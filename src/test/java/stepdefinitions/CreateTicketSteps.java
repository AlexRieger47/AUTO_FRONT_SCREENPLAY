package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.PaginaDeLogin;
import questions.ElListadoDeTickets;
import questions.ElTicketEnElListado;
import tasks.IniciarSesion;
import tasks.NavegarACrearTicket;
import tasks.RegistrarTicket;
import utils.TestData;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.is;

public class CreateTicketSteps {

	private String ticketTitle;

	@Given("el usuario se encuentra autenticado en el modulo de tickets")
	public void elUsuarioSeEncuentraAutenticadoEnElModuloDeTickets() {
		theActorCalled("el usuario").attemptsTo(PaginaDeLogin.abrir());
		theActorCalled("el usuario").attemptsTo(
				IniciarSesion.conCredenciales(TestData.DEFAULT_EMAIL, TestData.DEFAULT_PASSWORD)
		);
		theActorCalled("el usuario").should(seeThat(ElListadoDeTickets.estaVisible(), is(true)));
	}

	@When("el usuario registra un nuevo ticket con titulo y descripcion validos")
	public void elUsuarioRegistraUnNuevoTicketConTituloYDescripcionValidos() {
		ticketTitle = TestData.generateUniqueTicketTitle();
		String ticketDescription = TestData.generateTicketDescription();
		theActorCalled("el usuario").attemptsTo(
				NavegarACrearTicket.enElMenu(),
				RegistrarTicket.conTituloY(ticketTitle, ticketDescription)
		);
	}

	@Then("el ticket queda disponible en el listado de tickets")
	public void elTicketQuedaDisponibleEnElListadoDeTickets() {
		theActorCalled("el usuario").should(seeThat(ElTicketEnElListado.esVisible(ticketTitle), is(true)));
	}
}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.PaginaDeLogin;
import questions.ElListadoDeTickets;
import tasks.IniciarSesion;
import utils.TestData;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

	@Given("existe un usuario registrado con credenciales validas en SistemaTickets")
	public void existeUnUsuarioRegistradoConCredencialesValidasEnSistemaTickets() {
		theActorCalled("el usuario").attemptsTo(PaginaDeLogin.abrir());
	}

	@When("el usuario inicia sesion en SistemaTickets")
	public void elUsuarioIniciaSesionEnSistemaTickets() {
		theActorCalled("el usuario").attemptsTo(
				IniciarSesion.conCredenciales(TestData.DEFAULT_EMAIL, TestData.DEFAULT_PASSWORD)
		);
	}

	@Then("el usuario visualiza el listado de tickets")
	public void elUsuarioVisualizaElListadoDeTickets() {
		theActorCalled("el usuario").should(seeThat(ElListadoDeTickets.estaVisible(), is(true)));
	}
}

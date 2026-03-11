package stepdefinitions;

import interactions.AbrirUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.PaginaDeLogin;
import questions.LaPaginaDeLogin;
import questions.ElListadoDeTickets;
import questions.ElMensajeDeErrorDeLogin;
import tasks.IniciarSesion;
import utils.TestData;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

	@Given("el usuario se encuentra en la pagina de inicio de sesion")
	public void elUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
		theActorCalled("el usuario").attemptsTo(PaginaDeLogin.abrir());
	}

	@Given("el usuario no ha iniciado sesion en SistemaTickets")
	public void elUsuarioNoHaIniciadoSesionEnSistemaTickets() {
		theActorCalled("el usuario");
	}

	@Given("existe un usuario de prueba previamente registrado en SistemaTickets")
	public void existeUnUsuarioRegistradoConCredencialesValidasEnSistemaTickets() {
		theActorCalled("el usuario").attemptsTo(PaginaDeLogin.abrir());
	}

	@When("el usuario inicia sesion en SistemaTickets")
	public void elUsuarioIniciaSesionEnSistemaTickets() {
		theActorCalled("el usuario").attemptsTo(
				IniciarSesion.conCredenciales(TestData.DEFAULT_EMAIL, TestData.DEFAULT_PASSWORD)
		);
	}

	@When("el usuario intenta iniciar sesion con credenciales invalidas")
	public void elUsuarioIntentaIniciarSesionConCredencialesInvalidas() {
		theActorCalled("el usuario").attemptsTo(
				IniciarSesion.conCredenciales(TestData.INVALID_EMAIL, TestData.INVALID_PASSWORD)
		);
	}

	@When("el usuario intenta acceder directamente al modulo de tickets")
	public void elUsuarioIntentaAccederDirectamenteAlModuloDeTickets() {
		theActorCalled("el usuario").attemptsTo(
				AbrirUrl.en(TestData.getBaseUrl() + "/tickets")
		);
	}

	@When("el usuario intenta acceder directamente al modulo de notificaciones")
	public void elUsuarioIntentaAccederDirectamenteAlModuloDeNotificaciones() {
		theActorCalled("el usuario").attemptsTo(
				AbrirUrl.en(TestData.getBaseUrl() + "/notifications")
		);
	}

	@Then("el usuario visualiza el listado de tickets")
	public void elUsuarioVisualizaElListadoDeTickets() {
		theActorCalled("el usuario").should(seeThat(ElListadoDeTickets.estaVisible(), is(true)));
	}

	@Then("el sistema muestra un mensaje de credenciales invalidas")
	public void elSistemaMuestraUnMensajeDeCredencialesInvalidas() {
		theActorCalled("el usuario").should(
				seeThat(ElMensajeDeErrorDeLogin.indicaCredencialesInvalidas(), is(true))
		);
	}

	@Then("el sistema redirige al usuario a la pagina de inicio de sesion")
	public void elSistemaRedirigeAlUsuarioALaPaginaDeInicioDeSesion() {
		theActorCalled("el usuario").should(
				seeThat(LaPaginaDeLogin.estaVisible(), is(true))
		);
	}

	@Then("el sistema redirige al usuario al listado de tickets")
	public void elSistemaRedirigeAlUsuarioAlListadoDeTickets() {
		theActorCalled("el usuario").should(
				seeThat(ElListadoDeTickets.estaVisible(), is(true))
		);
	}
}

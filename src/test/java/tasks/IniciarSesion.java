package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginUI;

public class IniciarSesion implements Task {

	private final String email;
	private final String password;

	private IniciarSesion(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public static IniciarSesion conCredenciales(String email, String password) {
		return new IniciarSesion(email, password);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(email).into(LoginUI.EMAIL_FIELD),
				Enter.theValue(password).into(LoginUI.PASSWORD_FIELD),
				Click.on(LoginUI.LOGIN_BUTTON)
		);
	}
}

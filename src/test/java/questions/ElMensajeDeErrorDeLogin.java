package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.LoginUI;

public class ElMensajeDeErrorDeLogin implements Question<Boolean> {

	private static final String INVALID_CREDENTIALS_MESSAGE = "Credenciales inválidas";

	public static ElMensajeDeErrorDeLogin indicaCredencialesInvalidas() {
		return new ElMensajeDeErrorDeLogin();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return LoginUI.LOGIN_ERROR_MESSAGE.resolveFor(actor).isVisible()
				&& LoginUI.LOGIN_ERROR_MESSAGE.resolveFor(actor).getText().contains(INVALID_CREDENTIALS_MESSAGE);
	}
}
package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.LoginUI;

public class LaPaginaDeLogin implements Question<Boolean> {

	public static LaPaginaDeLogin estaVisible() {
		return new LaPaginaDeLogin();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return LoginUI.EMAIL_FIELD.resolveFor(actor).isVisible()
				&& LoginUI.PASSWORD_FIELD.resolveFor(actor).isVisible()
				&& LoginUI.LOGIN_BUTTON.resolveFor(actor).isVisible();
	}
}
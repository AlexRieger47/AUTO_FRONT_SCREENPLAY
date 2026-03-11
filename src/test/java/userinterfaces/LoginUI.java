package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

	public static final Target EMAIL_FIELD =
			Target.the("campo de correo electrónico").located(By.cssSelector("#email"));

	public static final Target PASSWORD_FIELD =
			Target.the("campo de contraseña").located(By.cssSelector("#password"));

	public static final Target LOGIN_BUTTON =
			Target.the("botón de inicio de sesión").located(By.cssSelector("button.btn-primary"));

	private LoginUI() {
	}
}

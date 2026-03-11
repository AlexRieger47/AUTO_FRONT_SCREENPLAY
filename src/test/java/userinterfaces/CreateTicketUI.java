package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateTicketUI {

	public static final Target TITLE_INPUT =
			Target.the("campo de título del ticket").located(By.cssSelector("form.ticket-form input.form-input"));

	public static final Target DESCRIPTION_TEXTAREA =
			Target.the("campo de descripción del ticket").located(By.cssSelector("form.ticket-form textarea.form-textarea"));

	public static final Target SUBMIT_BUTTON =
			Target.the("botón de enviar ticket").located(By.cssSelector("form.ticket-form button.form-button"));

	private CreateTicketUI() {
	}
}

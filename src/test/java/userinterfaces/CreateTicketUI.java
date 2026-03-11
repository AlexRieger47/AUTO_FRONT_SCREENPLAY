package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateTicketUI {

	public static final Target TITLE_INPUT =
			Target.the("campo de título del ticket").locatedBy("form.ticket-form input.form-input");

	public static final Target DESCRIPTION_TEXTAREA =
			Target.the("campo de descripción del ticket").locatedBy("form.ticket-form textarea.form-textarea");

	public static final Target SUBMIT_BUTTON =
			Target.the("botón de enviar ticket").locatedBy("form.ticket-form button.form-button");

	private CreateTicketUI() {
	}
}

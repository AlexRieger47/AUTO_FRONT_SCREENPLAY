package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.CreateTicketUI;

public class RegistrarTicket implements Task {

	private final String title;
	private final String description;

	private RegistrarTicket(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public static RegistrarTicket conTituloY(String title, String description) {
		return new RegistrarTicket(title, description);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(title).into(CreateTicketUI.TITLE_INPUT),
				Enter.theValue(description).into(CreateTicketUI.DESCRIPTION_TEXTAREA),
				Click.on(CreateTicketUI.SUBMIT_BUTTON)
		);
	}
}

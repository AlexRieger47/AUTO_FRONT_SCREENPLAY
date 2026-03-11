package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.NavBarUI;

public class NavegarACrearTicket implements Task {

	public static NavegarACrearTicket enElMenu() {
		return new NavegarACrearTicket();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(NavBarUI.CREATE_TICKET_LINK)
		);
	}
}

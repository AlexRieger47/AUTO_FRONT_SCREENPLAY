package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.TicketListUI;

public class ElListadoDeTickets implements Question<Boolean> {

	public static ElListadoDeTickets estaVisible() {
		return new ElListadoDeTickets();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return TicketListUI.PAGE_HEADER.resolveFor(actor).isVisible();
	}
}

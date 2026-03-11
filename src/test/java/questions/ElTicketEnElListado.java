package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.TicketListUI;

public class ElTicketEnElListado implements Question<Boolean> {

	private final String ticketTitle;

	private ElTicketEnElListado(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public static ElTicketEnElListado esVisible(String ticketTitle) {
		return new ElTicketEnElListado(ticketTitle);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return TicketListUI.TICKETS_CONTAINER.resolveFor(actor).isVisible() &&
				TicketListUI.TICKET_TITLES.resolveAllFor(actor).stream()
						.anyMatch(element -> element.getText().trim().equals(ticketTitle));
	}
}

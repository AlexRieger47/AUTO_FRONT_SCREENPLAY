package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TicketListUI {

	public static final Target PAGE_HEADER =
			Target.the("encabezado del listado de tickets").locatedBy(".list-header");

	public static final Target TICKETS_CONTAINER =
			Target.the("contenedor de la grilla de tickets").locatedBy(".tickets-grid");

	public static final Target TICKET_TITLES =
			Target.the("títulos de los tickets en el listado").locatedBy(".ticket-item .ticket-title");

	private TicketListUI() {
	}
}

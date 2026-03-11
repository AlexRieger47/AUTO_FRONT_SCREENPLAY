package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TicketListUI {

	public static final Target PAGE_HEADER =
			Target.the("encabezado del listado de tickets").located(By.cssSelector(".list-header"));

	public static final Target TICKETS_CONTAINER =
			Target.the("contenedor de la grilla de tickets").located(By.cssSelector(".tickets-grid"));

	public static final Target TICKET_TITLES =
			Target.the("títulos de los tickets en el listado").located(By.cssSelector(".ticket-item .ticket-title"));

	private TicketListUI() {
	}
}

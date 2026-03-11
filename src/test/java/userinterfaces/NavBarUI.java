package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NavBarUI {

	public static final Target TICKETS_LINK =
			Target.the("enlace de lista de tickets en el menú").locatedBy("a[href='/tickets']");

	public static final Target CREATE_TICKET_LINK =
			Target.the("enlace de crear ticket en el menú").locatedBy("a[href='/tickets/new']");

	public static final Target LOGOUT_BUTTON =
			Target.the("botón de cerrar sesión").locatedBy("button.navbar__link--logout");

	private NavBarUI() {
	}
}

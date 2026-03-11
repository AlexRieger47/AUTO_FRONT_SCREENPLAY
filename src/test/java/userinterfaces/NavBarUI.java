package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavBarUI {

	public static final Target TICKETS_LINK =
			Target.the("enlace de lista de tickets en el menú").located(By.cssSelector("a[href='/tickets']"));

	public static final Target CREATE_TICKET_LINK =
			Target.the("enlace de crear ticket en el menú").located(By.cssSelector("a[href='/tickets/new']"));

	public static final Target LOGOUT_BUTTON =
			Target.the("botón de cerrar sesión").located(By.cssSelector("button.navbar__link--logout"));

	private NavBarUI() {
	}
}

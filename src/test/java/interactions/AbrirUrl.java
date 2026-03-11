package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrl implements Interaction {

	private final String url;

	private AbrirUrl(String url) {
		this.url = url;
	}

	public static AbrirUrl en(String url) {
		return new AbrirUrl(url);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(url));
	}
}

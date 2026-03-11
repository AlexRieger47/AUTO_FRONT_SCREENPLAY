package stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;

public class Hooks {

	@Before
	public void configurarEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
}

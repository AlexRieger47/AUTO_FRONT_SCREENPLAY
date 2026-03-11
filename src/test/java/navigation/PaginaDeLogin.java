package navigation;

import interactions.AbrirUrl;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import utils.TestData;

public class PaginaDeLogin {

	public static Performable abrir() {
		return Task.where("{0} abre la página de inicio de sesión",
				AbrirUrl.en(TestData.getBaseUrl() + "/login")
		);
	}

	private PaginaDeLogin() {
	}
}

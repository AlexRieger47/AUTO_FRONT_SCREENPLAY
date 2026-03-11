package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class TestData {

	public static final String DEFAULT_EMAIL = "sofkiano@sofka.com";
	public static final String DEFAULT_PASSWORD = "12345678";

	private static final String BASE_URL = "http://localhost:5173";
	private static final DateTimeFormatter TITLE_TIMESTAMP_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

	private TestData() {
	}

	public static String generateUniqueTicketTitle() {
		return "Ticket Prueba " + LocalDateTime.now().format(TITLE_TIMESTAMP_FORMATTER);
	}

	public static String generateTicketDescription() {
		return "Descripcion de ticket generada para pruebas automatizadas";
	}

	public static String getBaseUrl() {
		String configuredBaseUrl = System.getProperty("webdriver.base.url");
		if (configuredBaseUrl == null || configuredBaseUrl.isBlank()) {
			return BASE_URL;
		}
		return configuredBaseUrl;
	}
}

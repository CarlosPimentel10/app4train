package com.lukasz.engineerproject.app4train.utils;

public enum NotificationMessages {

	BMI_SAVE_ERROR_TITLE("B£¥D"),
	BMI_SAVE_ERROR_DESCRIPTION("Musi byæ co najmniej jeden u¿ytkownik!"),

	BAI_SAVE_ERROR_TITLE("B£¥D"),
	BAI_SAVE_ERROR_DESCRIPTION("Musi byæ co najmniej jeden u¿ytkownik!"),

	BMR_SAVE_ERROR_TITLE("B£¥D"),
	BMR_SAVE_ERROR_DESCRIPTION("Musi byæ co najmniej jeden u¿ytkownik!"),

	USER_SAVE_SUCCESS_TITLE("ZAPISZ"),
	USER_SAVE_SUCCESS_DESCRIPTION("U¿ytkownik poprawnie zapisany!"),

	BMI_SAVE_SUCCESS_TITLE("OBLICZ"),
	BMI_SAVE_SUCCESS_DESCRIPTION("WskaŸnik BMI poprawnie zapisany!"),

	BAI_SAVE_SUCCESS_TITLE("OBLICZ"),
	BAI_SAVE_SUCCESS_DESCRIPTION("WskaŸnik BAI poprawnie zapisany!"),

	BMR_SAVE_SUCCESS_TITLE("OBLICZ"),
	BMR_SAVE_SUCCESS_DESCRIPTION("WskaŸnik BMR poprawnie zapisany!"),

	USER_SAVE_VALIDATION_ERROR_TITLE("B£¥D"),
	USER_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz¹ byæ wype³nione!"),

	BMI_SAVE_VALIDATION_ERROR_TITLE("B£¥D"),
	BMI_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz¹ byæ wype³nione!"),

	BAI_SAVE_VALIDATION_ERROR_TITLE("B£¥D"),
	BAI_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz¹ byæ wype³nione!"),

	BMR_SAVE_VALIDATION_ERROR_TITLE("B£¥D"),
	BMR_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz¹ byæ wype³nione!"),

	USER_REMOVE_SUCCESS_TITLE("USUÑ"),
	USER_REMOVE_SUCCESS_DESCRIPTION("U¿ytkownik(cy) poprawnie usuniêci!"),

	LOGIN_INCORRECT_SUCCESS_TITLE("B£¥D"),
	LOGIN_INCORRECT_SUCCESS_SUCCESS_DESCRIPTION("Niepoprawne logowanie! Spróbuj jeszcze raz"),

	SIGN_UP_INCORRECT_SUCCESS_TITLE("B£¥D"),
	SIGN_UP_INCORRECT_SUCCESS_SUCCESS_DESCRIPTION("Has³a nie s¹ takie same!"),

	BODY_MASS_INDEX_REMOVE_SUCCESS_TITLE("USUÑ"),
	BODY_MASS_INDEX_REMOVE_SUCCESS_DESCRIPTION("WskaŸnik(iki) BMI poprawnie usuniête!"),

	BASIC_METABOLIC_RATE_REMOVE_SUCCESS_TITLE("USUÑ"),
	BASIC_METABOLIC_RATE_REMOVE_SUCCESS_DESCRIPTION("WskaŸnik(iki) BMR poprawnie usuniête!"),

	BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_TITLE("USUÑ"),
	BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_DESCRIPTION("WskaŸnik(iki) BAI poprawnie usuniête!"),

	THE_SAME_LOGIN_IN_DATABASE_ERROR_TITLE("B£¥D"),
	THE_SAME_LOGIN_IN_DATABASE_ERROR_DESCRIPTION("Istnieje u¿ytkownik o takim loginie. Wymyœl inny!"),

	SIGN_UP_VALIDATION_USERNAME_ERROR_TITLE("B£¥D"),
	SIGN_UP_VALIDATION_USERNAME_ERROR_DESCRIPTION("Wszystkie pola musz¹ byæ wype³nione!"),

	SIGN_UP_VALIDATION_PASSWORD_ERROR_TITLE("B£¥D"),
	SIGN_UP_VALIDATION_PASSWORD_ERROR_DESCRIPTION("Wszystkie pola musz¹ byæ wype³nione!"),

	EMAIL_SUCCESS_SENDING_MESSAGE_DESCRIPTION("Wiadomoœæ zosta³a poprawnie wys³ana!"),

	EMAIL_FAIL_VALIDATION_DESCRIPTION("B³êdny format adresu email. Spróbuj jeszcze raz!");

	private final String string;

	NotificationMessages(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}

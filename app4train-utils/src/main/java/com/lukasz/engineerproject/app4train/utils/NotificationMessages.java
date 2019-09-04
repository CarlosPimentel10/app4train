package com.lukasz.engineerproject.app4train.utils;

public enum NotificationMessages {

	BMI_SAVE_ERROR_TITLE("B��D"),
	BMI_SAVE_ERROR_DESCRIPTION("Musi by� co najmniej jeden u�ytkownik!"),

	BAI_SAVE_ERROR_TITLE("B��D"),
	BAI_SAVE_ERROR_DESCRIPTION("Musi by� co najmniej jeden u�ytkownik!"),

	BMR_SAVE_ERROR_TITLE("B��D"),
	BMR_SAVE_ERROR_DESCRIPTION("Musi by� co najmniej jeden u�ytkownik!"),

	USER_SAVE_SUCCESS_TITLE("ZAPISZ"),
	USER_SAVE_SUCCESS_DESCRIPTION("U�ytkownik poprawnie zapisany!"),

	BMI_SAVE_SUCCESS_TITLE("OBLICZ"),
	BMI_SAVE_SUCCESS_DESCRIPTION("Wska�nik BMI poprawnie zapisany!"),

	BAI_SAVE_SUCCESS_TITLE("OBLICZ"),
	BAI_SAVE_SUCCESS_DESCRIPTION("Wska�nik BAI poprawnie zapisany!"),

	BMR_SAVE_SUCCESS_TITLE("OBLICZ"),
	BMR_SAVE_SUCCESS_DESCRIPTION("Wska�nik BMR poprawnie zapisany!"),

	USER_SAVE_VALIDATION_ERROR_TITLE("B��D"),
	USER_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz� by� wype�nione!"),

	BMI_SAVE_VALIDATION_ERROR_TITLE("B��D"),
	BMI_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz� by� wype�nione!"),

	BAI_SAVE_VALIDATION_ERROR_TITLE("B��D"),
	BAI_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz� by� wype�nione!"),

	BMR_SAVE_VALIDATION_ERROR_TITLE("B��D"),
	BMR_SAVE_VALIDATION_ERROR_DESCRIPTION("Pola musz� by� wype�nione!"),

	USER_REMOVE_SUCCESS_TITLE("USU�"),
	USER_REMOVE_SUCCESS_DESCRIPTION("U�ytkownik(cy) poprawnie usuni�ci!"),

	LOGIN_INCORRECT_SUCCESS_TITLE("B��D"),
	LOGIN_INCORRECT_SUCCESS_SUCCESS_DESCRIPTION("Niepoprawne logowanie! Spr�buj jeszcze raz"),

	SIGN_UP_INCORRECT_SUCCESS_TITLE("B��D"),
	SIGN_UP_INCORRECT_SUCCESS_SUCCESS_DESCRIPTION("Has�a nie s� takie same!"),

	BODY_MASS_INDEX_REMOVE_SUCCESS_TITLE("USU�"),
	BODY_MASS_INDEX_REMOVE_SUCCESS_DESCRIPTION("Wska�nik(iki) BMI poprawnie usuni�te!"),

	BASIC_METABOLIC_RATE_REMOVE_SUCCESS_TITLE("USU�"),
	BASIC_METABOLIC_RATE_REMOVE_SUCCESS_DESCRIPTION("Wska�nik(iki) BMR poprawnie usuni�te!"),

	BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_TITLE("USU�"),
	BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_DESCRIPTION("Wska�nik(iki) BAI poprawnie usuni�te!"),

	THE_SAME_LOGIN_IN_DATABASE_ERROR_TITLE("B��D"),
	THE_SAME_LOGIN_IN_DATABASE_ERROR_DESCRIPTION("Istnieje u�ytkownik o takim loginie. Wymy�l inny!"),

	SIGN_UP_VALIDATION_USERNAME_ERROR_TITLE("B��D"),
	SIGN_UP_VALIDATION_USERNAME_ERROR_DESCRIPTION("Wszystkie pola musz� by� wype�nione!"),

	SIGN_UP_VALIDATION_PASSWORD_ERROR_TITLE("B��D"),
	SIGN_UP_VALIDATION_PASSWORD_ERROR_DESCRIPTION("Wszystkie pola musz� by� wype�nione!"),

	EMAIL_SUCCESS_SENDING_MESSAGE_DESCRIPTION("Wiadomo�� zosta�a poprawnie wys�ana!"),

	EMAIL_FAIL_VALIDATION_DESCRIPTION("B��dny format adresu email. Spr�buj jeszcze raz!");

	private final String string;

	NotificationMessages(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}

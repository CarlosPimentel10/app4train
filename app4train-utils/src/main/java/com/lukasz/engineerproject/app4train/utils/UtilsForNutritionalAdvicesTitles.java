package com.lukasz.engineerproject.app4train.utils;

public enum UtilsForNutritionalAdvicesTitles {
	
	TOPIC_ONE("Ser chudy czy t�usty?"),
	TOPIC_TWO("Produkty kt�re lepiej nie podawa� dzieciom"),
	TOPIC_THREE("Czy mo�na zbudowa� mi�nie jedz�c 3 posi�ki dziennie?"),
	TOPIC_FOUR("Czy �elatyna jest przydatna w diecie sportowca?"),
	TOPIC_FIVE("Twar�g - je�� czy nie je��?"),
	TOPIC_SIX("Co je�� po treningu?"),
	TOPIC_SEVEN("4 propozycje na �niadanie"),
	TOPIC_EIGHT("Jaka dieta do rozbudowy masy mi�niowej?"),
	TOPIC_NINE("Jakie warzywa i owoce nie nale�y trzyma� w lod�wce"),
	TOPIC_TEN("5 powod�w by pi� wi�cej wody"),
	TOPIC_ELEVEN("Olej kokosowy a cholesterol"),
	TOPIC_TWELVE("T�uszcze trans - gdzie je znajdziemy?"),
	TOPIC_THIRTEEN("Czy mo�na je�� jajka codziennie?"),
	TOPIC_FOURTEEN("Dlaczego na redukcji zaleca si� je�� wi�cej bia�ka?"),
	TOPIC_FIFTEEN("Co lepiej nawadnia izotonik czy woda?"),
	TOPIC_SIXTEEN("Napoje kt�re powinno si� pi� na czczo"),
	TOPIC_SEVENTEEN("Cukier - sze�� powod�w by z niego zrezygnowa�"),
	TOPIC_EIGHTEEN("Jakie w�glowodany wybra�?"),
	TOPIC_NINETEEN("Czy spo�ywanie soli jest zdrowe?"),
	TOPIC_TWENTY("Co wiesz na temat cholesterolu?");

	
	private final String string;
	
	private UtilsForNutritionalAdvicesTitles(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}

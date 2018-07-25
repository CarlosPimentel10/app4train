package com.lukasz.engineerproject.app4train.utils;

public enum UtilsForNutritionalAdvicesTitles {
	
	TOPIC_ONE("Ser chudy czy t³usty?"),
	TOPIC_TWO("Produkty które lepiej nie podawaæ dzieciom"),
	TOPIC_THREE("Czy mo¿na zbudowaæ miêœnie jedz¹c 3 posi³ki dziennie?"),
	TOPIC_FOUR("Czy ¿elatyna jest przydatna w diecie sportowca?"),
	TOPIC_FIVE("Twaróg - jeœæ czy nie jeœæ?"),
	TOPIC_SIX("Co jeœæ po treningu?"),
	TOPIC_SEVEN("4 propozycje na œniadanie"),
	TOPIC_EIGHT("Jaka dieta do rozbudowy masy miêœniowej?"),
	TOPIC_NINE("Jakie warzywa i owoce nie nale¿y trzymaæ w lodówce"),
	TOPIC_TEN("5 powodów by piæ wiêcej wody"),
	TOPIC_ELEVEN("Olej kokosowy a cholesterol"),
	TOPIC_TWELVE("T³uszcze trans - gdzie je znajdziemy?"),
	TOPIC_THIRTEEN("Czy mo¿na jeœæ jajka codziennie?"),
	TOPIC_FOURTEEN("Dlaczego na redukcji zaleca siê jeœæ wiêcej bia³ka?"),
	TOPIC_FIFTEEN("Co lepiej nawadnia izotonik czy woda?"),
	TOPIC_SIXTEEN("Napoje które powinno siê piæ na czczo"),
	TOPIC_SEVENTEEN("Cukier - szeœæ powodów by z niego zrezygnowaæ"),
	TOPIC_EIGHTEEN("Jakie wêglowodany wybraæ?"),
	TOPIC_NINETEEN("Czy spo¿ywanie soli jest zdrowe?"),
	TOPIC_TWENTY("Co wiesz na temat cholesterolu?");

	
	private final String string;
	
	private UtilsForNutritionalAdvicesTitles(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}

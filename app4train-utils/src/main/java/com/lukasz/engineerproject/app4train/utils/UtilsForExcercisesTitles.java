package com.lukasz.engineerproject.app4train.utils;

public enum UtilsForExcercisesTitles {

	TOPIC_ONE("\"Rozpi�tki\" z hantlami na �awce p�askiej"),
	TOPIC_TWO("\"Rozpi�tki\" w pozycji siedz�cej na przyrz�dzie"),
	TOPIC_THREE("\"Rozpi�tki\" w pozycji stoj�cej przy wykorzystaniu wyci�gu g�rnego"),
	TOPIC_FOUR("Wyciskanie sztangi na �awce sko�nej (skos dodatni)"),
	TOPIC_FIVE("Wyciskanie sztangi na �awce sko�nej (skos ujemny)"),
	TOPIC_SIX("Wyciskanie sztangi na �awce p�askiej"),
	TOPIC_SEVEN("Wyciskanie hantli nad g�owe na �awce p�askiej"),
	TOPIC_EIGHT("Wyciskanie hantli nad g�owe na �awce sko�niej (skos dodatni)"),
	TOPIC_NINE("Unoszenie ramion w bok z wykorzystaniem hantli"),
	TOPIC_TEN("Podci�ganie sztangi �amanej do brody"),
	TOPIC_ELEVEN("Przyci�ganie dr��ka wyci�gu g�rnego do klatki piersiowej"),
	TOPIC_TWELVE("Wyciskanie ci�aru na suwnicy sko�nej"),
	TOPIC_THIRTEEN("�wiczenie na mi�nie tylniej cz�ci bark�w z wykorzystaniem maszyny"),
	TOPIC_FOURTEEN("Naprzemianstronne unoszenie ramion w bok z wykorzystaniem  wyci�gu dolnego"),
	TOPIC_FIFTEEN("Prostowanie przedramion z wykorzystaniem wyci�gu g�rnego z u�yciem dr��ka prostego trzymanego nachwytem"),
	TOPIC_SIXTEEN("Prostowanie przedramion ze sztang� �aman� w pozycji le��cej na �aweczce"),
	TOPIC_SEVENTEEN("Prostowanie przedramion przy wykorzystaniu wyci�gu g�rnego z u�yciem linek"),
	TOPIC_EIGHTEEN("Prostowanie przedramion przy wykorzystaniu wyci�gu g�rnego z u�yciem dr��ka prostego trzymanego podchwytem"),
	TOPIC_NINETEEN("Podci�ganie hantli w kl�ku podpartym na �awce"),
	TOPIC_TWENTY("Naprzemianstronne uginanie przedramion z wykorzystaniem hantli w pozycji stoj�cej"),
	TOPIC_TWENTYONE("Wyciskanie sztangi na �awce sprzed klatki piersiowej"),
	TOPIC_TWENTYTWO("Uginanie przedramion z wykorzystaniem przyrz�du \"Larre Scott\" tzw. modlitewnik"),
	TOPIC_TWENTYTHREE("Uginanie przedramion z wykorzystaniem hantli w pozycji stoj�cej (brak rotacji nadgarstka)"),
	TOPIC_TWENTYFOUR("Uginanie przedramion w pozycji stoj�cej z wykorzystaniem sztangi �amanej"),
	TOPIC_TWENTYFIVE("Zginanie przedramion w podporze ty�em na �aweczce"),
	TOPIC_TWENTYSIX("Wykroki z hantlami"),
	TOPIC_TWENTYSEVEN("Prostowanie n�g na maszynie"),
	TOPIC_TWENTYEIGHT("Przysiady na suwnicy sko�nej"),
	TOPIC_TWENTYNINE("Uginanie n�g w pozycji le��cej na maszynie"),
	TOPIC_THIRTY("Unoszenie ramion w bok z wykorzystaniem gumy oporowej"),
	TOPIC_THIRTYONE("Wspi�cia na palce na maszynie (�ydki)"),
	TOPIC_THIRTYTWO("Podci�ganie sztangi trzymanej podchwytem w opadzie tu�owia"),
	TOPIC_THIRTYTHREE("Podci�ganie sztangi trzymanej nachwytem w opadzie tu�owia"),
	TOPIC_THIRTYFOUR("Uginanie przedramion z wykorzystaniem gumy oporowej"),
	TOPIC_THIRTYFIVE("Przysiady z wykorzystaniem kettlebell"),
	TOPIC_THIRTYSIX("Wyciskanie hantli na �awce sko�nej (skos dodatni)"),
	TOPIC_THIRTYSEVEN("Wyciskanie hantli na �awce p�askiej"),
	TOPIC_THIRTYEIGHT("Wykroki z wykorzystaniem kettlebell"),
	TOPIC_THIRTYNINE("Podci�ganie do brody z wykorzystaniem kettlebell"),
	TOPIC_FOURTY("Pompki damskie na kolanach"),
	TOPIC_FOURTYONE("Prostowanie przedramion z wykorzystaniem kettlebell na macie"),
	TOPIC_FOURTYTWO("Unoszenie ramion w prz�d z wykorzystaniem kettlebell"),
	TOPIC_FOURTYTHREE("Podci�ganie na dr��ku szerokim uchwytem");
	private final String string;
	
	private UtilsForExcercisesTitles(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}


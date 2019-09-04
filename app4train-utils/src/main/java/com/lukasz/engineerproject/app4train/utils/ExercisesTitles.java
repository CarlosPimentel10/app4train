package com.lukasz.engineerproject.app4train.utils;

public enum ExercisesTitles {

	TOPIC_ONE("\"Rozpiêtki\" z hantlami na ³awce p³askiej"),
	TOPIC_TWO("\"Rozpiêtki\" w pozycji siedz¹cej na przyrz¹dzie"),
	TOPIC_THREE("\"Rozpiêtki\" w pozycji stoj¹cej przy wykorzystaniu wyci¹gu górnego"),
	TOPIC_FOUR("Wyciskanie sztangi na ³awce skoœnej (skos dodatni)"),
	TOPIC_FIVE("Wyciskanie sztangi na ³awce skoœnej (skos ujemny)"),
	TOPIC_SIX("Wyciskanie sztangi na ³awce p³askiej"),
	TOPIC_SEVEN("Wyciskanie hantli nad g³owe na ³awce p³askiej"),
	TOPIC_EIGHT("Wyciskanie hantli nad g³owe na ³awce skoœniej (skos dodatni)"),
	TOPIC_NINE("Unoszenie ramion w bok z wykorzystaniem hantli"),
	TOPIC_TEN("Podci¹ganie sztangi ³amanej do brody"),
	TOPIC_ELEVEN("Przyci¹ganie dr¹¿ka wyci¹gu górnego do klatki piersiowej"),
	TOPIC_TWELVE("Wyciskanie ciê¿aru na suwnicy skoœnej"),
	TOPIC_THIRTEEN("Æwiczenie na miêœnie tylniej czêœci barków z wykorzystaniem maszyny"),
	TOPIC_FOURTEEN("Naprzemianstronne unoszenie ramion w bok z wykorzystaniem  wyci¹gu dolnego"),
	TOPIC_FIFTEEN("Prostowanie przedramion z wykorzystaniem wyci¹gu górnego z u¿yciem dr¹¿ka prostego trzymanego nachwytem"),
	TOPIC_SIXTEEN("Prostowanie przedramion ze sztang¹ ³aman¹ w pozycji le¿¹cej na ³aweczce"),
	TOPIC_SEVENTEEN("Prostowanie przedramion przy wykorzystaniu wyci¹gu górnego z u¿yciem linek"),
	TOPIC_EIGHTEEN("Prostowanie przedramion przy wykorzystaniu wyci¹gu górnego z u¿yciem dr¹¿ka prostego trzymanego podchwytem"),
	TOPIC_NINETEEN("Podci¹ganie hantli w klêku podpartym na ³awce"),
	TOPIC_TWENTY("Naprzemianstronne uginanie przedramion z wykorzystaniem hantli w pozycji stoj¹cej"),
	TOPIC_TWENTY_ONE("Wyciskanie sztangi na ³awce sprzed klatki piersiowej"),
	TOPIC_TWENTY_TWO("Uginanie przedramion z wykorzystaniem przyrz¹du \"Larre Scott\" tzw. modlitewnik"),
	TOPIC_TWENTY_THREE("Uginanie przedramion z wykorzystaniem hantli w pozycji stoj¹cej (brak rotacji nadgarstka)"),
	TOPIC_TWENTY_FOUR("Uginanie przedramion w pozycji stoj¹cej z wykorzystaniem sztangi ³amanej"),
	TOPIC_TWENTY_FIVE("Zginanie przedramion w podporze ty³em na ³aweczce"),
	TOPIC_TWENTY_SIX("Wykroki z hantlami"),
	TOPIC_TWENTY_SEVEN("Prostowanie nóg na maszynie"),
	TOPIC_TWENTY_EIGHT("Przysiady na suwnicy skoœnej"),
	TOPIC_TWENTY_NINE("Uginanie nóg w pozycji le¿¹cej na maszynie"),
	TOPIC_THIRTY("Unoszenie ramion w bok z wykorzystaniem gumy oporowej"),
	TOPIC_THIRTY_ONE("Wspiêcia na palce na maszynie (³ydki)"),
	TOPIC_THIRTY_TWO("Podci¹ganie sztangi trzymanej podchwytem w opadzie tu³owia"),
	TOPIC_THIRTY_THREE("Podci¹ganie sztangi trzymanej nachwytem w opadzie tu³owia"),
	TOPIC_THIRTY_FOUR("Uginanie przedramion z wykorzystaniem gumy oporowej"),
	TOPIC_THIRTY_FIVE("Przysiady z wykorzystaniem kettlebell"),
	TOPIC_THIRTY_SIX("Wyciskanie hantli na ³awce skoœnej (skos dodatni)"),
	TOPIC_THIRTY_SEVEN("Wyciskanie hantli na ³awce p³askiej"),
	TOPIC_THIRTY_EIGHT("Wykroki z wykorzystaniem kettlebell"),
	TOPIC_THIRTY_NINE("Podci¹ganie do brody z wykorzystaniem kettlebell"),
	TOPIC_FORTY("Pompki damskie na kolanach"),
	TOPIC_FORTY_ONE("Prostowanie przedramion z wykorzystaniem kettlebell na macie"),
	TOPIC_FORTY_TWO("Unoszenie ramion w przód z wykorzystaniem kettlebell"),
	TOPIC_FORTY_THREE("Podci¹ganie na dr¹¿ku szerokim uchwytem");

	private final String string;

	ExercisesTitles(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}


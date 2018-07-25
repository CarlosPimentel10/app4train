package com.lukasz.engineerproject.app4train.utils;

public enum UtilsForArticlesTitles {

	TOPIC_ONE("Ile razy w tygodniu nale�y trenowa�?"),
	TOPIC_TWO("3 suplementy, kt�re wspomagaj� jako�� snu"),
	TOPIC_THREE("Choroba - kiedy trenowa� a kiedy odpu�ci�?"),
	TOPIC_FOUR("Sauna jako regeneracja potreningowa"),
	TOPIC_FIVE("Co mo�e utrudnia� odchudzanie?"),
	TOPIC_SIX("T�uszcz na brzuchu - dlaczego nie znika?"),
	TOPIC_SEVEN("Bieganie i aktywno�� pomaga w rzuceniu palenia"),
	TOPIC_EIGHT("Oporne �ydki - jak zmusi� je do wzrostu?"),
	TOPIC_NINE("Korzy�ci wynikaj�ce z treningu ca�ego cia�a"),
	TOPIC_TEN("Oznaki zbyt wysokiego kortyzolu"),
	TOPIC_ELEVEN("Jak odpowiednio zregenerowa� si� po treningu?"),
	TOPIC_TWELVE("Dlaczego nie mog� zbudowa� masy mi�niowej?"),
	TOPIC_THIRTEEN("Sprawd� czy nie jeste� przetrenowany"),
	TOPIC_FOURTEEN("Sygna�y �wiadcz�ce �e tw�j trener personalny jest kiepski"),
	TOPIC_FIFTEEN("Jedz mniej, �wicz wi�cej - czy to dzia�a?"),
	TOPIC_SIXTEEN("Czy mi�nie zamieniaj� si� w t�uszcz je�eli przestajemy �wiczy�?"),
	TOPIC_SEVENTEEN("Jak kobiety powinny trenowa�?"),
	TOPIC_EIGHTEEN("Dlaczego kobiety powinny d�wiga� ci�ary?"),
	TOPIC_NINETEEN("Zalety przysiad�w"),
	TOPIC_TWENTY("B�le staw�w - przyczyny i leczenie");
	
	private final String string;
	
	private UtilsForArticlesTitles(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}


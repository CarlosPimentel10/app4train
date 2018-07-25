package com.lukasz.engineerproject.app4train.utils;

public enum UtilsForArticlesTitles {

	TOPIC_ONE("Ile razy w tygodniu nale¿y trenowaæ?"),
	TOPIC_TWO("3 suplementy, które wspomagaj¹ jakoœæ snu"),
	TOPIC_THREE("Choroba - kiedy trenowaæ a kiedy odpuœciæ?"),
	TOPIC_FOUR("Sauna jako regeneracja potreningowa"),
	TOPIC_FIVE("Co mo¿e utrudniaæ odchudzanie?"),
	TOPIC_SIX("T³uszcz na brzuchu - dlaczego nie znika?"),
	TOPIC_SEVEN("Bieganie i aktywnoœæ pomaga w rzuceniu palenia"),
	TOPIC_EIGHT("Oporne ³ydki - jak zmusiæ je do wzrostu?"),
	TOPIC_NINE("Korzyœci wynikaj¹ce z treningu ca³ego cia³a"),
	TOPIC_TEN("Oznaki zbyt wysokiego kortyzolu"),
	TOPIC_ELEVEN("Jak odpowiednio zregenerowaæ siê po treningu?"),
	TOPIC_TWELVE("Dlaczego nie mogê zbudowaæ masy miêœniowej?"),
	TOPIC_THIRTEEN("SprawdŸ czy nie jesteœ przetrenowany"),
	TOPIC_FOURTEEN("Sygna³y œwiadcz¹ce ¿e twój trener personalny jest kiepski"),
	TOPIC_FIFTEEN("Jedz mniej, æwicz wiêcej - czy to dzia³a?"),
	TOPIC_SIXTEEN("Czy miêœnie zamieniaj¹ siê w t³uszcz je¿eli przestajemy æwiczyæ?"),
	TOPIC_SEVENTEEN("Jak kobiety powinny trenowaæ?"),
	TOPIC_EIGHTEEN("Dlaczego kobiety powinny dŸwigaæ ciê¿ary?"),
	TOPIC_NINETEEN("Zalety przysiadów"),
	TOPIC_TWENTY("Bóle stawów - przyczyny i leczenie");
	
	private final String string;
	
	private UtilsForArticlesTitles(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}


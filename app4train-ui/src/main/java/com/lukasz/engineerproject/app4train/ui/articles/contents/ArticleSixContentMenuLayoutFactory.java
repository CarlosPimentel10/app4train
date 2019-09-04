package com.lukasz.engineerproject.app4train.ui.articles.contents;

import com.lukasz.engineerproject.app4train.utils.ArticlesTitles;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@org.springframework.stereotype.Component
public class ArticleSixContentMenuLayoutFactory {

	private class ArticleSixContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleSix;

		public ArticleSixContentMenuLayout init() {

			Label topicOfOfArticleSix = new Label(ArticlesTitles.TOPIC_SIX.getString());

			Button buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleSix);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleSix);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleSix = new Label(
					"<b><br><br>Nadmiar t�uszczu na brzuchu i wok� talii jest to podstawowy pow�d wielu os�b do tego �eby zacz�� trenowa� oraz zdrowo si� od�ywia�.</b><br>"
							+ "<b>Pomimo stara�, mo�e nam si� nie udawa� osi�gn�� zamierzony cel. Ci�ka praca nad sob� nie daje nam odpowiedniej satysfakcji. Czasem </b><br>"
							+ "<b>powinni�my zwr�ci� uwag� na kilka przyczyn, kt�re uniemo�liwiaj� nam osi�gn�� wymarzon� sylwetk�.</b>"
							+ "<h4>Deficyt snu</h4>"
							+ "<b>W przypadku gdy pracujesz wiele godzin bez odpoczynku, a tak�e siedzisz za biurkiem do p�nych godzin nocnych, zamiast i�� spa� o rozs�dnej </b><br>"
							+ "<b>porze, mo�esz mie� problemy ze swoimi obwodami. Cz�ste niedosypianie sprawia, �e masz ochot� na niezdrowe i s�abe jako�ciowo jedzenie. Osoby, </b><br>"
							+ "<b>kt�re �pi� �rednio 4-5 godzin na dob� zjadaj� ok. ponad 600 dodatkowych kalorii ni� osoby, kt�re �pi� 7-8 godzin dziennie.</b>"
							+ "<h4>Zbyt wysoki poziom stresu</h4>"
							+ "<b>W nerwach zwykle si�gamy po przek�ski, kt�re s� niekoniecznie dietetyczne. Zwi�kszona zostaje wtedy poda� kalorii, mamy wolniejsze spalanie</b><br>"
							+ "<b>a to przek�ada si� na dodatkowe centymetry.</b>"
							+ "<h4>Nieodpowiednie podej�cie do odchudzania</h4>"
							+ "<b>Odchudzanie to nie tylko spadek ilo�ci spo�ywanych kalorii poparta wi�ksz� aktywno�ci� ruchowa. Wiadomo, s� to niezb�dne elementy chc�c  </b><br>"
							+ "<b>kszta�towa� nasz� sylwetk�, ale trzeba do tego odpowiednio podej��. Najlepiej zmiany wprowadzi� na sta�e, a nie tylko na kilka tygodni przed  </b><br>"
							+ "<b>wakacjami. Spo�ywanie zdrowej, warto�ciowej oraz najmniej przetworzonej �ywno�ci powinno sta� si� naszym sta�ym nawykiem. Takie  </b><br>"
							+ "<b>podej�cie pozwoli nam zachowa� d�ugo zmiany, jakie uzyskamy w sylwetce. </b>"
							+ "<h4>Dieta CUD</h4>"
							+ "<b>Wiadomo, �e efekt jest mo�liwy do osi�gni�cia, jednak je�li utrata wagi by�a szybka, a my szybko wr�cimy do swoich poprzednich nawyk�w to i </b><br>"
							+ "<b>waga wzro�nie. Zbyt rygorystyczna oraz uboga w warto�ci od�ywcze dieta, negatywnie wp�ywa na nasze narz�dy wewn�trzne, co mo�e mie� wp�yw na nasze zdrowie.</b><br>",
					ContentMode.HTML);
			throughtExplanationOfArticleSix.setSizeUndefined();
			throughtExplanationOfArticleSix.setStyleName("throughtExplanationOfArticleSix");
			throughtExplanationOfArticleSix.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}

	}

	public Component createComponent() {
		return new ArticleSixContentMenuLayout().init();
	}
}

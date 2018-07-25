package com.lukasz.engineerproject.app4train.ui.articles;

import com.lukasz.engineerproject.app4train.utils.UtilsForArticlesTitles;
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
public class ArticleThreeContentMenuLayoutFactory {

	private class ArticleThreeContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleThree;
		private Label topicOfOfArticleThree;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleThreeContentMenuLayout init() {

			topicOfOfArticleThree = new Label(UtilsForArticlesTitles.TOPIC_THREE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleThree = new Label("<br><h4>Katar</h4>"
							+ "<b>Mo�e by� s�abym powodem odpuszczania trening�w. Je�li odczuwasz objawy, kt�re zlokalizowane s� powy�ej szyi takie jak  katar, b�l g�owy czy gard�a,  </b><br>"
							+ "<b>jednak nie masz gor�czki nie jeste� zmuszony do opuszczania treningu. Pomimo tego, �e nie musisz unika� przegrzania to eksperci jednak zalecaj� </b><br>"
							+ "<b>zmniejszenie intensywno�� treningu. Zbyt intensywny trening mo�e skutkowa� spadkiem odporno�ci naszego organizmu. Warto jednak zwr�ci� uwag�, </b><br>"
							+ "<b>�e pomimo powy�szych zastrze�e� badania wykaza�y, i� trening podczas tych dolegliwo�ci nie jest niekorzystny dla organizmu o ile jest on lekki."
							+ "<h4>Sezonowe alergie</h4>"
							+ "<b>Trening podczas stan�w alergicznych mo�e mie� korzystny wp�yw na organizm. Niewielki wysi�ek fizyczny to cz�sto dobry pomys�. Jednak </b><br>"
							+ "<b>�wiczenia na �wie�ym powietrzu w niesprzyjaj�cych warunkach atmosferycznych, mog� nie by� jednak dobrym pomys�em. Gdy jednak </b><br>"
							+ "<b>chcesz �wiczy� na zewn�trz postaw na bardzo dok�adn�, intensywn� rozgrzewk�. Spowoduje to odpowiednie przygotowanie organizmu do �wicze� w niskiej temperaturze.</b><br>"
							+ "<b>Mo�esz r�wnie� �wiczy� w masce na ustach lub nosie. B�dzie ona  filtrowa� powietrze, kt�rym oddychasz. Dzi�ki temu zmniejszysz ilo�� wdychanych py�k�w. </b>"
							+ "<h4>Problemy �o��dkowo-jelitowe</h4>"
							+ "<b>Je�eli Twoje problemy zwi�zane s� z wymiotami czy biegunk� to lepiej odpu�� trening. Trening w tym stanie skutkowa� mo�e jeszcze wi�kszym </b><br>"
							+ "<b>os�abieniem oraz odwodnieniem organizmu. W tym okresie nale�y dba� o prawid�owy poziom p�yn�w oraz na bie��co uzupe�nia� elektrolity.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleThree.setSizeUndefined();
					throughtExplanationOfArticleThree.setStyleName("throughtExplanationOfArticleThree");
					throughtExplanationOfArticleThree.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleThree);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleThree);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleThreeContentMenuLayout().init();
	}
}

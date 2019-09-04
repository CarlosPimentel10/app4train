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
public class ArticleTwentyContentMenuLayoutFactory {

	private class ArticleTwentyContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleTwenty;

		public ArticleTwentyContentMenuLayout init() {

			Label topicOfOfArticleTwenty = new Label(ArticlesTitles.TOPIC_TWENTY.getString());

			Button buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleTwenty);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleTwenty);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleTwenty = new Label(
					"<b><br><br>Niestety nie da si� jednoznacznie bez g��bszej diagnostyki stwierdzi� jakie przyczyny wyst�powania b�lu staw�w.</b><br>"
							+ "<b>Lista przyczyn mo�e by� bardzo d�uga od genetycznych przypad�o�ci po rodzaj wykonywanego sportu, czy charakter wykonywanej pracy </b><br>"
							+ "<b>Do�� cz�st� przyczyn� dyskomfortu stawu jest technika treningowa, wymagaj�ca sporej korekty. Tyczy si� to r�wnie� b��dnie przeprowadzonej </b><br>"
							+ "<b>rozgrzewki lub nawet jej brak. W przypadku problem�w tego typu niezb�dna jest poprawy techniki wykonywanych �wicze�, </b><br>"
							+ "<b>natomiast rozgrzewka przed treningiem powinna by� intensywna. B��dna technika wykonywanych �wicze�, skutkuje to skr�ceniem mi�ni, </b><br>"
							+ "<b>co wp�ywa na ograniczenie ruchu w stawach, oraz przyczynia si� do dociskania powierzchni stawowych. Stawy maj�ce ograniczon� ruchomo��</b><br>"
							+ "<b>i s� dociskane, szybciej ulega� b�d� zwyrodnieniom. Dlatego po wysi�ku nale�y wykonywa� regularnie stretching, maj�cy na celu przywr�cenie </b><br>"
							+ "<b>odpowiedniej d�ugo�ci mi�ni. Kolejnymi przyczynami s� te� nieodpowiednia dieta, jak i brak odpowiedniej ilo�ci czasu na odpoczynek.</b><br>"
							+ "<b>Nieodpowiednia dieta b�dzie mia�a wp�yw na to, jak d�ugo wygl�da� b�dzie okres regeneracji powysi�kowej. Przerwa treningowa jest tak�e kluczowa </b><br>"
							+ "<b>pod k�tem regeneracji. Powinna ona by� wykonywana regularnie, po okresie 10-12 tygodni, w kt�rym wykonujemy intensywne treningi.</b><br>"
							+ "<b>Najlepiej jest wykonywa� oko�o 8-10 dni przerwy od aktywno�ci fizycznej. </b><br>",
					ContentMode.HTML);
			throughtExplanationOfArticleTwenty.setSizeUndefined();
			throughtExplanationOfArticleTwenty.setStyleName("throughtExplanationOfArticleTwenty");
			throughtExplanationOfArticleTwenty.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}

	}

	public Component createComponent() {
		return new ArticleTwentyContentMenuLayout().init();
	}
}

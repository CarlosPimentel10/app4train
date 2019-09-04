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
					"<b><br><br>Niestety nie da siê jednoznacznie bez g³êbszej diagnostyki stwierdziæ jakie przyczyny wystêpowania bólu stawów.</b><br>"
							+ "<b>Lista przyczyn mo¿e byæ bardzo d³uga od genetycznych przypad³oœci po rodzaj wykonywanego sportu, czy charakter wykonywanej pracy </b><br>"
							+ "<b>Doœæ czêst¹ przyczyn¹ dyskomfortu stawu jest technika treningowa, wymagaj¹ca sporej korekty. Tyczy siê to równie¿ b³êdnie przeprowadzonej </b><br>"
							+ "<b>rozgrzewki lub nawet jej brak. W przypadku problemów tego typu niezbêdna jest poprawy techniki wykonywanych æwiczeñ, </b><br>"
							+ "<b>natomiast rozgrzewka przed treningiem powinna byæ intensywna. B³êdna technika wykonywanych æwiczeñ, skutkuje to skróceniem miêœni, </b><br>"
							+ "<b>co wp³ywa na ograniczenie ruchu w stawach, oraz przyczynia siê do dociskania powierzchni stawowych. Stawy maj¹ce ograniczon¹ ruchomoœæ</b><br>"
							+ "<b>i s¹ dociskane, szybciej ulegaæ bêd¹ zwyrodnieniom. Dlatego po wysi³ku nale¿y wykonywaæ regularnie stretching, maj¹cy na celu przywrócenie </b><br>"
							+ "<b>odpowiedniej d³ugoœci miêœni. Kolejnymi przyczynami s¹ te¿ nieodpowiednia dieta, jak i brak odpowiedniej iloœci czasu na odpoczynek.</b><br>"
							+ "<b>Nieodpowiednia dieta bêdzie mia³a wp³yw na to, jak d³ugo wygl¹daæ bêdzie okres regeneracji powysi³kowej. Przerwa treningowa jest tak¿e kluczowa </b><br>"
							+ "<b>pod k¹tem regeneracji. Powinna ona byæ wykonywana regularnie, po okresie 10-12 tygodni, w którym wykonujemy intensywne treningi.</b><br>"
							+ "<b>Najlepiej jest wykonywaæ oko³o 8-10 dni przerwy od aktywnoœci fizycznej. </b><br>",
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

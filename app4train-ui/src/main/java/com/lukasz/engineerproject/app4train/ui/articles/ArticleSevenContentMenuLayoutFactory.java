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
public class ArticleSevenContentMenuLayoutFactory {

	private class ArticleSevenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleSeven;
		private Label topicOfOfArticleSeven;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleSevenContentMenuLayout init() {

			topicOfOfArticleSeven = new Label(UtilsForArticlesTitles.TOPIC_SEVEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleSeven = new Label(
							"<b><br><br>Wed�ug ostatnich bada� przeprowadzonych przez naukowc�w z brytyjskiego Uniwersytetu Columbia (UBC)  bada� palacze, kt�rzy pr�buj� bezskutecznie </b><br>"
									+ "<b>pozby� si� swojego na�ogu, powinni regularnie biega�. Regularny jogging powoduje to �e jeste� w stanie poradzi� sobie z ch�ci� si�gni�cia po kolejnego papierosa.</b><br>"
									+ "<b>Wnioski te s� wynikiem programu badawczego Run to Quit. Po��czy� on w ze sob� 2016 roku dwie organizacje - Kanadyjskie Towarzystwo do walki z </b><br>"
									+ "<b>Rakiem (Canadian Cancer Society) oraz firm� Running Room.</b>"
									+ "<h4>Przebieg bada�</h4>"
									+ "<b>Dzie� uczestnik�w sk�ada� si� z biegania, uczenia si� technik, kt�re pozwalaj� oderwa� si� od na�ogu nikotynowego jak r�wnie� relaksacyjne </b><br>"
									+ "<b>spacery na �wie�ym powietrzu. </b>" + "<h4>Zaskakuj�ce rezultaty</h4>"
									+ "<b>Po 6 miesi�cach od zako�czenia programu odby�y si� dodatkowe wywiady z uczestnikami eksperymentu, jak r�wnie� testy, potwierdzaj�ce wcze�niej</b><br>"
									+ "<b>z�o�one przez nich deklaracje. Badania te potwierdzi�y skuteczno�� tej terapii, poniewa� ponad 90% os�b, bior�cych udzia� w eksperymencie </b><br>"
									+ "<b>ograniczy�o palenie. Podstawowym dowodem na to by� znaczny spadek poziomu tlenku w�gla w ich organizmie uczestnik�w oraz widoczna </b><br>"
									+ "<b>poprawa ich samopoczucia.</b>",
							ContentMode.HTML);
					throughtExplanationOfArticleSeven.setSizeUndefined();
					throughtExplanationOfArticleSeven.setStyleName("throughtExplanationOfArticleSeven");
					throughtExplanationOfArticleSeven.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleSeven);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleSeven);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleSevenContentMenuLayout().init();
	}
}

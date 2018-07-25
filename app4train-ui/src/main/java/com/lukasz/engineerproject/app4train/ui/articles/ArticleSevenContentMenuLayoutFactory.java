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
							"<b><br><br>Wed³ug ostatnich badañ przeprowadzonych przez naukowców z brytyjskiego Uniwersytetu Columbia (UBC)  badañ palacze, którzy próbuj¹ bezskutecznie </b><br>"
									+ "<b>pozbyæ siê swojego na³ogu, powinni regularnie biegaæ. Regularny jogging powoduje to ¿e jesteœ w stanie poradziæ sobie z chêci¹ siêgniêcia po kolejnego papierosa.</b><br>"
									+ "<b>Wnioski te s¹ wynikiem programu badawczego Run to Quit. Po³¹czy³ on w ze sob¹ 2016 roku dwie organizacje - Kanadyjskie Towarzystwo do walki z </b><br>"
									+ "<b>Rakiem (Canadian Cancer Society) oraz firmê Running Room.</b>"
									+ "<h4>Przebieg badañ</h4>"
									+ "<b>Dzieñ uczestników sk³ada³ siê z biegania, uczenia siê technik, które pozwalaj¹ oderwaæ siê od na³ogu nikotynowego jak równie¿ relaksacyjne </b><br>"
									+ "<b>spacery na œwie¿ym powietrzu. </b>" + "<h4>Zaskakuj¹ce rezultaty</h4>"
									+ "<b>Po 6 miesi¹cach od zakoñczenia programu odby³y siê dodatkowe wywiady z uczestnikami eksperymentu, jak równie¿ testy, potwierdzaj¹ce wczeœniej</b><br>"
									+ "<b>z³o¿one przez nich deklaracje. Badania te potwierdzi³y skutecznoœæ tej terapii, poniewa¿ ponad 90% osób, bior¹cych udzia³ w eksperymencie </b><br>"
									+ "<b>ograniczy³o palenie. Podstawowym dowodem na to by³ znaczny spadek poziomu tlenku wêgla w ich organizmie uczestników oraz widoczna </b><br>"
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

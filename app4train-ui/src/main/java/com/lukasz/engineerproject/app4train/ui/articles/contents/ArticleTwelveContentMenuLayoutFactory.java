
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
public class ArticleTwelveContentMenuLayoutFactory {

	private class ArticleTwelveContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleTwelve;

		public ArticleTwelveContentMenuLayout init() {

			Label topicOfOfArticleTwelve = new Label(ArticlesTitles.TOPIC_TWELVE.getString());

			Button buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleTwelve);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleTwelve);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleTwelve = new Label(
					"<br><h4>Jesz za ma�o, co oznacza �e nie masz energii, by trenowa� wystarczaj�co mocno i poprawi� znacz�co proporcje swojego cia�a</h4>"
							+ "<h4>Jesz za ma�o zdrowej �ywno�ci. Unikach fastfood�w oraz s�odyczy. Energia pochodzi� powinna z nieprzetworzonego jedzenia</h4>"
							+ "<h4>Unikasz w�glowodan�w, kt�re s� przede wszystkim doskona�ym �r�d�em energii. Wa�ne, zw�aszcza w okresie oko�o treningowym</h4>"
							+ "<h4>Ca�kowicie rezygnujesz z cardio. Nawet, gdy budujesz mas� mi�niow� nie powiniene� rezygnowa� z dodatkowych aktywno�ci</h4>"
							+ "<h4>Robisz za du�o cardio. Kilka spacer�w w tygodniu trwaj�cych 30-40 minut wydaj� si� wystarczaj�ce dla uk�adu krwiono�nego</h4>"
							+ "<h4>Nie dbasz wystarczaj�co o regeneracj�. To w�a�nie w czasie regeneracji mi�nie rosn�</h4>"
							+ "<h4>Za bardzo skupiasz si� na maszynach. �wiczenia z wolnym ci�arem gwarantuj� lepsze efekty</h4>"
							+ "<h4>Pomijasz posi�ki</h4>"
							+ "<h4>Drastycznie zwi�kszasz ilo�� kalorii w diecie. Optymalne rozwi�zanie to do bilansu zerowego dodawa� co tydzie� lub 2 tygodnie po 100-200 kcal</h4>",
					ContentMode.HTML);
			throughtExplanationOfArticleTwelve.setSizeUndefined();
			throughtExplanationOfArticleTwelve.setStyleName("throughtExplanationOfArticleTwelve");
			throughtExplanationOfArticleTwelve.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}
	}

	public Component createComponent() {
		return new ArticleTwelveContentMenuLayout().init();
	}
}

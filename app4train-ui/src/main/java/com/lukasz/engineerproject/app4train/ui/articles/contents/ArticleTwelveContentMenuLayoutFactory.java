
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
					"<br><h4>Jesz za ma³o, co oznacza ¿e nie masz energii, by trenowaæ wystarczaj¹co mocno i poprawiæ znacz¹co proporcje swojego cia³a</h4>"
							+ "<h4>Jesz za ma³o zdrowej ¿ywnoœci. Unikach fastfoodów oraz s³odyczy. Energia pochodziæ powinna z nieprzetworzonego jedzenia</h4>"
							+ "<h4>Unikasz wêglowodanów, które s¹ przede wszystkim doskona³ym Ÿród³em energii. Wa¿ne, zw³aszcza w okresie oko³o treningowym</h4>"
							+ "<h4>Ca³kowicie rezygnujesz z cardio. Nawet, gdy budujesz masê miêœniow¹ nie powinieneœ rezygnowaæ z dodatkowych aktywnoœci</h4>"
							+ "<h4>Robisz za du¿o cardio. Kilka spacerów w tygodniu trwaj¹cych 30-40 minut wydaj¹ siê wystarczaj¹ce dla uk³adu krwionoœnego</h4>"
							+ "<h4>Nie dbasz wystarczaj¹co o regeneracjê. To w³aœnie w czasie regeneracji miêœnie rosn¹</h4>"
							+ "<h4>Za bardzo skupiasz siê na maszynach. Æwiczenia z wolnym ciê¿arem gwarantuj¹ lepsze efekty</h4>"
							+ "<h4>Pomijasz posi³ki</h4>"
							+ "<h4>Drastycznie zwiêkszasz iloœæ kalorii w diecie. Optymalne rozwi¹zanie to do bilansu zerowego dodawaæ co tydzieñ lub 2 tygodnie po 100-200 kcal</h4>",
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

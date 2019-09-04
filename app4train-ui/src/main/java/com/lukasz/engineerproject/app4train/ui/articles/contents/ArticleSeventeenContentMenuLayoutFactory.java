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
public class ArticleSeventeenContentMenuLayoutFactory {

	private class ArticleSeventeenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleSeventeen;

		public ArticleSeventeenContentMenuLayout init() {

			Label topicOfOfArticleSeveteen = new Label(ArticlesTitles.TOPIC_SEVENTEEN.getString());

			Button buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleSeventeen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleSeveteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleSeventeen = new Label(
					"<b><br><br>Czêsto mo¿na spotkaæ siê ze stwierdzeniem, i¿ kobiety powinny trenowaæ podobnie tak jak mê¿czyŸni. Trening kobiecy w znacznym stopniu nie  </b><br>"
							+ "<b>powinien ró¿niæ siê od treningu mê¿czyzny. Trzeba jednak zaznaczyæ, ¿e kobiety powinny trenowaæ mocniej ni¿ mê¿czyŸni, chc¹c osi¹gn¹æ zadowalaj¹ce efekty.</b><br>"
							+ "<b>Spowodowane jest to przez hormony, a dok³adniej rzecz ujmuj¹c ró¿nicy hormonalnej jaka wystêpuje pomiêdzy mê¿czyznami, a kobietami.</b><br>"
							+ "<b>Przeciêtnie kobiety maj¹ oko³o dziesiêæ razy mniej testosteronu ni¿ mê¿czyŸni. Bior¹c pod uwagê budowanie masy miêœniowej, jest to </b><br>"
							+ "<b>ogromna wada kobiecego organizmu. Z drugiej jednak strony, patrz¹c siê z punktu widzenia kobiety, to te¿ ich zaleta. Nie musz¹ siê obawiaæ, ¿e po </b><br>"
							+ "<b>chwyceniu za ciê¿ary stan¹ siê zbyt mêskie. Aby trening by³ jak najbardziej efektywny, powinien sk³adaæ siê z takich æwiczeñ jak przysiad, martwy ci¹g,</b><br>"
							+ "<b>wykroki, podci¹gania czy wyciskania sztangi. Te z³o¿one ruchy wielostawowe procentuj¹ najlepszymi efektami. Kolejnym powodem, dla którego kobiety </b><br>"
							+ "<b>powinny trenowaæ czêsto oraz intensywnie, jest fakt, ¿e maj¹ niewiele miêœni. Tak wiêc w trakcie treningu odnosz¹ mniej uszkodzeñ w³ókien   </b><br>"
							+ "<b>miêœniowych oraz szybciej regeneruj¹ siê po treningu.</b><br>"
							+ "<b>Podsumowuj¹c, nie ³udŸ siê, ¿e zbudujesz cia³o smuk³ej i wysportowanej kobiety, wykonuj¹c dziwne æwiczenia prezentowane przez znane instruktorki na </b><br>"
							+ "<b>portalach spo³ecznoœciowych. Z³ap za sztangê, hantle i rozpocznij prawdziwy, ciê¿ki trening, pozwalaj¹cy zarówno wyrzeŸbiæ twoje cia³o, </b><br>"
							+ "<b>ale tak¿e sprawi, ¿e bêdziesz silniejsza i pewniejsza siebie.</b><br>",
					ContentMode.HTML);
			throughtExplanationOfArticleSeventeen.setSizeUndefined();
			throughtExplanationOfArticleSeventeen.setStyleName("throughtExplanationOfArticleSeventeen");
			throughtExplanationOfArticleSeventeen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}

	}

	public Component createComponent() {
		return new ArticleSeventeenContentMenuLayout().init();
	}
}

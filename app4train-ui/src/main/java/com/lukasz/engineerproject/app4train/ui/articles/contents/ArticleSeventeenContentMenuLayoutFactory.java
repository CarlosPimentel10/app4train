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
					"<b><br><br>Cz�sto mo�na spotka� si� ze stwierdzeniem, i� kobiety powinny trenowa� podobnie tak jak m�czy�ni. Trening kobiecy w znacznym stopniu nie  </b><br>"
							+ "<b>powinien r�ni� si� od treningu m�czyzny. Trzeba jednak zaznaczy�, �e kobiety powinny trenowa� mocniej ni� m�czy�ni, chc�c osi�gn�� zadowalaj�ce efekty.</b><br>"
							+ "<b>Spowodowane jest to przez hormony, a dok�adniej rzecz ujmuj�c r�nicy hormonalnej jaka wyst�puje pomi�dzy m�czyznami, a kobietami.</b><br>"
							+ "<b>Przeci�tnie kobiety maj� oko�o dziesi�� razy mniej testosteronu ni� m�czy�ni. Bior�c pod uwag� budowanie masy mi�niowej, jest to </b><br>"
							+ "<b>ogromna wada kobiecego organizmu. Z drugiej jednak strony, patrz�c si� z punktu widzenia kobiety, to te� ich zaleta. Nie musz� si� obawia�, �e po </b><br>"
							+ "<b>chwyceniu za ci�ary stan� si� zbyt m�skie. Aby trening by� jak najbardziej efektywny, powinien sk�ada� si� z takich �wicze� jak przysiad, martwy ci�g,</b><br>"
							+ "<b>wykroki, podci�gania czy wyciskania sztangi. Te z�o�one ruchy wielostawowe procentuj� najlepszymi efektami. Kolejnym powodem, dla kt�rego kobiety </b><br>"
							+ "<b>powinny trenowa� cz�sto oraz intensywnie, jest fakt, �e maj� niewiele mi�ni. Tak wi�c w trakcie treningu odnosz� mniej uszkodze� w��kien   </b><br>"
							+ "<b>mi�niowych oraz szybciej regeneruj� si� po treningu.</b><br>"
							+ "<b>Podsumowuj�c, nie �ud� si�, �e zbudujesz cia�o smuk�ej i wysportowanej kobiety, wykonuj�c dziwne �wiczenia prezentowane przez znane instruktorki na </b><br>"
							+ "<b>portalach spo�eczno�ciowych. Z�ap za sztang�, hantle i rozpocznij prawdziwy, ci�ki trening, pozwalaj�cy zar�wno wyrze�bi� twoje cia�o, </b><br>"
							+ "<b>ale tak�e sprawi, �e b�dziesz silniejsza i pewniejsza siebie.</b><br>",
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

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
public class ArticleSixteenContentMenuLayoutFactory {

	private class ArticleSixteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleSixteen;

		public ArticleSixteenContentMenuLayout init() {

			Label topicOfOfArticleSixteen = new Label(ArticlesTitles.TOPIC_SIXTEEN.getString());

			Button buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleSixteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleSixteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleSixteen = new Label(
					"<b><br><br>Cz�sto s�ycha� pomys�ach zamiany t�uszczu na mi�nie, poniewa� ludzie my�l�, �e taki cel mo�e przynie�� redukcja. Jednak dobrze wykonana redukcja obni�a </b><br>"
							+ "<b>poziom ot�uszczenia. Nie wp�ywa jednak na wzrost muskulatury na znacznym poziomie. W zwi�zku z tym b��dem jest trzymanie sta�ej masy cia�a </b><br>"
							+ "<b> jako wyznacznika obecnej formy, jednocze�nie redukuj�c tkank� t�uszczow�. Skutkuje to tym �e forma stoi w miejscu. Z punktu naukowego, nie ma </b><br>"
							+ "<b>mo�liwo�ci aby mi�sie�, b�d�cy obci��ony ni�sz� aktywno�ci� fizyczn�, przekszta�ca� si� w tkank� t�uszczow�. Mi�nie zbudowane s� g��wnie z bia�ek,</b><br>"
							+ "<b>aminokwas�w oraz wody, z niewielkim udzia�em tr�jgliceryd�w wewn�trz mi�niowych i glikogenu. Tkanka t�uszczowa zbudowana jest z adipocyt�w,</b><br>"
							+ "<b>aminokwas�w oraz wody, z niewielkim udzia�em tr�jgliceryd�w wewn�trz mi�niowych i glikogenu. Tkanka t�uszczowa zbudowana jest z adipocyt�w,</b><br>"
							+ "<b>gromadz�cych t�uszcz. Nie jest wi�c takiej mo�liwo�ci by w procesie biochemicznym przekszta�ci� jedn� kom�rk� w drug�, jak i odwrotnie. Dlaczego wi�c </b><br>"
							+ "<b>wyst�puje zjawisko, w kt�rym to mi�nie zaczynaj� by� bardziej ot�uszczone? Dochodzi do zjawiska rekompozycji, w negatywnym sensie jego znaczenia. </b><br>"
							+ "<b>Skutkuje to zmian� proporcji tkanki t�uszczowej do mi�niowej. Je�eli chcemy, aby po okresie szczytu formy sylwetka dalej pozosta�a szczup�a, nawet </b><br>"
							+ "<b>gdy przestali�my trenowa�, powinni�my dokona� kortekty od�ywiania. Gdy zale�y nam jednak na utrzymaniu dodatkowo wi�kszej ilo�ci tkanki mi�niowej,</b><br>"
							+ "<b>niezb�dny jest treningu si�owy, daj�cy sygna�, �e mi�nie s� potrzebne.</b><br>",
					ContentMode.HTML);
			throughtExplanationOfArticleSixteen.setSizeUndefined();
			throughtExplanationOfArticleSixteen.setStyleName("throughtExplanationOfArticleSixteen");
			throughtExplanationOfArticleSixteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}

	}

	public Component createComponent() {
		return new ArticleSixteenContentMenuLayout().init();
	}
}

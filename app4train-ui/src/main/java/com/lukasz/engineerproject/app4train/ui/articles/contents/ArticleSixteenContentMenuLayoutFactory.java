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
					"<b><br><br>Czêsto s³ychaæ pomys³ach zamiany t³uszczu na miêœnie, poniewa¿ ludzie myœl¹, ¿e taki cel mo¿e przynieœæ redukcja. Jednak dobrze wykonana redukcja obni¿a </b><br>"
							+ "<b>poziom ot³uszczenia. Nie wp³ywa jednak na wzrost muskulatury na znacznym poziomie. W zwi¹zku z tym b³êdem jest trzymanie sta³ej masy cia³a </b><br>"
							+ "<b> jako wyznacznika obecnej formy, jednoczeœnie redukuj¹c tkankê t³uszczow¹. Skutkuje to tym ¿e forma stoi w miejscu. Z punktu naukowego, nie ma </b><br>"
							+ "<b>mo¿liwoœci aby miêsieñ, bêd¹cy obci¹¿ony ni¿sz¹ aktywnoœci¹ fizyczn¹, przekszta³caæ siê w tkankê t³uszczow¹. Miêœnie zbudowane s¹ g³ównie z bia³ek,</b><br>"
							+ "<b>aminokwasów oraz wody, z niewielkim udzia³em trójglicerydów wewn¹trz miêœniowych i glikogenu. Tkanka t³uszczowa zbudowana jest z adipocytów,</b><br>"
							+ "<b>aminokwasów oraz wody, z niewielkim udzia³em trójglicerydów wewn¹trz miêœniowych i glikogenu. Tkanka t³uszczowa zbudowana jest z adipocytów,</b><br>"
							+ "<b>gromadz¹cych t³uszcz. Nie jest wiêc takiej mo¿liwoœci by w procesie biochemicznym przekszta³ciæ jedn¹ komórkê w drug¹, jak i odwrotnie. Dlaczego wiêc </b><br>"
							+ "<b>wystêpuje zjawisko, w którym to miêœnie zaczynaj¹ byæ bardziej ot³uszczone? Dochodzi do zjawiska rekompozycji, w negatywnym sensie jego znaczenia. </b><br>"
							+ "<b>Skutkuje to zmian¹ proporcji tkanki t³uszczowej do miêœniowej. Je¿eli chcemy, aby po okresie szczytu formy sylwetka dalej pozosta³a szczup³a, nawet </b><br>"
							+ "<b>gdy przestaliœmy trenowaæ, powinniœmy dokonaæ kortekty od¿ywiania. Gdy zale¿y nam jednak na utrzymaniu dodatkowo wiêkszej iloœci tkanki miêœniowej,</b><br>"
							+ "<b>niezbêdny jest treningu si³owy, daj¹cy sygna³, ¿e miêœnie s¹ potrzebne.</b><br>",
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

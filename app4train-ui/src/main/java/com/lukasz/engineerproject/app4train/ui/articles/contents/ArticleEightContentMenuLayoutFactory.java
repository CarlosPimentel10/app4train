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
public class ArticleEightContentMenuLayoutFactory {

	private class ArticleEightContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleEight;

		public ArticleEightContentMenuLayout init() {

			Label topicOfOfArticleEight = new Label(ArticlesTitles.TOPIC_EIGHT.getString());

			Button buttonForWindow = new Button();
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleEight);
					UI.getCurrent().addWindow(window);
				}
			});

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleEight);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleEight = new Label(
					"<b><br><br>Problem mo¿e wynikaæ z braku odpowiedniej motywacji do ich treningu, wynikaj¹cej z predyspozycji genetycznych, które skutkuj¹ tym, ¿e mamy </b><br>"
							+ "<b>tzw. “³ydki biegacza”.</b><br>"
							+ "<b>“£ydka biegacza” jest pojêciem odnosz¹cym siê do samego kszta³tu budowy brzuœca miêœniowego podudzia, posiadaj¹cego d³ugie œciêgno na </b><br>"
							+ "<b>swoim przyczepie. Dodatkowo zbudowane s¹ z w³ókien czerwonych podatnych na d³ugotrwa³¹ pracê miêœnia.</b><br>"
							+ "<b>Istniej¹ trzy sposoby na to, aby skutecznie poruszyæ ³ydki, po to aby ich budowa nabra³a tempa. </b>"
							+ "<h4>Zasada nr 1 </h4>"
							+ "<b>Opiera siê na przeci¹¿eniu miêœni. W zwi¹zku z tym wykorzystanie 30-40kg na maszynie oraz wykonywanie milionów powtórzeñ na ³ydki mo¿e </b><br>"
							+ "<b>nie wp³yn¹æ na zwiêkszenie ich objêtoœæ. Zwykle osoby, które maj¹ pokaŸne podudzia wykonuj¹ klasyczne wspiêcia stoj¹c ze sztang¹ </b><br>"
							+ "<b>umieszczon¹ na plecach, gdzie obci¹¿enie nierzadko przekracza dwukrotnie masê ich cia³a. Wykorzystuj nieco mniejsze zakresy iloœci </b><br>"
							+ "<b>powtórzeñ, przy wykorzystaniu wiêkszego obci¹¿enia, wykonuj¹c po 8-10 ruchów.</b>"
							+ "<h4>Zasada nr 2</h4>"
							+ "<b>W zwi¹zku z tym, i¿ iloœæ w³ókien miêœniowych w miêœniach ³ydek zwykle stanowi przewagê w³ókien wolnokurczliwych, wykorzystanie nieco </b><br>"
							+ "<b>wiêkszych zakresów powtórzeñ bêdzie wiêc skutkowa³o zwiêkszeniem masy naszych podudzi. Trzeba jednak zaznaczyæ, ¿e zasada nr 1 i zasada </b><br>"
							+ "<b>nr 2 powinny wystêpowaæ ³¹cznie w naszych treningach tak, aby co trening zmieniaæ zarówno zakresy powtórzeñ oraz ¿eby nasze ³ydki </b><br>"
							+ "<b>odczuwa³y inne bodŸce. W momencie gdy podczas wykonywania serii zaczynasz czuæ tzw. „palenie” w ³ydkach to znak, ¿e w tej chwili </b><br>"
							+ "<b>rozpoczyna siê seria. Staraj siê wykonaæ w tym momencie jeszcze dodatkowo 12-15 powtórzeñ.</b>"
							+ "<h4>Zasada nr 3</h4>"
							+ "<b>Rozci¹ganie miêœni podudzi jest technik¹ ma³o znan¹ a przede wszystkim b³êdnie interpretowan¹, poniewa¿ nie polega ona na stretchingu, tylko na </b><br>"
							+ "<b>umiejêtnym rozci¹ganiu miêœni, tak aby ruch by³ pe³ny oraz wykorzystywa³ pe³en zakres ruchu. </b><br>",
					ContentMode.HTML);
			throughtExplanationOfArticleEight.setSizeUndefined();
			throughtExplanationOfArticleEight.setStyleName("throughtExplanationOfArticleEight");
			throughtExplanationOfArticleEight.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}
	}

	public Component createComponent() {
		return new ArticleEightContentMenuLayout().init();
	}
}

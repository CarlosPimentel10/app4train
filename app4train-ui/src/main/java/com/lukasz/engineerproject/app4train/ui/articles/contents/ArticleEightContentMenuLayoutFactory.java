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
					"<b><br><br>Problem mo�e wynika� z braku odpowiedniej motywacji do ich treningu, wynikaj�cej z predyspozycji genetycznych, kt�re skutkuj� tym, �e mamy </b><br>"
							+ "<b>tzw. ��ydki biegacza�.</b><br>"
							+ "<b>��ydka biegacza� jest poj�ciem odnosz�cym si� do samego kszta�tu budowy brzu�ca mi�niowego podudzia, posiadaj�cego d�ugie �ci�gno na </b><br>"
							+ "<b>swoim przyczepie. Dodatkowo zbudowane s� z w��kien czerwonych podatnych na d�ugotrwa�� prac� mi�nia.</b><br>"
							+ "<b>Istniej� trzy sposoby na to, aby skutecznie poruszy� �ydki, po to aby ich budowa nabra�a tempa. </b>"
							+ "<h4>Zasada nr 1 </h4>"
							+ "<b>Opiera si� na przeci��eniu mi�ni. W zwi�zku z tym wykorzystanie 30-40kg na maszynie oraz wykonywanie milion�w powt�rze� na �ydki mo�e </b><br>"
							+ "<b>nie wp�yn�� na zwi�kszenie ich obj�to��. Zwykle osoby, kt�re maj� poka�ne podudzia wykonuj� klasyczne wspi�cia stoj�c ze sztang� </b><br>"
							+ "<b>umieszczon� na plecach, gdzie obci��enie nierzadko przekracza dwukrotnie mas� ich cia�a. Wykorzystuj nieco mniejsze zakresy ilo�ci </b><br>"
							+ "<b>powt�rze�, przy wykorzystaniu wi�kszego obci��enia, wykonuj�c po 8-10 ruch�w.</b>"
							+ "<h4>Zasada nr 2</h4>"
							+ "<b>W zwi�zku z tym, i� ilo�� w��kien mi�niowych w mi�niach �ydek zwykle stanowi przewag� w��kien wolnokurczliwych, wykorzystanie nieco </b><br>"
							+ "<b>wi�kszych zakres�w powt�rze� b�dzie wi�c skutkowa�o zwi�kszeniem masy naszych podudzi. Trzeba jednak zaznaczy�, �e zasada nr 1 i zasada </b><br>"
							+ "<b>nr 2 powinny wyst�powa� ��cznie w naszych treningach tak, aby co trening zmienia� zar�wno zakresy powt�rze� oraz �eby nasze �ydki </b><br>"
							+ "<b>odczuwa�y inne bod�ce. W momencie gdy podczas wykonywania serii zaczynasz czu� tzw. �palenie� w �ydkach to znak, �e w tej chwili </b><br>"
							+ "<b>rozpoczyna si� seria. Staraj si� wykona� w tym momencie jeszcze dodatkowo 12-15 powt�rze�.</b>"
							+ "<h4>Zasada nr 3</h4>"
							+ "<b>Rozci�ganie mi�ni podudzi jest technik� ma�o znan� a przede wszystkim b��dnie interpretowan�, poniewa� nie polega ona na stretchingu, tylko na </b><br>"
							+ "<b>umiej�tnym rozci�ganiu mi�ni, tak aby ruch by� pe�ny oraz wykorzystywa� pe�en zakres ruchu. </b><br>",
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

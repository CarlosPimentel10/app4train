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
public class ArticleThirteenContentMenuLayoutFactory {

	private class ArticleThirteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleThirteen;
		private Label topicOfOfArticleThirteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleThirteenContentMenuLayout init() {

			topicOfOfArticleThirteen = new Label(UtilsForArticlesTitles.TOPIC_THIRTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleThirteen = new Label("<br><h4>Podwy�szone t�tno spoczynkowe</h4><br>"
							+ "<b>To cz�sta reakcja obronna organizmu, kt�ra ma na celu to, aby serce mocniej pracowa�o i przet�acza�o wi�cej krwi przez nasz ustr�j. Zadaniem tego jest szybsze </b><br>"
							+ "<b>dostarczenie sk�adnik�w regeneracyjnych, budulcowych oraz szybsze odprowadzenie produkt�w stanowi�cych odpad metaboliczny. Zaleca si� sprawdza� t�tno rano,</b><br>"
							+ "<b> zanim wstaniemy z ��ka, po to by mie� pewno�� czy dochodzi do zmian w tego typu parametrach. T�tno spoczynkowe powy�ej 70 mo�e stanowi� pierwszy </b><br>"
							+ "<b>sygna�, �e czas na odpoczynek.</b>" + "<h4>Nasilone uczucie pragnienia</h4>"
							+ "<b>Oznak� ograniczenia mo�liwo�ci wysi�kowych naszego organizmu zwi�zana jest z utrat� wody, a jej objawem jest np. sucho�� w jamie ustnej. Podobnie sytuacja </b><br>"
							+ "<b>ma miejsce w przypadku przetrenowania. W momencie gdy nasz organizm wkracza w stan przetrenowania, rozpoczyna wysy�anie sygna��w podobnych do </b><br>"
							+ "<b>tych, kt�re zwi�zane s� ze spadkiem poziomu wody w organizmie. A to oznacza, �e zaczyna towarzyszy� nam pragnienie. </b>"
							+ "<h4>Utrzymuj�ca si� bolesno�� mi�ni</h4>"
							+ "<b>Wyst�powanie bolesno�ci mi�ni po treningu si�owym jest naturalnym procesem, kt�ry zwi�zany jest z uszkodzeniem w��kien mi�niowych.Mikrouszkodzenia </b><br>"
							+ "<b>przewa�nie wyst�puj� 24 godziny po treningu i potrafi� utrzyma� si� do 3 dni po wysi�ku. W sytuacji gdy b�l mi�niowy utrzymuje si� jeszcze d�u�ej, mo�e </b><br>"
							+ "<b>�wiadczy� to, �e tempo regeneracji spad�o. Organizm w tej sytuacji nie wyrabia z odbudow� uszkodzonych w��kien i potrzebuje d�u�szych czasowo odpoczynk�w. </b>"
							+ "<h4>Cz�ste infekcje</h4>"
							+ "<b>Oznak�, �e tw�j organizm nie jest w najlepszej formie, jest os�abienie uk�adu odporno�ciowego, czego wynikiem s� cz�ste infekcj�, przezi�bienia czy kaszel</b>"
							+ "<h4>Brak efektu wizualnego</h4>"
							+ "<b>Je�eli jeste� w okresie budowy masy mi�niowej, natomiast twoja sylwetka stoi w miejscu, zaczynasz je�� wi�cej, a jedyne rzecz� jak� uzyskujesz </b><br>"
							+ "<b>to t�uszcz, to jest znak, �e nie do ko�ca tw�j organizm zachowuje si� tak, jak powinien.</b><br>",
							ContentMode.HTML);

					throughtExplanationOfArticleThirteen.setSizeUndefined();
					throughtExplanationOfArticleThirteen.setStyleName("throughtExplanationOfArticleThirteen");
					throughtExplanationOfArticleThirteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleThirteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleThirteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleThirteenContentMenuLayout().init();
	}
}

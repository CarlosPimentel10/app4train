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
public class ArticleOneContentMenuLayoutFactory {

	private class ArticleOneContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleOne;
		private Label topicOfOfArticleOne;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleOneContentMenuLayout init() {

			topicOfOfArticleOne = new Label(UtilsForArticlesTitles.TOPIC_ONE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleOne = new Label(
							"<b><br><br>Kwestia cz�stotliwo�ci trenowania w ci�gu tygodnia powinna by� odpowiednio rozumiana.  Zwr�� uwag�, �e pi�� trening�w w</b><br>"
									+ "<b>tygodniu niekoniecznie musi by� lepsze ni� cztery, czy trzy jednostki treningowe. Musimy zdawa� sobie spraw� z tego, �e, </b><br>"
									+ "<b>wi�cej jednostek treningowych w tygodniu nie zawsze dawa� b�dzie lepsze efekty. Ilo�� trening�w w ci�gu tygodnia powinna by� uzale�niona od sta�u </b><br>"
									+ "<b>treningowego oraz preferencji.</b>" + "<h4>Sta� treningowy</h4>"
									+ "<b>Im d�u�ej posiadamy sta� treningowy, tym wi�cej wysi�ku musimy w�o�y� w osi�gni�cie zamierzonych rezultat�w. Twoja obj�to�� treningowa lub intensywno��</b><br>"
									+ "<b> powinna nieustannie wzrasta�. Mocno upraszczaj�c, osoby pocz�tkuj�ce powinny trenowa� 3 razy w tygodniu. Z ka�dym treningiem b�d� osi�ga�y </b><br>"
									+ "<b>coraz to lepsze efekty. Jest to normalny objaw w przypadku os�b, kt�re rozpoczynaj� dopiero swoje treningi. W przypadku os�b bardziej zaawansowanych,</b><br>"
									+ "<b> trzeba mie� na uwadze, �e mog� potrzebowa� 4, 5 a nawet 6 sesji treningowych tygodniowo chc�c pobudzi� w odpowiedni spos�b swoje mi�nie.</b>"
									+ "<h4>Preferencje</h4>"
									+ "<b>Je�li nie lubisz chodzi� na si�owni� zbyt cz�sto, to w takim przypadku nie ma sensu zmusza� si� do 5 lub 6 jednostek treningowych w tygodniu. </b><br>"
									+ "<b>Lepiej trenowa� od 3 do 4 dni w tygodniu i cieszy� si� efektami b�d�c na si�owni rzadziej. Je�li jednak lubisz trenowa�, i jest to Twoja</b><br>"
									+ "<b>odskocznia od rzeczywi�ci, nie jeste� zmuszony ogranicza� si� do 3 trening�w w tygodniu. Je�li odpowiednio zaplanujesz obj�to�� treningow�,</b><br>"
									+ "<b>nawet w takim przypadku nie przetrenujesz si�. Wymaga to roz�o�enia w takim przypadku planu treningowego na sze�� kr�tszych i l�ejszych sesji.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleOne.setStyleName("throughtExplanationOfArticleOne");
					throughtExplanationOfArticleOne.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfArticleOne.setSizeUndefined();
					window.setContent(throughtExplanationOfArticleOne);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleOne);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleOneContentMenuLayout().init();
	}
}

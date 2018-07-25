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
public class ArticleEighteenContentMenuLayoutFactory {

	private class ArticleEighteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleEighteen;
		private Label topicOfOfArticleEighteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleEighteenContentMenuLayout init() {

			topicOfOfArticleEighteen = new Label(UtilsForArticlesTitles.TOPIC_EIGHTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleEighteen = new Label(
							"<b><br><br>W ostatnich latach kobiety coraz cz�ciej wykonuj� trening si�owy Pomimo tego wi�kszo�� kobiet sceptycznie podchodzi do ci�ar�w,</b><br>"
									+ "<b>trenuj�c zazwyczaj z niewielkim obci��eniem. Wiele os�b uwa�a, �e 15 powt�rze� i wi�cej to odpowiedni spos�b na uzyskanie rze�by. Gdy jednak </b><br>"
									+ "<b>powt�rze� jest mniej, a ci�ar wi�kszy na pewno zwi�kszymy swoj� mas� mi�niow�. To za�o�enie powoduje, �e wi�kszo�� kobiet unika wi�kszych ci�ar�w. </b><br>"
									+ "<b>Trening taki przynosi bardzo du�o korzy�ci.</b>"
									+ "<h4>Poprawa sk�adu cia�a</h4>"
									+ "<b>Pozwala poprawi� sk�adu cia�a, a wi�c to, na czym skupiaj� si� najbardziej kobiety. Pozwoli nam to zyska� wi�cej tkanki mi�niowej i zredukowa� </b><br>"
									+ "<b>tkank� t�uszczow�. Gdy m�wimy o zyskaniu mi�ni musimy mie� na uwadze, �e nie b�dziemy mieli takich jak profesjonalne zawodniczki kulturystyki.</b><br>"
									+ "<b>Aby je wypracowa�, trzeba po�wi�ci� lata intensywnego treningu, wspomagaj�c si� dodatkowo niedozwolonymi �rodkami. Tak naprawd� trening z  </b><br>"
									+ "<b>obci��eniem pomo�e zbudowa� delikatne mi�nie, nadaj�ce cia�u kobiety kszta�t�w. </b>"
									+ "<h4>Lepsze zdrowie</h4>"
									+ "<b>Trening z obci��eniem wp�ywa korzystnie prawie na ka�dy aspekt zdrowia kobiety np. funkcjonowanie serca, sprawno�� m�zgu, r�wnowag� hormonaln�.</b><br>"
									+ "<b>oraz dobrze dzia�aj�cy metabolizm. Podnoszenie ci�ar�w wp�ywa na zmniejszenie obwodu talii, zmniejszenie poziomu tr�jgliceryd�w, zmniejszenie</b><br>"
									+ "<b>poziomu glukozy we krwi, a tak�e obni�enia rytmu serca oraz t�tna spoczynkowego.</b>"
									+ "<h4>Mo�esz je�� wi�cej</h4>"
									+ "<b>Trenuj�c naprawd� ci�ko mo�esz pozwoli� sobie na nieco wi�cej jedzenia i dalej cieszy� si� zgrabn� sylwetk�. Uzyskamy dzi�ki temu wi�cej si�y, a </b><br>"
									+ "<b>treningi stan� si� jeszcze efektywniejsze. Nie mo�emy popada� ze skrajno�ci w skrajno��, bo to �e mo�na wi�cej je�� nie znaczy, �e mamy </b><br>"
									+ "<b>je�� 2 razy wi�cej ni� normalnie. Wszystko powinno opiera� si� o zapotrzebowanie kaloryczne uwzgl�dniaj�ce ci�kie treningi. W </b><br>"
									+ "<b>przeciwnym wypadku mo�emy osi�gn�� efekt odwrotny od zamierzonego.</b>",
							ContentMode.HTML);
					throughtExplanationOfArticleEighteen.setStyleName("throughtExplanationOfArticleEighteen");
					throughtExplanationOfArticleEighteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfArticleEighteen.setSizeUndefined();
					window.setContent(throughtExplanationOfArticleEighteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleEighteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleEighteenContentMenuLayout().init();
	}
}

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
public class ArticleNineContentMenuLayoutFactory {

	private class ArticleNineContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleNine;
		private Label topicOfOfArticleNine;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleNineContentMenuLayout init() {

			topicOfOfArticleNine = new Label(UtilsForArticlesTitles.TOPIC_NINE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleNine = new Label("<br><h4>R�wnomierne obci��anie mi�ni</h4><br>"
							+ "<b>Zwykle cz�sto osoby trenuj�ce skupiaj� si� na ulubionej partii cia�a. Mo�e to powodowa� dysproporcj� sylwetki, ale tak�e ograniczenia zwi�zane z </b><br>"
							+ "<b>progresj�. �wicz�c ca�e cia�o r�wnomiernie je wzmacniamy oraz rozwijamy, zak�adaj�c, �e trening poparty jest odpowiednio zbilansowan� diet�.</b>"
							+ "<h4>Mniejsza obj�to��</h4>"
							+ "<b>Wykonuj�c po jednym �wiczeniu na dan� grup� mi�ni, mamy mniejsze ryzyko przetrenowania. Pomimo tego, �e w treningu ca�ego cia�a, ka�da partia anga�owana </b><br>"
							+ "<b>nawet dwa, czy trzy razy w tygodniu to i tak obj�to�� treningowa b�dzie wci�� mniejsza. Dzi�ki temu mi�sie� b�dzie mia� wi�ksz� szans� na regeneracj�.</b>"
							+ "<h4>�wiczenia wielostawowe</h4>"
							+ "<b>Podstawow� r�nic� mi�dzy treningiem ca�ego cia�a, a treningiem dzielonym jest dob�r �wicze�. Pierwszy trening charakteryzuje si� zwykle </b><br>"
							+ "<b>�wiczeniami wielostawowymi, anga�uj�ce jednocze�nie wiele grup mi�niowych. W treningu dzielonym cz�sto pojawiaj� si� �wiczenia </b><br>"
							+ "<b>izolowane. Zalet� treningu ca�ego cia�a jest to, �e wykonuj�c niewiele �wicze� wielostawowych, mamy pewno��, �e nie pominiemy �adnej istotnej partii.</b>"
							+ "<h4>Szybsza utrata tkanki t�uszczowej</h4>"
							+ "<b>Trening ca�ego cia�a anga�uje wi�cej grup mi�niowych w ramach jednej jednostki treningowej. W zwi�zku z tym zu�ywamy wi�cej energii. Taki typ</b><br>"
							+ "<b>treningu jest bardziej intensywny dla naszego organizmu. </b>"
							+ "<h4>Szybsze wzmocnienie cia�a</h4>"
							+ "<b>Niezwykle wa�ne dla os�b pocz�tkuj�cych, poniewa� �wicz�c ca�e cia�o kilka razy w tygodniu trenujemy dan� parti� kilkukrotnie, daj�c mi�niom </b><br>"
							+ "<b>wi�cej bod�c�w do rozwoju, przy czym stale uczymy si� techniki wykonywana wielu �wicze�. W konsekwencji szybciej si� rozwijamy, </b><br>"
							+ "<b>wzmacniamy i mo�emy dokonywa� zmian w naszych planach treningowych.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleNine.setSizeUndefined();
					throughtExplanationOfArticleNine.setStyleName("throughtExplanationOfArticleNine");
					throughtExplanationOfArticleNine.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleNine);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleNine);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleNineContentMenuLayout().init();
	}
}

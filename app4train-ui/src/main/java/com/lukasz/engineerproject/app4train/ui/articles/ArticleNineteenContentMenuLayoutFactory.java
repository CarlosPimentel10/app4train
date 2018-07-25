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
public class ArticleNineteenContentMenuLayoutFactory {

	private class ArticleNineteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleNineteen;
		private Label topicOfOfArticleNineteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleNineteenContentMenuLayout init() {

			topicOfOfArticleNineteen = new Label(UtilsForArticlesTitles.TOPIC_NINETEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleNineteen = new Label("<br><h4>Przysiady buduj� nogi</h4><br>"
							+ "<b>Nie ma lepszego �wiczenia dla rozwoju n�g ni� przysiady. Rozwijaj� mi�nie czworog�owe, przywodziciele, po�ladki, dwug�owe oraz �ydki. </b><br>"
							+ "<b>Je�eli chcecie, aby uda ros�y, wykorzystajcie jak�� form� przysiad�w w planie treningowym, a najlepiej w wersji klasycznej ze sztang�.</b>"
							+ "<h4>Wzmacniaj� mi�nie \"core\"</h4>"
							+ "<b>Stabilna pozycja podczas wykonywania klasycznych przysiad�w z obci��eniem jest wymagaj�ca dla gorsetu mi�niowego, jak i mi�ni core,</b><br>"
							+ "<b>kt�re odpowiedzialne s� za stabilizacj� kr�gos�upa czy miednicy. Przysiady daj� nam mo�liwo�� wzmocnienia mi�ni �rodka.</b>"
							+ "<h4>Poprawia balans mi�niowy i r�wnowag�</h4>"
							+ "<b>Przysiady poprawi� stabilno�� oraz si�� dw�ch n�g. W tym przypadku silniejsza strona cia�a zazwyczaj wspiera s�absz�. Dodatkowo, przysiady </b><br>"
							+ "<b>wymagaj� od nas utrzymania doskona�ego poczucia r�wnowagi. W zwi�zku z tym, rozwijanie grup mi�niowych odpowiedzialnych za </b><br>"
							+ "<b>utrzymanie pionowej sylwetki, tak�e b�dzie wa�ne podczas siadania.</b>"
							+ "<h4>Wzmacniaj�  grzbiet</h4>"
							+ "<b>W trakcie przysiadu wykorzystywany jest dolny odcinek mi�ni grzbietu. Wykonywanie przysiad�w obci��a uk�ad mi�niowy grzbietu, w zwi�zku z </b><br>"
							+ "<b>tym w planach treningowych nie zaleca si� wykonywa� treningu grzbietu i n�g dzie� po dniu. Grzbiet r�wnie� dostaje wtedy znaczny bodziec, co </b><br>"
							+ "<b>wymaga co najmniej jednego dnia odpoczynku.</b><br>", ContentMode.HTML);
					throughtExplanationOfArticleNineteen.setSizeUndefined();
					throughtExplanationOfArticleNineteen.setStyleName("throughtExplanationOfArticleNineteen");
					throughtExplanationOfArticleNineteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleNineteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleNineteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleNineteenContentMenuLayout().init();
	}
}

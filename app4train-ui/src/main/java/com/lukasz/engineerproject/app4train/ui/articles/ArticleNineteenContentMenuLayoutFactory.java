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
					throughtExplanationOfArticleNineteen = new Label("<br><h4>Przysiady buduj¹ nogi</h4><br>"
							+ "<b>Nie ma lepszego æwiczenia dla rozwoju nóg ni¿ przysiady. Rozwijaj¹ miêœnie czworog³owe, przywodziciele, poœladki, dwug³owe oraz ³ydki. </b><br>"
							+ "<b>Je¿eli chcecie, aby uda ros³y, wykorzystajcie jak¹œ formê przysiadów w planie treningowym, a najlepiej w wersji klasycznej ze sztang¹.</b>"
							+ "<h4>Wzmacniaj¹ miêœnie \"core\"</h4>"
							+ "<b>Stabilna pozycja podczas wykonywania klasycznych przysiadów z obci¹¿eniem jest wymagaj¹ca dla gorsetu miêœniowego, jak i miêœni core,</b><br>"
							+ "<b>które odpowiedzialne s¹ za stabilizacjê krêgos³upa czy miednicy. Przysiady daj¹ nam mo¿liwoœæ wzmocnienia miêœni œrodka.</b>"
							+ "<h4>Poprawia balans miêœniowy i równowagê</h4>"
							+ "<b>Przysiady poprawi¹ stabilnoœæ oraz si³ê dwóch nóg. W tym przypadku silniejsza strona cia³a zazwyczaj wspiera s³absz¹. Dodatkowo, przysiady </b><br>"
							+ "<b>wymagaj¹ od nas utrzymania doskona³ego poczucia równowagi. W zwi¹zku z tym, rozwijanie grup miêœniowych odpowiedzialnych za </b><br>"
							+ "<b>utrzymanie pionowej sylwetki, tak¿e bêdzie wa¿ne podczas siadania.</b>"
							+ "<h4>Wzmacniaj¹  grzbiet</h4>"
							+ "<b>W trakcie przysiadu wykorzystywany jest dolny odcinek miêœni grzbietu. Wykonywanie przysiadów obci¹¿a uk³ad miêœniowy grzbietu, w zwi¹zku z </b><br>"
							+ "<b>tym w planach treningowych nie zaleca siê wykonywaæ treningu grzbietu i nóg dzieñ po dniu. Grzbiet równie¿ dostaje wtedy znaczny bodziec, co </b><br>"
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

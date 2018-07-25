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
public class ArticleFourteenContentMenuLayoutFactory {

	private class ArticleFourteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleFourteen;
		private Label topicOfOfArticleFourteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleFourteenContentMenuLayout init() {

			topicOfOfArticleFourteen = new Label(UtilsForArticlesTitles.TOPIC_FOURTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleFourteen = new Label(
							"<br><h4>Nie potrafi wyjaœniæ na czym polega æwiczenie</h4>"
									+ "<h4>Nie dostajesz od niego „zadañ domowych”, wykonywanych poza sesjami treningowymi</h4>"
									+ "<h4>Nie monitoruje twojego treningu, w formie dziennika odnotowuj¹c twoje rezultaty</h4>"
									+ "<h4>Siedzi z telefonem podczas treningu. To œwiadczy, ¿e traktuje Ciê przedmiotowo i zale¿y mu tylko na pieni¹dzach</h4>"
									+ "<h4>Zajmuje siê wy³¹cznie liczeniem twoich powtórzeñ, zamiast zwracanie uwagi na technikê wykonywanych przez Ciebie æwiczeñ</h4>"
									+ "<h4>Brak wsparcia dla twojego rozwoju, poniewa¿ powinien polecaæ odpowiednie artyku³y, czy te¿ blogi, tak abyœ sam/sama zacz¹³/zaczê³a szukaæ wiedzy</h4>"
									+ "<h4>Robisz wy³¹cznie cardio jest oznak¹, ¿e tracisz wy³¹cznie czas</h4>"
									+ "<h4>Nie praktykuje tego co sam g³osi, co mo¿na zaobserwowaæ jak sam siê prezentuje</h4>"
									+ "<h4>Nie mówi nic o od¿ywianiu co stanowi klucz do sukcesu</h4>"
									+ "<h4>Nie wykonuje pomiarów, które niezbêdne s¹ do zaplanowania treningu</h4>"
									+ "<h4>Nie osi¹gasz rezultatów</h4>",
							ContentMode.HTML);

					throughtExplanationOfArticleFourteen.setSizeUndefined();
					throughtExplanationOfArticleFourteen.setStyleName("throughtExplanationOfArticleFourteen");
					throughtExplanationOfArticleFourteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleFourteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleFourteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleFourteenContentMenuLayout().init();
	}
}

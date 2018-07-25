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
public class ArticleThreeContentMenuLayoutFactory {

	private class ArticleThreeContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleThree;
		private Label topicOfOfArticleThree;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleThreeContentMenuLayout init() {

			topicOfOfArticleThree = new Label(UtilsForArticlesTitles.TOPIC_THREE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleThree = new Label("<br><h4>Katar</h4>"
							+ "<b>Mo¿e byæ s³abym powodem odpuszczania treningów. Jeœli odczuwasz objawy, które zlokalizowane s¹ powy¿ej szyi takie jak  katar, ból g³owy czy gard³a,  </b><br>"
							+ "<b>jednak nie masz gor¹czki nie jesteœ zmuszony do opuszczania treningu. Pomimo tego, ¿e nie musisz unikaæ przegrzania to eksperci jednak zalecaj¹ </b><br>"
							+ "<b>zmniejszenie intensywnoœæ treningu. Zbyt intensywny trening mo¿e skutkowaæ spadkiem odpornoœci naszego organizmu. Warto jednak zwróciæ uwagê, </b><br>"
							+ "<b>¿e pomimo powy¿szych zastrze¿eñ badania wykaza³y, i¿ trening podczas tych dolegliwoœci nie jest niekorzystny dla organizmu o ile jest on lekki."
							+ "<h4>Sezonowe alergie</h4>"
							+ "<b>Trening podczas stanów alergicznych mo¿e mieæ korzystny wp³yw na organizm. Niewielki wysi³ek fizyczny to czêsto dobry pomys³. Jednak </b><br>"
							+ "<b>æwiczenia na œwie¿ym powietrzu w niesprzyjaj¹cych warunkach atmosferycznych, mog¹ nie byæ jednak dobrym pomys³em. Gdy jednak </b><br>"
							+ "<b>chcesz æwiczyæ na zewn¹trz postaw na bardzo dok³adn¹, intensywn¹ rozgrzewkê. Spowoduje to odpowiednie przygotowanie organizmu do æwiczeñ w niskiej temperaturze.</b><br>"
							+ "<b>Mo¿esz równie¿ æwiczyæ w masce na ustach lub nosie. Bêdzie ona  filtrowaæ powietrze, którym oddychasz. Dziêki temu zmniejszysz iloœæ wdychanych py³ków. </b>"
							+ "<h4>Problemy ¿o³¹dkowo-jelitowe</h4>"
							+ "<b>Je¿eli Twoje problemy zwi¹zane s¹ z wymiotami czy biegunk¹ to lepiej odpuœæ trening. Trening w tym stanie skutkowaæ mo¿e jeszcze wiêkszym </b><br>"
							+ "<b>os³abieniem oraz odwodnieniem organizmu. W tym okresie nale¿y dbaæ o prawid³owy poziom p³ynów oraz na bie¿¹co uzupe³niaæ elektrolity.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleThree.setSizeUndefined();
					throughtExplanationOfArticleThree.setStyleName("throughtExplanationOfArticleThree");
					throughtExplanationOfArticleThree.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleThree);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleThree);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleThreeContentMenuLayout().init();
	}
}

package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import com.lukasz.engineerproject.app4train.utils.UtilsForNutritionalAdvicesTitles;
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
public class NutritionalAdviceTwelveContentMenuLayoutFactory {

	private class NutritionalAdviceTwelveContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceTwelve;
		private Label topicOfOfNutritionalAdviceTwelve;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceTwelveContentMenuLayout init() {

			topicOfOfNutritionalAdviceTwelve = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_TWELVE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceTwelve = new Label(
							"<b><br><br>Najbardziej szkodliwe dla zdrowia s¹ kwasy t³uszczowe typu t³uszcze trans. To utwardzone oleje roœlinne powstaj¹ce w </b><br>"
									+ "<b>procesie uwodornienia. P³ynne oleje powoduj¹ zmianê konsystencji na sta³¹ lub miêkk¹ formê, odpowiedni¹ do  </b><br>"
									+ "<b>smarowania. Oleje tego typu pozbawione s¹ wszelkich zdrowotnych w³aœciwoœci, staj¹c siê jednoczeœnie produktem niezdrowym.</b>"
									+ "<h4>Gdzie je znajdziemy?</h4>"
									+ "<b>•	S³one przek¹ski w postaci chipsów, paluszków, krakersów. Im bardziej s¹ chrupi¹ce, tym wiêcej utwardzonych olejów roœlinnych posiadaj¹.  </b><br>"
									+ "<b>•	S³odycze takie jak np. p¹czki, ciasta, ciastka, herbatniki, produkty czekoladowe oraz batony.  </b><br>"
									+ "<b>•	Fast-foody w postaci frytek oraz dañ sma¿onych na g³êbokim t³uszczu. </b><br>"
									+ "<b>•	Zupy w proszku, majonez, a tak¿e koncentraty zup i sosów. </b>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceTwelve.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceTwelve
							.setStyleName("throughtExplanationOfNutritionalAdviceTwelve");
					throughtExplanationOfNutritionalAdviceTwelve.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceTwelve);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceTwelve);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceTwelveContentMenuLayout().init();
	}
}
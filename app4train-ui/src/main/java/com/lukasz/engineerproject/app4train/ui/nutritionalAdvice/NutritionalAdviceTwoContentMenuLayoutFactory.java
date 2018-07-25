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
public class NutritionalAdviceTwoContentMenuLayoutFactory {

	private class NutritionalAdviceTwoContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceTwo;
		private Label topicOfOfNutritionalAdviceTwo;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceTwoContentMenuLayout init() {

			topicOfOfNutritionalAdviceTwo = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_TWO.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceTwo = new Label("<br><h4>S³odkie soki owocowe</h4>"
							+ "<b>Soki s¹ zwykle wzbogacane s¹ o ma³o cenny sk³adnik, czyli cukier. Wiêc te¿ zamiast kupowaæ butelkê soku multiwitaminowego, kup dziecku œwie¿e owoce, </b><br>"
							+ "<b>pokrój i przyrz¹dŸ sa³atkê.</b>" + "<h4>Miód</h4>"
							+ "<b>Rzecznicy Akademii ¯ywienia i Dietetyki g³osz¹, ¿eby dziecku do lat 2 nie podawaæ miodu, poniewa¿ mo¿e zawieraæ toksyczne bakterie, </b><br>"
							+ "<b>które spowodowaæ mog¹ zatrucie jadem kie³basianym.</b><br>"
							+ "<h4>Gazowane napoje</h4>"
							+ "<b>Wiele badañ wykazuj¹, i¿ napoje gazowane, w szczególnoœci te kolorowe, nafaszerowane s¹ cukrem. </b>"
							+ "<h4>S³odkie przek¹ski</h4>"
							+ "<b>Wszystkie s³odkie przek¹ski dostarczaj¹ nie tylko sporej iloœci dodatkowego cukru naszym dzieciom, ale równie¿ sporej iloœci </b><br>"
							+ "<b>barwników i konserwantów. Wykorzystuj¹c </b><br>"
							+ "<b>pe³noziarnist¹ m¹kê, dobrej jakoœci suszone owoce, orzechy, mo¿na sporz¹dziæ ciekawe „s³odkie” dodatki do diety, które zawieraj¹ du¿o wiêcej wartoœci</b><br>"
							+ "<b>od¿ywczych, w porównaniu z ich tradycyjnymi zamiennikami.</b>"
							+ "<h4>Musli œniadaniowe</h4>"
							+ "<b>Sporo rodziców siêga po s³odkie musli œniadaniowe dla swoich dzieci. Zawieraj¹ jednak spore iloœci cukru, oraz czêsto pozbawione </b><br>"
							+ "<b>s¹ b³onnika pokarmowego, tak bardzo potrzebnego dzieciom.</b><br>", ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceTwo.setStyleName("throughtExplanationOfNutritionalAdviceTwo");
					throughtExplanationOfNutritionalAdviceTwo.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceTwo.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceTwo);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceTwo);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceTwoContentMenuLayout().init();
	}
}
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
public class NutritionalAdviceFourContentMenuLayoutFactory {

	private class NutritionalAdviceFourContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceFour;
		private Label topicOfOfNutritionalAdviceFour;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceFourContentMenuLayout init() {

			topicOfOfNutritionalAdviceFour = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_FOUR.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceFour = new Label(
							"<b><br><br>�elatyna jest substancj� bia�kow� posiadaj�c� du�� zawarto�� kolagenu. Zar�wno sportowcy jak i osoby obarczone du�ym </b><br>"
									+ "<b>wysi�kiem fizycznym s� cz�ciej nara�one na urazy i kontuzje staw�w. Badania pokazuj�, i� �elatyna mo�e wp�ywa� na �agodzenie b�li staw�w, </b><br>"
									+ "<b>jednak nie mo�na popada� w zbytni optymizm. Dalej brakuje naukowych dowod�w na to, �e poka�na i regularna jej obecno�� w diecie wp�ynie na  </b><br>"
									+ "<b>szybsz� regeneracj� staw�w po urazach. Najwa�niejsza jest zbilansowana dieta, kt�ra b�dzie wspiera� procesy prawid�owej syntezy kolagenu. </b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceFour
							.setStyleName("throughtExplanationOfNutritionalAdviceFour");
					throughtExplanationOfNutritionalAdviceFour.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceFour.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceFour);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceFour);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceFourContentMenuLayout().init();
	}
}
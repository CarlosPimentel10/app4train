package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import com.lukasz.engineerproject.app4train.utils.NutritionalAdvicesTitles;
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
public class NutritionalAdviceSixContentMenuLayoutFactory {

	private class NutritionalAdviceSixContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceSix;
		private Button buttonForWindow;

		public NutritionalAdviceSixContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceSix = new Label(NutritionalAdvicesTitles.TOPIC_SIX.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceSix);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareButton() {
			buttonForWindow = new Button();
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);
		}

		private void buttonAction() {
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceSix = new Label(
							"<b><br><br>Posi�ek potreningowy powinien sk�ada� si� z bia�ka i w�glowodan�w. T�uszcze z kolei, powinny by� ograniczone. Zar�wno bia�ko jak i </b><br>"
									+ "<b>w�glowodany przyj�te po treningu, od�ywiaj� nasze mi�nie, pozwalaj�ce im prawid�ow� rozbudow�, uzupe�nienie zasob�w energii utraconych </b><br>"
									+ "<b>podczas treningu oraz regeneracj� uszkodze� w��kien mi�niowych spowodowanych treningiem. Dlaczego? Dlatego, �e bia�ka s� z�o�one z  </b><br>"
									+ "<b>aminokwas�w, niezb�dnych przy budowie naszych mi�ni, natomiast w�glowodany uzupe�niaj� glikogen. Nie powinni�my spo�ywa� t�uszczu </b><br>"
									+ "<b>w posi�ku potreningowym, dlatego �e  spowalnia nasz metabolizm, kt�ry ju� jest mocno rozp�dzony po wykonaniu treningu. Dodatkowo</b><br>"
									+ "<b>t�uszcz jest ci�kostrawny, a nasz �o��dek po treningu jest nieco delikatny, dlatego lepiej go nie obci��a�.</b>"
									+ "<h4>Kiedy najlepiej spo�y� posi�ek potreningowy i w jakiej formie go spo�ywa�? </h4>"
									+ "<b>Posi�ek potreningowy najlepiej spo�y� w formie p�ynnej tzw. shake w�glowodanowo-bia�kowy. Powinien by� on spo�yty oko�o p� godziny po </b><br>"
									+ "<b>treningu. Nie powinni�my spo�ywa� go od razu po treningu, dlatego �e nasz organizm powinien zregenerowa� si� po wysi�ku, a krew powinna </b><br>"
									+ "<b>wr�ci� do normalnego obiegu. </b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceSix.setStyleName("throughtExplanationOfNutritionalAdviceSix");
					throughtExplanationOfNutritionalAdviceSix.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfNutritionalAdviceSix.setSizeUndefined();
					window.setContent(throughtExplanationOfNutritionalAdviceSix);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceSixContentMenuLayout().init();
	}
}
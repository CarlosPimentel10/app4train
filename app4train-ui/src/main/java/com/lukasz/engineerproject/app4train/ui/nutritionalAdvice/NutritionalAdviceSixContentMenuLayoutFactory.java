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
							"<b><br><br>Posi³ek potreningowy powinien sk³adaæ siê z bia³ka i wêglowodanów. T³uszcze z kolei, powinny byæ ograniczone. Zarówno bia³ko jak i </b><br>"
									+ "<b>wêglowodany przyjête po treningu, od¿ywiaj¹ nasze miêœnie, pozwalaj¹ce im prawid³ow¹ rozbudowê, uzupe³nienie zasobów energii utraconych </b><br>"
									+ "<b>podczas treningu oraz regeneracjê uszkodzeñ w³ókien miêœniowych spowodowanych treningiem. Dlaczego? Dlatego, ¿e bia³ka s¹ z³o¿one z  </b><br>"
									+ "<b>aminokwasów, niezbêdnych przy budowie naszych miêœni, natomiast wêglowodany uzupe³niaj¹ glikogen. Nie powinniœmy spo¿ywaæ t³uszczu </b><br>"
									+ "<b>w posi³ku potreningowym, dlatego ¿e  spowalnia nasz metabolizm, który ju¿ jest mocno rozpêdzony po wykonaniu treningu. Dodatkowo</b><br>"
									+ "<b>t³uszcz jest ciê¿kostrawny, a nasz ¿o³¹dek po treningu jest nieco delikatny, dlatego lepiej go nie obci¹¿aæ.</b>"
									+ "<h4>Kiedy najlepiej spo¿yæ posi³ek potreningowy i w jakiej formie go spo¿ywaæ? </h4>"
									+ "<b>Posi³ek potreningowy najlepiej spo¿yæ w formie p³ynnej tzw. shake wêglowodanowo-bia³kowy. Powinien byæ on spo¿yty oko³o pó³ godziny po </b><br>"
									+ "<b>treningu. Nie powinniœmy spo¿ywaæ go od razu po treningu, dlatego ¿e nasz organizm powinien zregenerowaæ siê po wysi³ku, a krew powinna </b><br>"
									+ "<b>wróciæ do normalnego obiegu. </b><br>",
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
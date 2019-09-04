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
public class NutritionalAdviceFiveContentMenuLayoutFactory {

	private class NutritionalAdviceFiveContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceFive;
		private Button buttonForWindow;

		public NutritionalAdviceFiveContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceFive = new Label(NutritionalAdvicesTitles.TOPIC_FIVE.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceFive);
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
					throughtExplanationOfNutritionalAdviceFive = new Label(
							"<br><br><b>Sery twarogowe s� popularnym elementem diety os�b b�d�cych na diecie, a tak�e os�b aktywnych fizycznie.</b>"
									+ "<h4>Kaloryczno�� sera twarogowego</h4>"
									+ "<b>Bior�c pod uwag� ilo�� t�uszczu mlecznego wyr�niamy twar�g chudy, p�t�usty i t�usty. Twar�g chudy b�dzie najmniej kaloryczny, a tak�e </b><br>"
									+ "<b>b�dzie zawiera� najmniej t�uszczy.</b>"
									+ "<h4>Co cennego znajdziemy w bia�ym serze twarogowym?</h4>"
									+ "<b>Je�li m�wimy o serze p�t�ustym lub t�ustym znajdziemy w nim witaminy A, D, E, K. Twar�g jest tak�e dobrym �r�d�em witaminy B2. W mniejszych </b><br>"
									+ "<b>ilo�ciach dostarcza te� witaminy B12. Twar�g dostarcza niewielkie ilo�ci wapnia, potasu oraz magnezu, jednak 100 g sera twarogowego dostarcza </b><br>"
									+ "<b>oko�o 70-100mg wapnia, gdy dzienne zapotrzebowanie cz�owieka wynosi 1000-1200mg. Wida�, �e aby pokry� dzienne zapotrzebowanie, </b><br>"
									+ "<b>zmuszeni byliby�my zje�� co najmniej kilogram twarogu.</b>"
									+ "<h4>Niski indeks glikemiczny</h4>"
									+ "<b>Twar�g zawiera jedynie niewielkie ilo�ci laktozy, co sprawi, ze jest produktem niskiego indeksu glikemicznego.</b><br>"
									+ "<b>swoje mi�nie aminokwasami z samego rana. Pomimo, �e nie b�dzie to posi�ek bardzo syty, b�dzie stanowi� dobr� opcj�, na pocz�tek dnia.</b>"
									+ "<h4>Twar�g nie dla ka�dego</h4>"
									+ "<b>Nie na wszystkich produkty pochodzenia mlecznego dobrze oddzia�uj�. Je�eli odczuwasz dyskomfort trawienny, reakcje alergiczne, wypryski, </b><br>"
									+ "<b>powiniene� ograniczy� spo�ycie twarogu.</b>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceFive.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceFive
							.setStyleName("throughtExplanationOfNutritionalAdviceFive");
					throughtExplanationOfNutritionalAdviceFive.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceFive);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceFiveContentMenuLayout().init();
	}
}
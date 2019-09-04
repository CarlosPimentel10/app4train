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
							"<br><br><b>Sery twarogowe s¹ popularnym elementem diety osób bêd¹cych na diecie, a tak¿e osób aktywnych fizycznie.</b>"
									+ "<h4>Kalorycznoœæ sera twarogowego</h4>"
									+ "<b>Bior¹c pod uwagê iloœæ t³uszczu mlecznego wyró¿niamy twaróg chudy, pó³t³usty i t³usty. Twaróg chudy bêdzie najmniej kaloryczny, a tak¿e </b><br>"
									+ "<b>bêdzie zawiera³ najmniej t³uszczy.</b>"
									+ "<h4>Co cennego znajdziemy w bia³ym serze twarogowym?</h4>"
									+ "<b>Jeœli mówimy o serze pó³t³ustym lub t³ustym znajdziemy w nim witaminy A, D, E, K. Twaróg jest tak¿e dobrym Ÿród³em witaminy B2. W mniejszych </b><br>"
									+ "<b>iloœciach dostarcza te¿ witaminy B12. Twaróg dostarcza niewielkie iloœci wapnia, potasu oraz magnezu, jednak 100 g sera twarogowego dostarcza </b><br>"
									+ "<b>oko³o 70-100mg wapnia, gdy dzienne zapotrzebowanie cz³owieka wynosi 1000-1200mg. Widaæ, ¿e aby pokryæ dzienne zapotrzebowanie, </b><br>"
									+ "<b>zmuszeni bylibyœmy zjeœæ co najmniej kilogram twarogu.</b>"
									+ "<h4>Niski indeks glikemiczny</h4>"
									+ "<b>Twaróg zawiera jedynie niewielkie iloœci laktozy, co sprawi, ze jest produktem niskiego indeksu glikemicznego.</b><br>"
									+ "<b>swoje miêœnie aminokwasami z samego rana. Pomimo, ¿e nie bêdzie to posi³ek bardzo syty, bêdzie stanowiæ dobr¹ opcjê, na pocz¹tek dnia.</b>"
									+ "<h4>Twaróg nie dla ka¿dego</h4>"
									+ "<b>Nie na wszystkich produkty pochodzenia mlecznego dobrze oddzia³uj¹. Je¿eli odczuwasz dyskomfort trawienny, reakcje alergiczne, wypryski, </b><br>"
									+ "<b>powinieneœ ograniczyæ spo¿ycie twarogu.</b>",
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
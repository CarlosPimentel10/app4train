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
					throughtExplanationOfNutritionalAdviceTwo = new Label("<br><h4>S�odkie soki owocowe</h4>"
							+ "<b>Soki s� zwykle wzbogacane s� o ma�o cenny sk�adnik, czyli cukier. Wi�c te� zamiast kupowa� butelk� soku multiwitaminowego, kup dziecku �wie�e owoce, </b><br>"
							+ "<b>pokr�j i przyrz�d� sa�atk�.</b>" + "<h4>Mi�d</h4>"
							+ "<b>Rzecznicy Akademii �ywienia i Dietetyki g�osz�, �eby dziecku do lat 2 nie podawa� miodu, poniewa� mo�e zawiera� toksyczne bakterie, </b><br>"
							+ "<b>kt�re spowodowa� mog� zatrucie jadem kie�basianym.</b><br>"
							+ "<h4>Gazowane napoje</h4>"
							+ "<b>Wiele bada� wykazuj�, i� napoje gazowane, w szczeg�lno�ci te kolorowe, nafaszerowane s� cukrem. </b>"
							+ "<h4>S�odkie przek�ski</h4>"
							+ "<b>Wszystkie s�odkie przek�ski dostarczaj� nie tylko sporej ilo�ci dodatkowego cukru naszym dzieciom, ale r�wnie� sporej ilo�ci </b><br>"
							+ "<b>barwnik�w i konserwant�w. Wykorzystuj�c </b><br>"
							+ "<b>pe�noziarnist� m�k�, dobrej jako�ci suszone owoce, orzechy, mo�na sporz�dzi� ciekawe �s�odkie� dodatki do diety, kt�re zawieraj� du�o wi�cej warto�ci</b><br>"
							+ "<b>od�ywczych, w por�wnaniu z ich tradycyjnymi zamiennikami.</b>"
							+ "<h4>Musli �niadaniowe</h4>"
							+ "<b>Sporo rodzic�w si�ga po s�odkie musli �niadaniowe dla swoich dzieci. Zawieraj� jednak spore ilo�ci cukru, oraz cz�sto pozbawione </b><br>"
							+ "<b>s� b�onnika pokarmowego, tak bardzo potrzebnego dzieciom.</b><br>", ContentMode.HTML);
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
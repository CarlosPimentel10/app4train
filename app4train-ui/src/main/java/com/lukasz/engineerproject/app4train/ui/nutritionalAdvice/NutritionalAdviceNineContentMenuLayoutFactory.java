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
public class NutritionalAdviceNineContentMenuLayoutFactory {

	private class NutritionalAdviceNineContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceNine;
		private Label topicOfOfNutritionalAdviceNine;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceNineContentMenuLayout init() {

			topicOfOfNutritionalAdviceNine = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_NINE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceNine = new Label(
							"<b><br><br>Warzywa i owoce to podstawowe elementy naszej diety, które dostarczaj¹ nam cenne witaminy i minera³y. Wa¿ne jest umiejêtne </b><br>"
									+ "<b>przechowywanie ich w lodówce tak aby wyd³u¿yæ ich ¿ywotnoœæ. Wiêkszoœæ warzyw i owoców powinno trzymaæ siê w lodówce. Warzywa i </b><br>"
									+ "<b>owoce powinny byæ umieszczone na œrodkowej pó³ce w lodówce gdzie jest odpowiednia regulacja temperatury. Niektóre produkty takie jak np. </b><br>"
									+ "<b>mango, ananas, banany czy te¿ awokado nie powinny byæ umieszczane w lodówce, poniewa¿ mog¹ siê szybciej psuæ. Owoce tropikalne nale¿y </b><br>"
									+ "<b>przechowywaæ w miejscach suchych i ciep³ych. Podobnie cytryny, które mo¿na przechowywaæ oko³o dwóch tygodni poza lodówk¹.</b><br>"
									+ "<b>Warzywa takie jak ogórki, pomidory czy cukinie powinniœmy przechowywaæ w cieplejszych miejscach. Niska temperatura powoduje, ¿e </b><br>"
									+ "<b>trac¹ walory smakowe. Podobnie ma siê sytuacja z cebul¹ czy ziemniakami. Ziemniaki preferuj¹ suche i ciemne lokalizacje. Czosnek </b><br>"
									+ "<b>równie¿ nie lubi niskich temperatur. Niskie temperatury korzystne s¹ dla brukselki i kapusty. Natomiast jab³ka oraz gruszki mog¹ byæ </b><br>"
									+ "<b>przechowywane w ró¿nych temperaturach.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceNine.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceNine
							.setStyleName("throughtExplanationOfNutritionalAdviceNine");
					throughtExplanationOfNutritionalAdviceNine.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceNine);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceNine);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceNineContentMenuLayout().init();
	}
}
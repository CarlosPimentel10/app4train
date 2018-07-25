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
							"<b><br><br>Warzywa i owoce to podstawowe elementy naszej diety, kt�re dostarczaj� nam cenne witaminy i minera�y. Wa�ne jest umiej�tne </b><br>"
									+ "<b>przechowywanie ich w lod�wce tak aby wyd�u�y� ich �ywotno��. Wi�kszo�� warzyw i owoc�w powinno trzyma� si� w lod�wce. Warzywa i </b><br>"
									+ "<b>owoce powinny by� umieszczone na �rodkowej p�ce w lod�wce gdzie jest odpowiednia regulacja temperatury. Niekt�re produkty takie jak np. </b><br>"
									+ "<b>mango, ananas, banany czy te� awokado nie powinny by� umieszczane w lod�wce, poniewa� mog� si� szybciej psu�. Owoce tropikalne nale�y </b><br>"
									+ "<b>przechowywa� w miejscach suchych i ciep�ych. Podobnie cytryny, kt�re mo�na przechowywa� oko�o dw�ch tygodni poza lod�wk�.</b><br>"
									+ "<b>Warzywa takie jak og�rki, pomidory czy cukinie powinni�my przechowywa� w cieplejszych miejscach. Niska temperatura powoduje, �e </b><br>"
									+ "<b>trac� walory smakowe. Podobnie ma si� sytuacja z cebul� czy ziemniakami. Ziemniaki preferuj� suche i ciemne lokalizacje. Czosnek </b><br>"
									+ "<b>r�wnie� nie lubi niskich temperatur. Niskie temperatury korzystne s� dla brukselki i kapusty. Natomiast jab�ka oraz gruszki mog� by� </b><br>"
									+ "<b>przechowywane w r�nych temperaturach.</b><br>",
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
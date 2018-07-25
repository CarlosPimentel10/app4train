package com.lukasz.engineerproject.app4train.ui.bodyMassIndex;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = BodyMassIndexExplanation.NAME, ui = App4TrainMainUI.class)
public class BodyMassIndexExplanation extends VerticalLayout implements View {

	public static final String NAME = "cotojestbmi?";
	private Label labelForExplanation;
	private Panel panel;

	private void addLayout() {

		setMargin(true);
		panel = new Panel("Co to jest BMI?");
		panel.setWidth("100%");
		labelForExplanation = new Label(
				"<b>Wska�nik masy cia�a (BMI) (ang. Body Mass Index)</b> �  to wsp�czynnik uzyskany przez podzielenie masy cia�a podanej w (kg) przez kwadrat wysoko�ci podanej w (m). Zakres warto�ci wska�nika BMI stosowany jest tylko w stosunku do os�b doros�ych. \r\n"
						+ "Wska�nik ten ma znaczenie w ocenie zagro�enia chorobami wynikaj�ce z nadwagi i oty�o�ci, np. cukrzyc�, mia�d�yc�. Podwy�szona warto�� tego wska�nika zwi�ksza ryzyko wyst�pienia takich chor�b.\r\n"
						+ "BMI jest bardzo prosty w u�yciu, jednak nie uwzgl�dnia on indywidualnej budowy cia�a. Jest on dosy� niedok�adnym wska�nikiem zar�wno niedowagi jak i nadwagi, kt�re mog� stanowi� zagro�enie dla zdrowia. Kulturysta mo�e mie� BMI wskazuj�ce na skrajn� oty�o��, posiadaj�c jednocze�nie niewielk�  tkank� t�uszczow�. Z drugiej strony, wska�nik zupe�nie zdrowych, szczup�ych oraz wysokich lekkoatlet�w mo�e wykazywa� skrajn� niedowag�. To potwierdza jego faktyczn� niedok�adno��.\r\n",
				ContentMode.HTML);

		panel.setContent(labelForExplanation);
		labelForExplanation.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		addComponent(panel);

	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();

	}

}

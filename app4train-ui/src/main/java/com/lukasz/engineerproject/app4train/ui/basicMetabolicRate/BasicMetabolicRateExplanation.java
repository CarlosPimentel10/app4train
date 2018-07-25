package com.lukasz.engineerproject.app4train.ui.basicMetabolicRate;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = BasicMetabolicRateExplanation.NAME, ui = App4TrainMainUI.class)
public class BasicMetabolicRateExplanation extends VerticalLayout implements View {

	public static final String NAME = "cotojestbmr?";
	private Label labelForExplanation;
	private Panel panel;

	private void addLayout() {

		setMargin(true);
		panel = new Panel("Co to jest BMR?");
		panel.setWidth("100%");
		labelForExplanation = new Label(
				"<b>Podstawowa Przemiana Materii (PPM) (ang. Basic Metabolic Rate)</b> - oznacza wydatek energetyczny, jaki konieczny jest do utrzymania funkcji �yciowych takich jak np. oddychanie. Ilo�� dostarczonej energii, zawieraj�ca si� w BMR, wp�ywa r�wnie� na prawid�ow� funkcje metaboliczn�, w tym funkcje hormonalne. Mo�na powiedzie�, �e jest to ilo�� jedzenia niezb�dna by prze�y�. Utrzymywanie stanu kalorycznego poni�ej BMR mo�e by� dla naszego organizmu bardzo niebezpieczne poniewa� grozi upo�ledzeniem funkcji wydzielniczych, rozrodczych czy metabolicznych.\r\n"
						+ "Warto�� ta nie uwzgl�dnia wydatku energetycznego niezb�dnego dla aktywno�ci dnia codziennego, dlatego nie stanowi podstawy do u�o�enia zbilansowanej diety. Stanowi jednak podstaw� do obliczenia ca�kowitego zapotrzebowania kalorycznego uwzgl�dniaj�c typ budowy cia�a. \r\n",
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

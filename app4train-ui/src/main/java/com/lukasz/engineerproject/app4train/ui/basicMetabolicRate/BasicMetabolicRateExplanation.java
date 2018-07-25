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
				"<b>Podstawowa Przemiana Materii (PPM) (ang. Basic Metabolic Rate)</b> - oznacza wydatek energetyczny, jaki konieczny jest do utrzymania funkcji ¿yciowych takich jak np. oddychanie. Iloœæ dostarczonej energii, zawieraj¹ca siê w BMR, wp³ywa równie¿ na prawid³ow¹ funkcje metaboliczn¹, w tym funkcje hormonalne. Mo¿na powiedzieæ, ¿e jest to iloœæ jedzenia niezbêdna by prze¿yæ. Utrzymywanie stanu kalorycznego poni¿ej BMR mo¿e byæ dla naszego organizmu bardzo niebezpieczne poniewa¿ grozi upoœledzeniem funkcji wydzielniczych, rozrodczych czy metabolicznych.\r\n"
						+ "Wartoœæ ta nie uwzglêdnia wydatku energetycznego niezbêdnego dla aktywnoœci dnia codziennego, dlatego nie stanowi podstawy do u³o¿enia zbilansowanej diety. Stanowi jednak podstawê do obliczenia ca³kowitego zapotrzebowania kalorycznego uwzglêdniaj¹c typ budowy cia³a. \r\n",
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

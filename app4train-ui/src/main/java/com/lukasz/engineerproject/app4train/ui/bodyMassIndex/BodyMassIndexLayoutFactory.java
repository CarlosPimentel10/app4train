package com.lukasz.engineerproject.app4train.ui.bodyMassIndex;

import org.springframework.beans.factory.annotation.Autowired;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.TabSheet.Tab;

@SpringView(name = BodyMassIndexLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class BodyMassIndexLayoutFactory extends VerticalLayout implements View, BodyMassIndexSavedListener {

	public static final String NAME = "obliczbmi";
	private TabSheet tabSheet;

	@Autowired
	private CalculateBodyMassIndexLayoutFactory addBodyMassIndexFactory;

	@Autowired
	private ShowAllCalculatedBodyMassIndexLayoutFactory showBodyMassIndexFactory;

	private void addLayout() {

		setMargin(false);
		tabSheet = new TabSheet();
		tabSheet.setWidth("100%");

		Component addBodyMassIndexTab = addBodyMassIndexFactory.createComponent(this);
		Component showBodyMassIndexTab = showBodyMassIndexFactory.createComponent();

		Tab tabAddBodyMassIndex = tabSheet.addTab(addBodyMassIndexTab, StringUtils.MENU_CALCULATE_BMI.getString());
		tabAddBodyMassIndex.setIcon(FontAwesome.CHECK);
		Tab tabShowBodyMassIndex = tabSheet.addTab(showBodyMassIndexTab,
				StringUtils.MENU_SHOW_ALL_CALCULATED_BMI.getString());
		tabShowBodyMassIndex.setIcon(FontAwesome.SEARCH);

		addComponent(tabSheet);
	}

	public void bodyMassIndexSaved() {
		showBodyMassIndexFactory.refreshTables();

	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}

}

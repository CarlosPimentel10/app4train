package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

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

@SpringView(name = BodyAdiposityIndexLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class BodyAdiposityIndexLayoutFactory extends VerticalLayout implements View, BodyAdiposityIndexSavedListener {

	public static final String NAME = "obliczbai";
	private TabSheet tabSheet;

	@Autowired
	private CalculateBodyAdiposityIndexLayoutFactory addBodyAdiposityIndexFactory;

	@Autowired
	private ShowAllCalculatedBodyAdiposityIndexLayoutFactory showBodyAdiposityIndexFactory;

	private void addLayout() {

		// setMargin(true);
		setMargin(false);
		tabSheet = new TabSheet();
		tabSheet.setWidth("100%");

		Component addBodyAdiposityIndexTab = addBodyAdiposityIndexFactory.createComponent(this);
		Component showBodyAdiposityIndexTab = showBodyAdiposityIndexFactory.createComponent();

		Tab tabAddBodyMassIndex = tabSheet.addTab(addBodyAdiposityIndexTab, StringUtils.MENU_CALCULATE_BAI.getString());
		tabAddBodyMassIndex.setIcon(FontAwesome.CHECK);
		Tab tabShowBodyMassIndex = tabSheet.addTab(showBodyAdiposityIndexTab,
				StringUtils.MENU_SHOW_ALL_CALCULATED_BAI.getString());
		tabShowBodyMassIndex.setIcon(FontAwesome.SEARCH);

		addComponent(tabSheet);
	}

	public void bodyAdiposityIndexSaved() {
		showBodyAdiposityIndexFactory.refreshTables();

	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}

}

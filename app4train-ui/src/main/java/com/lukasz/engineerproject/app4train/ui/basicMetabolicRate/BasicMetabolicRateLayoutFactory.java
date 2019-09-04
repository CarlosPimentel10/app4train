package com.lukasz.engineerproject.app4train.ui.basicMetabolicRate;

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

@SpringView(name = BasicMetabolicRateLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class BasicMetabolicRateLayoutFactory extends VerticalLayout implements View, BasicMetabolicRateSavedListener {

	public static final String NAME = "obliczbmr";

	private final CalculateBasicMetabolicRateLayoutFactory addBasicMetabolicRateFactory;

	private final ShowAllCalculatedBasicMetabolicRateLayoutFactory showBasicMetabolicRateFactory;

	public BasicMetabolicRateLayoutFactory(
			CalculateBasicMetabolicRateLayoutFactory addBasicMetabolicRateFactory,
			ShowAllCalculatedBasicMetabolicRateLayoutFactory showBasicMetabolicRateFactory) {
		this.addBasicMetabolicRateFactory = addBasicMetabolicRateFactory;
		this.showBasicMetabolicRateFactory = showBasicMetabolicRateFactory;
	}

	private void addLayout() {

		setMargin(false);

		TabSheet tabSheet = new TabSheet();
		tabSheet.setWidth("100%");

		Component addBasicMetabolicRateTab = addBasicMetabolicRateFactory.createComponent(this);
		Component showBasicMetabolicRateTab = showBasicMetabolicRateFactory.createComponent();

		Tab tabAddBasicMetabolicRate = tabSheet.addTab(addBasicMetabolicRateTab,
				StringUtils.MENU_CALCULATE_BMR.getString());
		tabAddBasicMetabolicRate.setIcon(FontAwesome.CHECK);
		Tab tabShowBasicMetabolicRate = tabSheet.addTab(showBasicMetabolicRateTab,
				StringUtils.MENU_SHOW_ALL_CALCULATED_BMR.getString());
		tabShowBasicMetabolicRate.setIcon(FontAwesome.SEARCH);

		addComponent(tabSheet);
	}

	public void basicMetabolicRateSaved() {
		showBasicMetabolicRateFactory.refreshTables();

	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}
}

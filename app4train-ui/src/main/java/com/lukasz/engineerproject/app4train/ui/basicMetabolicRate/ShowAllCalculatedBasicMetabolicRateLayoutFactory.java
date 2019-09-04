package com.lukasz.engineerproject.app4train.ui.basicMetabolicRate;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BasicMetabolicRateEntity;
import com.lukasz.engineerproject.app4train.service.bmr.ShowAllBasicMetabolicRateService;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ShowAllCalculatedBasicMetabolicRateLayoutFactory implements UIComponentBuilder {

	private List<BasicMetabolicRateEntity> basicMetabolicRateEntity;
	private BeanItemContainer<BasicMetabolicRateEntity> container;
	private final ShowAllBasicMetabolicRateService showAllBasicMetabolicRateService;

	public ShowAllCalculatedBasicMetabolicRateLayoutFactory(ShowAllBasicMetabolicRateService showAllBasicMetabolicRateService) {
		this.showAllBasicMetabolicRateService = showAllBasicMetabolicRateService;
	}

	private class ShowBasicMetabolicRateLayout extends VerticalLayout {

		private Grid basicMetabolicRateTable;

		public ShowBasicMetabolicRateLayout init() {

			setMargin(true);
			container = new BeanItemContainer<BasicMetabolicRateEntity>(BasicMetabolicRateEntity.class, basicMetabolicRateEntity);
			basicMetabolicRateTable = new Grid(container);
			basicMetabolicRateTable.setColumnOrder("basicMetabolicRateResult", "userGrowth", "dryMuscleWeight", "user");
			basicMetabolicRateTable.getColumn("basicMetabolicRateResult").setHeaderCaption("BMR");
			basicMetabolicRateTable.getColumn("userGrowth").setHeaderCaption("Wzrost");
			basicMetabolicRateTable.getColumn("dryMuscleWeight").setHeaderCaption("Sucha waga miêœni");
			basicMetabolicRateTable.getColumn("user").setHeaderCaption("U¿ytkownik");
			basicMetabolicRateTable.removeColumn("id");
			basicMetabolicRateTable.setWidth("100%");
			basicMetabolicRateTable.setImmediate(true);

			return this;
		}

		public ShowBasicMetabolicRateLayout layout() {
			addComponent(basicMetabolicRateTable);
			return this;
		}

		ShowBasicMetabolicRateLayout load() {
			basicMetabolicRateEntity = showAllBasicMetabolicRateService.getAllBasicMetabolicRate();
			return this;
		}
	}

	void refreshTables() {
		basicMetabolicRateEntity = showAllBasicMetabolicRateService.getAllBasicMetabolicRate();
		container.removeAllItems();
		container.addAll(basicMetabolicRateEntity);
	}

	public Component createComponent() {
		return new ShowBasicMetabolicRateLayout().load().init().layout();
	}
}
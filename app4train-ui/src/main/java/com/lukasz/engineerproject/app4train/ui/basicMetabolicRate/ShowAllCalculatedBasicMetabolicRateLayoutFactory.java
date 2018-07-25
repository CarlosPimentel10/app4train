package com.lukasz.engineerproject.app4train.ui.basicMetabolicRate;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;
import com.lukasz.engineerproject.app4train.service.showBasicMetabolicRateResult.ShowAllBasicMetabolicRateService;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ShowAllCalculatedBasicMetabolicRateLayoutFactory implements UIComponentBuilder {

	private List<BasicMetabolicRate> basicMetabolicRate;
	private BeanItemContainer<BasicMetabolicRate> container;

	private class ShowBasicMetabolicRateLayout extends VerticalLayout {

		private Grid basicMetabolicRateTable;

		public ShowBasicMetabolicRateLayout init() {

			setMargin(true);
			container = new BeanItemContainer<BasicMetabolicRate>(BasicMetabolicRate.class, basicMetabolicRate);
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

		public ShowBasicMetabolicRateLayout load() {
			basicMetabolicRate = showAllBasicMetabolicRateService.getAllBasicMetabolicRate();
			return this;
		}
	}

	public void refreshTables() {
		basicMetabolicRate = showAllBasicMetabolicRateService.getAllBasicMetabolicRate();
		container.removeAllItems();
		container.addAll(basicMetabolicRate);
	}

	@Autowired
	private ShowAllBasicMetabolicRateService showAllBasicMetabolicRateService;

	public Component createComponent() {
		return new ShowBasicMetabolicRateLayout().load().init().layout();
	}
}
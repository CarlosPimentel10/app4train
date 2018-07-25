package com.lukasz.engineerproject.app4train.ui.basicMetabolicRate;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;
import com.lukasz.engineerproject.app4train.service.removeBasicMetabolicRate.RemoveBasicMetabolicRateService;
import com.lukasz.engineerproject.app4train.service.showBasicMetabolicRateResult.ShowAllBasicMetabolicRateService;
import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.lukasz.engineerproject.app4train.utils.NotificationMessages;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Grid.MultiSelectionModel;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = RemoveBasicMetabolicRateLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class RemoveBasicMetabolicRateLayoutFactory extends VerticalLayout implements View, Button.ClickListener {

	@Autowired
	private ShowAllBasicMetabolicRateService showAllBasicMetabolicRateService;

	@Autowired
	private RemoveBasicMetabolicRateService removeBasicMetabolicRateService;

	public static final String NAME = "usuñobliczonebmr";
	private Grid removeBasicMetabolicRateTable;
	private Button removeBasicMetabolicRateButton;
	private List<BasicMetabolicRate> basicMetabolicRates;

	private void addLayout() {

		removeBasicMetabolicRateButton = new Button(StringUtils.REMOVE_BASIC_METABOLIC_RATE.getString());

		setMargin(true);
		BeanItemContainer<BasicMetabolicRate> container = new BeanItemContainer<BasicMetabolicRate>(
				BasicMetabolicRate.class, basicMetabolicRates);

		removeBasicMetabolicRateTable = new Grid(container);
		removeBasicMetabolicRateTable.setColumnOrder("basicMetabolicRateResult", "userGrowth", "dryMuscleWeight",
				"user");
		removeBasicMetabolicRateTable.getColumn("basicMetabolicRateResult").setHeaderCaption("BMR");
		removeBasicMetabolicRateTable.getColumn("userGrowth").setHeaderCaption("Wzrost (cm)");
		removeBasicMetabolicRateTable.getColumn("dryMuscleWeight").setHeaderCaption("Sucha waga miêœni (kg)");
		removeBasicMetabolicRateTable.getColumn("user").setHeaderCaption("U¿ytkownik");
		removeBasicMetabolicRateTable.removeColumn("id");
		removeBasicMetabolicRateTable.setImmediate(true);
		removeBasicMetabolicRateTable.setWidth("100%");
		removeBasicMetabolicRateTable.setSelectionMode(SelectionMode.MULTI);

		removeBasicMetabolicRateButton.addClickListener(this);
		removeBasicMetabolicRateButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);

		addComponent(removeBasicMetabolicRateTable);
		addComponent(removeBasicMetabolicRateButton);
	}

	public void buttonClick(ClickEvent event) {

		MultiSelectionModel selectionModel = (MultiSelectionModel) removeBasicMetabolicRateTable.getSelectionModel();

		for (Object selectedItem : selectionModel.getSelectedRows()) {
			BasicMetabolicRate basicMetabolicRate = (BasicMetabolicRate) selectedItem;
			removeBasicMetabolicRateTable.getContainerDataSource().removeItem(basicMetabolicRate);
			removeBasicMetabolicRateService.removeBasicMetabolicRate(basicMetabolicRate);
		}

		Notification.show(NotificationMessages.BASIC_METABOLIC_RATE_REMOVE_SUCCESS_TITLE.getString(),
				NotificationMessages.BASIC_METABOLIC_RATE_REMOVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

		removeBasicMetabolicRateTable.getSelectionModel().reset();
	}

	private void loadBasicMetabolicRates() {
		basicMetabolicRates = showAllBasicMetabolicRateService.getAllBasicMetabolicRate();
	}

	public void enter(ViewChangeEvent event) {

		if (removeBasicMetabolicRateTable != null)
			return;

		loadBasicMetabolicRates();
		addLayout();
	}
}

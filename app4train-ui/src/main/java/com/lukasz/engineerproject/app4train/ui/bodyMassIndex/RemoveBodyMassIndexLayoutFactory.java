package com.lukasz.engineerproject.app4train.ui.bodyMassIndex;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BodyMassIndexEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.service.bmi.RemoveBodyMassIndexService;
import com.lukasz.engineerproject.app4train.service.bmi.ShowAllBodyMassIndexService;
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

@SpringView(name = RemoveBodyMassIndexLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class RemoveBodyMassIndexLayoutFactory extends VerticalLayout implements View, Button.ClickListener {

	@Autowired
	private ShowAllBodyMassIndexService showAllBodyMassIndexService;

	@Autowired
	private RemoveBodyMassIndexService removeBodyMassIndexService;

	public static final String NAME = "usuñobliczonebmi";
	private Grid removeBodyMassIndexTable;
	private Button removeBodyMassIndexeButton;
	private List<BodyMassIndexEntity> bodyMassIndexEntities;

	private void addLayout() {

		removeBodyMassIndexeButton = new Button(StringUtils.REMOVE_BODY_MASS_INDEX.getString());

		setMargin(true);
		BeanItemContainer<BodyMassIndexEntity> container = new BeanItemContainer<BodyMassIndexEntity>(BodyMassIndexEntity.class,
				bodyMassIndexEntities);

		removeBodyMassIndexTable = new Grid(container);
		removeBodyMassIndexTable.setColumnOrder("bodyMassIndexResult", "userGrowth", "userWeight", "user");
		removeBodyMassIndexTable.getColumn("bodyMassIndexResult").setHeaderCaption("BMI");
		removeBodyMassIndexTable.getColumn("userGrowth").setHeaderCaption("Wzrost (cm)");
		removeBodyMassIndexTable.getColumn("userWeight").setHeaderCaption("Waga (kg)");
		removeBodyMassIndexTable.getColumn("user").setHeaderCaption("U¿ytkownik");
		removeBodyMassIndexTable.removeColumn("id");
		removeBodyMassIndexTable.setImmediate(true);
		removeBodyMassIndexTable.setSelectionMode(SelectionMode.MULTI);
		removeBodyMassIndexTable.setWidth("100%");

		removeBodyMassIndexeButton.addClickListener(this);
		removeBodyMassIndexeButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);

		addComponent(removeBodyMassIndexTable);
		addComponent(removeBodyMassIndexeButton);
	}

	public void buttonClick(ClickEvent event) {

		MultiSelectionModel selectionModel = (MultiSelectionModel) removeBodyMassIndexTable.getSelectionModel();

		for (Object selectedItem : selectionModel.getSelectedRows()) {
			BodyMassIndexEntity bodyMassIndexEntity = (BodyMassIndexEntity) selectedItem;
			removeBodyMassIndexTable.getContainerDataSource().removeItem(bodyMassIndexEntity);
			removeBodyMassIndexService.removeBodyMassIndex(bodyMassIndexEntity);
		}

		Notification.show(NotificationMessages.BODY_MASS_INDEX_REMOVE_SUCCESS_TITLE.getString(),
				NotificationMessages.BODY_MASS_INDEX_REMOVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

		removeBodyMassIndexTable.getSelectionModel().reset();
	}

	private void loadBodyMassIndexes() {
		bodyMassIndexEntities = showAllBodyMassIndexService.getAllBodyMassIndex();
	}

	public void enter(ViewChangeEvent event) {

		if (removeBodyMassIndexTable != null)
			return;

		loadBodyMassIndexes();
		addLayout();
	}
}

package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BodyAdiposityIndexEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.service.bai.RemoveBodyAdiposityIndexService;
import com.lukasz.engineerproject.app4train.service.bai.ShowAllBodyAdiposityIndexService;
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

@SpringView(name = RemoveBodyAdiposityIndexLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class RemoveBodyAdiposityIndexLayoutFactory extends VerticalLayout implements View, Button.ClickListener {

	@Autowired
	private ShowAllBodyAdiposityIndexService showAllBodyAdiposityIndexService;

	@Autowired
	private RemoveBodyAdiposityIndexService removeBodyAdiposityIndexService;

	public static final String NAME = "usuñobliczonebai";
	private Grid removeBodyAdiposityIndexTable;
	private Button removeBodyAdiposityIndexButton;
	private List<BodyAdiposityIndexEntity> bodyAdiposityIndexEntities;

	private void addLayout() {

		prepareButtonToRemoveBodyAdiposityIndex();

		setMargin(true);
		BeanItemContainer<BodyAdiposityIndexEntity> container = new BeanItemContainer<BodyAdiposityIndexEntity>(
				BodyAdiposityIndexEntity.class, bodyAdiposityIndexEntities);

		prepareBodyAdiposityIndexTable(container);

		addComponent(removeBodyAdiposityIndexTable);
		addComponent(removeBodyAdiposityIndexButton);
	}

	private void prepareButtonToRemoveBodyAdiposityIndex() {
		removeBodyAdiposityIndexButton = new Button(StringUtils.REMOVE_BODY_ADIPOSITY_INDEX.getString());
		removeBodyAdiposityIndexButton.addClickListener(this);
		removeBodyAdiposityIndexButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
	}

	private void prepareBodyAdiposityIndexTable(BeanItemContainer<BodyAdiposityIndexEntity> container) {
		removeBodyAdiposityIndexTable = new Grid(container);
		removeBodyAdiposityIndexTable.setColumnOrder("bodyAdiposityIndexResult", "userGrowth", "hipCircumference",
				"user");
		removeBodyAdiposityIndexTable.getColumn("bodyAdiposityIndexResult").setHeaderCaption("BAI");
		removeBodyAdiposityIndexTable.getColumn("userGrowth").setHeaderCaption("Wzrost (cm)");
		removeBodyAdiposityIndexTable.getColumn("hipCircumference").setHeaderCaption("Obwód bioder (cm)");
		removeBodyAdiposityIndexTable.getColumn("user").setHeaderCaption("U¿ytkownik");
		removeBodyAdiposityIndexTable.removeColumn("id");
		removeBodyAdiposityIndexTable.setImmediate(true);
		removeBodyAdiposityIndexTable.setSelectionMode(SelectionMode.MULTI);
		removeBodyAdiposityIndexTable.setWidth("100%");
	}

	public void buttonClick(ClickEvent event) {

		MultiSelectionModel selectionModel = (MultiSelectionModel) removeBodyAdiposityIndexTable.getSelectionModel();

		for (Object selectedItem : selectionModel.getSelectedRows()) {
			BodyAdiposityIndexEntity bodyAdiposityIndexEntity = (BodyAdiposityIndexEntity) selectedItem;
			removeBodyAdiposityIndexTable.getContainerDataSource().removeItem(bodyAdiposityIndexEntity);
			removeBodyAdiposityIndexService.removeBodyAdiposityIndex(bodyAdiposityIndexEntity);
		}

		prepareMessage();

		removeBodyAdiposityIndexTable.getSelectionModel().reset();
	}

	private void prepareMessage() {
		Notification.show(NotificationMessages.BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_TITLE.getString(),
				NotificationMessages.BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);
	}

	private void loadBodyAdiposityIndexes() {
		bodyAdiposityIndexEntities = showAllBodyAdiposityIndexService.getAllBodyAdiposityIndex();
	}

	public void enter(ViewChangeEvent event) {

		if (removeBodyAdiposityIndexTable != null)
			return;

		loadBodyAdiposityIndexes();
		addLayout();
	}
}

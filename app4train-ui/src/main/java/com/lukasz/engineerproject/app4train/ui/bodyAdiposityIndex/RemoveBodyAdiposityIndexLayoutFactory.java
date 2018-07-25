package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;
import com.lukasz.engineerproject.app4train.service.removeBodyAdiposityIndex.RemoveBodyAdiposityIndexService;
import com.lukasz.engineerproject.app4train.service.showBodyAdiposityIndexResult.ShowAllBodyAdiposityIndexService;
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
	private List<BodyAdiposityIndex> bodyAdiposityIndexes;

	private void addLayout() {

		removeBodyAdiposityIndexButton = new Button(StringUtils.REMOVE_BODY_ADIPOSITY_INDEX.getString());

		setMargin(true);
		BeanItemContainer<BodyAdiposityIndex> container = new BeanItemContainer<BodyAdiposityIndex>(
				BodyAdiposityIndex.class, bodyAdiposityIndexes);

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

		removeBodyAdiposityIndexButton.addClickListener(this);
		removeBodyAdiposityIndexButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);

		addComponent(removeBodyAdiposityIndexTable);
		addComponent(removeBodyAdiposityIndexButton);
	}

	public void buttonClick(ClickEvent event) {

		MultiSelectionModel selectionModel = (MultiSelectionModel) removeBodyAdiposityIndexTable.getSelectionModel();

		for (Object selectedItem : selectionModel.getSelectedRows()) {
			BodyAdiposityIndex bodyAdiposityIndex = (BodyAdiposityIndex) selectedItem;
			removeBodyAdiposityIndexTable.getContainerDataSource().removeItem(bodyAdiposityIndex);
			removeBodyAdiposityIndexService.removeBodyAdiposityIndex(bodyAdiposityIndex);
		}

		Notification.show(NotificationMessages.BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_TITLE.getString(),
				NotificationMessages.BODY_ADIPOSITY_INDEX_REMOVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

		removeBodyAdiposityIndexTable.getSelectionModel().reset();
	}

	private void loadBodyAdiposityIndexes() {
		bodyAdiposityIndexes = showAllBodyAdiposityIndexService.getAllBodyAdiposityIndex();
	}

	public void enter(ViewChangeEvent event) {

		if (removeBodyAdiposityIndexTable != null)
			return;

		loadBodyAdiposityIndexes();
		addLayout();
	}
}

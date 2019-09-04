package com.lukasz.engineerproject.app4train.ui.users;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.UserEntity;
import com.lukasz.engineerproject.app4train.service.user.RemoveUserService;
import com.lukasz.engineerproject.app4train.service.user.ShowUsersService;
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

@SpringView(name = RemoveUserLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class RemoveUserLayoutFactory extends VerticalLayout implements View, Button.ClickListener {

	private final ShowUsersService userService;

	private final RemoveUserService removeUserService;

	public static final String NAME = "usuñu¿ytkownika";
	private Grid removeUserTable;
	private Button removeUserButton;
	private List<UserEntity> userEntities;

	public RemoveUserLayoutFactory(ShowUsersService userService, RemoveUserService removeUserService) {
		this.userService = userService;
		this.removeUserService = removeUserService;
	}

	private void addLayout() {

		setMargin(true);
		BeanItemContainer<UserEntity> container = new BeanItemContainer<UserEntity>(UserEntity.class, userEntities);

		prepareTableWithUsersToRemove(container);

		prepareButtonToRemove();

		addComponent(removeUserTable);
		addComponent(removeUserButton);
	}

	private void prepareButtonToRemove() {
		removeUserButton = new Button(StringUtils.REMOVE_USER.getString());
		removeUserButton.addClickListener(this);
		removeUserButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
	}

	private void prepareTableWithUsersToRemove(BeanItemContainer<UserEntity> container) {
		removeUserTable = new Grid(container);
		removeUserTable.setColumnOrder("firstName", "lastName", "age", "gender");
		removeUserTable.getColumn("firstName").setHeaderCaption("Imiê");
		removeUserTable.getColumn("lastName").setHeaderCaption("Nazwisko");
		removeUserTable.getColumn("age").setHeaderCaption("Wiek");
		removeUserTable.getColumn("gender").setHeaderCaption("P³eæ");
		removeUserTable.removeColumn("id");
		removeUserTable.setImmediate(true);
		removeUserTable.setSelectionMode(SelectionMode.MULTI);
		removeUserTable.setWidth("100%");
	}

	public void buttonClick(ClickEvent event) {

		MultiSelectionModel selectionModel = (MultiSelectionModel) removeUserTable.getSelectionModel();

		removeSelectedItem(selectionModel);

		getMessage();

		removeUserTable.getSelectionModel().reset();
	}

	private void removeSelectedItem(MultiSelectionModel selectionModel) {
		for (Object selectedItem : selectionModel.getSelectedRows()) {
			UserEntity userEntity = (UserEntity) selectedItem;
			removeUserTable.getContainerDataSource().removeItem(userEntity);
			removeUserService.removeUser(userEntity);
		}
	}

	private void getMessage() {
		Notification.show(NotificationMessages.USER_REMOVE_SUCCESS_TITLE.getString(),
				NotificationMessages.USER_REMOVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);
	}

	private void loadStudents() {
		userEntities = userService.getAllUsers();
	}

	public void enter(ViewChangeEvent event) {

		if (removeUserTable != null)
			return;

		loadStudents();
		addLayout();
	}
}

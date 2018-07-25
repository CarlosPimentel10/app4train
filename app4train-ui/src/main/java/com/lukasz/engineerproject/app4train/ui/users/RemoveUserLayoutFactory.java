package com.lukasz.engineerproject.app4train.ui.users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.service.removeUser.RemoveUserService;
import com.lukasz.engineerproject.app4train.service.showUsers.ShowUsersService;
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

	@Autowired
	private ShowUsersService userService;

	@Autowired
	private RemoveUserService removeUserService;

	public static final String NAME = "usuñu¿ytkownika";
	private Grid removeUserTable;
	private Button removeUserButton;
	private List<User> users;

	private void addLayout() {

		removeUserButton = new Button(StringUtils.REMOVE_USER.getString());

		setMargin(true);
		BeanItemContainer<User> container = new BeanItemContainer<User>(User.class, users);

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

		removeUserButton.addClickListener(this);
		removeUserButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);

		addComponent(removeUserTable);
		addComponent(removeUserButton);
	}

	public void buttonClick(ClickEvent event) {

		MultiSelectionModel selectionModel = (MultiSelectionModel) removeUserTable.getSelectionModel();

		for (Object selectedItem : selectionModel.getSelectedRows()) {
			User user = (User) selectedItem;
			removeUserTable.getContainerDataSource().removeItem(user);
			removeUserService.removeUser(user);
		}

		Notification.show(NotificationMessages.USER_REMOVE_SUCCESS_TITLE.getString(),
				NotificationMessages.USER_REMOVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

		removeUserTable.getSelectionModel().reset();
	}

	private void loadStudents() {
		users = userService.getAllUsers();
	}

	public void enter(ViewChangeEvent event) {

		if (removeUserTable != null)
			return;

		loadStudents();
		addLayout();
	}
}

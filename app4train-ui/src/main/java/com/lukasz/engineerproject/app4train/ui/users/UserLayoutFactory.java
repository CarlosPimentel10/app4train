package com.lukasz.engineerproject.app4train.ui.users;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = UserLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class UserLayoutFactory extends VerticalLayout implements View, UserSavedListener {

	public static final String NAME = "dodaju¿ytkownika";
	private TabSheet tabSheet;

	private final AddUserMainLayoutFactory mainFactory;
	private final ShowAllUsersLayoutFactory allUsersFactory;

	public UserLayoutFactory(AddUserMainLayoutFactory mainFactory, ShowAllUsersLayoutFactory allUsersFactory) {
		this.mainFactory = mainFactory;
		this.allUsersFactory = allUsersFactory;
	}

	private void addLayout() {

		setMargin(false);

		tabSheet = new TabSheet();
		tabSheet.setWidth("100%");

		Component addStudentMainTab = mainFactory.createComponent(this);
		Component showStudentsTab = allUsersFactory.createComponent();

		Tab addTabMainMenu = tabSheet.addTab(addStudentMainTab, StringUtils.ADD_USER.getString());
		addTabMainMenu.setIcon(FontAwesome.USER);
		Tab addTabShowAllUsers = tabSheet.addTab(showStudentsTab, StringUtils.SHOW_ALL_USERS.getString());
		addTabShowAllUsers.setIcon(FontAwesome.USERS);
		addComponent(tabSheet);
	}

	public void userSaved() {
		allUsersFactory.refreshTables();
	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}
}
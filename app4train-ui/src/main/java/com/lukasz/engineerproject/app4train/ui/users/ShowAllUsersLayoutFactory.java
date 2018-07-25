package com.lukasz.engineerproject.app4train.ui.users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.service.showUsers.ShowUsersService;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ShowAllUsersLayoutFactory implements UIComponentBuilder {

	private List<User> users;
	private BeanItemContainer<User> container;

	private class ShowAllUsersLayout extends VerticalLayout {

		private Grid usersTable;

		public ShowAllUsersLayout init() {

			setMargin(true);

			container = new BeanItemContainer<User>(User.class, users);

			usersTable = new Grid(container);
			usersTable.setColumnOrder("firstName", "lastName", "age", "gender");
			usersTable.getColumn("firstName").setHeaderCaption("Imiê");
			usersTable.getColumn("lastName").setHeaderCaption("Nazwisko");
			usersTable.getColumn("age").setHeaderCaption("Wiek");
			usersTable.getColumn("gender").setHeaderCaption("P³eæ");
			usersTable.removeColumn("id");
			usersTable.setWidth("100%");
			usersTable.setImmediate(true);

			return this;
		}

		public ShowAllUsersLayout layout() {
			addComponent(usersTable);
			return this;
		}

		public ShowAllUsersLayout load() {
			users = showUsersService.getAllUsers();
			return this;
		}
	}

	public void refreshTables() {
		users = showUsersService.getAllUsers();
		container.removeAllItems();
		container.addAll(users);
	}

	@Autowired
	private ShowUsersService showUsersService;

	public Component createComponent() {
		return new ShowAllUsersLayout().load().init().layout();
	}
}
package com.lukasz.engineerproject.app4train.ui.users;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.service.user.ShowUsersService;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ShowAllUsersLayoutFactory implements UIComponentBuilder {

	private List<UserEntity> userEntities;
	private BeanItemContainer<UserEntity> container;

	private final ShowUsersService showUsersService;

	public ShowAllUsersLayoutFactory(ShowUsersService showUsersService) {
		this.showUsersService = showUsersService;
	}

	private class ShowAllUsersLayout extends VerticalLayout {

		private Grid usersTable;

		public ShowAllUsersLayout init() {

			setMargin(true);

			container = new BeanItemContainer<UserEntity>(UserEntity.class, userEntities);

			prepareUsesTable();

			return this;
		}

		private void prepareUsesTable() {
			usersTable = new Grid(container);
			usersTable.setColumnOrder("firstName", "lastName", "age", "gender");
			usersTable.getColumn("firstName").setHeaderCaption("Imiê");
			usersTable.getColumn("lastName").setHeaderCaption("Nazwisko");
			usersTable.getColumn("age").setHeaderCaption("Wiek");
			usersTable.getColumn("gender").setHeaderCaption("P³eæ");
			usersTable.removeColumn("id");
			usersTable.setWidth("100%");
			usersTable.setImmediate(true);
		}

		public ShowAllUsersLayout layout() {
			addComponent(usersTable);
			return this;
		}

		ShowAllUsersLayout load() {
			userEntities = showUsersService.getAllUsers();
			return this;
		}
	}

	void refreshTables() {
		userEntities = showUsersService.getAllUsers();
		container.removeAllItems();
		container.addAll(userEntities);
	}

	public Component createComponent() {
		return new ShowAllUsersLayout().load().init().layout();
	}
}
package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.service.getBodyAdiposityIndexResult.GetBodyAdiposityIndexResultService;
import com.lukasz.engineerproject.app4train.service.showUsers.ShowUsersServiceImpl;
import com.lukasz.engineerproject.app4train.utils.NotificationMessages;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class CalculateBodyAdiposityIndexLayoutFactory {

	private class AddBodyAdiposityIndexLayout extends VerticalLayout implements ClickListener {

		private static final long serialVersionUID = 1L;
		private TextField hipCircumference;
		private TextField userGrowth;
		private Button calculateButton;
		private BeanFieldGroup<BodyAdiposityIndex> fieldGroup;
		private BodyAdiposityIndex bodyAdiposityIndex;
		private ComboBox user;
		private FormLayout formLayout;
		private BodyAdiposityIndexSavedListener bodyAdiposityIndexSavedListener;

		public AddBodyAdiposityIndexLayout(BodyAdiposityIndexSavedListener bodyAdiposityIndexSavedListener) {
			this.bodyAdiposityIndexSavedListener = bodyAdiposityIndexSavedListener;
			this.bodyAdiposityIndex = new BodyAdiposityIndex();
		}

		public AddBodyAdiposityIndexLayout init() {

			fieldGroup = new BeanFieldGroup<BodyAdiposityIndex>(BodyAdiposityIndex.class);
			hipCircumference = new TextField(StringUtils.HIP_CIRCUMFERENCE.getString());
			userGrowth = new TextField(StringUtils.GROWTH.getString());
			user = new ComboBox(StringUtils.USER.getString());

			calculateButton = new Button(StringUtils.CALCULATE.getString(), this);
			calculateButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
			calculateButton.setIcon(FontAwesome.PLUS);
			calculateButton.addClickListener(this);

			userGrowth.setNullRepresentation("");
			hipCircumference.setNullRepresentation("");

			formLayout = new FormLayout();

			return this;
		}

		public AddBodyAdiposityIndexLayout bind() {
			fieldGroup.bindMemberFields(this);
			fieldGroup.setItemDataSource(bodyAdiposityIndex);

			return this;
		}

		public Component layout() {

			setMargin(true);
			setWidth("100%");

			formLayout.addComponents(hipCircumference, userGrowth, user, calculateButton);

			return formLayout;
		}

		public void buttonClick(ClickEvent event) {
			if (event.getSource() == this.calculateButton) {
				save();
			} else {
				clearFields();
			}
		}

		private void clearFields() {
			userGrowth.setValue(null);
			hipCircumference.setValue(null);
			user.setValue(null);

		}

		private void save() {
			if (!isOperationValid()) {
				Notification.show(NotificationMessages.BAI_SAVE_ERROR_TITLE.getString(),
						NotificationMessages.BAI_SAVE_ERROR_DESCRIPTION.getString(), Type.ERROR_MESSAGE);
			} else {
				saveUser();
			}
		}

		private void saveUser() {
			try {
				fieldGroup.commit();
			} catch (CommitException e) {
				Notification.show(NotificationMessages.BAI_SAVE_VALIDATION_ERROR_TITLE.getString(),
						NotificationMessages.BAI_SAVE_VALIDATION_ERROR_DESCRIPTION.getString(), Type.ERROR_MESSAGE);
				return;
			}

			getBodyAdiposityIndexResultService.save(bodyAdiposityIndex);
			bodyAdiposityIndexSavedListener.bodyAdiposityIndexSaved();

			Notification.show(NotificationMessages.BAI_SAVE_SUCCESS_TITLE.getString(),
					NotificationMessages.BAI_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

			clearFields();
		}

		public AddBodyAdiposityIndexLayout load() {

			List<User> users = showUsersService.getAllUsers();
			user.addItems(users);

			return this;
		}
	}

	private boolean isOperationValid() {
		return showUsersService.getAllUsers().size() != 0;
	}

	@Autowired
	private GetBodyAdiposityIndexResultService getBodyAdiposityIndexResultService;

	@Autowired
	private ShowUsersServiceImpl showUsersService;

	public Component createComponent(BodyAdiposityIndexSavedListener bodyAdiposityIndexSavedListener) {
		return new AddBodyAdiposityIndexLayout(bodyAdiposityIndexSavedListener).init().load().bind().layout();
	}
}

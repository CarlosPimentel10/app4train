package com.lukasz.engineerproject.app4train.ui.bodyMassIndex;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BodyMassIndexEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.domain.UserEntity;
import com.lukasz.engineerproject.app4train.service.bmi.GetBodyMassIndexResultService;
import com.lukasz.engineerproject.app4train.service.user.UserServiceImpl.ShowUsersServiceImpl;
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
public class CalculateBodyMassIndexLayoutFactory {

	private class AddBodyMassIndexLayout extends VerticalLayout implements ClickListener {

		private static final long serialVersionUID = 1L;
		private TextField userWeight;
		private TextField userGrowth;
		private Button calculateButton;
		private BeanFieldGroup<BodyMassIndexEntity> fieldGroup;
		private BodyMassIndexEntity bodyMassIndexEntity;
		private ComboBox user;
		private FormLayout formLayout;

		private BodyMassIndexSavedListener bodyMassIndexSavedListener;

		public AddBodyMassIndexLayout(BodyMassIndexSavedListener bodyMassIndexSavedListener) {
			this.bodyMassIndexSavedListener = bodyMassIndexSavedListener;
			this.bodyMassIndexEntity = new BodyMassIndexEntity();
		}

		public AddBodyMassIndexLayout init() {

			fieldGroup = new BeanFieldGroup<BodyMassIndexEntity>(BodyMassIndexEntity.class);
			userWeight = new TextField(StringUtils.WEIGHT.getString());
			userGrowth = new TextField(StringUtils.GROWTH.getString());
			user = new ComboBox(StringUtils.USER.getString());

			calculateButton = new Button(StringUtils.CALCULATE.getString(), this);
			calculateButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
			calculateButton.setIcon(FontAwesome.PLUS);
			calculateButton.addClickListener(this);

			userGrowth.setNullRepresentation("");
			userWeight.setNullRepresentation("");

			formLayout = new FormLayout();

			return this;
		}

		public AddBodyMassIndexLayout bind() {
			fieldGroup.bindMemberFields(this);
			fieldGroup.setItemDataSource(bodyMassIndexEntity);

			return this;
		}

		public Component layout() {

			setMargin(true);
			setWidth("100%");

			formLayout.addComponents(userWeight, userGrowth, user, calculateButton);

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
			userWeight.setValue(null);
			user.setValue(null);
		}

		private void save() {
			if (!isOperationValid()) {
				Notification.show(NotificationMessages.BMI_SAVE_ERROR_TITLE.getString(),
						NotificationMessages.BMI_SAVE_ERROR_DESCRIPTION.getString(), Type.ERROR_MESSAGE);
			} else {
				saveUser();
			}
		}

		private void saveUser() {
			try {
				fieldGroup.commit();
			} catch (CommitException e) {
				Notification.show(NotificationMessages.BMI_SAVE_VALIDATION_ERROR_TITLE.getString(),
						NotificationMessages.BMI_SAVE_VALIDATION_ERROR_DESCRIPTION.getString(), Type.ERROR_MESSAGE);
				return;
			}

			getBodyMassIndexResultService.save(bodyMassIndexEntity);
			bodyMassIndexSavedListener.bodyMassIndexSaved();

			Notification.show(NotificationMessages.BMI_SAVE_SUCCESS_TITLE.getString(),
					NotificationMessages.BMI_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

			clearFields();
		}

		public AddBodyMassIndexLayout load() {

			List<UserEntity> userEntities = showUsersService.getAllUsers();
			user.addItems(userEntities);

			return this;
		}
	}

	private boolean isOperationValid() {
		return showUsersService.getAllUsers().size() != 0;
	}

	@Autowired
	private GetBodyMassIndexResultService getBodyMassIndexResultService;

	@Autowired
	private ShowUsersServiceImpl showUsersService;

	public Component createComponent(BodyMassIndexSavedListener bodyMassIndexSavedListener) {
		return new AddBodyMassIndexLayout(bodyMassIndexSavedListener).init().load().bind().layout();
	}
}

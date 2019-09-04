package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BodyAdiposityIndexEntity;
import com.lukasz.engineerproject.app4train.model.domain.UserEntity;
import com.lukasz.engineerproject.app4train.service.bai.GetBodyAdiposityIndexResultService;
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
public class CalculateBodyAdiposityIndexLayoutFactory {

	private final GetBodyAdiposityIndexResultService getBodyAdiposityIndexResultService;
	private final ShowUsersServiceImpl showUsersService;

	public CalculateBodyAdiposityIndexLayoutFactory(GetBodyAdiposityIndexResultService getBodyAdiposityIndexResultService, ShowUsersServiceImpl showUsersService) {
		this.getBodyAdiposityIndexResultService = getBodyAdiposityIndexResultService;
		this.showUsersService = showUsersService;
	}

	private class AddBodyAdiposityIndexLayout extends VerticalLayout implements ClickListener {

		private static final long serialVersionUID = 1L;
		private TextField hipCircumference;
		private TextField userGrowth;
		private Button calculateButton;
		private BeanFieldGroup<BodyAdiposityIndexEntity> fieldGroup;
		private BodyAdiposityIndexEntity bodyAdiposityIndexEntity;
		private ComboBox user;
		private FormLayout formLayout;
		private BodyAdiposityIndexSavedListener bodyAdiposityIndexSavedListener;

		AddBodyAdiposityIndexLayout(BodyAdiposityIndexSavedListener bodyAdiposityIndexSavedListener) {
			this.bodyAdiposityIndexSavedListener = bodyAdiposityIndexSavedListener;
			this.bodyAdiposityIndexEntity = new BodyAdiposityIndexEntity();
		}

		public AddBodyAdiposityIndexLayout init() {

			fieldGroup = new BeanFieldGroup<BodyAdiposityIndexEntity>(BodyAdiposityIndexEntity.class);
			hipCircumference = new TextField(StringUtils.HIP_CIRCUMFERENCE.getString());
			userGrowth = new TextField(StringUtils.GROWTH.getString());
			user = new ComboBox(StringUtils.USER.getString());

			prepareCalculateButton();

			userGrowth.setNullRepresentation("");
			hipCircumference.setNullRepresentation("");

			formLayout = new FormLayout();

			return this;
		}

		private void prepareCalculateButton() {
			calculateButton = new Button(StringUtils.CALCULATE.getString(), this);
			calculateButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
			calculateButton.setIcon(FontAwesome.PLUS);
			calculateButton.addClickListener(this);
		}

		AddBodyAdiposityIndexLayout bind() {
			fieldGroup.bindMemberFields(this);
			fieldGroup.setItemDataSource(bodyAdiposityIndexEntity);

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

			getBodyAdiposityIndexResultService.save(bodyAdiposityIndexEntity);
			bodyAdiposityIndexSavedListener.bodyAdiposityIndexSaved();

			Notification.show(NotificationMessages.BAI_SAVE_SUCCESS_TITLE.getString(),
					NotificationMessages.BAI_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

			clearFields();
		}

		AddBodyAdiposityIndexLayout load() {

			List<UserEntity> userEntities = showUsersService.getAllUsers();
			user.addItems(userEntities);

			return this;
		}
	}

	private boolean isOperationValid() {
		return showUsersService.getAllUsers().size() != 0;
	}

	public Component createComponent(BodyAdiposityIndexSavedListener bodyAdiposityIndexSavedListener) {
		return new AddBodyAdiposityIndexLayout(bodyAdiposityIndexSavedListener).init().load().bind().layout();
	}
}

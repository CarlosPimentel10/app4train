package com.lukasz.engineerproject.app4train.ui.basicMetabolicRate;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BasicMetabolicRateEntity;
import com.lukasz.engineerproject.app4train.model.domain.UserEntity;

import com.lukasz.engineerproject.app4train.service.bmr.GetBasicMetabolicRateResultService;
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
public class CalculateBasicMetabolicRateLayoutFactory {

	private final GetBasicMetabolicRateResultService getBasicMetabolicRateResultService;
	private final ShowUsersServiceImpl showUsersService;

	public CalculateBasicMetabolicRateLayoutFactory(
			GetBasicMetabolicRateResultService getBasicMetabolicRateResultService,
			ShowUsersServiceImpl showUsersService) {
		this.getBasicMetabolicRateResultService = getBasicMetabolicRateResultService;
		this.showUsersService = showUsersService;
	}

	private class AddBasicMetabolicRateLayout extends VerticalLayout implements ClickListener {

		private static final long serialVersionUID = 1L;
		private TextField dryMuscleWeight;
		private TextField userGrowth;
		private Button calculateButton;
		private BeanFieldGroup<BasicMetabolicRateEntity> fieldGroup;
		private BasicMetabolicRateEntity basicMetabolicRateEntity;
		private ComboBox user;
		private FormLayout formLayout;

		private BasicMetabolicRateSavedListener basicMetabolicRateSavedListener;

		AddBasicMetabolicRateLayout(BasicMetabolicRateSavedListener basicMetabolicRateSavedListener) {
			this.basicMetabolicRateSavedListener = basicMetabolicRateSavedListener;
			this.basicMetabolicRateEntity = new BasicMetabolicRateEntity();
		}

		public AddBasicMetabolicRateLayout init() {

			fieldGroup = new BeanFieldGroup<BasicMetabolicRateEntity>(BasicMetabolicRateEntity.class);
			dryMuscleWeight = new TextField(StringUtils.DRY_MUSCLE_WEIGHT.getString());
			userGrowth = new TextField(StringUtils.GROWTH.getString());
			user = new ComboBox(StringUtils.USER.getString());

			calculateButton = new Button(StringUtils.CALCULATE.getString(), this);
			calculateButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
			calculateButton.setIcon(FontAwesome.PLUS);
			calculateButton.addClickListener(this);

			userGrowth.setNullRepresentation("");
			dryMuscleWeight.setNullRepresentation("");

			formLayout = new FormLayout();

			return this;
		}

		AddBasicMetabolicRateLayout bind() {
			fieldGroup.bindMemberFields(this);
			fieldGroup.setItemDataSource(basicMetabolicRateEntity);

			return this;
		}

		public Component layout() {

			setMargin(true);
			setWidth("100%");

			formLayout.addComponents(dryMuscleWeight, userGrowth, user, calculateButton);

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
			dryMuscleWeight.setValue(null);
			user.setValue(null);
		}

		private void save() {
			if (!isOperationValid()) {
				Notification.show(NotificationMessages.BMR_SAVE_ERROR_TITLE.getString(),
						NotificationMessages.BMR_SAVE_ERROR_DESCRIPTION.getString(), Type.ERROR_MESSAGE);
			} else {
				saveUser();
			}
		}

		private void saveUser() {
			try {
				fieldGroup.commit();
			} catch (CommitException e) {
				Notification.show(NotificationMessages.BMR_SAVE_VALIDATION_ERROR_TITLE.getString(),
						NotificationMessages.BMR_SAVE_VALIDATION_ERROR_DESCRIPTION.getString(), Type.ERROR_MESSAGE);
				return;
			}

			if (basicMetabolicRateEntity.getUserEntity().getGender().equals("Mê¿czyzna")) {
				getBasicMetabolicRateResultService.saveWhenUserIsMan(
						basicMetabolicRateEntity,
						basicMetabolicRateEntity.getUserEntity().getAge(),
						basicMetabolicRateEntity.getDryMuscleWeight(),
						basicMetabolicRateEntity.getUserGrowth());
				basicMetabolicRateSavedListener.basicMetabolicRateSaved();

				Notification.show(NotificationMessages.BMR_SAVE_SUCCESS_TITLE.getString(),
						NotificationMessages.BMR_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);
				clearFields();
			} else if (basicMetabolicRateEntity.getUserEntity().getGender().equals("Kobieta")) {
				getBasicMetabolicRateResultService.saveWhenUserIsWoman(
						basicMetabolicRateEntity,
						basicMetabolicRateEntity.getUserEntity().getAge(),
						basicMetabolicRateEntity.getDryMuscleWeight(),
						basicMetabolicRateEntity.getUserGrowth());
				basicMetabolicRateSavedListener.basicMetabolicRateSaved();

				Notification.show(NotificationMessages.BMR_SAVE_SUCCESS_TITLE.getString(),
						NotificationMessages.BMR_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);
				clearFields();
			}
		}

		AddBasicMetabolicRateLayout load() {

			List<UserEntity> userEntities = showUsersService.getAllUsers();
			user.addItems(userEntities);
			return this;
		}
	}

	private boolean isOperationValid() {
		return showUsersService.getAllUsers().size() != 0;
	}

	public Component createComponent(BasicMetabolicRateSavedListener basicMetabolicRateSavedListener) {
		return new AddBasicMetabolicRateLayout(basicMetabolicRateSavedListener).init().load().bind().layout();
	}
}

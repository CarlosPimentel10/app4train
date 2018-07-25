package com.lukasz.engineerproject.app4train.ui.basicMetabolicRate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.service.getBasicMetabolicRateResult.GetBasicMetabolicRateResultService;
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
public class CalculateBasicMetabolicRateLayoutFactory {

	private class AddBasicMetabolicRateLayout extends VerticalLayout implements ClickListener {

		private static final long serialVersionUID = 1L;
		private TextField dryMuscleWeight;
		private TextField userGrowth;
		private Button calculateButton;
		private BeanFieldGroup<BasicMetabolicRate> fieldGroup;
		private BasicMetabolicRate basicMetabolicRate;
		private ComboBox user;
		private FormLayout formLayout;

		private BasicMetabolicRateSavedListener basicMetabolicRateSavedListener;

		public AddBasicMetabolicRateLayout(BasicMetabolicRateSavedListener basicMetabolicRateSavedListener) {
			this.basicMetabolicRateSavedListener = basicMetabolicRateSavedListener;
			this.basicMetabolicRate = new BasicMetabolicRate();
		}

		public AddBasicMetabolicRateLayout init() {

			fieldGroup = new BeanFieldGroup<BasicMetabolicRate>(BasicMetabolicRate.class);
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

		public AddBasicMetabolicRateLayout bind() {
			fieldGroup.bindMemberFields(this);
			fieldGroup.setItemDataSource(basicMetabolicRate);

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

			try {
				if (basicMetabolicRate.getUser().getGender().equals("Mê¿czyzna")) {
					getBasicMetabolicRateResultService.saveWhenUserIsMan(basicMetabolicRate,
							(Integer) basicMetabolicRate.getUser().getAge(),
							(Double) basicMetabolicRate.getDryMuscleWeight(),
							(Integer) basicMetabolicRate.getUserGrowth());
					basicMetabolicRateSavedListener.basicMetabolicRateSaved();
					Notification.show(NotificationMessages.BMR_SAVE_SUCCESS_TITLE.getString(),
							NotificationMessages.BMR_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);
					clearFields();
				} else if (basicMetabolicRate.getUser().getGender().equals("Kobieta")) {
					getBasicMetabolicRateResultService.saveWhenUserIsWoman(basicMetabolicRate,
							(Integer) basicMetabolicRate.getUser().getAge(),
							(Double) basicMetabolicRate.getDryMuscleWeight(),
							(Integer) basicMetabolicRate.getUserGrowth());
					basicMetabolicRateSavedListener.basicMetabolicRateSaved();
					Notification.show(NotificationMessages.BMR_SAVE_SUCCESS_TITLE.getString(),
							NotificationMessages.BMR_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);
					clearFields();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} //

		}

		public AddBasicMetabolicRateLayout load() {

			List<User> users = showUsersService.getAllUsers();
			user.addItems(users);

			return this;
		}
	}

	private boolean isOperationValid() {
		return showUsersService.getAllUsers().size() != 0;
	}

	@Autowired
	private GetBasicMetabolicRateResultService getBasicMetabolicRateResultService;

	@Autowired
	private ShowUsersServiceImpl showUsersService;

	public Component createComponent(BasicMetabolicRateSavedListener basicMetabolicRateSavedListener) {
		return new AddBasicMetabolicRateLayout(basicMetabolicRateSavedListener).init().load().bind().layout();
	}
}

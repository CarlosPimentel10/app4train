package com.lukasz.engineerproject.app4train.ui.users;

import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.service.addUser.AddUserService;
import com.lukasz.engineerproject.app4train.utils.Gender;
import com.lukasz.engineerproject.app4train.utils.NotificationMessages;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@org.springframework.stereotype.Component
public class AddUserMainLayoutFactory {

	private class AddUserMainLayout extends VerticalLayout implements ClickListener {

		private static final long serialVersionUID = 1L;
		private TextField firstName;
		private TextField lastName;
		private TextField age;
		private ComboBox gender;
		private Button saveButton;
		private Button clearButton;
		private Label explanationOfThisPart1;
		private Label explanationOfThisPart2;
		private Label explanationOfThisPart3;
		private Label explanationOfThisPart4;
		private Label labelForUserForm;

		private UserSavedListener userSavedListener;

		private BeanFieldGroup<User> fieldGroup;
		private User user;

		public AddUserMainLayout(UserSavedListener userSavedListener) {
			this.userSavedListener = userSavedListener;
			this.user = new User();
		}

		public AddUserMainLayout init() {

			fieldGroup = new BeanFieldGroup<User>(User.class);

			firstName = new TextField(StringUtils.FIRST_NAME.getString());
			lastName = new TextField(StringUtils.LAST_NAME.getString());
			age = new TextField(StringUtils.AGE.getString());
			gender = new ComboBox(StringUtils.GENDER.getString());

			firstName.setNullRepresentation("");
			lastName.setNullRepresentation("");
			age.setNullRepresentation("");

			saveButton = new Button(StringUtils.SAVE.getString());
			saveButton.setIcon(FontAwesome.SAVE);
			saveButton.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
			clearButton = new Button(StringUtils.CANCEL.getString());
			clearButton.setIcon(FontAwesome.TIMES);
			clearButton.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
			saveButton.addClickListener(this);
			clearButton.addClickListener(this);

			saveButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
			clearButton.setStyleName(ValoTheme.BUTTON_PRIMARY);

			explanationOfThisPart1 = new Label(
					"<b>Stwórz przynajmniej jednego u¿ytkownika poprzez wype³nienie wymaganych pól formularza umieszczonego poni¿ej. Pozwoli Ci to na obliczenie:<b><br><br>",
					ContentMode.HTML);
			explanationOfThisPart1.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			explanationOfThisPart2 = new Label(
					"<ul><li>WskaŸnika masy cia³a - BMI</li><li>WskaŸnika ot³uszczenia cia³a - BAI</li><li>Podstawowej przemiany materii - BMR</li></ul><br>",
					ContentMode.HTML);

			explanationOfThisPart3 = new Label(
					"Masz mo¿liwoœæ stworzenia tylu u¿ytkowników z ró¿nymi parametrami na ilu masz ochotê. Daje to mo¿liwoœæ sprawdzenia, jakie dany u¿ytkownik osi¹gn¹³ wyniki oraz porównania ich w stosunku to wyników osi¹gniêtych przez innych stworzonych u¿ytkowników. Tak wiêc najpierw tworzony jest przynajmniej jeden u¿ytkownik a nastêpnie w zale¿noœci od tego jaki wskaŸnik (BMR, BAI, BMR) chcemy obliczyæ, musimy przejœæ od odpowiadniej zak³adni w menu celem dokonania obliczeñ.<br><br>",
					ContentMode.HTML);
			explanationOfThisPart3.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			
			explanationOfThisPart4 = new Label(
					"Je¿eli chcesz wiêcej dowiedzieæ siê o w/w wskaŸnikach zanim przejdziesz do stworzenia swojego u¿ytkownika, przejdŸ do odpowiedniej zak³adki umieszczonej w menu.<br><br>",
					ContentMode.HTML);
			explanationOfThisPart4.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);

			labelForUserForm = new Label("<b>Formularz pozwalaj¹cy stworzyæ u¿ytkownika<br><b>", ContentMode.HTML);
			labelForUserForm.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);

			gender.addItem(Gender.MALE.getString());
			gender.addItem(Gender.FEMALE.getString());

			return this;
		}

		public AddUserMainLayout bind() {
			fieldGroup.bindMemberFields(this);
			fieldGroup.setItemDataSource(user);
			return this;
		}

		public Component layout() {

			setMargin(true);

			GridLayout layout = new GridLayout(2, 4);
			layout.setSizeUndefined();
			layout.setSpacing(true);

			layout.addComponent(firstName, 0, 0);
			layout.addComponent(lastName, 1, 0);

			layout.addComponent(age, 0, 1);
			layout.addComponent(gender, 1, 1);

			layout.addComponent(new HorizontalLayout(saveButton, clearButton), 0, 3);

			age.clear();

			return new VerticalLayout(explanationOfThisPart1, explanationOfThisPart2, explanationOfThisPart3,
					explanationOfThisPart4, labelForUserForm, layout);
		}

		public void buttonClick(ClickEvent event) {
			if (event.getSource() == this.saveButton) {
				saveUser();
			} else {
				clearFields();
			}
		}

		private void clearFields() {
			firstName.setValue(null);
			lastName.setValue(null);
			age.setValue(null);
			gender.setValue(null);
		}

		private void saveUser() {
			try {
				fieldGroup.commit();
			} catch (CommitException e) {
				Notification.show(NotificationMessages.USER_SAVE_VALIDATION_ERROR_TITLE.getString(),
						NotificationMessages.USER_SAVE_VALIDATION_ERROR_DESCRIPTION.getString(), Type.ERROR_MESSAGE);
				return;
			}

			addUserService.saveUser(user);
			userSavedListener.userSaved();

			Notification.show(NotificationMessages.USER_SAVE_SUCCESS_TITLE.getString(),
					NotificationMessages.USER_SAVE_SUCCESS_DESCRIPTION.getString(), Type.WARNING_MESSAGE);

			clearFields();
		}

	}

	@Autowired
	private AddUserService addUserService;

	public Component createComponent(UserSavedListener userSavedListener) {
		return new AddUserMainLayout(userSavedListener).init().bind().layout();
	}
}

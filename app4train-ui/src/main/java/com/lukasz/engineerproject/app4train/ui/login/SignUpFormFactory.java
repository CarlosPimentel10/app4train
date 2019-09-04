package com.lukasz.engineerproject.app4train.ui.login;

import org.springframework.stereotype.Component;
import com.lukasz.engineerproject.app4train.repository.security.UserForRegistrationRepository;
import com.lukasz.engineerproject.app4train.service.security.RegisterUserService;
import com.lukasz.engineerproject.app4train.utils.NotificationMessages;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.ValoTheme;

@Component
public class SignUpFormFactory {

	private final RegisterUserService registerUserService;
	private final UserForRegistrationRepository userRepository;
	private final App4TrainLogoLayoutFactoryForAuthorization logoFactory;

	public SignUpFormFactory(RegisterUserService registerUserService,
							 UserForRegistrationRepository userRepository,
							 App4TrainLogoLayoutFactoryForAuthorization logoFactory) {
		this.registerUserService = registerUserService;
		this.userRepository = userRepository;
		this.logoFactory = logoFactory;
	}

	private class SignUpForm {
		private Panel panelForRegistration;
		private TextField userName;
		private PasswordField userPassword;
		private PasswordField repeatedUserPassword;
		private Button saveButton;
		private Button returnButton;
		private VerticalLayout layoutForRegistrationForm;
		private FormLayout formLayout;
		private VerticalLayout root;
		private Panel content;
		private Panel logoContent;
		private Panel descriptionOfRegistrationContent;
		private Label descriptionOfRegistration;
		private Panel footer;
		private Label contentOfFooter;
		private HorizontalLayout layoutForSocialMediaButtons;
		private Label labelForSocialMediaButtons;

		public SignUpForm init() {

			root = new VerticalLayout();
			root.setStyleName("root");
			logoContent = new Panel();
			content = new Panel();
			descriptionOfRegistrationContent = new Panel();
			footer = new Panel();

			prepareShortDescription();

			preparePanelForRegistration();

			prepareFieldsForPanel();

			prepareButtonsSaveAndReturn();

			prepareLayoutForRegistrationForm();

			saveButtonAction();

			returnButtonAction(
					returnButton,
					"/app4train-web/login"
			);

			prepareLabelForSocialMediaButtons();

			Button buttonForFacebook = prepareButtonForFacebook();

			Button buttonForInstagram = prepareButtonForInstagram();

			Button buttonForTwitter = prepareButtonForTwitter();

			prepareLayoutForSocialMediaButtons(buttonForFacebook, buttonForInstagram, buttonForTwitter);

			prepareFooter();

			return this;
		}


		private void prepareShortDescription() {
			descriptionOfRegistration = new Label(
					"<b>Wype≥nij wszystkie pola celem dokonania poprawnej rejestracji. Pozwoli Ci to na darmowe skorzystanie ze wszystkich treúci zawartych w tej aplikacji.</b>",
					ContentMode.HTML);
			descriptionOfRegistration.setStyleName("descriptionOfRegistration");
		}

		private void prepareFieldsForPanel() {
			userName = new TextField(StringUtils.SING_UP_USER_LOGIN.getString());
			userPassword = new PasswordField(StringUtils.SING_UP_USER_PASSWORD.getString());
			repeatedUserPassword = new PasswordField(StringUtils.SING_UP_USE_PASSWORD_AGAIN.getString());
		}

		private void saveButtonAction() {
			saveButton.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					if (!repeatedUserPassword.getValue().equals(userPassword.getValue())) {
						Notification.show(
								NotificationMessages.SIGN_UP_INCORRECT_SUCCESS_TITLE.getString(),
								NotificationMessages.SIGN_UP_INCORRECT_SUCCESS_SUCCESS_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE
						);
						userPassword.clear();
						repeatedUserPassword.clear();
						return;
					} else if (userName.getValue().isEmpty()) {
						Notification.show(
								NotificationMessages.SIGN_UP_VALIDATION_USERNAME_ERROR_TITLE.getString(),
								NotificationMessages.SIGN_UP_VALIDATION_USERNAME_ERROR_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE
						);
						userName.clear();
						userPassword.clear();
						repeatedUserPassword.clear();
						return;
					} else if (userPassword.getValue().isEmpty()) {
						Notification.show(
								NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_TITLE.getString(),
								NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE
						);
						userName.clear();
						userPassword.clear();
						repeatedUserPassword.clear();
						return;
					}

					if (isOperationValid()) {
						Notification.show(
								NotificationMessages.THE_SAME_LOGIN_IN_DATABASE_ERROR_TITLE.getString(),
								NotificationMessages.THE_SAME_LOGIN_IN_DATABASE_ERROR_DESCRIPTION.getString(),
								Type.WARNING_MESSAGE
						);
						userName.clear();
						userPassword.clear();
						repeatedUserPassword.clear();
					} else if (!isOperationValid()) {
						registerUserService.saveUser(
								userName.getValue(),
								userPassword.getValue());

						UI.getCurrent()
								.getPage()
								.setLocation("/app4train-web/login");
					}
				}
			});
		}

		private void returnButtonAction(Button returnButton, final String s) {
			returnButton.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					UI.getCurrent().getPage().setLocation(s);
				}
			});
		}

		private Button prepareButtonForTwitter() {
			Button buttonForTwitter = new Button();
			buttonForTwitter.setIcon(FontAwesome.TWITTER);
			returnButtonAction(buttonForTwitter, "https://twitter.com/app4train");
			return buttonForTwitter;
		}

		private Button prepareButtonForInstagram() {
			Button buttonForInstagram = new Button();
			buttonForInstagram.setIcon(FontAwesome.INSTAGRAM);
			returnButtonAction(buttonForInstagram, "https://www.instagram.com/app4train4/?hl=pl");
			return buttonForInstagram;
		}

		private Button prepareButtonForFacebook() {
			Button buttonForFacebook = new Button();
			buttonForFacebook.setIcon(FontAwesome.FACEBOOK);
			returnButtonAction(buttonForFacebook, "https://www.facebook.com/app4train");
			return buttonForFacebook;
		}

		private void prepareButtonsSaveAndReturn() {
			saveButton = new Button(StringUtils.SING_UP_SAVE.getString());
			saveButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
			saveButton.setIcon(FontAwesome.CHECK);

			returnButton = new Button(StringUtils.RETURN_TO_MAIN.getString());
			returnButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
			returnButton.setIcon(FontAwesome.SIGN_OUT);
		}

		private void prepareFooter() {
			contentOfFooter = new Label("<p><b>App4Train 2018 &copy; Wszystkie prawa zastrzeøone.</b></p>",
					ContentMode.HTML);
		}

		private void prepareLayoutForSocialMediaButtons(Button buttonForFacebook, Button buttonForInstagram, Button buttonForTwitter) {
			layoutForSocialMediaButtons = new HorizontalLayout(buttonForFacebook, buttonForInstagram, buttonForTwitter);
			layoutForSocialMediaButtons.setSpacing(true);
		}

		private void prepareLabelForSocialMediaButtons() {
			labelForSocialMediaButtons = new Label("<p><b>åledü nas</b></p>", ContentMode.HTML);
			labelForSocialMediaButtons.setStyleName(ValoTheme.TEXTFIELD_ALIGN_CENTER);
		}

		private void preparePanelForRegistration() {
			panelForRegistration = new Panel(StringUtils.SING_UP_PANEL_TITLE.getString());
			panelForRegistration.setSizeUndefined();
		}

		private void prepareLayoutForRegistrationForm() {
			layoutForRegistrationForm = new VerticalLayout();
			layoutForRegistrationForm.setStyleName("layoutForRegistrationForm");
			layoutForRegistrationForm.setMargin(true);
			layoutForRegistrationForm.setHeight("100%");
			formLayout = new FormLayout();
		}

		public com.vaadin.ui.Component layout() {

			root.setMargin(true);
			root.setWidth("100%");
			root.setHeightUndefined();
			root.setSpacing(true);

			logoContent.setWidth("75%");
			logoContent.setHeightUndefined();

			descriptionOfRegistrationContent.setWidth("75%");
			footer.setHeight("100%");

			content.setWidth("75%");
			content.setHeight("100%");

			com.vaadin.ui.Component logo = logoFactory.createComponent();
			logoContent.setContent(logo);

			descriptionOfRegistration.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			descriptionOfRegistrationContent.setContent(descriptionOfRegistration);

			layoutForRegistrationForm.addComponent(panelForRegistration);
			layoutForRegistrationForm.setComponentAlignment(panelForRegistration, Alignment.MIDDLE_CENTER);

			formLayout.addComponents(userName, userPassword, repeatedUserPassword);
			HorizontalLayout horizontalLayoutForButtons = new HorizontalLayout(saveButton, returnButton);
			horizontalLayoutForButtons.setSpacing(true);

			formLayout.addComponent(horizontalLayoutForButtons);
			formLayout.setSizeUndefined();
			formLayout.setMargin(true);

			footer.setWidth("75%");
			footer.setHeight("100%");

			panelForRegistration.setContent(formLayout);
			content.setContent(layoutForRegistrationForm);
			footer.setContent(contentOfFooter);

			root.addComponent(logoContent);
			root.addComponent(descriptionOfRegistrationContent);
			root.addComponent(content);
			root.addComponent(labelForSocialMediaButtons);
			root.addComponent(layoutForSocialMediaButtons);
			root.addComponent(footer);
			root.setComponentAlignment(descriptionOfRegistrationContent, Alignment.MIDDLE_CENTER);
			root.setComponentAlignment(content, Alignment.MIDDLE_CENTER);
			root.setComponentAlignment(layoutForSocialMediaButtons, Alignment.MIDDLE_CENTER);
			root.setComponentAlignment(logoContent, Alignment.TOP_CENTER);
			root.setComponentAlignment(footer, Alignment.BOTTOM_CENTER);

			return root;
		}

		private boolean isOperationValid() {
			try {
				userRepository.findByUsername(userName.getValue()).isEnabled();
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
		}
	}

	public com.vaadin.ui.Component createComponent() {
		return new SignUpForm().init().layout();
	}
}

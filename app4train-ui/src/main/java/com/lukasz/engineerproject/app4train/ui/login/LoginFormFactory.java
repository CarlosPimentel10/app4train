package com.lukasz.engineerproject.app4train.ui.login;

import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.ui.Notification;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import com.lukasz.engineerproject.app4train.utils.NotificationMessages;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.ValoTheme;

@Component
public class LoginFormFactory {

	@Autowired
	private DaoAuthenticationProvider daoAuthenticationProvider;

	@Autowired
	private App4TrainLogoLayoutFactoryForAuthorization logoFactory;

	private class LoginForm {
		private Panel panelForLoginForm;
		private TextField userName;
		private PasswordField userPassword;
		private Button loginButton;
		private Button signUpButton;
		private VerticalLayout layoutForLoginForm;
		private FormLayout formLayout;
		private VerticalLayout root;
		private Panel content;
		private Panel logoContent;
		private Panel descriptionAboutAppContent;
		private Label descriptionAboutApp;
		private Panel footer;
		private Label contentOfFooter;
		private Button buttonForFacebook;
		private Button buttonForInstagram;
		private Button buttonForTwitter;
		private HorizontalLayout layoutForSocalMediaButtons;
		private Label labelForSocialMediaButtons;

		public LoginForm init() {

			root = new VerticalLayout();
			root.setStyleName("root");

			logoContent = new Panel();
			content = new Panel();
			descriptionAboutAppContent = new Panel();
			footer = new Panel();
			footer.setStyleName("contentOfFooter");
			descriptionAboutApp = new Label(
					"<b>Stworzyliœmy dla Ciebie portal, który pozwoli ci ulepszyæ twoj¹ sylwetkê. Dziêki niemu pog³êbisz swoj¹ wiedzê z tematyki sportów sylwetkowych. Je¿eli chcesz zmieniæ swój wygl¹d, dokonaj rejestracji aby móc skorzystaæ z wielu przydatnych artyku³ów dietetycznych, przyk³adowych planów treningowych zarówno dla kobiet i mê¿czyzn, filmów instruktarzowych prezentuj¹cych poprawn¹ technikê wykonywania æwiczeñ, jak równie¿ kalkulatorów pozwalaj¹cych obliczyæ wskaŸnik masy cia³a (BMI), wskaŸnik ot³uszczenia cia³a (BAI) oraz podstawow¹ przemianê materii (BMR). Jesteœ niezadowolony ze swojego wygl¹du? Nie wiesz od czego zacz¹æ? Ten portal jest dla Ciebie. Dowiesz siê jak poprawiæ swój wygl¹d.</b>",
					ContentMode.HTML);
			descriptionAboutApp.setStyleName("descriptionAboutApp");
			panelForLoginForm = new Panel(StringUtils.LOGIN_PANEL_TITLE.getString());

			panelForLoginForm.setSizeUndefined();

			userName = new TextField(StringUtils.LOGIN_USER_NAME.getString());
			userPassword = new PasswordField(StringUtils.LOGIN_USER_PASSWORD.getString());

			loginButton = new Button(StringUtils.LOGIN_LOG_IN.getString());
			loginButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
			loginButton.setIcon(FontAwesome.SIGN_IN);

			signUpButton = new Button(StringUtils.LOGIN_REGISTER.getString());
			signUpButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
			signUpButton.setIcon(FontAwesome.CLIPBOARD);

			layoutForLoginForm = new VerticalLayout();
			layoutForLoginForm.setStyleName("panelForLoginForm");
			layoutForLoginForm.setMargin(true);
			layoutForLoginForm.setHeight("100%");
			formLayout = new FormLayout();

			labelForSocialMediaButtons = new Label("<p><b>ŒledŸ nas<b></p>", ContentMode.HTML);
			labelForSocialMediaButtons.setStyleName(ValoTheme.TEXTFIELD_ALIGN_CENTER);

			buttonForFacebook = new Button();
			buttonForFacebook.setStyleName("page-uii");
			buttonForFacebook.setIcon(FontAwesome.FACEBOOK);
			// buttonForFacebook.addStyleName(ValoTheme.BUTTON_SMALL);
			buttonForFacebook.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getPage().setLocation("https://www.facebook.com/app4train");

				}
			});

			buttonForInstagram = new Button();
			buttonForInstagram.setIcon(FontAwesome.INSTAGRAM);
			// buttonForInstagram.addStyleName(ValoTheme.BUTTON_SMALL);

			buttonForInstagram.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getPage().setLocation("https://www.instagram.com/app4train4/?hl=pl");

				}
			});

			buttonForTwitter = new Button();
			buttonForTwitter.setIcon(FontAwesome.TWITTER);
			// buttonForTwitter.addStyleName(ValoTheme.BUTTON_SMALL);

			buttonForTwitter.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getPage().setLocation("https://twitter.com/app4train");

				}
			});

			layoutForSocalMediaButtons = new HorizontalLayout(buttonForFacebook, buttonForInstagram, buttonForTwitter);
			layoutForSocalMediaButtons.setSpacing(true);

			contentOfFooter = new Label("<p><b>App4Train 2018 &copy; Wszystkie prawa zastrze¿one.</b></p>",
					ContentMode.HTML);
			contentOfFooter.setStyleName("contentOfFooter");
			return this;

		}

		public com.vaadin.ui.Component layout() {

			root.setWidth("100%");
			root.setHeightUndefined();
			root.setSpacing(true);
			root.setMargin(true);

			logoContent.setWidth("75%");
			logoContent.setHeightUndefined();

			descriptionAboutAppContent.setWidth("75%");
			footer.setHeight("100%");

			content.setWidth("75%");
			content.setHeight("100%");

			com.vaadin.ui.Component logo = logoFactory.createComponent();
			logoContent.setContent(logo);

			descriptionAboutApp.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			descriptionAboutAppContent.setContent(descriptionAboutApp);

			layoutForLoginForm.addComponent(panelForLoginForm);
			layoutForLoginForm.setComponentAlignment(panelForLoginForm, Alignment.MIDDLE_CENTER);
			formLayout.addComponent(userName);
			formLayout.addComponent(userPassword);
			HorizontalLayout horizontalLayoutForButtons = new HorizontalLayout(loginButton, signUpButton);
			horizontalLayoutForButtons.setSpacing(true);
			formLayout.addComponent(horizontalLayoutForButtons);
			formLayout.setSizeUndefined();
			formLayout.setMargin(true);

			footer.setWidth("75%");
			footer.setHeight("100%");

			panelForLoginForm.setContent(formLayout);
			content.setContent(layoutForLoginForm);
			footer.setContent(contentOfFooter);

			loginButton.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					try {
						Authentication authenticationToken = new UsernamePasswordAuthenticationToken(
								userName.getValue(), userPassword.getValue());
						Authentication authenticated = daoAuthenticationProvider.authenticate(authenticationToken);
						SecurityContextHolder.getContext().setAuthentication(authenticated);
						UI.getCurrent().getPage().setLocation("/app4train-web/ui");
					} catch (AuthenticationException e) {
						Notification.show(NotificationMessages.LOGIN_INCORRECT_SUCCESS_TITLE.getString(),
								NotificationMessages.LOGIN_INCORRECT_SUCCESS_SUCCESS_DESCRIPTION.getString(),
								com.vaadin.ui.Notification.Type.ERROR_MESSAGE);
						System.out.println(e.getMessage());
					}
					userName.clear();
					userPassword.clear();
				}
			});
			signUpButton.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getPage().setLocation("/app4train-web/signup");

				}
			});

			root.addComponent(logoContent);
			root.addComponent(descriptionAboutAppContent);
			root.addComponent(content);
			root.addComponent(labelForSocialMediaButtons);
			root.addComponent(layoutForSocalMediaButtons);
			root.addComponent(footer);
			root.setComponentAlignment(descriptionAboutAppContent, Alignment.MIDDLE_CENTER);
			root.setComponentAlignment(content, Alignment.MIDDLE_CENTER);
			root.setComponentAlignment(layoutForSocalMediaButtons, Alignment.MIDDLE_CENTER);
			root.setComponentAlignment(logoContent, Alignment.TOP_CENTER);
			root.setComponentAlignment(footer, Alignment.BOTTOM_CENTER);
			return root;
		}
	}

	public com.vaadin.ui.Component createComponent() {
		return new LoginForm().init().layout();
	}
}

package com.lukasz.engineerproject.app4train.ui.contact;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.lukasz.engineerproject.app4train.service.emailSender.GmailSender;
import com.lukasz.engineerproject.app4train.utils.NotificationMessages;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.themes.ValoTheme;

@Component
public class FormMessageForMailLayoutFactory {

	private class AddMessageForMailLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private TextField userName;
		private TextField userEmail;
		private TextField topic;
		private TextField userPhoneNumber;
		private TextArea message;
		private Button sendButton;
		private FormLayout formLayoutForMessageContent;

		public AddMessageForMailLayout init() {

			userName = new TextField(StringUtils.USER_NAME.getString());
			userEmail = new TextField(StringUtils.USER_EMAIL.getString());
			topic = new TextField(StringUtils.TOPIC.getString());
			userPhoneNumber = new TextField(StringUtils.USER_PHONE_NUMBER.getString());
			message = new TextArea();

			userName.setNullRepresentation("");
			userEmail.setNullRepresentation("");
			topic.setNullRepresentation("");
			userPhoneNumber.setNullRepresentation("");
			message.setNullRepresentation("");

			message.setWidth("100%");

			sendButton = new Button(StringUtils.SEND_MESSAGE.getString());
			sendButton.setIcon(FontAwesome.SAVE);
			sendButton.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);

			sendButton.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					if (userName.getValue().isEmpty()) {
						Notification.show(NotificationMessages.SIGN_UP_VALIDATION_USERNAME_ERROR_TITLE.getString(),
								NotificationMessages.SIGN_UP_VALIDATION_USERNAME_ERROR_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE);
						return;
					} else if (userEmail.getValue().isEmpty()) {
						Notification.show(NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_TITLE.getString(),
								NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE);
						return;
					} else if (topic.getValue().isEmpty()) {
						Notification.show(NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_TITLE.getString(),
								NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE);
						return;
					} else if (userPhoneNumber.getValue().isEmpty()) {
						Notification.show(NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_TITLE.getString(),
								NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE);
						return;
					} else if (message.getValue().isEmpty()) {
						Notification.show(NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_TITLE.getString(),
								NotificationMessages.SIGN_UP_VALIDATION_PASSWORD_ERROR_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE);
						return;
					} else if (!userEmail.getValue().matches("^[_\\w\\.\\-]+@[\\w\\.-]+\\.[a-z]{2,6}$")) {
						Notification.show(NotificationMessages.EMAIL_FAIL_VALIDATION_DESCRIPTION.getString(),
								Type.ERROR_MESSAGE);
						userEmail.clear();
						return;
					}

					sender.setSender("app4train@gmail.com", "");
					try {
						sender.addRecipient("app4train@gmail.com");
						sender.setSubject(topic.getValue());
						sender.setBody(message.getValue() + "\n" + userName.getValue() + "\n"
								+ userPhoneNumber.getValue() + "\n" + userEmail.getValue());
						sender.send();
					} catch (AddressException e) {
						e.printStackTrace();
					} catch (MessagingException e) {
						e.printStackTrace();
					}

					Notification.show(NotificationMessages.EMAIL_SUCCESS_SENDING_MESSAGE_DESCRIPTION.getString(),
							Type.HUMANIZED_MESSAGE);

					userName.clear();
					userEmail.clear();
					topic.clear();
					userPhoneNumber.clear();
					message.clear();
					return;
				}

			});
			sendButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);

			formLayoutForMessageContent = new FormLayout();
			return this;
		}

		public com.vaadin.ui.Component layout() {

			setMargin(true);
			VerticalLayout verticalLayoutForHorizontalLayout = new VerticalLayout();
			HorizontalLayout horizontalLayoutForFirstRow = new HorizontalLayout(userName, userEmail);
			horizontalLayoutForFirstRow.setSpacing(true);
			HorizontalLayout horizontalLayoutForSecondRow = new HorizontalLayout(topic, userPhoneNumber);
			horizontalLayoutForSecondRow.setSpacing(true);
			verticalLayoutForHorizontalLayout.addComponents(horizontalLayoutForFirstRow, horizontalLayoutForSecondRow,
					message, sendButton);
			verticalLayoutForHorizontalLayout.setSpacing(true);
			verticalLayoutForHorizontalLayout.setSizeUndefined();
			formLayoutForMessageContent.addComponent(verticalLayoutForHorizontalLayout);
			formLayoutForMessageContent.setSizeUndefined();
			formLayoutForMessageContent.setMargin(true);

			addComponent(formLayoutForMessageContent);
			setComponentAlignment((com.vaadin.ui.Component) formLayoutForMessageContent, Alignment.MIDDLE_CENTER);
			return formLayoutForMessageContent;
		}

		private void clearFields() {
			userName.setValue(null);
			userEmail.setValue(null);
			userPhoneNumber.setValue(null);
			topic.setValue(null);
		}
	}

	@Autowired
	private GmailSender sender;

	public com.vaadin.ui.Component createComponent() {
		return new AddMessageForMailLayout().init().layout();
	}

}

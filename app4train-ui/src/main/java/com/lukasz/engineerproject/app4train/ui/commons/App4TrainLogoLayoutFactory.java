package com.lukasz.engineerproject.app4train.ui.commons;

import org.springframework.security.core.context.SecurityContextHolder;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.ValoTheme;

@org.springframework.stereotype.Component
public class App4TrainLogoLayoutFactory implements UIComponentBuilder {

	private class LogoLayout extends VerticalLayout {

		private Embedded logo;
		private Button button;

		public LogoLayout init() {
			logo = new Embedded();
			logo.setSource(new ThemeResource("../../images/logo_app_4_train.png"));
			logo.setSizeUndefined();
			button = new Button(StringUtils.MENU_LOGOUT_LABEL.getString());//
			return this;
		}

		public LogoLayout layout() {

			addComponents(button, logo);

			setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
			setComponentAlignment(button, Alignment.BOTTOM_RIGHT);
			button.setStyleName(ValoTheme.BUTTON_FRIENDLY); //
			button.addStyleName(ValoTheme.BUTTON_SMALL);
			button.setIcon(FontAwesome.SIGN_OUT);
			button.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
			button.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					SecurityContextHolder.clearContext();
					UI.getCurrent().getPage().setLocation("/app4train-web/login");

				}
			});
			return this;
		}
	}

	public Component createComponent() {
		return new LogoLayout().init().layout();
	}
}

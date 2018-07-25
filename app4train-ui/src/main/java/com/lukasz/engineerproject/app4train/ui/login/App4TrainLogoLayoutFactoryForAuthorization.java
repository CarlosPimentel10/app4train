package com.lukasz.engineerproject.app4train.ui.login;

import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class App4TrainLogoLayoutFactoryForAuthorization implements UIComponentBuilder {

	private class LogoLayout extends VerticalLayout {

		private Embedded logo;

		public LogoLayout init() {
			logo = new Embedded();
			logo.setSource(new ThemeResource("../../images/logo_app_4_train.png"));
			logo.setSizeUndefined();
			return this;
		}

		public LogoLayout layout() {

			addComponent(logo);
			setComponentAlignment(logo, Alignment.MIDDLE_CENTER);

			return this;
		}
	}

	public Component createComponent() {
		return new LogoLayout().init().layout();
	}
}

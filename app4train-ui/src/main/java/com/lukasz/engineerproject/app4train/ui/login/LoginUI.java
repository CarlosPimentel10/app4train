package com.lukasz.engineerproject.app4train.ui.login;

import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI(path = LoginUI.PATH)
@Theme("valo")
public class LoginUI extends UI {

	public static final String PATH = "/login";

	@Autowired
	LoginFormFactory loginFormFactory;

	@Override
	protected void init(VaadinRequest request) {
		getPage().getStyles().add(".root{font-size: 16px; font-family: 'BenchNine';}");
		getPage().getStyles().add(".panelForLoginForm{background-color:#e8e8e8}");
		getPage().getStyles().add(".descriptionAboutApp{color: #ffffff; background-color:#333}");
		setContent(loginFormFactory.createComponent());

	}
}

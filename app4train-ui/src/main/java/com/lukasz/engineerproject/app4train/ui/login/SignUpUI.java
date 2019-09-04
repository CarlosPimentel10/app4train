package com.lukasz.engineerproject.app4train.ui.login;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI(path = SignUpUI.PATH)
@Theme("valo")
public class SignUpUI extends UI {

	static final String PATH = "/signup";

	private final SignUpFormFactory signUpFormFactory;

	public SignUpUI(SignUpFormFactory signUpFormFactory) {
		this.signUpFormFactory = signUpFormFactory;
	}

	@Override
	protected void init(VaadinRequest request) {
		getPage().getStyles().add(".root{font-size: 16px; font-family: 'BenchNine';}");
		getPage().getStyles().add(".layoutForRegistrationForm{background-color:#e8e8e8}");
		getPage().getStyles().add(".descriptionOfRegistration{color: #ffffff; background-color:#333}");
		setContent(signUpFormFactory.createComponent());
	}
}

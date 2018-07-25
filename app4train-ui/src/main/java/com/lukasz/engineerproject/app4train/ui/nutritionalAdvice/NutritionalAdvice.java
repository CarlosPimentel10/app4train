package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = NutritionalAdvice.NAME, ui = App4TrainMainUI.class)
public class NutritionalAdvice extends VerticalLayout implements View {

	public static final String NAME = "wyœwietlporady¿ywieniowe";

	@Autowired
	private NutritionalAdviceMenuFactory nutritionalAdviceMenuFactory;

	private void addLayout() {
		setMargin(false);
		Component createTreeMenuComponent = nutritionalAdviceMenuFactory.createComponent();
		addComponent(createTreeMenuComponent);

	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();

	}
}

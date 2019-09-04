package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = NutritionalAdvice.NAME, ui = App4TrainMainUI.class)
public class NutritionalAdvice extends VerticalLayout implements View {

	public static final String NAME = "wyœwietlporady¿ywieniowe";

	private final NutritionalAdviceMenuFactory nutritionalAdviceMenuFactory;

	public NutritionalAdvice(NutritionalAdviceMenuFactory nutritionalAdviceMenuFactory) {
		this.nutritionalAdviceMenuFactory = nutritionalAdviceMenuFactory;
	}

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

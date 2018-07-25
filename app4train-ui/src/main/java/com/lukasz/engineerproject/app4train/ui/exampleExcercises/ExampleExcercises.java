package com.lukasz.engineerproject.app4train.ui.exampleExcercises;

import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Video;

@SpringView(name = ExampleExcercises.NAME, ui = App4TrainMainUI.class)
public class ExampleExcercises extends VerticalLayout implements View {

	public static final String NAME = "wyœwietlæwiczenia";
	private Video video;

	@Autowired
	private ExampleExcerciseMenuFactory exampleExcerciseMenuFactory;

	private void addLayout() {
		setMargin(false);
		Component createTreeMenuComponent = exampleExcerciseMenuFactory.createComponent();
		addComponent(createTreeMenuComponent);
	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();

	}
}

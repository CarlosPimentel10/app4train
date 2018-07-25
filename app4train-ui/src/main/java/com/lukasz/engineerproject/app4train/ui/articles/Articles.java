package com.lukasz.engineerproject.app4train.ui.articles;

import org.springframework.beans.factory.annotation.Autowired;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Video;

@SpringView(name = Articles.NAME, ui = App4TrainMainUI.class)
public class Articles extends VerticalLayout implements View {

	public static final String NAME = "wyœwietlartyku³y";
	private Video video;

	@Autowired
	private ArticlesMenuFactory articlesMenuFactory;

	private void addLayout() {
		setMargin(false);
		Component createTreeMenuComponent = articlesMenuFactory.createComponent();
		addComponent(createTreeMenuComponent);
	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();

	}
}

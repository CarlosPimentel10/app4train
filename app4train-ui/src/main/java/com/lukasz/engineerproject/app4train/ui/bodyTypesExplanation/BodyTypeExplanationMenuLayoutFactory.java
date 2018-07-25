package com.lukasz.engineerproject.app4train.ui.bodyTypesExplanation;

import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = BodyTypeExplanationMenuLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class BodyTypeExplanationMenuLayoutFactory extends VerticalLayout implements View {
	public static final String NAME = "sprawdütypybudowycia≥a";
	private TabSheet tabSheet;

	@Autowired
	private BodyTypeExplanationForEctomorphicMenuLayoutFactory bodyTypeExplanationForEctomorphicMenuLayoutFactory;

	@Autowired
	private BodyTypeExplanationForEndomorphicMenuLayoutFactory bodyTypeExplanationForEndomorphicMenuLayoutFactory;

	@Autowired
	private BodyTypeExplanationForMesomorphicMenuLayoutFactory bodyTypeExplanationForMesomorphicMenuLayoutFactory;

	private void addLayout() {

		setMargin(false);
		tabSheet = new TabSheet();
		tabSheet.setWidth("100%");

		Component BodyTypeExplanationForEctomorphicTab = bodyTypeExplanationForEctomorphicMenuLayoutFactory
				.createComponent(this);
		Component BodyTypeExplanationForMesomorphicTab = bodyTypeExplanationForMesomorphicMenuLayoutFactory
				.createComponent(this);
		Component BodyTypeExplanationForEndomorphicTab = bodyTypeExplanationForEndomorphicMenuLayoutFactory
				.createComponent(this);

		tabSheet.addTab(BodyTypeExplanationForEctomorphicTab, StringUtils.ECTOMORPHIC.getString());
		tabSheet.addTab(BodyTypeExplanationForMesomorphicTab, StringUtils.MESOMORPHIC.getString());
		tabSheet.addTab(BodyTypeExplanationForEndomorphicTab, StringUtils.ENDOMORPHIC.getString());

		addComponent(tabSheet);
	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}
}

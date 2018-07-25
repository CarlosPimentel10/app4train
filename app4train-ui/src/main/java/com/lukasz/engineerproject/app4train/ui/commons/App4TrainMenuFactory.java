package com.lukasz.engineerproject.app4train.ui.commons;

import com.lukasz.engineerproject.app4train.ui.navigator.App4TrainNavigator;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.lukasz.engineerproject.app4train.utils.StringUtils;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class App4TrainMenuFactory implements UIComponentBuilder {

	private class App4TrainMenu extends VerticalLayout implements Property.ValueChangeListener {
		
		private Tree mainMenu;
		
		public App4TrainMenu init() {
			mainMenu = new Tree();
			mainMenu.setStyleName("tree");
			mainMenu.addValueChangeListener(this);
			return this;
		}
		
		public App4TrainMenu layout() {
			
			setWidth("100%");
			setHeightUndefined();
			mainMenu.addItem(StringUtils.MENU_USER.getString());
			mainMenu.addItem(StringUtils.MENU_TRAINING_PLANS.getString());
			mainMenu.addItem(StringUtils.MENU_EXCERCISES.getString());
			mainMenu.addItem(StringUtils.MENU_ADVICES.getString());
			mainMenu.addItem(StringUtils.MENU_ARTICLES.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_MASS_INDEX.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_ADIPOSITY_INDEX.getString());
			mainMenu.addItem(StringUtils.MENU_BASIC_METABOLIC_RATE.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_TYPE.getString());
			mainMenu.addItem(StringUtils.MENU_CONTACT.getString());
			
			mainMenu.expandItem(StringUtils.MENU_USER.getString());
			mainMenu.expandItem(StringUtils.MENU_TRAINING_PLANS.getString());
			mainMenu.expandItem(StringUtils.MENU_EXCERCISES.getString());
			mainMenu.expandItem(StringUtils.MENU_ADVICES.getString());
			mainMenu.expandItem(StringUtils.MENU_ARTICLES.getString());
			mainMenu.expandItem(StringUtils.MENU_CONTACT.getString());
			mainMenu.expandItem(StringUtils.MENU_BODY_MASS_INDEX.getString());
			mainMenu.expandItem(StringUtils.MENU_BODY_ADIPOSITY_INDEX.getString());
			mainMenu.expandItem(StringUtils.MENU_BASIC_METABOLIC_RATE.getString());
			mainMenu.expandItem(StringUtils.MENU_BODY_TYPE.getString());

			mainMenu.addItem(StringUtils.MENU_ADD_USER.getString());
			mainMenu.addItem(StringUtils.MENU_REMOVE_USER.getString());
			mainMenu.addItem(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_ONE.getString());
			mainMenu.addItem(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_TWO.getString());
			mainMenu.addItem(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_THREE.getString());
			mainMenu.addItem(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_ONE.getString());
			mainMenu.addItem(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_TWO.getString());
			mainMenu.addItem(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_THREE.getString());
			mainMenu.addItem(StringUtils.MENU_EXCERCISES_CHECK.getString());
			mainMenu.addItem(StringUtils.MENU_ADVICES_CHECK.getString());
			mainMenu.addItem(StringUtils.MENU_ARTICLES_CHECK.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_MASS_INDEX_EXPALATION.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_MASS_INDEX_CALCULATE.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_MASS_INDEX_DELETE.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_TYPE_CHECK.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_ADIPOSITY_INDEX_EXPALATION.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_ADIPOSITY_INDEX_CALCULATE.getString());
			mainMenu.addItem(StringUtils.MENU_BODY_ADIPOSITY_INDEX_DELETE.getString());
			mainMenu.addItem(StringUtils.MENU_BASIC_METABOLIC_RATE_EXPALATION.getString());
			mainMenu.addItem(StringUtils.MENU_BASIC_METABOLIC_RATE_CALCULATE.getString());
			mainMenu.addItem(StringUtils.MENU_BASIC_METABOLIC_RATE_DELETE.getString());
			mainMenu.addItem(StringUtils.MENU_CONTACT_CHECK.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_ADD_USER.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_REMOVE_USER.getString(), false);
			mainMenu.setParent(StringUtils.MENU_ADD_USER.getString(), StringUtils.MENU_USER.getString());
			mainMenu.setParent(StringUtils.MENU_REMOVE_USER.getString(), StringUtils.MENU_USER.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_ONE.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_TWO.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_THREE.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_ONE.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_TWO.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_THREE.getString(), false);
			mainMenu.setParent(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_ONE.getString(), StringUtils.MENU_TRAINING_PLANS.getString());
			mainMenu.setParent(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_TWO.getString(), StringUtils.MENU_TRAINING_PLANS.getString());
			mainMenu.setParent(StringUtils.MENU_TRAINING_PLANS_FOR_MAN_EXAMPLE_THREE.getString(), StringUtils.MENU_TRAINING_PLANS.getString());
			mainMenu.setParent(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_ONE.getString(), StringUtils.MENU_TRAINING_PLANS.getString());
			mainMenu.setParent(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_TWO.getString(), StringUtils.MENU_TRAINING_PLANS.getString());
			mainMenu.setParent(StringUtils.MENU_TRAINING_PLANS_FOR_WOMAN_EXAMPLE_THREE.getString(), StringUtils.MENU_TRAINING_PLANS.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_EXCERCISES_CHECK.getString(), false);
			mainMenu.setParent(StringUtils.MENU_EXCERCISES_CHECK.getString(), StringUtils.MENU_EXCERCISES.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_ADVICES_CHECK.getString(), false);
			mainMenu.setParent(StringUtils.MENU_ADVICES_CHECK.getString(), StringUtils.MENU_ADVICES.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_ARTICLES_CHECK.getString(), false);
			mainMenu.setParent(StringUtils.MENU_ARTICLES_CHECK.getString(), StringUtils.MENU_ARTICLES.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_BODY_MASS_INDEX_EXPALATION.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_BODY_MASS_INDEX_CALCULATE.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_BODY_MASS_INDEX_DELETE.getString(), false);
			mainMenu.setParent(StringUtils.MENU_BODY_MASS_INDEX_EXPALATION.getString(), StringUtils.MENU_BODY_MASS_INDEX.getString());
			mainMenu.setParent(StringUtils.MENU_BODY_MASS_INDEX_CALCULATE.getString(), StringUtils.MENU_BODY_MASS_INDEX.getString());
			mainMenu.setParent(StringUtils.MENU_BODY_MASS_INDEX_DELETE.getString(), StringUtils.MENU_BODY_MASS_INDEX.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_BODY_ADIPOSITY_INDEX_EXPALATION.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_BODY_ADIPOSITY_INDEX_CALCULATE.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_BODY_ADIPOSITY_INDEX_DELETE.getString(), false);
			mainMenu.setParent(StringUtils.MENU_BODY_ADIPOSITY_INDEX_EXPALATION.getString(), StringUtils.MENU_BODY_ADIPOSITY_INDEX.getString());
			mainMenu.setParent(StringUtils.MENU_BODY_ADIPOSITY_INDEX_CALCULATE.getString(), StringUtils.MENU_BODY_ADIPOSITY_INDEX.getString());
			mainMenu.setParent(StringUtils.MENU_BODY_ADIPOSITY_INDEX_DELETE.getString(), StringUtils.MENU_BODY_ADIPOSITY_INDEX.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_BASIC_METABOLIC_RATE_EXPALATION.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_BASIC_METABOLIC_RATE_CALCULATE.getString(), false);
			mainMenu.setChildrenAllowed(StringUtils.MENU_BASIC_METABOLIC_RATE_DELETE.getString(), false);
			mainMenu.setParent(StringUtils.MENU_BASIC_METABOLIC_RATE_EXPALATION.getString(), StringUtils.MENU_BASIC_METABOLIC_RATE.getString());
			mainMenu.setParent(StringUtils.MENU_BASIC_METABOLIC_RATE_CALCULATE.getString(), StringUtils.MENU_BASIC_METABOLIC_RATE.getString());
			mainMenu.setParent(StringUtils.MENU_BASIC_METABOLIC_RATE_DELETE.getString(), StringUtils.MENU_BASIC_METABOLIC_RATE.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_BODY_TYPE_CHECK.getString(), false);
			mainMenu.setParent(StringUtils.MENU_BODY_TYPE_CHECK.getString(), StringUtils.MENU_BODY_TYPE.getString());
			
			mainMenu.setChildrenAllowed(StringUtils.MENU_CONTACT_CHECK.getString(), false);
			mainMenu.setParent(StringUtils.MENU_CONTACT_CHECK.getString(), StringUtils.MENU_CONTACT.getString());
			
			mainMenu.setSizeUndefined();
			addComponent(mainMenu);
			
			return this;
		}

		public void valueChange(ValueChangeEvent event) {
			String selectedItemPath = (String) event.getProperty().getValue();
			
			if( selectedItemPath == null ) return;
			
			if( selectedItemPath == "Logout" ) return;
			
			String path = selectedItemPath.toLowerCase().replaceAll("\\s+","");
			App4TrainNavigator.navigate(path);
		}
	}

	public Component createComponent() {
		return new App4TrainMenu().init().layout();
	}
}

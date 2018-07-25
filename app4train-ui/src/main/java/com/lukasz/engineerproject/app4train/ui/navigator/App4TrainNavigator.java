package com.lukasz.engineerproject.app4train.ui.navigator;

import com.google.gwt.thirdparty.guava.common.base.Strings;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.SingleComponentContainer;
import com.vaadin.ui.UI;

public class App4TrainNavigator extends Navigator {

	public App4TrainNavigator(UI ui, SingleComponentContainer container) {
		super(ui, container);
	}

	private static App4TrainNavigator getNavigator() {
		UI ui = UI.getCurrent();
		Navigator navigator = ui.getNavigator();
		return (App4TrainNavigator) navigator;
	}

	public static void navigate(String path) {
		try {
			App4TrainNavigator.getNavigator().navigateTo(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void navigateTo(String viewName) {
		super.navigateTo(Strings.nullToEmpty(viewName));
	}
}

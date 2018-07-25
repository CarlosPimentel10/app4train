package com.lukasz.engineerproject.app4train.ui.bodyMassIndex;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.lukasz.engineerproject.app4train.model.entity.BodyMassIndex;
import com.lukasz.engineerproject.app4train.service.showBodyMassIndexResult.ShowAllBodyMassIndexService;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.ValoTheme;

@org.springframework.stereotype.Component
public class ShowAllCalculatedBodyMassIndexLayoutFactory implements UIComponentBuilder {

	private List<BodyMassIndex> bodyMassIndex;
	private BeanItemContainer<BodyMassIndex> container;
	private Button buttonForWindow;
	private Embedded tableBMI;

	private class ShowBodyMassIndexLayout extends VerticalLayout {

		private Grid bodyMassIndexTable;

		public ShowBodyMassIndexLayout init() {

			setMargin(true);
			container = new BeanItemContainer<BodyMassIndex>(BodyMassIndex.class, bodyMassIndex);
			bodyMassIndexTable = new Grid(container);
			bodyMassIndexTable.setColumnOrder("bodyMassIndexResult", "userGrowth", "userWeight", "user");
			bodyMassIndexTable.getColumn("bodyMassIndexResult").setHeaderCaption("BMI");
			bodyMassIndexTable.getColumn("userGrowth").setHeaderCaption("Wzrost (cm)");
			bodyMassIndexTable.getColumn("userWeight").setHeaderCaption("Waga (kg)");
			bodyMassIndexTable.getColumn("user").setHeaderCaption("Uøytkownik");
			bodyMassIndexTable.removeColumn("id");
			bodyMassIndexTable.setWidth("100%");
			bodyMassIndexTable.setImmediate(true);

			buttonForWindow = new Button("Sprawdü tabele BMI");
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					Window window = new Window();
					window.setModal(true);

					tableBMI = new Embedded();
					tableBMI.setSource(new ThemeResource("../../images/tabela_bmi.png"));

					tableBMI.setSizeUndefined();
					window.setContent(tableBMI);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_PRIMARY);
			return this;
		}

		public ShowBodyMassIndexLayout layout() {
			addComponents(bodyMassIndexTable, buttonForWindow);
			return this;
		}

		public ShowBodyMassIndexLayout load() {
			bodyMassIndex = showAllBodyMassIndexService.getAllBodyMassIndex();
			return this;
		}
	}

	public void refreshTables() {
		bodyMassIndex = showAllBodyMassIndexService.getAllBodyMassIndex();
		container.removeAllItems();
		container.addAll(bodyMassIndex);
	}

	@Autowired
	private ShowAllBodyMassIndexService showAllBodyMassIndexService;

	public Component createComponent() {
		return new ShowBodyMassIndexLayout().load().init().layout();
	}
}
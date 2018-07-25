package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;
import com.lukasz.engineerproject.app4train.service.showBodyAdiposityIndexResult.ShowAllBodyAdiposityIndexService;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.ValoTheme;

@org.springframework.stereotype.Component
public class ShowAllCalculatedBodyAdiposityIndexLayoutFactory implements UIComponentBuilder {

	private List<BodyAdiposityIndex> bodyAdiposityIndex;
	private BeanItemContainer<BodyAdiposityIndex> container;
	private Button buttonForWindowOne;
	private Button buttonForWindowTwo;
	private Embedded tableBAIforMan;
	private Embedded tableBAIforWoman;
	private HorizontalLayout layoutForButtons;

	private class ShowBodyAdiposityIndexLayout extends VerticalLayout {

		private Grid bodyAdiposityIndexTable;

		public ShowBodyAdiposityIndexLayout init() {

			setMargin(true);
			container = new BeanItemContainer<BodyAdiposityIndex>(BodyAdiposityIndex.class, bodyAdiposityIndex);
			bodyAdiposityIndexTable = new Grid(container);
			bodyAdiposityIndexTable.setColumnOrder("bodyAdiposityIndexResult", "userGrowth", "hipCircumference");
			bodyAdiposityIndexTable.getColumn("bodyAdiposityIndexResult").setHeaderCaption("BAI");
			bodyAdiposityIndexTable.getColumn("userGrowth").setHeaderCaption("Wzrost (cm)");
			bodyAdiposityIndexTable.getColumn("hipCircumference").setHeaderCaption("Obwód bioder (cm)");
			bodyAdiposityIndexTable.getColumn("user").setHeaderCaption("U¿ytkownik");
			bodyAdiposityIndexTable.removeColumn("id");
			bodyAdiposityIndexTable.setWidth("100%");
			bodyAdiposityIndexTable.setImmediate(true);

			buttonForWindowOne = new Button("SprawdŸ tabele BAI dla mê¿czyzn");
			buttonForWindowOne.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					Window window = new Window();
					window.setModal(true);

					tableBAIforMan = new Embedded();
					tableBAIforMan.setSource(new ThemeResource("../../images/tabela_BAI_M.png"));
					// tableBMI.setWidth( "100%" );

					tableBAIforMan.setSizeUndefined();
					window.setContent(tableBAIforMan);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindowOne.setIcon(FontAwesome.SEARCH);
			buttonForWindowOne.setStyleName(ValoTheme.BUTTON_PRIMARY);

			buttonForWindowTwo = new Button("SprawdŸ tabele BAI dla kobiet");
			buttonForWindowTwo.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					Window window = new Window();
					window.setModal(true);

					tableBAIforWoman = new Embedded();
					tableBAIforWoman.setSource(new ThemeResource("../../images/tabela_BAI_K.png"));
					// tableBMI.setWidth( "100%" );

					tableBAIforWoman.setSizeUndefined();
					window.setContent(tableBAIforWoman);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindowTwo.setIcon(FontAwesome.SEARCH);
			buttonForWindowTwo.setStyleName(ValoTheme.BUTTON_PRIMARY);

			layoutForButtons = new HorizontalLayout(buttonForWindowOne, buttonForWindowTwo);
			layoutForButtons.setSpacing(true);

			return this;
		}

		public ShowBodyAdiposityIndexLayout layout() {
			addComponents(bodyAdiposityIndexTable, layoutForButtons);
			setComponentAlignment(layoutForButtons, Alignment.MIDDLE_CENTER);
			return this;
		}

		public ShowBodyAdiposityIndexLayout load() {
			bodyAdiposityIndex = showAllBodyAdiposityIndexService.getAllBodyAdiposityIndex();
			return this;
		}
	}

	public void refreshTables() {
		bodyAdiposityIndex = showAllBodyAdiposityIndexService.getAllBodyAdiposityIndex();
		container.removeAllItems();
		container.addAll(bodyAdiposityIndex);
	}

	@Autowired
	private ShowAllBodyAdiposityIndexService showAllBodyAdiposityIndexService;

	public Component createComponent() {
		return new ShowBodyAdiposityIndexLayout().load().init().layout();
	}
}
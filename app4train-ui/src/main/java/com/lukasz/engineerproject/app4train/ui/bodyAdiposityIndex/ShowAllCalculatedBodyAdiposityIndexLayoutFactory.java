package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BodyAdiposityIndexEntity;
import com.lukasz.engineerproject.app4train.service.bai.ShowAllBodyAdiposityIndexService;
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

	private List<BodyAdiposityIndexEntity> bodyAdiposityIndexEntities;
	private BeanItemContainer<BodyAdiposityIndexEntity> container;
	private Button buttonForWindowOne;
	private Button buttonForWindowTwo;
	private Embedded tableBAIforMan;
	private Embedded tableBAIforWoman;
	private HorizontalLayout layoutForButtons;

	public ShowAllCalculatedBodyAdiposityIndexLayoutFactory(ShowAllBodyAdiposityIndexService showAllBodyAdiposityIndexService) {
		this.showAllBodyAdiposityIndexService = showAllBodyAdiposityIndexService;
	}

	private class ShowBodyAdiposityIndexLayout extends VerticalLayout {

		private Grid bodyAdiposityIndexTable;

		public ShowBodyAdiposityIndexLayout init() {

			setMargin(true);
			container = new BeanItemContainer<BodyAdiposityIndexEntity>(BodyAdiposityIndexEntity.class, bodyAdiposityIndexEntities);

			prepareAdiposityIndexTable();

			prepareButtonForWindowOne();

			windowOneButtonAction();

			prepareButtonForWindowTwo();

			windowTwoButtonAction();

			layoutForButtons = new HorizontalLayout(buttonForWindowOne, buttonForWindowTwo);
			layoutForButtons.setSpacing(true);

			return this;
		}

		private void windowTwoButtonAction() {
			buttonForWindowTwo.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					Window window = new Window();
					window.setModal(true);

					tableBAIforWoman = new Embedded();
					tableBAIforWoman.setSource(new ThemeResource("../../images/tabela_BAI_K.png"));
					tableBAIforWoman.setSizeUndefined();

					window.setContent(tableBAIforWoman);
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void windowOneButtonAction() {
			buttonForWindowOne.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {

					Window window = new Window();
					window.setModal(true);

					tableBAIforMan = new Embedded();
					tableBAIforMan.setSource(new ThemeResource("../../images/tabela_BAI_M.png"));
					tableBAIforMan.setSizeUndefined();

					window.setContent(tableBAIforMan);
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareButtonForWindowTwo() {
			buttonForWindowTwo = new Button("SprawdŸ tabele BAI dla kobiet");
			buttonForWindowTwo.setIcon(FontAwesome.SEARCH);
			buttonForWindowTwo.setStyleName(ValoTheme.BUTTON_PRIMARY);
		}

		private void prepareButtonForWindowOne() {
			buttonForWindowOne = new Button("SprawdŸ tabele BAI dla mê¿czyzn");
			buttonForWindowOne.setIcon(FontAwesome.SEARCH);
			buttonForWindowOne.setStyleName(ValoTheme.BUTTON_PRIMARY);
		}

		private void prepareAdiposityIndexTable() {
			bodyAdiposityIndexTable = new Grid(container);
			bodyAdiposityIndexTable.setColumnOrder("bodyAdiposityIndexResult", "userGrowth", "hipCircumference");
			bodyAdiposityIndexTable.getColumn("bodyAdiposityIndexResult").setHeaderCaption("BAI");
			bodyAdiposityIndexTable.getColumn("userGrowth").setHeaderCaption("Wzrost (cm)");
			bodyAdiposityIndexTable.getColumn("hipCircumference").setHeaderCaption("Obwód bioder (cm)");
			bodyAdiposityIndexTable.getColumn("user").setHeaderCaption("U¿ytkownik");
			bodyAdiposityIndexTable.removeColumn("id");
			bodyAdiposityIndexTable.setWidth("100%");
			bodyAdiposityIndexTable.setImmediate(true);
		}

		public ShowBodyAdiposityIndexLayout layout() {
			addComponents(bodyAdiposityIndexTable, layoutForButtons);
			setComponentAlignment(layoutForButtons, Alignment.MIDDLE_CENTER);
			return this;
		}

		ShowBodyAdiposityIndexLayout load() {
			bodyAdiposityIndexEntities = showAllBodyAdiposityIndexService.getAllBodyAdiposityIndex();
			return this;
		}
	}

	void refreshTables() {
		bodyAdiposityIndexEntities = showAllBodyAdiposityIndexService.getAllBodyAdiposityIndex();
		container.removeAllItems();
		container.addAll(bodyAdiposityIndexEntities);
	}


	private final ShowAllBodyAdiposityIndexService showAllBodyAdiposityIndexService;

	public Component createComponent() {
		return new ShowBodyAdiposityIndexLayout().load().init().layout();
	}
}
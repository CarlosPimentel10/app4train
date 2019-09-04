package com.lukasz.engineerproject.app4train.ui.trainingPlans;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = TrainingPlanForManExampleThreeLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class TrainingPlanForManExampleThreeLayoutFactory extends VerticalLayout implements View {

	public static final String NAME = "dlam�czyzn-przyk�ad3";
	private Label exampleOfTraining;
	private VerticalLayout layoutForDayOne;
	private VerticalLayout layoutForDayTwo;
	private VerticalLayout layoutForDayThree;
	private Label dayOne;
	private Label dayTwo;
	private Label dayThree;
	private Grid trainingPlanTableForDayOne;
	private Grid trainingPlanTableForDayTwo;
	private Grid trainingPlanTableForDayThree;
	private Button buttonForFirstTraining;
	private Button buttonForSecondTraining;
	private Button buttonForThirdTraining;

	private void addLayout() {

		setMargin(false);

		prepareShortDescription();

		prepareButtonForFirstTraining();

		prepareButtonForSecondTraining();

		prepareButtonForThirdTraining();

		VerticalLayout layoutForButtons = new VerticalLayout();
		layoutForButtons.addComponents(buttonForFirstTraining, buttonForSecondTraining, buttonForThirdTraining);
		layoutForButtons.setSpacing(true);

		VerticalLayout layoutForAllComponents = new VerticalLayout();
		layoutForAllComponents.addComponents(exampleOfTraining, layoutForButtons);
		layoutForButtons.setStyleName(ValoTheme.TEXTFIELD_ALIGN_CENTER);
		addComponents(layoutForAllComponents);
	}

	private void prepareShortDescription() {
		exampleOfTraining = new Label("<b>Trening dla zaawansowanych </b><br><br><br>"
				+ "Plan treningowy przeznaczony jest dla m�czyzn chodz�cych ju� na si�owni� powy�ej dw�ch lat. Je�eli nie do ko�ca wiesz jak wygl�da dane �wiczenie to szczeg�owy opis ka�dego �wiczenia oraz prezentacja ich wykonania zosta�a umieszczona w menu w zak�adce \"Przyk�adowe �wiczenia\". Trening powinien by� poprzedzony odpowiedni� rozgrzewk�. Co najmniej 5 minut biegu oraz dynamicznych podskok�w, kr��e� a tak�e wymach�w ko�czynami powinno by� obowi�zkowym etapem przygotowuj�cym Tw�j organizm do treningu.<br><br><br>",
				ContentMode.HTML);
		exampleOfTraining.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
	}

	private void prepareButtonForFirstTraining() {
		buttonForFirstTraining = new Button("Zobacz pierwszy dzie� treningowy");
		buttonForFirstTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayOne = new Label("Trening pierwszy", ContentMode.HTML);
				trainingPlanTableForDayOne = new Grid();
				trainingPlanTableForDayOne.setStyleName("trainingPlanTableForDayOneExampleThree");
				trainingPlanTableForDayOne.addColumn("", String.class);
				trainingPlanTableForDayOne.addColumn("Nazwa �wiczenia", String.class);
				trainingPlanTableForDayOne.addColumn("Ilo�� powt�rze�", String.class);
				trainingPlanTableForDayOne.addColumn("Ilo�� serii", Integer.class);
				trainingPlanTableForDayOne.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayOne.addRow("1", "Rozpi�tki w pozycji stoj�cej przy wykorzystaniu wyci�gu g�rnego", "12-10-8", 3, 60);
				trainingPlanTableForDayOne.addRow("2", "Wyciskanie sztangi na �awce sko�nej (skos dodatni)", "12-10-8", 3, 60);
				trainingPlanTableForDayOne.addRow("3", "Wyciskanie sztangi na �awce sko�nej (skos ujemny)","12-10-8", 3, 60);
				trainingPlanTableForDayOne.addRow("4", "Wyciskanie hantli na �awce p�askiej", "12-10-8", 3, 60);
				trainingPlanTableForDayOne.addRow("5", "Podci�ganie hantli w kl�ku podpartym na �awce", "12-10-8",
						3, 60);
				trainingPlanTableForDayOne.addRow("6",
						"Podci�ganie na dr��ku", "12-10-8", 3, 60);
				trainingPlanTableForDayOne.addRow("7", "Podci�ganie sztangi trzymanej podchwytem w opadzie tu�owia", "12-10-8", 3, 60);
				trainingPlanTableForDayOne.addRow("8", "Podci�ganie sztangi trzymanej nachwytem w opadzie tu�owia", "12-10-8",
						3, 60);
				trainingPlanTableForDayOne.setSizeFull();
				window.setModal(true);
				layoutForDayOne = new VerticalLayout(dayOne, trainingPlanTableForDayOne);
				layoutForDayOne.setWidth("100%");
				window.setContent(layoutForDayOne);
				window.setWidth("100%");
				UI.getCurrent().addWindow(window);
			}
		});
		buttonForFirstTraining.setIcon(FontAwesome.SEARCH);
		buttonForFirstTraining.setStyleName(ValoTheme.BUTTON_PRIMARY);
	}

	private void prepareButtonForSecondTraining() {
		buttonForSecondTraining = new Button("Zobacz drugi dzie� treningowy");
		buttonForSecondTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayTwo = new Label("Trening drugi", ContentMode.HTML);
				trainingPlanTableForDayTwo = new Grid();
				trainingPlanTableForDayTwo.setStyleName("trainingPlanTableForDayTwoExampleThree");
				trainingPlanTableForDayTwo.addColumn("", String.class);
				trainingPlanTableForDayTwo.addColumn("Nazwa �wiczenia", String.class);
				trainingPlanTableForDayTwo.addColumn("Ilo�� powt�rze�", String.class);
				trainingPlanTableForDayTwo.addColumn("Ilo�� serii", Integer.class);
				trainingPlanTableForDayTwo.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayTwo.addRow("1", "Uginanie przedramion z wykorzystaniem gumy oporowej","12-10-8", 1, 60);
				trainingPlanTableForDayTwo.addRow("2", "Uginanie przedramion w pozycji stoj�cej z wykorzystaniem sztangi �amanej","12-10-8", 1, 60);
				trainingPlanTableForDayTwo.addRow("3", "Uginanie przedramion z wykorzystaniem przyrz�du \"Larre Scott\" tzw. modlitewnik","12-10-8", 1,
						60);
				trainingPlanTableForDayTwo.addRow("4", "Prostowanie przedramion z wykorzystaniem wyci�gu g�rnego z u�yciem dr��ka prostego trzymanego nachwytem","12-10-8", 1, 60);
				trainingPlanTableForDayTwo.addRow("5", "Prostowanie przedramion ze sztang� �aman� w pozycji le��cej na �aweczce","12-10-8", 1, 60);
				trainingPlanTableForDayTwo.addRow("6", "Prostowanie przedramion przy wykorzystaniu wyci�gu g�rnego z u�yciem linek","12-10-8", 1, 60);
				trainingPlanTableForDayTwo.addRow("7", "Prostowanie przedramion z wykorzystaniem wyci�gu g�rnego z u�yciem dr��ka prostego trzymanego podchwytem","12-10-8", 1, 60);
				trainingPlanTableForDayTwo.setWidth("100%");
				window.setModal(true);
				layoutForDayTwo = new VerticalLayout(dayTwo, trainingPlanTableForDayTwo);
				layoutForDayTwo.setWidth("100%");
				window.setContent(layoutForDayTwo);
				window.setWidth("100%");
				UI.getCurrent().addWindow(window);
			}
		});
		buttonForSecondTraining.setIcon(FontAwesome.SEARCH);
		buttonForSecondTraining.setStyleName(ValoTheme.BUTTON_PRIMARY);
	}

	private void prepareButtonForThirdTraining() {
		buttonForThirdTraining = new Button("Zobacz trzeci dzie� treningowy");
		buttonForThirdTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayThree = new Label("Trening trzeci", ContentMode.HTML);
				trainingPlanTableForDayThree = new Grid();
				trainingPlanTableForDayThree.setStyleName("trainingPlanTableForDayThreeExampleThree");
				trainingPlanTableForDayThree.addColumn("", String.class);
				trainingPlanTableForDayThree.addColumn("Nazwa �wiczenia", String.class);
				trainingPlanTableForDayThree.addColumn("Ilo�� powt�rze�", String.class);
				trainingPlanTableForDayThree.addColumn("Ilo�� serii", Integer.class);
				trainingPlanTableForDayThree.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayThree.addRow("1", "Prostowanie n�g na maszynie", "12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("2", "Przysiady z wykorzystaniem kettlebell", "12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("3",
						"\"Przysiady na suwnicy sko�nej", "12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("4", "Uginanie n�g w pozycji le��cej na maszynie",
						"12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("5", "Wykroki z wykorzystaniem kettlebell",
						"12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("6", "Wspi�cia na palce na maszynie (�ydki)",
						"12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("7", "Unoszenie ramion w bok z wykorzystaniem gumy oporowej","12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("8", "�wiczenie na mi�nie tylniej cz�ci bark�w z wykorzystaniem maszyny","12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("9", "Wyciskanie hantli nad g�owe na �awce p�askiej","12-10-8", 1, 60);
				trainingPlanTableForDayThree.addRow("10", "Podci�ganie sztangi �amanej do brody","12-10-8", 1, 60);
				trainingPlanTableForDayThree.setWidth("100%");
				window.setModal(true);
				layoutForDayThree = new VerticalLayout(dayThree, trainingPlanTableForDayThree);
				layoutForDayThree.setWidth("100%");
				window.setContent(layoutForDayThree);
				window.setWidth("100%");
				UI.getCurrent().addWindow(window);
			}
		});
		buttonForThirdTraining.setIcon(FontAwesome.SEARCH);
		buttonForThirdTraining.setStyleName(ValoTheme.BUTTON_PRIMARY);
	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}
}

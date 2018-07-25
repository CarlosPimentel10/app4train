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

@SpringView(name = TrainingPlanForManExampleOneLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class TrainingPlanForManExampleOneLayoutFactory extends VerticalLayout implements View {

	public static final String NAME = "dlam�czyzn-przyk�ad1";
	private Label exampleOfTraining;
	private VerticalLayout layoutForAllComponents;
	private VerticalLayout layoutForDayOne;
	private VerticalLayout layoutForDayTwo;
	private VerticalLayout layoutForDayThree;
	private VerticalLayout layoutForButtons;
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

		exampleOfTraining = new Label("<b>Trening dla pocz�tkuj�cych </b><br><br><br>"
				+ "Plan treningowy przeznaczony jest dla m�czyzn rozpoczynaj�cych swoj� przygod� z si�owni�. Je�eli nie do ko�ca wiesz jak wygl�da dane �wiczenie to szczeg�owy opis ka�dego �wiczenia oraz prezentacja ich wykonania zosta�a umieszczona w menu w zak�adce \"Przyk�adowe �wiczenia\". Trening powinien by� poprzedzony odpowiedni� rozgrzewk�. Co najmniej 5 minut biegu oraz dynamicznych podskok�w, kr��e� a tak�e wymach�w ko�czynami powinno by� obowi�zkowym etapem przygotowuj�cym Tw�j organizm do treningu.<br><br><br>",
				ContentMode.HTML);
		exampleOfTraining.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);

		buttonForFirstTraining = new Button("Zobacz pierwszy dzie� treningowy");
		buttonForFirstTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayOne = new Label("Trening pierwszy", ContentMode.HTML);
				trainingPlanTableForDayOne = new Grid();
				trainingPlanTableForDayOne.setStyleName("trainingPlanTableForDayOneExampleOne");
				trainingPlanTableForDayOne.addColumn("", String.class);
				trainingPlanTableForDayOne.addColumn("Nazwa �wiczenia", String.class);
				trainingPlanTableForDayOne.addColumn("Ilo�� powt�rze�", Integer.class);
				trainingPlanTableForDayOne.addColumn("Ilo�� serii", Integer.class);
				trainingPlanTableForDayOne.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayOne.addRow("1", "\"Rozpi�tki\" z hantlami na �awce p�askiej", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("2", "Wyciskanie sztangi na �awce sko�nej (skos dodatni)", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("3", "Wyciskanie hantli nad g�owe w pozycji siedz�cej", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("4", "Unoszenie ramion w bok z wykorzystaniem hantli", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("5", "Prostowanie przedramion z wykorzystaniem wyci�gu g�rnego", 15,
						1, 60);
				trainingPlanTableForDayOne.addRow("6",
						"Prostowanie przedramion ze sztang� �aman� w pozycji le��cej na �awce", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("7", "Podci�ganie hantli w kl�ku podpartym na �awce", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("8", "Podci�ganie sztangi trzymanej nachwytem w opadzie tu�owia", 15,
						1, 60);
				trainingPlanTableForDayOne.addRow("9",
						"Naprzemianstronne uginanie przedramion z wykorzystaniem\r\n" + " hantli w pozycji stoj�cej",
						15, 1, 60);
				trainingPlanTableForDayOne.addRow("10",
						"Uginanie przedramion wykorzystaniu przyrz�du \"Larre Scott\" tzw. modlitewnik", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("11", "Prostowanie n�g na maszynie", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("12", "Przysiady na suwnicy sko�nej", 15, 1, 60);
				trainingPlanTableForDayOne.addRow("13", "Wspi�cia na palce na maszynie (�ydki)", 15, 1, 60);
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

		buttonForSecondTraining = new Button("Zobacz drugi dzie� treningowy");
		buttonForSecondTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayTwo = new Label("Trening drugi", ContentMode.HTML);
				trainingPlanTableForDayTwo = new Grid();
				trainingPlanTableForDayTwo.setStyleName("trainingPlanTableForDayTwoExampleOne");
				trainingPlanTableForDayTwo.addColumn("", String.class);
				trainingPlanTableForDayTwo.addColumn("Nazwa �wiczenia", String.class);
				trainingPlanTableForDayTwo.addColumn("Ilo�� powt�rze�", Integer.class);
				trainingPlanTableForDayTwo.addColumn("Ilo�� serii", Integer.class);
				trainingPlanTableForDayTwo.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayTwo.addRow("1", "\"Rozpi�tki\" z hantlami na �awce p�askiej", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("2", "Wyciskanie sztangi na �awce sko�nej (skos ujemny)", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("3", "Wyciskanie sztangi na �awce sprzed klatki piersiowej", 15, 1,
						60);
				trainingPlanTableForDayTwo.addRow("4", "Podci�ganie sztangi �amanej do brody", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("5", "Wykroki z hantlami", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("6", "Uginanie n�g w pozycji le��cej na maszynie", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("7", "Wspi�cia na palce na maszynie (�ydki)", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("8", "Przyci�ganie dr��ka wyci�gu g�rnego do klatki piersiowej", 15,
						1, 60);
				trainingPlanTableForDayTwo.addRow("9", "Podci�ganie sztangi trzymanej podchwytem w opadzie tu�owia", 15,
						1, 60);
				trainingPlanTableForDayTwo.addRow("10",
						"Uginanie przedramion z wykorzystaniem hantli w pozycji stoj�cej \r\n"
								+ "(brak rotacji nadgarstka)",
						15, 1, 60);
				trainingPlanTableForDayTwo.addRow("11",
						"Uginanie przedramion w pozycji stoj�cej z wykorzystaniem sztangi �amanej", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("12",
						"Prostowanie przedramion przy wykorzystaniu wyci�gu g�rnego z u�yciem linek", 15, 1, 60);
				trainingPlanTableForDayTwo.addRow("13",
						"Prostowanie przedramion przy wykorzystaniu wyci�gu g�rnego \r\n"
								+ "z u�yciem dr��ka prostego trzymanego podchwytem",
						15, 1, 60);
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

		buttonForThirdTraining = new Button("Zobacz trzeci dzie� treningowy");
		buttonForThirdTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayThree = new Label("Trening trzeci", ContentMode.HTML);
				trainingPlanTableForDayThree = new Grid();
				trainingPlanTableForDayThree.setStyleName("trainingPlanTableForDayThreeExampleOne");
				trainingPlanTableForDayThree.addColumn("", String.class);
				trainingPlanTableForDayThree.addColumn("Nazwa �wiczenia", String.class);
				trainingPlanTableForDayThree.addColumn("Ilo�� powt�rze�", Integer.class);
				trainingPlanTableForDayThree.addColumn("Ilo�� serii", Integer.class);
				trainingPlanTableForDayThree.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayThree.addRow("1", "\"Rozpi�tki\" w pozycji siedz�cej na przyrz�dzie", 15, 1, 60);
				trainingPlanTableForDayThree.addRow("2", "Wyciskanie sztangi na �awce p�askiej", 15, 1, 60);
				trainingPlanTableForDayThree.addRow("3",
						"\"Rozpi�tki\" w pozycji stoj�cej przy wykorzystaniu wyci�gu g�rnego", 15, 1, 60);
				trainingPlanTableForDayThree.addRow("4", "Podci�ganie sztangi trzymanej podchwytem w opadzie tu�owia",
						15, 1, 60);
				trainingPlanTableForDayThree.addRow("5", "Podci�ganie sztangi trzymanej nachwytem w opadzie tu�owia",
						15, 1, 60);
				trainingPlanTableForDayThree.addRow("6", "Przyci�ganie dr��ka wyci�gu g�rnego do klatki piersiowej  ",
						15, 1, 60);
				trainingPlanTableForDayThree.addRow("7", "Prostowanie n�g na maszynie", 15, 1, 60);
				trainingPlanTableForDayThree.addRow("8", "Przysiady na suwnicy sko�nej", 15, 1, 60);
				trainingPlanTableForDayThree.addRow("9", "Wykroki z hantlami", 15, 1, 60);
				trainingPlanTableForDayThree.addRow("10", "Wspi�cia na palce na maszynie (�ydki)", 15, 1, 60);
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

		layoutForButtons = new VerticalLayout();
		layoutForButtons.addComponents(buttonForFirstTraining, buttonForSecondTraining, buttonForThirdTraining);
		layoutForButtons.setSpacing(true);

		layoutForAllComponents = new VerticalLayout();
		layoutForAllComponents.addComponents(exampleOfTraining, layoutForButtons);
		layoutForButtons.setStyleName(ValoTheme.TEXTFIELD_ALIGN_CENTER);
		addComponents(layoutForAllComponents);
	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}
}

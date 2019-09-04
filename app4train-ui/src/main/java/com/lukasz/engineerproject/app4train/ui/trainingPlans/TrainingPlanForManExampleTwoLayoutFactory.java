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

@SpringView(name = TrainingPlanForManExampleTwoLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class TrainingPlanForManExampleTwoLayoutFactory extends VerticalLayout implements View {

	public static final String NAME = "dlamê¿czyzn-przyk³ad2";
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
		exampleOfTraining = new Label("<b>Trening dla œredniozaawansowanych </b><br><br><br>"
				+ "Plan treningowy przeznaczony jest dla mê¿czyzn chodz¹cych ju¿ na si³owniê powy¿ej roku. Je¿eli nie do koñca wiesz jak wygl¹da dane æwiczenie to szczegó³owy opis ka¿dego æwiczenia oraz prezentacja ich wykonania zosta³a umieszczona w menu w zak³adce \"Przyk³adowe æwiczenia\". Trening powinien byæ poprzedzony odpowiedni¹ rozgrzewk¹. Co najmniej 5 minut biegu oraz dynamicznych podskoków, kr¹¿eñ a tak¿e wymachów koñczynami powinno byæ obowi¹zkowym etapem przygotowuj¹cym Twój organizm do treningu.<br><br><br>",
				ContentMode.HTML);
		exampleOfTraining.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
	}

	private void prepareButtonForFirstTraining() {
		buttonForFirstTraining = new Button("Zobacz pierwszy dzieñ treningowy");
		buttonForFirstTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayOne = new Label("Trening pierwszy", ContentMode.HTML);
				trainingPlanTableForDayOne = new Grid();
				trainingPlanTableForDayOne.setStyleName("trainingPlanTableForDayOneExampleTwo");
				trainingPlanTableForDayOne.addColumn("", String.class);
				trainingPlanTableForDayOne.addColumn("Nazwa æwiczenia", String.class);
				trainingPlanTableForDayOne.addColumn("Iloœæ powtórzeñ", String.class);
				trainingPlanTableForDayOne.addColumn("Iloœæ serii", Integer.class);
				trainingPlanTableForDayOne.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayOne.addRow("1", "\"Rozpiêtki\" z hantlami na ³awce p³askiej", "od 8 do 10", 2,
						60);
				trainingPlanTableForDayOne.addRow("2", "Wyciskanie sztangi na ³awce skoœnej (skos ujemny)",
						"od 8 do 10", 3, 90);
				trainingPlanTableForDayOne.addRow("3", "Wyciskanie sztangi na ³awce p³askiej", "od 8 do 10", 3, 60);
				trainingPlanTableForDayOne.addRow("4", "Wyciskanie hantli na ³awce p³askiej (skos dodatni)",
						"od 8 do 12", 3, 90);
				trainingPlanTableForDayOne.addRow("5", "Butterflay", "od 8 do 12", 3, 90);
				trainingPlanTableForDayOne.addRow("6", "Podci¹ganie hantli w klêku podpartym na ³awce", "12", 2, 60);
				trainingPlanTableForDayOne.addRow("7", "Podci¹ganie sztangi trzymanej podchwytem w opadzie tu³owia",
						"od 8 do 10", 3, 90);
				trainingPlanTableForDayOne.addRow("8", "Podci¹ganie sztangi trzymanej nachwytem w opadzie tu³owia",
						"od 8 do 10", 3, 60);
				trainingPlanTableForDayOne.addRow("9", "Przyci¹ganie dr¹¿ka wyci¹gu górnego do klatki piersiowej",
						"od 10 do 10", 3, 60);
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
		buttonForSecondTraining = new Button("Zobacz drugi dzieñ treningowy");
		buttonForSecondTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayTwo = new Label("Trening drugi", ContentMode.HTML);
				trainingPlanTableForDayTwo = new Grid();
				trainingPlanTableForDayTwo.setStyleName("trainingPlanTableForDayTwoExampleTwo");
				trainingPlanTableForDayTwo.addColumn("", String.class);
				trainingPlanTableForDayTwo.addColumn("Nazwa æwiczenia", String.class);
				trainingPlanTableForDayTwo.addColumn("Iloœæ powtórzeñ", String.class);
				trainingPlanTableForDayTwo.addColumn("Iloœæ serii", Integer.class);
				trainingPlanTableForDayTwo.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayTwo.addRow("1",
						"Naprzemianstronne uginanie przedramion z wykorzystaniem\r\n" + " hantli w pozycji stoj¹ce",
						"12 powt.+ 1 powt.\r\n" + " wykonywane do\r\n" + " po³owy ruchu i\r\n"
								+ " zatrzymanie na 20 sek",
						2, 90);
				trainingPlanTableForDayTwo.addRow("2",
						"Uginanie przedramion w pozycji stoj¹cej z wykorzystaniem sztangi ³amanej", "od 10 do 12", 3,
						60);
				trainingPlanTableForDayTwo.addRow("3",
						"Uginanie przedramion wykorzystaniu przyrz¹du \"Larre Scott\" tzw. modlitewnik", "od 8 do 10",
						3, 90);
				trainingPlanTableForDayTwo.addRow("4",
						"Uginanie przedramion z wykorzystaniem hantli w pozycji stoj¹cej \r\n"
								+ "(brak rotacji nadgarstka)",
						"8", 3, 60);
				trainingPlanTableForDayTwo.addRow("5",
						"Prostowanie przedramion przy wykorzystaniu wyci¹gu górnego z u¿yciem linek", "12", 2, 60);
				trainingPlanTableForDayTwo.addRow("6",
						"Prostowanie przedramion ze sztang¹ ³aman¹ w pozycji le¿¹cej na ³awce", "10", 3, 60);
				trainingPlanTableForDayTwo.addRow("7", "Zginanie przedramion w podporze ty³em na ³aweczce", "10", 3,
						60);
				trainingPlanTableForDayTwo.addRow("8",
						"Prostowanie przedramion z wykorzystaniem wyci¹gu górnego podchwytem", "od 10 do 12", 3, 90);
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
		buttonForThirdTraining = new Button("Zobacz trzeci dzieñ treningowy");
		buttonForThirdTraining.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Window window = new Window();
				dayThree = new Label("Trening trzeci", ContentMode.HTML);
				trainingPlanTableForDayThree = new Grid();
				trainingPlanTableForDayThree.setStyleName("trainingPlanTableForDayThreeExampleTwo");
				trainingPlanTableForDayThree.addColumn("", String.class);
				trainingPlanTableForDayThree.addColumn("Nazwa æwiczenia", String.class);
				trainingPlanTableForDayThree.addColumn("Iloœæ powtórzeñ", Integer.class);
				trainingPlanTableForDayThree.addColumn("Iloœæ serii", Integer.class);
				trainingPlanTableForDayThree.addColumn("Przerwa (sek)", Integer.class);
				trainingPlanTableForDayThree.addRow("1", "prostowanie nóg na maszynie", 15, 3, 60);
				trainingPlanTableForDayThree.addRow("2", "Wyciskanie ciê¿aru na suwnicy skoœnej", 15, 3, 90);
				trainingPlanTableForDayThree.addRow("3", "Przysiady na suwnicy skoœnej", 15, 3, 90);
				trainingPlanTableForDayThree.addRow("4", "Wykroki z hantlami", 10, 3, 60);
				trainingPlanTableForDayThree.addRow("5", "Uginanie nóg w pozycji le¿¹cej na maszynie", 10, 3, 60);
				trainingPlanTableForDayThree.addRow("6", "Wspiêcia na palce na maszynie (³ydki)", 15, 3, 60);
				trainingPlanTableForDayThree.addRow("7",
						"Æwiczenie na miêœnie tylniej czêœci barków z wykorzystaniem maszyny", 10, 3, 60);
				trainingPlanTableForDayThree.addRow("8", "Wyciskanie sztangi na ³awce sprzed klatki piersiowej", 10, 3,
						90);
				trainingPlanTableForDayThree.addRow("9", "Podci¹ganie sztangi ³amanej do brody", 12, 2, 90);
				trainingPlanTableForDayThree.addRow("10",
						"Naprzemianstronne unoszenie ramion w bok z wykorzystaniem\r\n" + " wyci¹gu dolnego", 12, 2,
						90);
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

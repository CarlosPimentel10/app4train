package com.lukasz.engineerproject.app4train.ui.commons;

import org.springframework.context.ApplicationContext;
import com.lukasz.engineerproject.app4train.ui.navigator.App4TrainNavigator;
import com.lukasz.engineerproject.app4train.ui.users.UserLayoutFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "/ui")
@Title("A p p 4 T r a i n")
@Theme("valo")

public class App4TrainMainUI extends UI {

	private final ApplicationContext appContext;
	private final SpringViewProvider viewProvider;
	private final App4TrainMenuFactory menuFactory;
	private final App4TrainLogoLayoutFactory logoFactory;

	private Panel changeTab = new Panel();

	private Button buttonForFacebook;
	private Button buttonForInstagram;
	private Button buttonForTwitter;
	private HorizontalLayout layoutForSocalMediaButtons;
	private Label labelForSocialMediaButtons;

	public App4TrainMainUI(
			ApplicationContext appContext,
			SpringViewProvider viewProvider,
			App4TrainMenuFactory menuFactory,
			App4TrainLogoLayoutFactory logoFactory) {
		this.appContext = appContext;
		this.viewProvider = viewProvider;
		this.menuFactory = menuFactory;
		this.logoFactory = logoFactory;
	}

	@Override
	protected void init(VaadinRequest request) {

		changeTab.setStyleName("panelForTree");
		changeTab.setHeight("100%");
		VerticalLayout layoutForAllContent = new VerticalLayout();
		setStyleName("page-ui");

		layoutForAllContent.setWidth("100%");
		layoutForAllContent.setHeightUndefined();

		prepareLabelForSocialMediaButtons();

		this.setStyleName("page-ui");

		setMainProperties();

		setPropertiesForArticles();

		setPropertiesForTrainingPlans();

		serPropertiesForNutritionalAdvices();

		setPropertiesForExcertises();

		prepareButtonForFacebook();

		prepareButtonForInstagram();

		prepareButtonForTwitter();

		prepareLayoutForSocialMediaButtons();

		VerticalLayout layoutForLogoMenuContent = new VerticalLayout();

		layoutForLogoMenuContent.setSizeFull();

		Panel footer = new Panel();
		footer.setHeightUndefined();
		footer.setWidth("75%");
		Label contentOfFooter = new Label("<p><b>App4Train 2018 &copy; Wszystkie prawa zastrzeøone.</b></p>",
				ContentMode.HTML);
		contentOfFooter.setStyleName("footer");

		Panel content = new Panel();
		content.setHeightUndefined();
		content.setWidth("75%");

		Panel logoContent = new Panel();
		logoContent.setWidth("75%");
		logoContent.setHeightUndefined();

		Panel menuContent = new Panel();
		menuContent.setSizeFull();

		HorizontalLayout uiLayout = new HorizontalLayout();
		uiLayout.setStyleName("content");
		uiLayout.setSizeFull();
		uiLayout.setMargin(true);
		uiLayout.setSpacing(true);

		Component logo = logoFactory.createComponent();
		Component menu = menuFactory.createComponent();

		uiLayout.addComponent(menuContent);
		uiLayout.addComponent(changeTab);

		uiLayout.setComponentAlignment(changeTab, Alignment.TOP_CENTER);

		uiLayout.setComponentAlignment(menuContent, Alignment.TOP_CENTER);

		uiLayout.setExpandRatio(menuContent, 1);
		uiLayout.setExpandRatio(changeTab, 2);

		logoContent.setContent(logo);
		content.setContent(uiLayout);
		menuContent.setContent(menu);
		footer.setContent(contentOfFooter);

		layoutForLogoMenuContent.addComponent(logoContent);
		layoutForLogoMenuContent.addComponent(content);
		layoutForLogoMenuContent.setComponentAlignment(content, Alignment.MIDDLE_CENTER);
		layoutForLogoMenuContent.setComponentAlignment(logoContent, Alignment.TOP_CENTER);
		layoutForLogoMenuContent.setSpacing(true);

		layoutForAllContent.addComponents(
				layoutForLogoMenuContent,
				labelForSocialMediaButtons,
				layoutForSocalMediaButtons,
				footer);
		layoutForAllContent.setComponentAlignment(layoutForLogoMenuContent, Alignment.MIDDLE_CENTER);
		layoutForAllContent.setComponentAlignment(layoutForSocalMediaButtons, Alignment.MIDDLE_CENTER);
		layoutForAllContent.setComponentAlignment(footer, Alignment.BOTTOM_CENTER);
		layoutForAllContent.setSpacing(true);

		initializeNavigator();

		setContent(layoutForAllContent);

	}

	private void prepareLayoutForSocialMediaButtons() {
		layoutForSocalMediaButtons = new HorizontalLayout(buttonForFacebook, buttonForInstagram, buttonForTwitter);
		layoutForSocalMediaButtons.setSpacing(true);
	}

	private void prepareLabelForSocialMediaButtons() {
		labelForSocialMediaButtons = new Label("<p><b>åledü nas</b></p>", ContentMode.HTML);
		labelForSocialMediaButtons.addStyleName(ValoTheme.TEXTFIELD_ALIGN_CENTER);
	}

	private void prepareButtonForTwitter() {
		buttonForTwitter = new Button();
		buttonForTwitter.setIcon(FontAwesome.TWITTER);

		buttonForTwitter.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getPage().setLocation("https://twitter.com/app4train");

			}
		});
	}

	private void prepareButtonForInstagram() {
		buttonForInstagram = new Button();
		buttonForInstagram.setIcon(FontAwesome.INSTAGRAM);

		buttonForInstagram.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getPage().setLocation("https://www.instagram.com/app4train4/?hl=pl");

			}
		});
	}

	private void prepareButtonForFacebook() {
		buttonForFacebook = new Button();

		buttonForFacebook.setIcon(FontAwesome.FACEBOOK);

		buttonForFacebook.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getPage().setLocation("https://www.facebook.com/app4train");

			}
		});
	}

	private void setPropertiesForExcertises() {
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseOnePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseOnePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwoPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwoPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThreePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThreePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFivePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFivePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSixPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSixPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSevenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSevenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseEightPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseEightPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseNinePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseNinePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseElevenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseElevenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwelvePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwelvePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirteenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirteenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourteenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourteenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFifteenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFifteenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSixteenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSixteenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSeventeenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseSeventeenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseEighteenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseEighteenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseNineteenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseNineteenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyOnePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyOnePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyTwoPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyTwoPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyThreePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyThreePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyFourPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyFourPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyFivePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyFivePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentySixPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentySixPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentySevenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentySevenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyEightPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyEightPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyNinePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseTwentyNinePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyOnePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyOnePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyTwoPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyTwoPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyThreePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyThreePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyFourPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyFourPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyFivePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyFivePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtySixPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtySixPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtySevenPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtySevenPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyEightPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyEightPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyNinePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseThirtyNinePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourtyPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourtyPart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourtyOnePart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourtyOnePart2{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourtyTwoPart1{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfExcerciseFourtyTwoPart2{font-size: 16px; font-family: 'BenchNine';}");
	}

	private void serPropertiesForNutritionalAdvices() {
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceOne{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceTwo{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceThree{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceFour{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceFive{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceSix{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceSeven{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceEight{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceNine{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceTen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceEleven{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceTwelve{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceThirteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceFourteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceFifteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceSixteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceSeventeen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceEighteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceNineteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfNutritionalAdviceTwenty{font-size: 16px; font-family: 'BenchNine';}");
	}

	private void setPropertiesForTrainingPlans() {
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayOneExampleOne{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayTwoExampleOne{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayThreeExampleOne{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayOneExampleTwo{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayTwoExampleTwo{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayThreeExampleTwo{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayOneExampleThree{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayTwoExampleThree{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".trainingPlanTableForDayThreeExampleThree{font-size: 16px; font-family: 'BenchNine';}");
	}

	private void setMainProperties() {

		getPage()
				.getStyles()
				.add(".page-ui{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".tree{font-size: 14px; font-family: 'BenchNine'; color: #ffffff; background-color:#333}");
		getPage()
				.getStyles()
				.add(".content{background-color:#e8e8e8}");
	}

	private void setPropertiesForArticles() {
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleOne{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleTwo{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleThree{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleFour{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleFive{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleSix{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleSeven{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleEight{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleNine{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleTen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleEleven{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleTwelve{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleThirteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleFourteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleFifteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleSixteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleSeventeen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleEighteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleNineteen{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfArticleTwenty{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfEctomorphicType{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfMesomorphicType{font-size: 16px; font-family: 'BenchNine';}");
		getPage()
				.getStyles()
				.add(".throughtExplanationOfEndomorphicType{font-size: 16px; font-family: 'BenchNine';}");
	}

	private void initializeNavigator() {
		App4TrainNavigator navigator = new App4TrainNavigator(this, changeTab);
		appContext.getAutowireCapableBeanFactory().autowireBean(navigator);
		navigator.addProvider(viewProvider);
		navigator.navigateTo(UserLayoutFactory.NAME);
	}
}

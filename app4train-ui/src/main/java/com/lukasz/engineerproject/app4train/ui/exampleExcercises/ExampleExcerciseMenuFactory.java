package com.lukasz.engineerproject.app4train.ui.exampleExcercises;

import org.springframework.beans.factory.annotation.Autowired;

import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ExampleExcerciseMenuFactory implements UIComponentBuilder {

	@Autowired
	private ExcerciseOneFactory excerciseOneFactory;
	@Autowired
	private ExcerciseTwoFactory excerciseTwoFactory;
	@Autowired
	private ExcerciseThreeFactory excerciseThreeFactory;
	@Autowired
	private ExcerciseFourFactory excerciseFourFactory;
	@Autowired
	private ExcerciseFiveFactory excerciseFiveFactory;
	@Autowired
	private ExcerciseSixFactory excerciseSixFactory;
	@Autowired
	private ExcerciseSevenFactory excerciseSevenFactory;
	@Autowired
	private ExcerciseEightFactory excerciseEightFactory;
	@Autowired
	private ExcerciseNineFactory excerciseNineFactory;
	@Autowired
	private ExcerciseTenFactory excerciseTenFactory;
	@Autowired
	private ExcerciseElevenFactory excerciseElevenFactory;
	@Autowired
	private ExcerciseTwelveFactory excerciseTwelveFactory;
	@Autowired
	private ExcerciseThirteenFactory excerciseThirteenFactory;
	@Autowired
	private ExcerciseFourteenFactory excerciseFourteenFactory;
	@Autowired
	private ExcerciseFifteenFactory excerciseFifteenFactory;
	@Autowired
	private ExcerciseSixteenFactory excerciseSixteenFactory;
	@Autowired
	private ExcerciseSeventeenFactory excerciseSeventeenFactory;
	@Autowired
	private ExcerciseEighteenFactory excerciseEighteenFactory;
	@Autowired
	private ExcerciseNineteenFactory excerciseNineteenFactory;
	@Autowired
	private ExcerciseTwentyFactory excerciseTwentyFactory;
	@Autowired
	private ExcerciseTwentyOneFactory excerciseTwentyOneFactory;
	@Autowired
	private ExcerciseTwentyTwoFactory excerciseTwentyTwoFactory;
	@Autowired
	private ExcerciseTwentyThreeFactory excerciseTwentyThreeFactory;
	@Autowired
	private ExcerciseTwentyFourFactory excerciseTwentyFourFactory;
	@Autowired
	private ExcerciseTwentyFiveFactory excerciseTwentyFiveFactory;
	@Autowired
	private ExcerciseTwentySixFactory excerciseTwentySixFactory;
	@Autowired
	private ExcerciseTwentySevenFactory excerciseTwentySevenFactory;
	@Autowired
	private ExcerciseTwentyEightFactory excerciseTwentyEightFactory;
	@Autowired
	private ExcerciseTwentyNineFactory excerciseTwentyNineFactory;
	@Autowired
	private ExcerciseThirtyFactory excerciseThirtyFactory;
	@Autowired
	private ExcerciseThirtyOneFactory excerciseThirtyOneFactory;
	@Autowired
	private ExcerciseThirtyTwoFactory excerciseThirtyTwoFactory;
	@Autowired
	private ExcerciseThirtyThreeFactory excerciseThirtyThreeFactory;
	@Autowired
	private ExcerciseThirtyFourFactory excerciseThirtyFourFactory;
	@Autowired
	private ExcerciseThirtyFiveFactory excerciseThirtyFiveFactory;
	@Autowired
	private ExcerciseThirtySixFactory excerciseThirtySixFactory;
	@Autowired
	private ExcerciseThirtySevenFactory excerciseThirtySevenFactory;
	@Autowired
	private ExcerciseThirtyEightFactory excerciseThirtyEightFactory;
	@Autowired
	private ExcerciseThirtyNineFactory excerciseThirtyNineFactory;
	@Autowired
	private ExcerciseFourtyFactory excerciseFourtyFactory;
	@Autowired
	private ExcerciseFourtyOneFactory excerciseFourtyOneFactory;
	@Autowired
	private ExcerciseFourtyTwoFactory excerciseFourtyTwoFactory;
	@Autowired
	private ExcerciseFourtyThreeFactory excerciseFourtyThreeFactory;

	private class ArticlesMenu extends VerticalLayout {

		private VerticalLayout layoutForTopics;

		public ArticlesMenu init() {
			layoutForTopics = new VerticalLayout();
			Component componentForExcerciseOne = excerciseOneFactory.createComponent();
			Component componentForExcerciseTwo = excerciseTwoFactory.createComponent();
			Component componentForExcerciseThree = excerciseThreeFactory.createComponent();
			Component componentForExcerciseFour = excerciseFourFactory.createComponent();
			Component componentForExcerciseFive = excerciseFiveFactory.createComponent();
			Component componentForExcerciseSix = excerciseSixFactory.createComponent();
			Component componentForExcerciseSeven = excerciseSevenFactory.createComponent();
			Component componentForExcerciseEight = excerciseEightFactory.createComponent();
			Component componentForExcerciseNine = excerciseNineFactory.createComponent();
			Component componentForExcerciseTen = excerciseTenFactory.createComponent();
			Component componentForExcerciseEleven = excerciseElevenFactory.createComponent();
			Component componentForExcerciseTwelve = excerciseTwelveFactory.createComponent();
			Component componentForExcerciseThirteen = excerciseThirteenFactory.createComponent();
			Component componentForExcerciseFourteen = excerciseFourteenFactory.createComponent();
			Component componentForExcerciseFifteen = excerciseFifteenFactory.createComponent();
			Component componentForExcerciseSixteen = excerciseSixteenFactory.createComponent();
			Component componentForExcerciseSeventeen = excerciseSeventeenFactory.createComponent();
			Component componentForExcerciseEighteen = excerciseEighteenFactory.createComponent();
			Component componentForExcerciseNineteen = excerciseNineteenFactory.createComponent();
			Component componentForExcerciseTwenty = excerciseTwentyFactory.createComponent();
			Component componentForExcerciseTwentyOne = excerciseTwentyOneFactory.createComponent();
			Component componentForExcerciseTwentyTwo = excerciseTwentyTwoFactory.createComponent();
			Component componentForExcerciseTwentyThree = excerciseTwentyThreeFactory.createComponent();
			Component componentForExcerciseTwentyFour = excerciseTwentyFourFactory.createComponent();
			Component componentForExcerciseTwentyFive = excerciseTwentyFiveFactory.createComponent();
			Component componentForExcerciseTwentySix = excerciseTwentySixFactory.createComponent();
			Component componentForExcerciseTwentySeven = excerciseTwentySevenFactory.createComponent();
			Component componentForExcerciseTwentyEight = excerciseTwentyEightFactory.createComponent();
			Component componentForExcerciseTwentyNine = excerciseTwentyNineFactory.createComponent();
			Component componentForExcerciseThirty = excerciseThirtyFactory.createComponent();
			Component componentForExcerciseThirtyOne = excerciseThirtyOneFactory.createComponent();
			Component componentForExcerciseThirtyTwo = excerciseThirtyTwoFactory.createComponent();
			Component componentForExcerciseThirtyThree = excerciseThirtyThreeFactory.createComponent();
			Component componentForExcerciseThirtyFour = excerciseThirtyFourFactory.createComponent();
			Component componentForExcerciseThirtyFive = excerciseThirtyFiveFactory.createComponent();
			Component componentForExcerciseThirtySix = excerciseThirtySixFactory.createComponent();
			Component componentForExcerciseThirtySeven = excerciseThirtySevenFactory.createComponent();
			Component componentForExcerciseThirtyEight = excerciseThirtyEightFactory.createComponent();
			Component componentForExcerciseThirtyNine = excerciseThirtyNineFactory.createComponent();
			Component componentForExcerciseFourty = excerciseFourtyFactory.createComponent();
			Component componentForExcerciseFourtyOne = excerciseFourtyOneFactory.createComponent();
			Component componentForExcerciseFourtyTwo = excerciseFourtyTwoFactory.createComponent();
			Component componentForExcerciseFourtyThree = excerciseFourtyThreeFactory.createComponent();
			
			layoutForTopics.addComponents(componentForExcerciseOne, componentForExcerciseTwo,
					componentForExcerciseThree, componentForExcerciseFour, componentForExcerciseFive,
					componentForExcerciseSix, componentForExcerciseSeven, componentForExcerciseEight,
					componentForExcerciseNine, componentForExcerciseTen, componentForExcerciseEleven,
					componentForExcerciseTwelve, componentForExcerciseThirteen, componentForExcerciseFourteen,
					componentForExcerciseFifteen, componentForExcerciseSixteen, componentForExcerciseSeventeen,
					componentForExcerciseEighteen, componentForExcerciseNineteen, componentForExcerciseTwenty,
					componentForExcerciseTwentyOne, componentForExcerciseTwentyTwo, componentForExcerciseTwentyThree,
					componentForExcerciseTwentyFour, componentForExcerciseTwentyFive, componentForExcerciseTwentySix,
					componentForExcerciseTwentySeven, componentForExcerciseTwentyEight, componentForExcerciseTwentyNine,
					componentForExcerciseThirty, componentForExcerciseThirtyOne, componentForExcerciseThirtyTwo,
					componentForExcerciseThirtyThree, componentForExcerciseThirtyFour, componentForExcerciseThirtyFive,
					componentForExcerciseThirtySix, componentForExcerciseThirtySeven, componentForExcerciseThirtyEight,
					componentForExcerciseThirtyNine, componentForExcerciseFourty, componentForExcerciseFourtyOne,
					componentForExcerciseFourtyTwo, componentForExcerciseFourtyThree);
			return this;
		}

		public ArticlesMenu layout() {

			setWidth("100%");
			setHeightUndefined();

			layoutForTopics.setSpacing(true);
			addComponent(layoutForTopics);

			return this;
		}
	}

	public Component createComponent() {
		return new ArticlesMenu().init().layout();
	}
}

package com.lukasz.engineerproject.app4train.ui.exampleExercises;

import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ExampleExerciseMenuFactory implements UIComponentBuilder {

	private final ExerciseOneFactory exerciseOneFactory;
	private final ExerciseTwoFactory exerciseTwoFactory;
	private final ExerciseThreeFactory exerciseThreeFactory;
	private final ExerciseFourFactory exerciseFourFactory;
	private final ExerciseFiveFactory exerciseFiveFactory;
	private final ExerciseSixFactory exerciseSixFactory;
	private final ExerciseSevenFactory exerciseSevenFactory;
	private final ExerciseEightFactory exerciseEightFactory;
	private final ExerciseNineFactory exerciseNineFactory;
	private final ExerciseTenFactory exerciseTenFactory;
	private final ExerciseElevenFactory exerciseElevenFactory;
	private final ExerciseTwelveFactory exerciseTwelveFactory;
	private final ExerciseThirteenFactory exerciseThirteenFactory;
	private final ExerciseFourteenFactory exerciseFourteenFactory;
	private final ExerciseFifteenFactory exerciseFifteenFactory;
	private final ExerciseSixteenFactory exerciseSixteenFactory;
	private final ExerciseSeventeenFactory exerciseSeventeenFactory;
	private final ExerciseEighteenFactory exerciseEighteenFactory;
	private final ExerciseNineteenFactory exerciseNineteenFactory;
	private final ExerciseTwentyFactory exerciseTwentyFactory;
	private final ExerciseTwentyOneFactory exerciseTwentyOneFactory;
	private final ExerciseTwentyTwoFactory exerciseTwentyTwoFactory;
	private final ExerciseTwentyThreeFactory exerciseTwentyThreeFactory;
	private final ExerciseTwentyFourFactory exerciseTwentyFourFactory;
	private final ExerciseTwentyFiveFactory exerciseTwentyFiveFactory;
	private final ExerciseTwentySixFactory exerciseTwentySixFactory;
	private final ExerciseTwentySevenFactory exerciseTwentySevenFactory;
	private final ExerciseTwentyEightFactory exerciseTwentyEightFactory;
	private final ExerciseTwentyNineFactory exerciseTwentyNineFactory;
	private final ExerciseThirtyFactory exerciseThirtyFactory;
	private final ExerciseThirtyOneFactory exerciseThirtyOneFactory;
	private final ExerciseThirtyTwoFactory exerciseThirtyTwoFactory;
	private final ExerciseThirtyThreeFactory exerciseThirtyThreeFactory;
	private final ExerciseThirtyFourFactory exerciseThirtyFourFactory;
	private final ExerciseThirtyFiveFactory exerciseThirtyFiveFactory;
	private final ExerciseThirtySixFactory exerciseThirtySixFactory;
	private final ExerciseThirtySevenFactory exerciseThirtySevenFactory;
	private final ExerciseThirtyEightFactory exerciseThirtyEightFactory;
	private final ExerciseThirtyNineFactory exerciseThirtyNineFactory;
	private final ExerciseFortyFactory exerciseFortyFactory;
	private final ExerciseFortyOneFactory exerciseFortyOneFactory;
	private final ExerciseFortyTwoFactory exerciseFortyTwoFactory;
	private final ExerciseFortyThreeFactory exerciseFortyThreeFactory;

	public ExampleExerciseMenuFactory(ExerciseOneFactory exerciseOneFactory,
									  ExerciseTwoFactory exerciseTwoFactory,
									  ExerciseThreeFactory exerciseThreeFactory,
									  ExerciseFourFactory exerciseFourFactory,
									  ExerciseFiveFactory exerciseFiveFactory,
									  ExerciseSixFactory exerciseSixFactory,
									  ExerciseSevenFactory exerciseSevenFactory,
									  ExerciseEightFactory exerciseEightFactory,
									  ExerciseNineFactory exerciseNineFactory,
									  ExerciseTenFactory exerciseTenFactory,
									  ExerciseElevenFactory exerciseElevenFactory,
									  ExerciseTwelveFactory exerciseTwelveFactory,
									  ExerciseThirteenFactory exerciseThirteenFactory,
									  ExerciseFourteenFactory exerciseFourteenFactory,
									  ExerciseFifteenFactory exerciseFifteenFactory,
									  ExerciseSixteenFactory exerciseSixteenFactory,
									  ExerciseSeventeenFactory exerciseSeventeenFactory,
									  ExerciseEighteenFactory exerciseEighteenFactory,
									  ExerciseNineteenFactory exerciseNineteenFactory,
									  ExerciseTwentyFactory exerciseTwentyFactory,
									  ExerciseTwentyOneFactory exerciseTwentyOneFactory,
									  ExerciseTwentyTwoFactory exerciseTwentyTwoFactory,
									  ExerciseTwentyThreeFactory exerciseTwentyThreeFactory,
									  ExerciseTwentyFourFactory exerciseTwentyFourFactory,
									  ExerciseTwentyFiveFactory exerciseTwentyFiveFactory,
									  ExerciseTwentySixFactory exerciseTwentySixFactory,
									  ExerciseTwentySevenFactory exerciseTwentySevenFactory,
									  ExerciseTwentyEightFactory exerciseTwentyEightFactory,
									  ExerciseTwentyNineFactory exerciseTwentyNineFactory,
									  ExerciseThirtyFactory exerciseThirtyFactory,
									  ExerciseThirtyOneFactory exerciseThirtyOneFactory,
									  ExerciseThirtyTwoFactory exerciseThirtyTwoFactory,
									  ExerciseThirtyThreeFactory exerciseThirtyThreeFactory,
									  ExerciseThirtyFourFactory exerciseThirtyFourFactory,
									  ExerciseThirtyFiveFactory exerciseThirtyFiveFactory,
									  ExerciseThirtySixFactory exerciseThirtySixFactory,
									  ExerciseThirtySevenFactory exerciseThirtySevenFactory,
									  ExerciseThirtyEightFactory exerciseThirtyEightFactory,
									  ExerciseThirtyNineFactory exerciseThirtyNineFactory,
									  ExerciseFortyFactory exerciseFortyFactory,
									  ExerciseFortyOneFactory exerciseFortyOneFactory,
									  ExerciseFortyTwoFactory exerciseFortyTwoFactory,
									  ExerciseFortyThreeFactory exerciseFortyThreeFactory
	) {
		this.exerciseOneFactory = exerciseOneFactory;
		this.exerciseTwoFactory = exerciseTwoFactory;
		this.exerciseThreeFactory = exerciseThreeFactory;
		this.exerciseFourFactory = exerciseFourFactory;
		this.exerciseFiveFactory = exerciseFiveFactory;
		this.exerciseSixFactory = exerciseSixFactory;
		this.exerciseSevenFactory = exerciseSevenFactory;
		this.exerciseEightFactory = exerciseEightFactory;
		this.exerciseNineFactory = exerciseNineFactory;
		this.exerciseTenFactory = exerciseTenFactory;
		this.exerciseElevenFactory = exerciseElevenFactory;
		this.exerciseTwelveFactory = exerciseTwelveFactory;
		this.exerciseThirteenFactory = exerciseThirteenFactory;
		this.exerciseFourteenFactory = exerciseFourteenFactory;
		this.exerciseFifteenFactory = exerciseFifteenFactory;
		this.exerciseSixteenFactory = exerciseSixteenFactory;
		this.exerciseSeventeenFactory = exerciseSeventeenFactory;
		this.exerciseEighteenFactory = exerciseEighteenFactory;
		this.exerciseNineteenFactory = exerciseNineteenFactory;
		this.exerciseTwentyFactory = exerciseTwentyFactory;
		this.exerciseTwentyOneFactory = exerciseTwentyOneFactory;
		this.exerciseTwentyTwoFactory = exerciseTwentyTwoFactory;
		this.exerciseTwentyThreeFactory = exerciseTwentyThreeFactory;
		this.exerciseTwentyFourFactory = exerciseTwentyFourFactory;
		this.exerciseTwentyFiveFactory = exerciseTwentyFiveFactory;
		this.exerciseTwentySixFactory = exerciseTwentySixFactory;
		this.exerciseTwentySevenFactory = exerciseTwentySevenFactory;
		this.exerciseTwentyEightFactory = exerciseTwentyEightFactory;
		this.exerciseTwentyNineFactory = exerciseTwentyNineFactory;
		this.exerciseThirtyFactory = exerciseThirtyFactory;
		this.exerciseThirtyOneFactory = exerciseThirtyOneFactory;
		this.exerciseThirtyTwoFactory = exerciseThirtyTwoFactory;
		this.exerciseThirtyThreeFactory = exerciseThirtyThreeFactory;
		this.exerciseThirtyFourFactory = exerciseThirtyFourFactory;
		this.exerciseThirtyFiveFactory = exerciseThirtyFiveFactory;
		this.exerciseThirtySixFactory = exerciseThirtySixFactory;
		this.exerciseThirtySevenFactory = exerciseThirtySevenFactory;
		this.exerciseThirtyEightFactory = exerciseThirtyEightFactory;
		this.exerciseThirtyNineFactory = exerciseThirtyNineFactory;
		this.exerciseFortyFactory = exerciseFortyFactory;
		this.exerciseFortyOneFactory = exerciseFortyOneFactory;
		this.exerciseFortyTwoFactory = exerciseFortyTwoFactory;
		this.exerciseFortyThreeFactory = exerciseFortyThreeFactory;
	}

	private class ArticlesMenu extends VerticalLayout {

		private VerticalLayout layoutForTopics;

		public ArticlesMenu init() {
			layoutForTopics = new VerticalLayout();

			layoutForTopics.addComponents(
					exerciseOneFactory.createComponent(),
					exerciseTwoFactory.createComponent(),
					exerciseThreeFactory.createComponent(),
					exerciseFourFactory.createComponent(),
					exerciseFiveFactory.createComponent(),
					exerciseSixFactory.createComponent(),
					exerciseSevenFactory.createComponent(),
					exerciseEightFactory.createComponent(),
					exerciseNineFactory.createComponent(),
					exerciseTenFactory.createComponent(),
					exerciseElevenFactory.createComponent(),
					exerciseTwelveFactory.createComponent(),
					exerciseThirteenFactory.createComponent(),
					exerciseFourteenFactory.createComponent(),
					exerciseFifteenFactory.createComponent(),
					exerciseSixteenFactory.createComponent(),
					exerciseSeventeenFactory.createComponent(),
					exerciseEighteenFactory.createComponent(),
					exerciseNineteenFactory.createComponent(),
					exerciseTwentyFactory.createComponent(),
					exerciseTwentyOneFactory.createComponent(),
					exerciseTwentyTwoFactory.createComponent(),
					exerciseTwentyThreeFactory.createComponent(),
					exerciseTwentyFourFactory.createComponent(),
					exerciseTwentyFiveFactory.createComponent(),
					exerciseTwentySixFactory.createComponent(),
					exerciseTwentySevenFactory.createComponent(),
					exerciseTwentyEightFactory.createComponent(),
					exerciseTwentyNineFactory.createComponent(),
					exerciseThirtyFactory.createComponent(),
					exerciseThirtyOneFactory.createComponent(),
					exerciseThirtyTwoFactory.createComponent(),
					exerciseThirtyThreeFactory.createComponent(),
					exerciseThirtyFourFactory.createComponent(),
					exerciseThirtyFiveFactory.createComponent(),
					exerciseThirtySixFactory.createComponent(),
					exerciseThirtySevenFactory.createComponent(),
					exerciseThirtyEightFactory.createComponent(),
					exerciseThirtyNineFactory.createComponent(),
					exerciseFortyFactory.createComponent(),
					exerciseFortyOneFactory.createComponent(),
					exerciseFortyTwoFactory.createComponent(),
					exerciseFortyThreeFactory.createComponent());
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

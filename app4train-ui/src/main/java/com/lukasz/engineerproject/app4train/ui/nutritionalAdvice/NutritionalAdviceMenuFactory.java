package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class NutritionalAdviceMenuFactory implements UIComponentBuilder {


	private final NutritionalAdviceOneContentMenuLayoutFactory nutritionalAdviceOneContentMenuLayoutFactory;
	private final NutritionalAdviceTwoContentMenuLayoutFactory nutritionalAdviceTwoContentMenuLayoutFactory;
	private final NutritionalAdviceThreeContentMenuLayoutFactory nutritionalAdviceThreeContentMenuLayoutFactory;
	private final NutritionalAdviceFourContentMenuLayoutFactory nutritionalAdviceFourContentMenuLayoutFactory;
	private final NutritionalAdviceFiveContentMenuLayoutFactory nutritionalAdviceFiveContentMenuLayoutFactory;
	private final NutritionalAdviceSixContentMenuLayoutFactory nutritionalAdviceSixContentMenuLayoutFactory;
	private final NutritionalAdviceSevenContentMenuLayoutFactory nutritionalAdviceSevenContentMenuLayoutFactory;
	private final NutritionalAdviceEightContentMenuLayoutFactory nutritionalAdviceEightContentMenuLayoutFactory;
	private final NutritionalAdviceNineContentMenuLayoutFactory nutritionalAdviceNineContentMenuLayoutFactory;
	private final NutritionalAdviceTenContentMenuLayoutFactory nutritionalAdviceTenContentMenuLayoutFactory;
	private final NutritionalAdviceElevenContentMenuLayoutFactory nutritionalAdviceElevenContentMenuLayoutFactory;
	private final NutritionalAdviceTwelveContentMenuLayoutFactory nutritionalAdviceTwelveContentMenuLayoutFactory;
	private final NutritionalAdviceThirteenContentMenuLayoutFactory nutritionalAdviceThirteenContentMenuLayoutFactory;
	private final NutritionalAdviceFourteenContentMenuLayoutFactory nutritionalAdviceFourteenContentMenuLayoutFactory;
	private final NutritionalAdviceFifteenContentMenuLayoutFactory nutritionalAdviceFifteenContentMenuLayoutFactory;
	private final NutritionalAdviceSixteenContentMenuLayoutFactory nutritionalAdviceSixteenContentMenuLayoutFactory;
	private final NutritionalAdviceSeventeenContentMenuLayoutFactory nutritionalAdviceSeventeenContentMenuLayoutFactory;
	private final NutritionalAdviceEighteenContentMenuLayoutFactory nutritionalAdviceEighteenContentMenuLayoutFactory;
	private final NutritionalAdviceNineteenContentMenuLayoutFactory nutritionalAdviceNineteenContentMenuLayoutFactory;
	private final NutritionalAdviceTwentyContentMenuLayoutFactory nutritionalAdviceTwentyContentMenuLayoutFactory;

	public NutritionalAdviceMenuFactory(NutritionalAdviceOneContentMenuLayoutFactory nutritionalAdviceOneContentMenuLayoutFactory,
										NutritionalAdviceTwoContentMenuLayoutFactory nutritionalAdviceTwoContentMenuLayoutFactory,
										NutritionalAdviceThreeContentMenuLayoutFactory nutritionalAdviceThreeContentMenuLayoutFactory,
										NutritionalAdviceFourContentMenuLayoutFactory nutritionalAdviceFourContentMenuLayoutFactory,
										NutritionalAdviceFiveContentMenuLayoutFactory nutritionalAdviceFiveContentMenuLayoutFactory,
										NutritionalAdviceSixContentMenuLayoutFactory nutritionalAdviceSixContentMenuLayoutFactory,
										NutritionalAdviceSevenContentMenuLayoutFactory nutritionalAdviceSevenContentMenuLayoutFactory,
										NutritionalAdviceEightContentMenuLayoutFactory nutritionalAdviceEightContentMenuLayoutFactory,
										NutritionalAdviceNineContentMenuLayoutFactory nutritionalAdviceNineContentMenuLayoutFactory,
										NutritionalAdviceTenContentMenuLayoutFactory nutritionalAdviceTenContentMenuLayoutFactory,
										NutritionalAdviceElevenContentMenuLayoutFactory nutritionalAdviceElevenContentMenuLayoutFactory,
										NutritionalAdviceTwelveContentMenuLayoutFactory nutritionalAdviceTwelveContentMenuLayoutFactory,
										NutritionalAdviceThirteenContentMenuLayoutFactory nutritionalAdviceThirteenContentMenuLayoutFactory,
										NutritionalAdviceFourteenContentMenuLayoutFactory nutritionalAdviceFourteenContentMenuLayoutFactory,
										NutritionalAdviceFifteenContentMenuLayoutFactory nutritionalAdviceFifteenContentMenuLayoutFactory,
										NutritionalAdviceSixteenContentMenuLayoutFactory nutritionalAdviceSixteenContentMenuLayoutFactory,
										NutritionalAdviceSeventeenContentMenuLayoutFactory nutritionalAdviceSeventeenContentMenuLayoutFactory,
										NutritionalAdviceEighteenContentMenuLayoutFactory nutritionalAdviceEighteenContentMenuLayoutFactory,
										NutritionalAdviceNineteenContentMenuLayoutFactory nutritionalAdviceNineteenContentMenuLayoutFactory,
										NutritionalAdviceTwentyContentMenuLayoutFactory nutritionalAdviceTwentyContentMenuLayoutFactory
	) {
		this.nutritionalAdviceOneContentMenuLayoutFactory = nutritionalAdviceOneContentMenuLayoutFactory;
		this.nutritionalAdviceTwoContentMenuLayoutFactory = nutritionalAdviceTwoContentMenuLayoutFactory;
		this.nutritionalAdviceThreeContentMenuLayoutFactory = nutritionalAdviceThreeContentMenuLayoutFactory;
		this.nutritionalAdviceFourContentMenuLayoutFactory = nutritionalAdviceFourContentMenuLayoutFactory;
		this.nutritionalAdviceFiveContentMenuLayoutFactory = nutritionalAdviceFiveContentMenuLayoutFactory;
		this.nutritionalAdviceSixContentMenuLayoutFactory = nutritionalAdviceSixContentMenuLayoutFactory;
		this.nutritionalAdviceSevenContentMenuLayoutFactory = nutritionalAdviceSevenContentMenuLayoutFactory;
		this.nutritionalAdviceEightContentMenuLayoutFactory = nutritionalAdviceEightContentMenuLayoutFactory;
		this.nutritionalAdviceNineContentMenuLayoutFactory = nutritionalAdviceNineContentMenuLayoutFactory;
		this.nutritionalAdviceTenContentMenuLayoutFactory = nutritionalAdviceTenContentMenuLayoutFactory;
		this.nutritionalAdviceElevenContentMenuLayoutFactory = nutritionalAdviceElevenContentMenuLayoutFactory;
		this.nutritionalAdviceTwelveContentMenuLayoutFactory = nutritionalAdviceTwelveContentMenuLayoutFactory;
		this.nutritionalAdviceThirteenContentMenuLayoutFactory = nutritionalAdviceThirteenContentMenuLayoutFactory;
		this.nutritionalAdviceFourteenContentMenuLayoutFactory = nutritionalAdviceFourteenContentMenuLayoutFactory;
		this.nutritionalAdviceFifteenContentMenuLayoutFactory = nutritionalAdviceFifteenContentMenuLayoutFactory;
		this.nutritionalAdviceSixteenContentMenuLayoutFactory = nutritionalAdviceSixteenContentMenuLayoutFactory;
		this.nutritionalAdviceSeventeenContentMenuLayoutFactory = nutritionalAdviceSeventeenContentMenuLayoutFactory;
		this.nutritionalAdviceEighteenContentMenuLayoutFactory = nutritionalAdviceEighteenContentMenuLayoutFactory;
		this.nutritionalAdviceNineteenContentMenuLayoutFactory = nutritionalAdviceNineteenContentMenuLayoutFactory;
		this.nutritionalAdviceTwentyContentMenuLayoutFactory = nutritionalAdviceTwentyContentMenuLayoutFactory;
	}

	private class ArticlesMenu extends VerticalLayout {

		private VerticalLayout layoutForTopics;//

		public ArticlesMenu init() {
			layoutForTopics = new VerticalLayout();

			layoutForTopics.addComponents(
					nutritionalAdviceOneContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceTwoContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceThreeContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceFourContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceFiveContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceSixContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceSevenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceEightContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceNineContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceTenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceElevenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceTwelveContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceThirteenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceFourteenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceFifteenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceSixteenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceSeventeenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceEighteenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceNineteenContentMenuLayoutFactory.createComponent(),
					nutritionalAdviceTwentyContentMenuLayoutFactory.createComponent());
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


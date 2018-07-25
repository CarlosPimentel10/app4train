package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import org.springframework.beans.factory.annotation.Autowired;

import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class NutritionalAdviceMenuFactory implements UIComponentBuilder {

	@Autowired
	private NutritionalAdviceOneContentMenuLayoutFactory nutritionalAdviceOneContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceTwoContentMenuLayoutFactory nutritionalAdviceTwoContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceThreeContentMenuLayoutFactory nutritionalAdviceThreeContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceFourContentMenuLayoutFactory nutritionalAdviceFourContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceFiveContentMenuLayoutFactory nutritionalAdviceFiveContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceSixContentMenuLayoutFactory nutritionalAdviceSixContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceSevenContentMenuLayoutFactory nutritionalAdviceSevenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceEightContentMenuLayoutFactory nutritionalAdviceEightContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceNineContentMenuLayoutFactory nutritionalAdviceNineContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceTenContentMenuLayoutFactory nutritionalAdviceTenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceElevenContentMenuLayoutFactory nutritionalAdviceElevenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceTwelveContentMenuLayoutFactory nutritionalAdviceTwelveContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceThirteenContentMenuLayoutFactory nutritionalAdviceThirteenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceFourteenContentMenuLayoutFactory nutritionalAdviceFourteenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceFifteenContentMenuLayoutFactory nutritionalAdviceFifteenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceSixteenContentMenuLayoutFactory nutritionalAdviceSixteenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceSeventeenContentMenuLayoutFactory nutritionalAdviceSeventeenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceEighteenContentMenuLayoutFactory nutritionalAdviceEighteenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceNineteenContentMenuLayoutFactory nutritionalAdviceNineteenContentMenuLayoutFactory;
	@Autowired
	private NutritionalAdviceTwentyContentMenuLayoutFactory nutritionalAdviceTwentyContentMenuLayoutFactory;

	private class ArticlesMenu extends VerticalLayout {

		private VerticalLayout layoutForTopics;//

		public ArticlesMenu init() {
			layoutForTopics = new VerticalLayout();
			Component componentForArticleOne = nutritionalAdviceOneContentMenuLayoutFactory.createComponent();
			Component componentForArticleTwo = nutritionalAdviceTwoContentMenuLayoutFactory.createComponent();
			Component componentForArticleThree = nutritionalAdviceThreeContentMenuLayoutFactory.createComponent();
			Component componentForArticleFour = nutritionalAdviceFourContentMenuLayoutFactory.createComponent();
			Component componentForArticleFive = nutritionalAdviceFiveContentMenuLayoutFactory.createComponent();
			Component componentForArticleSix = nutritionalAdviceSixContentMenuLayoutFactory.createComponent();
			Component componentForArticleSeven = nutritionalAdviceSevenContentMenuLayoutFactory.createComponent();
			Component componentForArticleEight = nutritionalAdviceEightContentMenuLayoutFactory.createComponent();
			Component componentForArticleNine = nutritionalAdviceNineContentMenuLayoutFactory.createComponent();
			Component componentForArticleTen = nutritionalAdviceTenContentMenuLayoutFactory.createComponent();
			Component componentForArticleEleven = nutritionalAdviceElevenContentMenuLayoutFactory.createComponent();
			Component componentForArticleTwelve = nutritionalAdviceTwelveContentMenuLayoutFactory.createComponent();
			Component componentForArticleThirteen = nutritionalAdviceThirteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleFourteen = nutritionalAdviceFourteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleFifteen = nutritionalAdviceFifteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleSixteen = nutritionalAdviceSixteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleSeventeen = nutritionalAdviceSeventeenContentMenuLayoutFactory
					.createComponent();
			Component componentForArticleEighteen = nutritionalAdviceEighteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleNineteen = nutritionalAdviceNineteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleTwenty = nutritionalAdviceTwentyContentMenuLayoutFactory.createComponent();

			layoutForTopics.addComponents(componentForArticleOne, componentForArticleTwo, componentForArticleThree,
					componentForArticleFour, componentForArticleFive, componentForArticleSix, componentForArticleSeven,
					componentForArticleEight, componentForArticleNine, componentForArticleTen,
					componentForArticleEleven, componentForArticleTwelve, componentForArticleThirteen,
					componentForArticleFourteen, componentForArticleFifteen, componentForArticleSixteen,
					componentForArticleSeventeen, componentForArticleEighteen, componentForArticleNineteen,
					componentForArticleTwenty);
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


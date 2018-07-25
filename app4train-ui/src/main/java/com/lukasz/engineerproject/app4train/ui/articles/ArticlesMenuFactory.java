
package com.lukasz.engineerproject.app4train.ui.articles;

import org.springframework.beans.factory.annotation.Autowired;

import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ArticlesMenuFactory implements UIComponentBuilder {

	@Autowired
	private ArticleOneContentMenuLayoutFactory articleOneContentMenuLayoutFactory;
	@Autowired
	private ArticleTwoContentMenuLayoutFactory articleTwoContentMenuLayoutFactory;
	@Autowired
	private ArticleThreeContentMenuLayoutFactory articleThreeContentMenuLayoutFactory;
	@Autowired
	private ArticleFourContentMenuLayoutFactory articleFourContentMenuLayoutFactory;
	@Autowired
	private ArticleFiveContentMenuLayoutFactory articleFiveContentMenuLayoutFactory;
	@Autowired
	private ArticleSixContentMenuLayoutFactory articleSixContentMenuLayoutFactory;
	@Autowired
	private ArticleSevenContentMenuLayoutFactory articleSevenContentMenuLayoutFactory;
	@Autowired
	private ArticleEightContentMenuLayoutFactory articleEightContentMenuLayoutFactory;
	@Autowired
	private ArticleNineContentMenuLayoutFactory articleNineContentMenuLayoutFactory;
	@Autowired
	private ArticleTenContentMenuLayoutFactory articleTenContentMenuLayoutFactory;
	@Autowired
	private ArticleElevenContentMenuLayoutFactory articleElevenContentMenuLayoutFactory;
	@Autowired
	private ArticleTwelveContentMenuLayoutFactory articleTwelveContentMenuLayoutFactory;
	@Autowired
	private ArticleThirteenContentMenuLayoutFactory articleThirteenContentMenuLayoutFactory;
	@Autowired
	private ArticleFourteenContentMenuLayoutFactory articleFourteenContentMenuLayoutFactory;
	@Autowired
	private ArticleFifteenContentMenuLayoutFactory articleFifteenContentMenuLayoutFactory;
	@Autowired
	private ArticleSixteenContentMenuLayoutFactory articleSixteenContentMenuLayoutFactory;
	@Autowired
	private ArticleSeventeenContentMenuLayoutFactory articleSeventeenContentMenuLayoutFactory;
	@Autowired
	private ArticleEighteenContentMenuLayoutFactory articleEighteenContentMenuLayoutFactory;
	@Autowired
	private ArticleNineteenContentMenuLayoutFactory articleNineteenContentMenuLayoutFactory;
	@Autowired
	private ArticleTwentyContentMenuLayoutFactory articleTwentyContentMenuLayoutFactory;

	private class ArticlesMenu extends VerticalLayout {

		private VerticalLayout layoutForTopics;//

		public ArticlesMenu init() {
			layoutForTopics = new VerticalLayout();
			Component componentForArticleOne = articleOneContentMenuLayoutFactory.createComponent();
			Component componentForArticleTwo = articleTwoContentMenuLayoutFactory.createComponent();
			Component componentForArticleThree = articleThreeContentMenuLayoutFactory.createComponent();
			Component componentForArticleFour = articleFourContentMenuLayoutFactory.createComponent();
			Component componentForArticleFive = articleFiveContentMenuLayoutFactory.createComponent();
			Component componentForArticleSix = articleSixContentMenuLayoutFactory.createComponent();
			Component componentForArticleSeven = articleSevenContentMenuLayoutFactory.createComponent();
			Component componentForArticleEight = articleEightContentMenuLayoutFactory.createComponent();
			Component componentForArticleNine = articleNineContentMenuLayoutFactory.createComponent();
			Component componentForArticleTen = articleTenContentMenuLayoutFactory.createComponent();
			Component componentForArticleEleven = articleElevenContentMenuLayoutFactory.createComponent();
			Component componentForArticleTwelve = articleTwelveContentMenuLayoutFactory.createComponent();
			Component componentForArticleThirteen = articleThirteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleFourteen = articleFourteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleFifteen = articleFifteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleSixteen = articleSixteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleSeventeen = articleSeventeenContentMenuLayoutFactory.createComponent();
			Component componentForArticleEighteen = articleEighteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleNineteen = articleNineteenContentMenuLayoutFactory.createComponent();
			Component componentForArticleTwenty = articleTwentyContentMenuLayoutFactory.createComponent();

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

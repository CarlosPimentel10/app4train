
package com.lukasz.engineerproject.app4train.ui.articles;

import com.lukasz.engineerproject.app4train.ui.articles.contents.*;
import com.lukasz.engineerproject.app4train.ui.views.UIComponentBuilder;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ArticlesMenuFactory implements UIComponentBuilder {

	private final ArticleOneContentMenuLayoutFactory articleOneContentMenuLayoutFactory;
	private final ArticleTwoContentMenuLayoutFactory articleTwoContentMenuLayoutFactory;
	private final ArticleThreeContentMenuLayoutFactory articleThreeContentMenuLayoutFactory;
	private final ArticleFourContentMenuLayoutFactory articleFourContentMenuLayoutFactory;
	private final ArticleFiveContentMenuLayoutFactory articleFiveContentMenuLayoutFactory;
	private final ArticleSixContentMenuLayoutFactory articleSixContentMenuLayoutFactory;
	private final ArticleSevenContentMenuLayoutFactory articleSevenContentMenuLayoutFactory;
	private final ArticleEightContentMenuLayoutFactory articleEightContentMenuLayoutFactory;
	private final ArticleNineContentMenuLayoutFactory articleNineContentMenuLayoutFactory;
	private final ArticleTenContentMenuLayoutFactory articleTenContentMenuLayoutFactory;
	private final ArticleElevenContentMenuLayoutFactory articleElevenContentMenuLayoutFactory;
	private final ArticleTwelveContentMenuLayoutFactory articleTwelveContentMenuLayoutFactory;
	private final ArticleThirteenContentMenuLayoutFactory articleThirteenContentMenuLayoutFactory;
	private final ArticleFourteenContentMenuLayoutFactory articleFourteenContentMenuLayoutFactory;
	private final ArticleFifteenContentMenuLayoutFactory articleFifteenContentMenuLayoutFactory;
	private final ArticleSixteenContentMenuLayoutFactory articleSixteenContentMenuLayoutFactory;
	private final ArticleSeventeenContentMenuLayoutFactory articleSeventeenContentMenuLayoutFactory;
	private final ArticleEighteenContentMenuLayoutFactory articleEighteenContentMenuLayoutFactory;
	private final ArticleNineteenContentMenuLayoutFactory articleNineteenContentMenuLayoutFactory;
	private final ArticleTwentyContentMenuLayoutFactory articleTwentyContentMenuLayoutFactory;

	public ArticlesMenuFactory
			(
					ArticleOneContentMenuLayoutFactory articleOneContentMenuLayoutFactory,
					ArticleTwoContentMenuLayoutFactory articleTwoContentMenuLayoutFactory,
					ArticleThreeContentMenuLayoutFactory articleThreeContentMenuLayoutFactory,
					ArticleFourContentMenuLayoutFactory articleFourContentMenuLayoutFactory,
					ArticleFiveContentMenuLayoutFactory articleFiveContentMenuLayoutFactory,
					ArticleSixContentMenuLayoutFactory articleSixContentMenuLayoutFactory,
					ArticleSevenContentMenuLayoutFactory articleSevenContentMenuLayoutFactory,
					ArticleEightContentMenuLayoutFactory articleEightContentMenuLayoutFactory,
					ArticleNineContentMenuLayoutFactory articleNineContentMenuLayoutFactory,
					ArticleTenContentMenuLayoutFactory articleTenContentMenuLayoutFactory,
					ArticleElevenContentMenuLayoutFactory articleElevenContentMenuLayoutFactory,
					ArticleTwelveContentMenuLayoutFactory articleTwelveContentMenuLayoutFactory,
					ArticleThirteenContentMenuLayoutFactory articleThirteenContentMenuLayoutFactory,
					ArticleFourteenContentMenuLayoutFactory articleFourteenContentMenuLayoutFactory,
					ArticleFifteenContentMenuLayoutFactory articleFifteenContentMenuLayoutFactory,
					ArticleSixteenContentMenuLayoutFactory articleSixteenContentMenuLayoutFactory,
					ArticleSeventeenContentMenuLayoutFactory articleSeventeenContentMenuLayoutFactory,
					ArticleEighteenContentMenuLayoutFactory articleEighteenContentMenuLayoutFactory,
					ArticleNineteenContentMenuLayoutFactory articleNineteenContentMenuLayoutFactory,
					ArticleTwentyContentMenuLayoutFactory articleTwentyContentMenuLayoutFactory
			) {
		this.articleOneContentMenuLayoutFactory = articleOneContentMenuLayoutFactory;
		this.articleTwoContentMenuLayoutFactory = articleTwoContentMenuLayoutFactory;
		this.articleThreeContentMenuLayoutFactory = articleThreeContentMenuLayoutFactory;
		this.articleFourContentMenuLayoutFactory = articleFourContentMenuLayoutFactory;
		this.articleFiveContentMenuLayoutFactory = articleFiveContentMenuLayoutFactory;
		this.articleSixContentMenuLayoutFactory = articleSixContentMenuLayoutFactory;
		this.articleSevenContentMenuLayoutFactory = articleSevenContentMenuLayoutFactory;
		this.articleEightContentMenuLayoutFactory = articleEightContentMenuLayoutFactory;
		this.articleNineContentMenuLayoutFactory = articleNineContentMenuLayoutFactory;
		this.articleTenContentMenuLayoutFactory = articleTenContentMenuLayoutFactory;
		this.articleElevenContentMenuLayoutFactory = articleElevenContentMenuLayoutFactory;
		this.articleTwelveContentMenuLayoutFactory = articleTwelveContentMenuLayoutFactory;
		this.articleThirteenContentMenuLayoutFactory = articleThirteenContentMenuLayoutFactory;
		this.articleFourteenContentMenuLayoutFactory = articleFourteenContentMenuLayoutFactory;
		this.articleFifteenContentMenuLayoutFactory = articleFifteenContentMenuLayoutFactory;
		this.articleSixteenContentMenuLayoutFactory = articleSixteenContentMenuLayoutFactory;
		this.articleSeventeenContentMenuLayoutFactory = articleSeventeenContentMenuLayoutFactory;
		this.articleEighteenContentMenuLayoutFactory = articleEighteenContentMenuLayoutFactory;
		this.articleNineteenContentMenuLayoutFactory = articleNineteenContentMenuLayoutFactory;
		this.articleTwentyContentMenuLayoutFactory = articleTwentyContentMenuLayoutFactory;
	}

	private class ArticlesMenu extends VerticalLayout {

		private VerticalLayout layoutForTopics;

		public ArticlesMenu init() {
			layoutForTopics = new VerticalLayout();
			prepareComponentsIntoLayout();
			return this;
		}

		private void prepareComponentsIntoLayout() {
			layoutForTopics.addComponents(
					articleOneContentMenuLayoutFactory.createComponent(),
					articleTwoContentMenuLayoutFactory.createComponent(),
					articleThreeContentMenuLayoutFactory.createComponent(),
					articleFourContentMenuLayoutFactory.createComponent(),
					articleFiveContentMenuLayoutFactory.createComponent(),
					articleSixContentMenuLayoutFactory.createComponent(),
					articleSevenContentMenuLayoutFactory.createComponent(),
					articleEightContentMenuLayoutFactory.createComponent(),
					articleNineContentMenuLayoutFactory.createComponent(),
					articleTenContentMenuLayoutFactory.createComponent(),
					articleElevenContentMenuLayoutFactory.createComponent(),
					articleTwelveContentMenuLayoutFactory.createComponent(),
					articleThirteenContentMenuLayoutFactory.createComponent(),
					articleFourteenContentMenuLayoutFactory.createComponent(),
					articleFifteenContentMenuLayoutFactory.createComponent(),
					articleFifteenContentMenuLayoutFactory.createComponent(),
					articleSixteenContentMenuLayoutFactory.createComponent(),
					articleSeventeenContentMenuLayoutFactory.createComponent(),
					articleEighteenContentMenuLayoutFactory.createComponent(),
					articleNineteenContentMenuLayoutFactory.createComponent(),
					articleTwentyContentMenuLayoutFactory.createComponent()
			);
		}

		ArticlesMenu setPropertiesToLayout() {

			setWidth("100%");
			setHeightUndefined();
			layoutForTopics.setSpacing(true);
			addComponent(layoutForTopics);

			return this;
		}
	}

	public Component createComponent() {
		return new ArticlesMenu().init().setPropertiesToLayout();
	}
}

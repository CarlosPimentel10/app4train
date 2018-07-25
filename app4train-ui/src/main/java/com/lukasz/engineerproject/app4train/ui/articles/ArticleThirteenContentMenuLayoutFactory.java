package com.lukasz.engineerproject.app4train.ui.articles;

import com.lukasz.engineerproject.app4train.utils.UtilsForArticlesTitles;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@org.springframework.stereotype.Component
public class ArticleThirteenContentMenuLayoutFactory {

	private class ArticleThirteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleThirteen;
		private Label topicOfOfArticleThirteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleThirteenContentMenuLayout init() {

			topicOfOfArticleThirteen = new Label(UtilsForArticlesTitles.TOPIC_THIRTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleThirteen = new Label("<br><h4>Podwy¿szone têtno spoczynkowe</h4><br>"
							+ "<b>To czêsta reakcja obronna organizmu, która ma na celu to, aby serce mocniej pracowa³o i przet³acza³o wiêcej krwi przez nasz ustrój. Zadaniem tego jest szybsze </b><br>"
							+ "<b>dostarczenie sk³adników regeneracyjnych, budulcowych oraz szybsze odprowadzenie produktów stanowi¹cych odpad metaboliczny. Zaleca siê sprawdzaæ têtno rano,</b><br>"
							+ "<b> zanim wstaniemy z ³ó¿ka, po to by mieæ pewnoœæ czy dochodzi do zmian w tego typu parametrach. Têtno spoczynkowe powy¿ej 70 mo¿e stanowiæ pierwszy </b><br>"
							+ "<b>sygna³, ¿e czas na odpoczynek.</b>" + "<h4>Nasilone uczucie pragnienia</h4>"
							+ "<b>Oznak¹ ograniczenia mo¿liwoœci wysi³kowych naszego organizmu zwi¹zana jest z utrat¹ wody, a jej objawem jest np. suchoœæ w jamie ustnej. Podobnie sytuacja </b><br>"
							+ "<b>ma miejsce w przypadku przetrenowania. W momencie gdy nasz organizm wkracza w stan przetrenowania, rozpoczyna wysy³anie sygna³ów podobnych do </b><br>"
							+ "<b>tych, które zwi¹zane s¹ ze spadkiem poziomu wody w organizmie. A to oznacza, ¿e zaczyna towarzyszyæ nam pragnienie. </b>"
							+ "<h4>Utrzymuj¹ca siê bolesnoœæ miêœni</h4>"
							+ "<b>Wystêpowanie bolesnoœci miêœni po treningu si³owym jest naturalnym procesem, który zwi¹zany jest z uszkodzeniem w³ókien miêœniowych.Mikrouszkodzenia </b><br>"
							+ "<b>przewa¿nie wystêpuj¹ 24 godziny po treningu i potrafi¹ utrzymaæ siê do 3 dni po wysi³ku. W sytuacji gdy ból miêœniowy utrzymuje siê jeszcze d³u¿ej, mo¿e </b><br>"
							+ "<b>œwiadczyæ to, ¿e tempo regeneracji spad³o. Organizm w tej sytuacji nie wyrabia z odbudow¹ uszkodzonych w³ókien i potrzebuje d³u¿szych czasowo odpoczynków. </b>"
							+ "<h4>Czêste infekcje</h4>"
							+ "<b>Oznak¹, ¿e twój organizm nie jest w najlepszej formie, jest os³abienie uk³adu odpornoœciowego, czego wynikiem s¹ czêste infekcjê, przeziêbienia czy kaszel</b>"
							+ "<h4>Brak efektu wizualnego</h4>"
							+ "<b>Je¿eli jesteœ w okresie budowy masy miêœniowej, natomiast twoja sylwetka stoi w miejscu, zaczynasz jeœæ wiêcej, a jedyne rzecz¹ jak¹ uzyskujesz </b><br>"
							+ "<b>to t³uszcz, to jest znak, ¿e nie do koñca twój organizm zachowuje siê tak, jak powinien.</b><br>",
							ContentMode.HTML);

					throughtExplanationOfArticleThirteen.setSizeUndefined();
					throughtExplanationOfArticleThirteen.setStyleName("throughtExplanationOfArticleThirteen");
					throughtExplanationOfArticleThirteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleThirteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleThirteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleThirteenContentMenuLayout().init();
	}
}

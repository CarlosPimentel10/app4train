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
public class ArticleEighteenContentMenuLayoutFactory {

	private class ArticleEighteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleEighteen;
		private Label topicOfOfArticleEighteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleEighteenContentMenuLayout init() {

			topicOfOfArticleEighteen = new Label(UtilsForArticlesTitles.TOPIC_EIGHTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleEighteen = new Label(
							"<b><br><br>W ostatnich latach kobiety coraz czêœciej wykonuj¹ trening si³owy Pomimo tego wiêkszoœæ kobiet sceptycznie podchodzi do ciê¿arów,</b><br>"
									+ "<b>trenuj¹c zazwyczaj z niewielkim obci¹¿eniem. Wiele osób uwa¿a, ¿e 15 powtórzeñ i wiêcej to odpowiedni sposób na uzyskanie rzeŸby. Gdy jednak </b><br>"
									+ "<b>powtórzeñ jest mniej, a ciê¿ar wiêkszy na pewno zwiêkszymy swoj¹ masê miêœniow¹. To za³o¿enie powoduje, ¿e wiêkszoœæ kobiet unika wiêkszych ciê¿arów. </b><br>"
									+ "<b>Trening taki przynosi bardzo du¿o korzyœci.</b>"
									+ "<h4>Poprawa sk³adu cia³a</h4>"
									+ "<b>Pozwala poprawiæ sk³adu cia³a, a wiêc to, na czym skupiaj¹ siê najbardziej kobiety. Pozwoli nam to zyskaæ wiêcej tkanki miêœniowej i zredukowaæ </b><br>"
									+ "<b>tkankê t³uszczow¹. Gdy mówimy o zyskaniu miêœni musimy mieæ na uwadze, ¿e nie bêdziemy mieli takich jak profesjonalne zawodniczki kulturystyki.</b><br>"
									+ "<b>Aby je wypracowaæ, trzeba poœwiêciæ lata intensywnego treningu, wspomagaj¹c siê dodatkowo niedozwolonymi œrodkami. Tak naprawdê trening z  </b><br>"
									+ "<b>obci¹¿eniem pomo¿e zbudowaæ delikatne miêœnie, nadaj¹ce cia³u kobiety kszta³tów. </b>"
									+ "<h4>Lepsze zdrowie</h4>"
									+ "<b>Trening z obci¹¿eniem wp³ywa korzystnie prawie na ka¿dy aspekt zdrowia kobiety np. funkcjonowanie serca, sprawnoœæ mózgu, równowagê hormonaln¹.</b><br>"
									+ "<b>oraz dobrze dzia³aj¹cy metabolizm. Podnoszenie ciê¿arów wp³ywa na zmniejszenie obwodu talii, zmniejszenie poziomu trójglicerydów, zmniejszenie</b><br>"
									+ "<b>poziomu glukozy we krwi, a tak¿e obni¿enia rytmu serca oraz têtna spoczynkowego.</b>"
									+ "<h4>Mo¿esz jeœæ wiêcej</h4>"
									+ "<b>Trenuj¹c naprawdê ciê¿ko mo¿esz pozwoliæ sobie na nieco wiêcej jedzenia i dalej cieszyæ siê zgrabn¹ sylwetk¹. Uzyskamy dziêki temu wiêcej si³y, a </b><br>"
									+ "<b>treningi stan¹ siê jeszcze efektywniejsze. Nie mo¿emy popadaæ ze skrajnoœci w skrajnoœæ, bo to ¿e mo¿na wiêcej jeœæ nie znaczy, ¿e mamy </b><br>"
									+ "<b>jeœæ 2 razy wiêcej ni¿ normalnie. Wszystko powinno opieraæ siê o zapotrzebowanie kaloryczne uwzglêdniaj¹ce ciê¿kie treningi. W </b><br>"
									+ "<b>przeciwnym wypadku mo¿emy osi¹gn¹æ efekt odwrotny od zamierzonego.</b>",
							ContentMode.HTML);
					throughtExplanationOfArticleEighteen.setStyleName("throughtExplanationOfArticleEighteen");
					throughtExplanationOfArticleEighteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfArticleEighteen.setSizeUndefined();
					window.setContent(throughtExplanationOfArticleEighteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleEighteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleEighteenContentMenuLayout().init();
	}
}

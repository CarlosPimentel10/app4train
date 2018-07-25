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
public class ArticleFourContentMenuLayoutFactory {

	private class ArticleFourContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleFour;
		private Label topicOfOfArticleFour;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleFourContentMenuLayout init() {

			topicOfOfArticleFour = new Label(UtilsForArticlesTitles.TOPIC_FOUR.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleFour = new Label(
							"<b><br><br>Sauna stanowi istotny element odnowy biologicznej. Mo¿e wywieraæ pozytywny wp³yw na nasze zdrowie, jak równie¿ sprzyjaæ lepszej regeneracji.</b><br>"
									+ "<b>Trzeba mieæ jednak œwiadomoœæ, ¿e nieprawid³owe korzystanie z sauny mo¿e przynieœæ skutek uboczny. Wyró¿niamy sauny suche, parowe, mokre oraz na podczerwieñ. </b>"
									+ "<h4>Sauna sucha</h4>"
									+ "<b>Zwana te¿ saun¹ fiñsk¹, to zazwyczaj drewniane pomieszczenie z piecem. Jest ona przeznaczona do k¹pieli w temp. 90-110°C oraz wilgotnoœci ok. 10%.</b>"
									+ "<h4>Sauna parowa</h4>"
									+ "<b>Zwana te¿ ³aŸni¹ rzymsk¹. W tego typu saunie temperatura jest ni¿sza 50-65°C, natomiast wilgotnoœæ jest bardzo wysoka bo powy¿ej 40%, a niekiedy </b><br>"
									+ "<b>nawet blisko 100%. Sauna parowa to zwykle pomieszczenie wy³o¿one kafelkami. Piec u¿ywa natomiast parownika bêd¹cego generatorem pary.</b>"
									+ "<h4>Sauna na podczerwieñ</h4>"
									+ "<b>z wygl¹du podobna do sauny suchej. Elementem grzewczym s¹ natomiast promienniki podczerwieni. W tego typu saunie temperatura i wilgotnoœæ </b><br>"
									+ "<b>powietrza odgrywaj¹ rolê drugorzêdn¹. Cia³o nagrzewane jest promieniowaniem na podczerwieñ.</b><br>"
									+ "<b>•	Korzystanie z sauny pomaga w redukcji bólu wystêpuj¹cego po treningu poprzez rozgrzanie oraz rozluŸnienie naci¹gniêtych miêœni </b><br>"
									+ "<b>•	Pobudza uk³ad nerwowy, który przyczynia siê do wzrostu si³y oraz szybkoœci skurczu miêœniowego</b><br>"
									+ "<b>•	Wzmacnia uk³ad odpornoœciowy</b><br>"
									+ "<b>•	Pomaga osi¹gniêcie odprê¿enia i lepszego samopoczucia</b><br>"
									+ "<b>•	Zwiêksza dotlenienie tkanek</b><br>"
									+ "<b>Sauna z pewnoœci¹ wp³ynie na lepsz¹ regeneracjê miêœni, pod warunkiem, ¿e nie bêdziemy korzystaæ zbyt czêsto. Przestrzegaæ kilku zasad:</b><br>"
									+ "<b>•	nie korzystaj z sauny po zakoñczonym treningu, jak i bezpoœrednio przed rozpoczêciem treningu</b><br>"
									+ "<b>•	pamiêtaj o odpowiednim nawodnieniu organizmu przed wejœciem do sauny, jak równie¿ po wyjœciu z niej</b><br>"
									+ "<b>•	nie korzystaj z sauny jednorazowo d³u¿ej ni¿ 15 min</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleFour.setStyleName("throughtExplanationOfArticleFour");
					throughtExplanationOfArticleFour.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfArticleFour.setSizeUndefined();
					window.setContent(throughtExplanationOfArticleFour);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleFour);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleFourContentMenuLayout().init();
	}
}

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
public class ArticleTwoContentMenuLayoutFactory {

	private class ArticleTwoContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleTwo;
		private Label topicOfOfArticleTwo;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleTwoContentMenuLayout init() {

			topicOfOfArticleTwo = new Label(UtilsForArticlesTitles.TOPIC_TWO.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleTwo = new Label(
							"<b><br>Regeneracja jest jednym z trzech elementów, tworz¹cych ca³oœæ z diet¹ i treningiem. Wa¿ne jest wiêc,aby dbaæ  </b><br>"
									+ "<b>o d³ugi wypoczynek, pozwalaj¹cy nam nabraæ pe³ni si³ na kolejny trening oraz zgromadziæ wiêcej substratów energetycznych po to, </b><br>"
									+ "<b> by by³ on jeszcze bardziej intensywny. Na rynku suplementacji wystêpuje kilka preparatów, wspomagaj¹cych funkcjê snu. </b><br>"
									+ "<b>Przedstawiamy trzy, które wspomog¹ odnowê uszkodzonych miêœni: </b>"
									+ "<h4>Kazeina</h4>"
									+ "<b>To od¿ywka bia³kowa, której strawnoœæ jest doœæ wolna, ma na celu zapewnienie dop³ywu sta³ego poziomu aminokwasów przez </b><br>"
									+ "<b>d³u¿szy okres czasu. Wykorzystanie od¿ywki bia³kowej w trakcie snu posiada 3 zalety: </b><br>"
									+ "<b>•	nasilenie procesów regeneracyjnych </b><br>"
									+ "<b>•	hamowanie g³odu nastêpnego dnia (co wa¿ne jest podczas etapu redukcji tkanki t³uszczowej)</b><br>"
									+ "<b>•	wspomaganie efektu termogenezy, co skutkuje wiêksz¹ utratê t³uszczu. </b><br>"
									+ "<b>Dawkowanie: wykorzystaj oko³o 40g kazeiny micelarnej na 1 godzinê przed pójœciem spaæ aby wykorzystaæ wszystkie jej potencjalne zalety.</b>"
									+ "<h4>CLA </h4>"
									+ "<b>Jest to t³uszcz z grupy trans, zakwalifikowany jest jako “zdrowy t³uszcz”. Jego stosowanie przek³ada siê na poprawê parametrów zdrowotnych </b><br>"
									+ "<b>naszego organizmu. Zastosowanie CLA w okresie snu wp³ywa na podtrzymanie odpowiedniego tempa metabolizmu.</b><br>"
									+ "<b>Dawkowanie: 2-3g przed snem wraz z od¿ywk¹ bia³kow¹ oraz 2-3g rano do œniadania.</b>"
									+ "<h4>GABA</h4>"
									+ "<b>Wykorzystanie kwasu gamma-aminomas³owego poprawia jakoœæ snu. Wp³ywa on zarówno na g³êbokoœæ samego snu, ale te¿ wprowadza </b><br>"
									+ "<b>organizm w stan wyciszenia, relaksu, co skutkujê szybszym zaœniêciem.  </b><br>"
									+ "<b>Dawkowanie: 0,5-5g na 30 minut przed snem. </b><br>",
							ContentMode.HTML);

					throughtExplanationOfArticleTwo.setSizeUndefined();
					throughtExplanationOfArticleTwo.setStyleName("throughtExplanationOfArticleTwo");
					throughtExplanationOfArticleTwo.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleTwo);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleTwo);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleTwoContentMenuLayout().init();
	}
}

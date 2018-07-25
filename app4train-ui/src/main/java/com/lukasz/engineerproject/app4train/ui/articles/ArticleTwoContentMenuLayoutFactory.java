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
							"<b><br>Regeneracja jest jednym z trzech element�w, tworz�cych ca�o�� z diet� i treningiem. Wa�ne jest wi�c,aby dba�  </b><br>"
									+ "<b>o d�ugi wypoczynek, pozwalaj�cy nam nabra� pe�ni si� na kolejny trening oraz zgromadzi� wi�cej substrat�w energetycznych po to, </b><br>"
									+ "<b> by by� on jeszcze bardziej intensywny. Na rynku suplementacji wyst�puje kilka preparat�w, wspomagaj�cych funkcj� snu. </b><br>"
									+ "<b>Przedstawiamy trzy, kt�re wspomog� odnow� uszkodzonych mi�ni: </b>"
									+ "<h4>Kazeina</h4>"
									+ "<b>To od�ywka bia�kowa, kt�rej strawno�� jest do�� wolna, ma na celu zapewnienie dop�ywu sta�ego poziomu aminokwas�w przez </b><br>"
									+ "<b>d�u�szy okres czasu. Wykorzystanie od�ywki bia�kowej w trakcie snu posiada 3 zalety: </b><br>"
									+ "<b>�	nasilenie proces�w regeneracyjnych </b><br>"
									+ "<b>�	hamowanie g�odu nast�pnego dnia (co wa�ne jest podczas etapu redukcji tkanki t�uszczowej)</b><br>"
									+ "<b>�	wspomaganie efektu termogenezy, co skutkuje wi�ksz� utrat� t�uszczu. </b><br>"
									+ "<b>Dawkowanie: wykorzystaj oko�o 40g kazeiny micelarnej na 1 godzin� przed p�j�ciem spa� aby wykorzysta� wszystkie jej potencjalne zalety.</b>"
									+ "<h4>CLA </h4>"
									+ "<b>Jest to t�uszcz z grupy trans, zakwalifikowany jest jako �zdrowy t�uszcz�. Jego stosowanie przek�ada si� na popraw� parametr�w zdrowotnych </b><br>"
									+ "<b>naszego organizmu. Zastosowanie CLA w okresie snu wp�ywa na podtrzymanie odpowiedniego tempa metabolizmu.</b><br>"
									+ "<b>Dawkowanie: 2-3g przed snem wraz z od�ywk� bia�kow� oraz 2-3g rano do �niadania.</b>"
									+ "<h4>GABA</h4>"
									+ "<b>Wykorzystanie kwasu gamma-aminomas�owego poprawia jako�� snu. Wp�ywa on zar�wno na g��boko�� samego snu, ale te� wprowadza </b><br>"
									+ "<b>organizm w stan wyciszenia, relaksu, co skutkuj� szybszym za�ni�ciem.  </b><br>"
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

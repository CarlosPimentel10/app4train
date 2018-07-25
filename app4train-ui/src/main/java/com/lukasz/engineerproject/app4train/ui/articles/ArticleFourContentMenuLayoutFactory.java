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
							"<b><br><br>Sauna stanowi istotny element odnowy biologicznej. Mo�e wywiera� pozytywny wp�yw na nasze zdrowie, jak r�wnie� sprzyja� lepszej regeneracji.</b><br>"
									+ "<b>Trzeba mie� jednak �wiadomo��, �e nieprawid�owe korzystanie z sauny mo�e przynie�� skutek uboczny. Wyr�niamy sauny suche, parowe, mokre oraz na podczerwie�. </b>"
									+ "<h4>Sauna sucha</h4>"
									+ "<b>Zwana te� saun� fi�sk�, to zazwyczaj drewniane pomieszczenie z piecem. Jest ona przeznaczona do k�pieli w temp. 90-110�C oraz wilgotno�ci ok. 10%.</b>"
									+ "<h4>Sauna parowa</h4>"
									+ "<b>Zwana te� �a�ni� rzymsk�. W tego typu saunie temperatura jest ni�sza 50-65�C, natomiast wilgotno�� jest bardzo wysoka bo powy�ej 40%, a niekiedy </b><br>"
									+ "<b>nawet blisko 100%. Sauna parowa to zwykle pomieszczenie wy�o�one kafelkami. Piec u�ywa natomiast parownika b�d�cego generatorem pary.</b>"
									+ "<h4>Sauna na podczerwie�</h4>"
									+ "<b>z wygl�du podobna do sauny suchej. Elementem grzewczym s� natomiast promienniki podczerwieni. W tego typu saunie temperatura i wilgotno�� </b><br>"
									+ "<b>powietrza odgrywaj� rol� drugorz�dn�. Cia�o nagrzewane jest promieniowaniem na podczerwie�.</b><br>"
									+ "<b>�	Korzystanie z sauny pomaga w redukcji b�lu wyst�puj�cego po treningu poprzez rozgrzanie oraz rozlu�nienie naci�gni�tych mi�ni </b><br>"
									+ "<b>�	Pobudza uk�ad nerwowy, kt�ry przyczynia si� do wzrostu si�y oraz szybko�ci skurczu mi�niowego</b><br>"
									+ "<b>�	Wzmacnia uk�ad odporno�ciowy</b><br>"
									+ "<b>�	Pomaga osi�gni�cie odpr�enia i lepszego samopoczucia</b><br>"
									+ "<b>�	Zwi�ksza dotlenienie tkanek</b><br>"
									+ "<b>Sauna z pewno�ci� wp�ynie na lepsz� regeneracj� mi�ni, pod warunkiem, �e nie b�dziemy korzysta� zbyt cz�sto. Przestrzega� kilku zasad:</b><br>"
									+ "<b>�	nie korzystaj z sauny po zako�czonym treningu, jak i bezpo�rednio przed rozpocz�ciem treningu</b><br>"
									+ "<b>�	pami�taj o odpowiednim nawodnieniu organizmu przed wej�ciem do sauny, jak r�wnie� po wyj�ciu z niej</b><br>"
									+ "<b>�	nie korzystaj z sauny jednorazowo d�u�ej ni� 15 min</b><br>",
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

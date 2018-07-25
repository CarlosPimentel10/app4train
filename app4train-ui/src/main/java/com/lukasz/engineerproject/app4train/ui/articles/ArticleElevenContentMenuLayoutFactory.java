
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
public class ArticleElevenContentMenuLayoutFactory {

	private class ArticleElevenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleEleven;
		private Label topicOfOfArticleEleven;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleElevenContentMenuLayout init() {

			topicOfOfArticleEleven = new Label(UtilsForArticlesTitles.TOPIC_ELEVEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleEleven = new Label("<br><h4>Dni odpoczynku s� potrzebne!</h4><br>"
							+ "<b>Uwa�asz, �e dni odpoczynku od trening�w to zmarnowany czas?. Zamiast wypoczywa� i regenerowa� si�, odczuwasz wyrzuty sumienia, �e w�a�nie w tym momencie nie </b><br>"
							+ "<b>jeste� na si�owni? W momencie choroby, kt�ra skutkuje kilkudniow� przerw� od trening�w, zamartwiasz si�, �e stracisz ci�ko wypracowane efekty?. To odpowiedni</b><br>"
							+ "<b>moment aby u�wiadomi� sobie, �e odpoczynek to tak�e cz�� planu, w kt�rym regenerujesz cia�o jak i umys�. Pozwala Ci on osi�gn�� dalszy rozw�j i progres.</b><br>"
							+ "<b>Zwr�� uwag� tylko, jak czujesz si� po nieprzespanej nocy? Jeste� niewyspany, nie mo�esz skupi�, odczuwasz ci�g�� potrzeb� podjadania oraz picia kawy </b><br>"
							+ "<b>a tak�e jeste� poddenerwowany. Wszystko to przek�ada si� na spadek si�y, spadek wypracowanej masy mi�niowej, a tak�e wzrost tkanki t�uszczowej.</b><br>"
							+ "<b>Skutki nieprzespanej nocy daj� rezultaty podobne do zm�czenia, jakiego do�wiadczanego przez tw�j organizm, w momencie gdy nie zapewniasz mu odpowiedniego </b><br>"
							+ "<b>odpoczynku po odbytym treningu.Gdy post�pujesz w taki w�a�nie spos�b, b�d� �wiadom tego, pr�dzej czy p�niej b�dziesz odczuwa� coraz cz�ciej bolesno�� mi�ni, uk�ad </b><br>"
							+ "<b>odporno�ciowy jest os�abiony, skutkiem czego s� coraz cz�stsze choroby, pojawiaj� si� problemy ze snem, obni�a si� twoja wydolno�� i si�a mi�ni, jak r�wnie� zwi�ksza</b><br>"
							+ "<b>si� ryzyko odniesienia kontuzji. Dni odpoczynku wa�ne s� te� dla psychiki, poniewa� na kolejne treningi udajemy si� du�o ch�tniej.</b>"
							+ "<h4>Jak cz�sto nale�y odpoczywa�?</h4>"
							+ "<b>Dni przeznaczone na regeneracj� musz� by� w ka�dym tygodniu treningowym. W zale�no�ci od planu treningowego, stopnia zaawansowania, oraz pracy i dodatkowych </b><br>"
							+ "<b>obowi�zk�w przeznacz od jednego do trzech dni na odpoczynek. Nie oznaczaj� one jedynie siedzenia na kanapie, poniewa� lepsze efekty daj� spacery </b><br>"
							+ "<b>czy te� na basen. Mo�emy skorzysta� r�wnie� sauny. Pocz�tkuj�cy co najmniej powinni odpoczywa� co dwa dni treningowe. Zaawansowani natomiast </b><br>"
							+ "<b>powinni co najmniej jeden dzie� przeznaczy� na aktywn� regeneracj� z wykorzystaniem masa�y czy te� sauny.</b><br>",
							ContentMode.HTML);

					throughtExplanationOfArticleEleven.setSizeUndefined();
					throughtExplanationOfArticleEleven.setStyleName("throughtExplanationOfArticleEleven");
					throughtExplanationOfArticleEleven.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleEleven);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleEleven);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleElevenContentMenuLayout().init();
	}
}

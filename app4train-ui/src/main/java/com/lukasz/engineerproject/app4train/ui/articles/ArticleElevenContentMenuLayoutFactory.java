
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
					throughtExplanationOfArticleEleven = new Label("<br><h4>Dni odpoczynku s¹ potrzebne!</h4><br>"
							+ "<b>Uwa¿asz, ¿e dni odpoczynku od treningów to zmarnowany czas?. Zamiast wypoczywaæ i regenerowaæ siê, odczuwasz wyrzuty sumienia, ¿e w³aœnie w tym momencie nie </b><br>"
							+ "<b>jesteœ na si³owni? W momencie choroby, która skutkuje kilkudniow¹ przerw¹ od treningów, zamartwiasz siê, ¿e stracisz ciê¿ko wypracowane efekty?. To odpowiedni</b><br>"
							+ "<b>moment aby uœwiadomiæ sobie, ¿e odpoczynek to tak¿e czêœæ planu, w którym regenerujesz cia³o jak i umys³. Pozwala Ci on osi¹gn¹æ dalszy rozwój i progres.</b><br>"
							+ "<b>Zwróæ uwagê tylko, jak czujesz siê po nieprzespanej nocy? Jesteœ niewyspany, nie mo¿esz skupiæ, odczuwasz ci¹g³¹ potrzebê podjadania oraz picia kawy </b><br>"
							+ "<b>a tak¿e jesteœ poddenerwowany. Wszystko to przek³ada siê na spadek si³y, spadek wypracowanej masy miêœniowej, a tak¿e wzrost tkanki t³uszczowej.</b><br>"
							+ "<b>Skutki nieprzespanej nocy daj¹ rezultaty podobne do zmêczenia, jakiego doœwiadczanego przez twój organizm, w momencie gdy nie zapewniasz mu odpowiedniego </b><br>"
							+ "<b>odpoczynku po odbytym treningu.Gdy postêpujesz w taki w³aœnie sposób, b¹dŸ œwiadom tego, prêdzej czy póŸniej bêdziesz odczuwa³ coraz czêœciej bolesnoœæ miêœni, uk³ad </b><br>"
							+ "<b>odpornoœciowy jest os³abiony, skutkiem czego s¹ coraz czêstsze choroby, pojawiaj¹ siê problemy ze snem, obni¿a siê twoja wydolnoœæ i si³a miêœni, jak równie¿ zwiêksza</b><br>"
							+ "<b>siê ryzyko odniesienia kontuzji. Dni odpoczynku wa¿ne s¹ te¿ dla psychiki, poniewa¿ na kolejne treningi udajemy siê du¿o chêtniej.</b>"
							+ "<h4>Jak czêsto nale¿y odpoczywaæ?</h4>"
							+ "<b>Dni przeznaczone na regeneracjê musz¹ byæ w ka¿dym tygodniu treningowym. W zale¿noœci od planu treningowego, stopnia zaawansowania, oraz pracy i dodatkowych </b><br>"
							+ "<b>obowi¹zków przeznacz od jednego do trzech dni na odpoczynek. Nie oznaczaj¹ one jedynie siedzenia na kanapie, poniewa¿ lepsze efekty daj¹ spacery </b><br>"
							+ "<b>czy te¿ na basen. Mo¿emy skorzystaæ równie¿ sauny. Pocz¹tkuj¹cy co najmniej powinni odpoczywaæ co dwa dni treningowe. Zaawansowani natomiast </b><br>"
							+ "<b>powinni co najmniej jeden dzieñ przeznaczyæ na aktywn¹ regeneracjê z wykorzystaniem masa¿y czy te¿ sauny.</b><br>",
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

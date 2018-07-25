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
public class ArticleFiveContentMenuLayoutFactory {

	private class ArticleFiveContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleFive;
		private Label topicOfOfArticleFive;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleFiveContentMenuLayout init() {

			topicOfOfArticleFive = new Label(UtilsForArticlesTitles.TOPIC_FIVE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleFive = new Label("<br><h4>Brak snu</h4>"
							+ "<b>Nie wp³ywa on korzystanie w okresie gdy zdecydowaliœmy siê na spadek naszej wagi. Zapewne po zarwanej nocy trudno Ci funkcjonowaæ na pe³nych obrotach.</b><br>"
							+ "<b>Niedostateczna iloœæ wypoczynku wp³ywa siê na skutecznoœæ Twoich dzia³aniach, jak równie¿ na Twoim wygl¹dzie. W tym okresie Twój organizm </b><br>"
							+ "<b> bêdzie siê broni³ przez uczuciem zmêczenia, wywo³uj¹c u Ciebie ochotê na wysokokaloryczne przek¹ski dostarczaj¹ce dodatkowej iloœci energii. </b>"
							+ "<h4>Stosowane leki</h4>"
							+ "<b>Jeœli podlegasz d³ugotrwa³emu leczeniu wymagaj¹cego stosowania równych leków sprawdŸ, czy lek, który stosujesz nie wywo³uje u Ciebie  </b><br>"
							+ "<b>zwiêkszenia masy cia³a. Leki przeciwdepresyjne czy sterydy mog¹ powodowaæ, ¿e nabierzesz kilku dodatkowych kilogramów. Oczywiœcie nie  </b><br>"
							+ "<b>nale¿y przerywaæ stosowanego leczenia bez konsultacji z lekarzem. Je¿eli uwa¿asz, ¿e lek, który przyjmujesz mo¿e mieæ z³y wp³yw na Twoj¹ wagê, </b><br>"
							+ "<b>porozmawiaj o tym z lekarzem, który Ci je przepisa³ i wspólnie przedyskutujcie inne metody leczenia. </b>"
							+ "<h4>Weekendowe folgowanie</h4>"
							+ "<b>Oprócz wytê¿onej pracy nad swoim cia³em w tygodniu, równie¿ powinieneœ robiæ wszystko, aby utrzymywaæ formê równie¿ w weekendy. </b><br>"
							+ "<b>Zarówno alkohol jak i nieprzestrzeganie diety sumuj¹ siê ze zmniejszonym wydatkiem energii w dniach, w których nie chodzisz do pracy. Zwróc </b><br>"
							+ "<b>uwagê na to, ¿e je¿eli w ci¹gu piêciu dni stracisz kilogram, w ci¹gu dwóch dni bez problemu ³atwo go nadrobiæ, co ostatesznie spowoduje, ¿e ca³y czas bêdziesz sta³ w miejscu.</b>"
							+ "<h4>Przek¹ski zamiast posi³ków</h4>"
							+ "<b>Jeœli przez ca³y dzieñ, jesz ma³e iloœci to tu to tam, nie robisz cia³u jakiejkolwiek przys³ugi. Mo¿na myœleæ, ¿e skoro nie jem du¿ych porcji to </b><br>"
							+ "<b>szybko stracê wagê. Niestety jesteœ w du¿ym b³êdzie poniewa¿ nie kontrolujesz w takim wypadku iloœci spo¿ywanych kalorii, co nie sprzyja </b><br>"
							+ "<b>utracie kilogramów. Zast¹p przek¹ski i zaplanuj konkretne posi³ki. U³atwi Ci to utrzymaæ dietê i odci¹gnie Ciê od chêci kupowania po drodze </b><br>"
							+ "<b>czegoœ niekoniecznie dietetycznego.</b><br>", ContentMode.HTML);
					throughtExplanationOfArticleFive.setSizeUndefined();
					throughtExplanationOfArticleFive.setStyleName("throughtExplanationOfArticleFive");
					throughtExplanationOfArticleFive.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleFive);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleFive);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleFiveContentMenuLayout().init();
	}
}

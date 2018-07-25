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
							+ "<b>Nie wp�ywa on korzystanie w okresie gdy zdecydowali�my si� na spadek naszej wagi. Zapewne po zarwanej nocy trudno Ci funkcjonowa� na pe�nych obrotach.</b><br>"
							+ "<b>Niedostateczna ilo�� wypoczynku wp�ywa si� na skuteczno�� Twoich dzia�aniach, jak r�wnie� na Twoim wygl�dzie. W tym okresie Tw�j organizm </b><br>"
							+ "<b> b�dzie si� broni� przez uczuciem zm�czenia, wywo�uj�c u Ciebie ochot� na wysokokaloryczne przek�ski dostarczaj�ce dodatkowej ilo�ci energii. </b>"
							+ "<h4>Stosowane leki</h4>"
							+ "<b>Je�li podlegasz d�ugotrwa�emu leczeniu wymagaj�cego stosowania r�wnych lek�w sprawd�, czy lek, kt�ry stosujesz nie wywo�uje u Ciebie  </b><br>"
							+ "<b>zwi�kszenia masy cia�a. Leki przeciwdepresyjne czy sterydy mog� powodowa�, �e nabierzesz kilku dodatkowych kilogram�w. Oczywi�cie nie  </b><br>"
							+ "<b>nale�y przerywa� stosowanego leczenia bez konsultacji z lekarzem. Je�eli uwa�asz, �e lek, kt�ry przyjmujesz mo�e mie� z�y wp�yw na Twoj� wag�, </b><br>"
							+ "<b>porozmawiaj o tym z lekarzem, kt�ry Ci je przepisa� i wsp�lnie przedyskutujcie inne metody leczenia. </b>"
							+ "<h4>Weekendowe folgowanie</h4>"
							+ "<b>Opr�cz wyt�onej pracy nad swoim cia�em w tygodniu, r�wnie� powiniene� robi� wszystko, aby utrzymywa� form� r�wnie� w weekendy. </b><br>"
							+ "<b>Zar�wno alkohol jak i nieprzestrzeganie diety sumuj� si� ze zmniejszonym wydatkiem energii w dniach, w kt�rych nie chodzisz do pracy. Zwr�c </b><br>"
							+ "<b>uwag� na to, �e je�eli w ci�gu pi�ciu dni stracisz kilogram, w ci�gu dw�ch dni bez problemu �atwo go nadrobi�, co ostatesznie spowoduje, �e ca�y czas b�dziesz sta� w miejscu.</b>"
							+ "<h4>Przek�ski zamiast posi�k�w</h4>"
							+ "<b>Je�li przez ca�y dzie�, jesz ma�e ilo�ci to tu to tam, nie robisz cia�u jakiejkolwiek przys�ugi. Mo�na my�le�, �e skoro nie jem du�ych porcji to </b><br>"
							+ "<b>szybko strac� wag�. Niestety jeste� w du�ym b��dzie poniewa� nie kontrolujesz w takim wypadku ilo�ci spo�ywanych kalorii, co nie sprzyja </b><br>"
							+ "<b>utracie kilogram�w. Zast�p przek�ski i zaplanuj konkretne posi�ki. U�atwi Ci to utrzyma� diet� i odci�gnie Ci� od ch�ci kupowania po drodze </b><br>"
							+ "<b>czego� niekoniecznie dietetycznego.</b><br>", ContentMode.HTML);
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

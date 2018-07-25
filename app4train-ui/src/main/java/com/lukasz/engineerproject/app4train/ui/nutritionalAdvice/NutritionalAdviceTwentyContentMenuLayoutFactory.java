package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import com.lukasz.engineerproject.app4train.utils.UtilsForNutritionalAdvicesTitles;
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
public class NutritionalAdviceTwentyContentMenuLayoutFactory {

	private class NutritionalAdviceTwentyContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceTwenty;
		private Label topicOfOfNutritionalAdviceTwenty;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceTwentyContentMenuLayout init() {

			topicOfOfNutritionalAdviceTwenty = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_TWENTY.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceTwenty = new Label(
							"<b><br><br>Nieprawdziwe informacje przekazywane s� cz�sto przez samych lekarzy i dietetyk�w. Skutkuje to b��dnym postrzeganiem cholesterolu. </b>"
									+ "<h4>Niezb�dny do �ycia!</h4>"
									+ "<b>Wi�ksza cz�� cholesterolu jest produkowana przez w�trob�. Tylko niewielka cz�� jest dostarczana w po�ywieniu. W zwi�zku z tym jedzenie </b><br>"
									+ "<b>nie ma tak strategicznego wp�ywu na cholesterol, jak niekt�rzy uwa�aj�. Nasz m�zg potrzebuje cholesterolu. Jego obecno�� w naszej sk�rze </b><br>"
									+ "<b>sprzyja syntezie witaminy D. Niski poziom cholesterolu przyczynia si� do starzenia si�, chor�b psychicznych i agresji. Cholesterol </b><br>"
									+ "<b>chroni nas przed nowotworami. Jak wida� zwi�zek ten jest bardzo potrzeby, dla naszego organizmu.</b>"
									+ "<h4>Wysoki czy niski?</h4>"
									+ "<b>Ca�kowita ilo�� cholesterolu we krwi wg lekarzy nie powinna przekracza� 200 mg/dl. Warto�� ta cz�sto jest nie do osi�gni�cia, nawet przez osoby, </b><br>"
									+ "<b>kt�re latami bior� tabletki sztucznie obni�aj�ce poziom cholesterolu. Jak wynika z badan naukowych, naturalny i zdrowy poziom cholesterolu </b><br>"
									+ "<b>wzrasta wraz z wiekiem, osi�gaj�c nawet 350 mg/dl nawet przez osoby po 40 roku �ycia. Wa�ne jest to, �e poziom cholesterolu we krwi stanowi </b><br>"
									+ "<b>miar� witalno�ci organizmu. Zwykle ludzie aktywni i zdrowsi posiadaj� wy�szy poziom, natomiast osoby zmagaj�ce si� z depresjami, maj� niski </b><br>"
									+ "<b>poziom cholesterolu. </b>" + "<h4>Dieta na cholesterol?</h4>"
									+ "<b>Ograniczenie t�uszcz�w i mi�sa oraz jaj, s� g��wnymi zaleceniami lekarzy, kt�rzy dodatkowo przepisuj� na sta�e leki obni�aj�ce cholesterol.</b><br>"
									+ "<b>To jeden z najwi�kszych mit�w, dlatego �e dieta ma umiarkowany wp�yw na poziom cholesterolu. Stosuj�c powy�sze wytyczne mo�emy sobie tylko  </b><br>"
									+ "<b>zaszkodzi�. Jaja, mi�so czy t�uszcze zwierz�ce nie wp�ywaj� negatywnie na cholesterol. </b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceTwenty.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceTwenty
							.setStyleName("throughtExplanationOfNutritionalAdviceTwenty");
					throughtExplanationOfNutritionalAdviceTwenty.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceTwenty);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceTwenty);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceTwentyContentMenuLayout().init();
	}
}
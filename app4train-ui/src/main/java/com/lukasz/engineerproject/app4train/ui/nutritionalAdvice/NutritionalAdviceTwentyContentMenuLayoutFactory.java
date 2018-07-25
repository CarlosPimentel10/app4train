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
							"<b><br><br>Nieprawdziwe informacje przekazywane s¹ czêsto przez samych lekarzy i dietetyków. Skutkuje to b³êdnym postrzeganiem cholesterolu. </b>"
									+ "<h4>Niezbêdny do ¿ycia!</h4>"
									+ "<b>Wiêksza czêœæ cholesterolu jest produkowana przez w¹trobê. Tylko niewielka czêœæ jest dostarczana w po¿ywieniu. W zwi¹zku z tym jedzenie </b><br>"
									+ "<b>nie ma tak strategicznego wp³ywu na cholesterol, jak niektórzy uwa¿aj¹. Nasz mózg potrzebuje cholesterolu. Jego obecnoœæ w naszej skórze </b><br>"
									+ "<b>sprzyja syntezie witaminy D. Niski poziom cholesterolu przyczynia siê do starzenia siê, chorób psychicznych i agresji. Cholesterol </b><br>"
									+ "<b>chroni nas przed nowotworami. Jak widaæ zwi¹zek ten jest bardzo potrzeby, dla naszego organizmu.</b>"
									+ "<h4>Wysoki czy niski?</h4>"
									+ "<b>Ca³kowita iloœæ cholesterolu we krwi wg lekarzy nie powinna przekraczaæ 200 mg/dl. Wartoœæ ta czêsto jest nie do osi¹gniêcia, nawet przez osoby, </b><br>"
									+ "<b>które latami bior¹ tabletki sztucznie obni¿aj¹ce poziom cholesterolu. Jak wynika z badan naukowych, naturalny i zdrowy poziom cholesterolu </b><br>"
									+ "<b>wzrasta wraz z wiekiem, osi¹gaj¹c nawet 350 mg/dl nawet przez osoby po 40 roku ¿ycia. Wa¿ne jest to, ¿e poziom cholesterolu we krwi stanowi </b><br>"
									+ "<b>miarê witalnoœci organizmu. Zwykle ludzie aktywni i zdrowsi posiadaj¹ wy¿szy poziom, natomiast osoby zmagaj¹ce siê z depresjami, maj¹ niski </b><br>"
									+ "<b>poziom cholesterolu. </b>" + "<h4>Dieta na cholesterol?</h4>"
									+ "<b>Ograniczenie t³uszczów i miêsa oraz jaj, s¹ g³ównymi zaleceniami lekarzy, którzy dodatkowo przepisuj¹ na sta³e leki obni¿aj¹ce cholesterol.</b><br>"
									+ "<b>To jeden z najwiêkszych mitów, dlatego ¿e dieta ma umiarkowany wp³yw na poziom cholesterolu. Stosuj¹c powy¿sze wytyczne mo¿emy sobie tylko  </b><br>"
									+ "<b>zaszkodziæ. Jaja, miêso czy t³uszcze zwierzêce nie wp³ywaj¹ negatywnie na cholesterol. </b><br>",
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
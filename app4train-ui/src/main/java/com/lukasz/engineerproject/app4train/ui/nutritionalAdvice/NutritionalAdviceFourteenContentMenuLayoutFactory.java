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
public class NutritionalAdviceFourteenContentMenuLayoutFactory {

	private class NutritionalAdviceFourteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceFourteen;
		private Label topicOfOfNutritionalAdviceFourteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceFourteenContentMenuLayout init() {

			topicOfOfNutritionalAdviceFourteen = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_FOURTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceFourteen = new Label(
							"<h4><br>Po pierwsze - ochrona masy miêœniowej przed katabolizmem</h4>"
									+ "<b>Okres z obni¿on¹ poda¿¹ kalorii to moment, w którym nasze miêœnie mo¿e dotkn¹æ zjawisko katabolizmu. Organizm, ma mniej dostêpnej </b><br>"
									+ "<b>energii, zatem bêdzie d¹¿y³ do pozyskania jej z naszych miêœni, w postaci aminokwasów, które zostan¹ przekszta³cone w glukozê.  </b><br>"
									+ "<b>Zwiêkszona iloœæ bia³ka w diecie ma celu zahamowaæ efekt wykorzystania protein zawartych w masie miêœniowej.</b>"
									+ "<h4>Po drugie - efekt termiczny bia³ka</h4>"
									+ "<b>Wiêkszy poziom bia³ka w organizmie powoduje podniesienie temperatury, co zwi¹zane jest z nasileniem procesów termogenicznych. Wp³ywaj¹ce na </b><br>"
									+ "<b>rozk³ad t³uszczy w naszym ciele. Jest to efekt, sprzyjaj¹cy wykorzystaniu t³uszczu na potrzeby energetyczne.</b>"
									+ "<h4>Po trzecie - dzia³anie hamuj¹ce apetyt</h4>"
									+ "<b>Wykorzystanie bia³ka do zahamowania apetytu jest idealnie, gdy mamy ochotê zjeœæ coœ dodatkowo. Trzeba wiedzieæ, ¿e proteiny i ich strawnoœæ </b><br>"
									+ "<b>w naszym organizmie wymagaj¹ wiêkszych nak³adów energetycznych, ni¿ same potrafi¹ dostarczyæ. Tak wiec gdy mamy ochotê na coœ s³odkiego, </b><br>"
									+ "<b>mo¿emy skorzystaæ ze s³odkiego shake proteinowego. Wp³ynie to na efektywnoœæ redukcji.</b>"
									+ "<h4>Ile wiêc spo¿ywaæ bia³ka?</h4>"
									+ "<b>Iloœæ protein, jak¹ mo¿emy spo¿yæ jest kwesti¹ indywidualizowan¹. Chc¹c budowaæ masê miêœniow¹ powinno siê spo¿ywaæ w granicach oko³o 2g na  </b><br>"
									+ "<b>kg masy cia³a. To wartoœæ, która w trakcie dodatniego bilansu energetycznego pokrywa zapotrzebowanie osoby trenuj¹cej na bia³ko. </b><br>"
									+ "<b>Natomiast, gdy przyjdzie nam zejœæ poni¿ej naszej wartoœci neutralnej, wtedy ryzyko katabolizmu nieco roœnie. Dlatego te¿ iloœæ bia³ka </b><br>"
									+ "<b>powinniœmy podnieœæ do wartoœci 2,5g na kg masy cia³a. Stosuj¹c odpowiednie iloœci bia³ka zwracajmy uwagê na reakcji uk³adu </b><br>"
									+ "<b>pokarmowego. Wszelkie bóle brzucha czy wzdêcia s¹ oznak¹, ¿e przyjêta iloœæ mo¿e byæ zbyt wysoka.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceFourteen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceFourteen
							.setStyleName("throughtExplanationOfNutritionalAdviceFourteen");
					throughtExplanationOfNutritionalAdviceFourteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceFourteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceFourteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceFourteenContentMenuLayout().init();
	}
}
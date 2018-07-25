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
							"<h4><br>Po pierwsze - ochrona masy mi�niowej przed katabolizmem</h4>"
									+ "<b>Okres z obni�on� poda�� kalorii to moment, w kt�rym nasze mi�nie mo�e dotkn�� zjawisko katabolizmu. Organizm, ma mniej dost�pnej </b><br>"
									+ "<b>energii, zatem b�dzie d��y� do pozyskania jej z naszych mi�ni, w postaci aminokwas�w, kt�re zostan� przekszta�cone w glukoz�.  </b><br>"
									+ "<b>Zwi�kszona ilo�� bia�ka w diecie ma celu zahamowa� efekt wykorzystania protein zawartych w masie mi�niowej.</b>"
									+ "<h4>Po drugie - efekt termiczny bia�ka</h4>"
									+ "<b>Wi�kszy poziom bia�ka w organizmie powoduje podniesienie temperatury, co zwi�zane jest z nasileniem proces�w termogenicznych. Wp�ywaj�ce na </b><br>"
									+ "<b>rozk�ad t�uszczy w naszym ciele. Jest to efekt, sprzyjaj�cy wykorzystaniu t�uszczu na potrzeby energetyczne.</b>"
									+ "<h4>Po trzecie - dzia�anie hamuj�ce apetyt</h4>"
									+ "<b>Wykorzystanie bia�ka do zahamowania apetytu jest idealnie, gdy mamy ochot� zje�� co� dodatkowo. Trzeba wiedzie�, �e proteiny i ich strawno�� </b><br>"
									+ "<b>w naszym organizmie wymagaj� wi�kszych nak�ad�w energetycznych, ni� same potrafi� dostarczy�. Tak wiec gdy mamy ochot� na co� s�odkiego, </b><br>"
									+ "<b>mo�emy skorzysta� ze s�odkiego shake proteinowego. Wp�ynie to na efektywno�� redukcji.</b>"
									+ "<h4>Ile wi�c spo�ywa� bia�ka?</h4>"
									+ "<b>Ilo�� protein, jak� mo�emy spo�y� jest kwesti� indywidualizowan�. Chc�c budowa� mas� mi�niow� powinno si� spo�ywa� w granicach oko�o 2g na  </b><br>"
									+ "<b>kg masy cia�a. To warto��, kt�ra w trakcie dodatniego bilansu energetycznego pokrywa zapotrzebowanie osoby trenuj�cej na bia�ko. </b><br>"
									+ "<b>Natomiast, gdy przyjdzie nam zej�� poni�ej naszej warto�ci neutralnej, wtedy ryzyko katabolizmu nieco ro�nie. Dlatego te� ilo�� bia�ka </b><br>"
									+ "<b>powinni�my podnie�� do warto�ci 2,5g na kg masy cia�a. Stosuj�c odpowiednie ilo�ci bia�ka zwracajmy uwag� na reakcji uk�adu </b><br>"
									+ "<b>pokarmowego. Wszelkie b�le brzucha czy wzd�cia s� oznak�, �e przyj�ta ilo�� mo�e by� zbyt wysoka.</b><br>",
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
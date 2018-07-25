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
public class NutritionalAdviceTenContentMenuLayoutFactory {

	private class NutritionalAdviceTenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceTen;
		private Label topicOfOfNutritionalAdviceTen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceTenContentMenuLayout init() {

			topicOfOfNutritionalAdviceTen = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_TEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceTen = new Label("<br><h4>Woda to �ycie</h4>"
							+ "<b>Woda jest substancj�, utrzymuj�c� ci� przy �yciu. Trzeba zda� sobie spraw� z tego, �e Cia�o cz�owieka sk�ada z ok. 70% z wody. Procentowa </b><br>"
							+ "<b>warto�� wody w bezt�uszczowej masie cia�a, je�eli chodzi u osob� doros�� jest na sta�ym poziomie i wynosi 75%. W tkankach mo�e by� r�wna </b><br>"
							+ "<b>warto�� wody np. w mi�niach jest 74-80% wody, w p�ucach oko�o 80%, w w�trobie oko�o 68%, a ko�ciach oko�o 25%. R�nice w zawarto�ci wody </b><br>"
							+ "<b>w ludzkim organizmie wynikaj� z wieku, p�ci, a tak�e z budowy cia�a. Woda pe�ni wa�ne funkcje w naszym organizmie, a z racji tego tracimy jej </b><br>"
							+ "<b>znaczne ilo�ci wraz z potem, moczem, oraz podczas oddychania, musimy j� na bie��co uzupe�nia�. Cz�owiek mo�e przetrwa� nawet 3 tygodnie bez </b><br>"
							+ "<b>pokarmu, bez wody jedynie 3 dni.</b>"
							+ "<h4>Woda jest niezb�dna w procesie trawienia</h4>"
							+ "<b>Formowanie k�s�w, prze�ykanie, a tak�e dalszy ich transport w przewodzie pokarmowym wymaga odpowiedniej zawarto�ci wody w �linie </b><br>"
							+ "<b>oraz soku �o��dkowym, jelitowym czy te� ��ci. Brak wody powoduje zaburzenie tych proces�w.</b>"
							+ "<h4>Woda poprawia samopoczucie i wydolno�� organizmu</h4>"
							+ "<b>Odwodnienie organizmu wp�ywa na sprawno�� umys�ow�. Wi��e si� z nast�puj�cymi objawami np. zm�czenie, pogorszenie pami�ci, </b><br>"
							+ "<b>rozkojarzenie, pogorszenie nastroju. Nie powinno nas to dziwi� dlatego, �e Nasz m�zg sk�ada si� z 80% wody.</b>"
							+ "<h4>Woda oczyszcza</h4>"
							+ "<b>Wraz z wydalan� przez nerki wod� z organizmu usuwane s� substancje przemiany materii. Odpowiednie nawodnienie organizmu </b><br>"
							+ "<b>pozwala na sprawne usuwanie toksyn z organizmu.</b>"
							+ "<h4>Woda pomaga utrzyma� prawid�ow� mas� cia�a</h4>"
							+ "<b>W przeciwie�stwie do sok�w oraz s�odkich napoj�w, woda nie posiada kalorii. W dodatku woda wype�nia �o��dek, co powoduje, �e jeste�my bardziej syci. </b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceTen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceTen.setStyleName("throughtExplanationOfNutritionalAdviceTen");
					throughtExplanationOfNutritionalAdviceTen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceTen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceTen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceTenContentMenuLayout().init();
	}
}
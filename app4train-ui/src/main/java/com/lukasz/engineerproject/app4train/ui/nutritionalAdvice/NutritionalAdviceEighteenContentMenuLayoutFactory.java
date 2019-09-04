package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import com.lukasz.engineerproject.app4train.utils.NutritionalAdvicesTitles;
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
public class NutritionalAdviceEighteenContentMenuLayoutFactory {

	private class NutritionalAdviceEighteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceEighteen;
		private Button buttonForWindow;

		public NutritionalAdviceEighteenContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceEighteen = new Label(NutritionalAdvicesTitles.TOPIC_EIGHTEEN.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceEighteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareButton() {
			buttonForWindow = new Button();
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);
		}

		private void buttonAction() {
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceEighteen = new Label("<h4><br>Carbo</h4>"
							+ "<b>To produkt w�glowodanowy, stanowi�cy mieszank� kilku frakcji tego makrosk�adnika. Dostarcza w�glowodan�w szybkowch�anialnych oraz wolnowch�anialnych.</b><br>"
							+ "<b>Suplement tego typu nadaj� si� jako pierwszy kontakt z w�glowodanami gdy sko�czymy trening. Na rynku suplementacyjnym mo�na spotka� carbo z dodatkiem</b><br>"
							+ "<b>leucyny, argininy, oraz kompleksem witamin. Stosowane jest zwykle przez kulturyst�w, pi�karzy, czy osoby trenuj�ce sporty walki, jako element regeneracji.</b>"
							+ "<h4>Waxy maize</h4>"
							+ "<b>Charakteryzuje si� d�ugo�a�cuchow� budow� chemiczn� , co oznacza, �e wykazuje tendencj� do powolnego trawienia w organizmie, stopniowego uwalniania </b><br>"
							+ "<b>energi, a co za tym idzie, nie uzyskujemy gwa�townego skoku insuliny i cukru we krwi co zapobiega uczuciu zm�czenia oraz senno�ci. </b><br>"
							+ "<b>Waxy maize powstaje z woskowej skrobi kukurydzianej. Sportowcy wykorzystuj� go jako dodatek do bia�ka w porze potreningowej. Z </b><br>"
							+ "<b>suplementu mo�na skorzysta� w okresie potreningowym, jak i w trakcie dnia, jako uzupe�nienie diety.</b>"
							+ "<h4>Koncentraty izotoniczne</h4>"
							+ "<b>Jest to prosta form� w�glowodan�w, jak np. glukoza. Jego formu�a wyliczana jest w taki spos�b, aby porcj� suplementu rozpu�ci� w odpowiedniej </b><br>"
							+ "<b>ilo�ci wody, aby uzyska� pewn� proporcj�. Dzi�ki temu powinni�my uzyska� roztw�r o zawarto�ci mniej wi�cej 50g w�glowodan�w na 1 litr p�ynu. </b><br>"
							+ "<b>Jest to ilo��, kt�ra wp�ynie na to, jak produkt wch�aniany zostanie przez nasz organizm. Tego typu roztw�r nosi nazw� roztworu izotonicznego.  </b>"
							+ "<h4>Podsumowanie</h4>"
							+ "<b>Wyb�r od�ywki w�glowodanowej powinien by� zwi�zany z tym jaki sport uprawiasz a tak�e z tym, czy brakuje Ci w�glowodan�w w diecie. Je�eli </b><br>"
							+ "<btrenujesz g��wnie kulturystycznie na si�owni, carbo po treningu powinno w zupe�no�ci wystarczy.</b><br>"
							+ "<b>Je�li w�glowodany wykorzystujesz g��wnie w ci�gu dnia, powiniene� wybra� z�o�one �r�d�a, nie powoduj�ce skok�w cukru we krwi.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceEighteen
							.setStyleName("throughtExplanationOfNutritionalAdviceEighteen");
					throughtExplanationOfNutritionalAdviceEighteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfNutritionalAdviceEighteen.setSizeUndefined();
					window.setContent(throughtExplanationOfNutritionalAdviceEighteen);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceEighteenContentMenuLayout().init();
	}
}
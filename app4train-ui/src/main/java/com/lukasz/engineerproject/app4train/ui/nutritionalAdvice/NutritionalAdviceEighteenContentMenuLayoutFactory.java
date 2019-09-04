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
							+ "<b>To produkt wêglowodanowy, stanowi¹cy mieszankê kilku frakcji tego makrosk³adnika. Dostarcza wêglowodanów szybkowch³anialnych oraz wolnowch³anialnych.</b><br>"
							+ "<b>Suplement tego typu nadaj¹ siê jako pierwszy kontakt z wêglowodanami gdy skoñczymy trening. Na rynku suplementacyjnym mo¿na spotkaæ carbo z dodatkiem</b><br>"
							+ "<b>leucyny, argininy, oraz kompleksem witamin. Stosowane jest zwykle przez kulturystów, pi³karzy, czy osoby trenuj¹ce sporty walki, jako element regeneracji.</b>"
							+ "<h4>Waxy maize</h4>"
							+ "<b>Charakteryzuje siê d³ugo³añcuchow¹ budow¹ chemiczn¹ , co oznacza, ¿e wykazuje tendencjê do powolnego trawienia w organizmie, stopniowego uwalniania </b><br>"
							+ "<b>energi, a co za tym idzie, nie uzyskujemy gwa³townego skoku insuliny i cukru we krwi co zapobiega uczuciu zmêczenia oraz sennoœci. </b><br>"
							+ "<b>Waxy maize powstaje z woskowej skrobi kukurydzianej. Sportowcy wykorzystuj¹ go jako dodatek do bia³ka w porze potreningowej. Z </b><br>"
							+ "<b>suplementu mo¿na skorzystaæ w okresie potreningowym, jak i w trakcie dnia, jako uzupe³nienie diety.</b>"
							+ "<h4>Koncentraty izotoniczne</h4>"
							+ "<b>Jest to prosta formê wêglowodanów, jak np. glukoza. Jego formu³a wyliczana jest w taki sposób, aby porcjê suplementu rozpuœciæ w odpowiedniej </b><br>"
							+ "<b>iloœci wody, aby uzyskaæ pewn¹ proporcjê. Dziêki temu powinniœmy uzyskaæ roztwór o zawartoœci mniej wiêcej 50g wêglowodanów na 1 litr p³ynu. </b><br>"
							+ "<b>Jest to iloœæ, która wp³ynie na to, jak produkt wch³aniany zostanie przez nasz organizm. Tego typu roztwór nosi nazwê roztworu izotonicznego.  </b>"
							+ "<h4>Podsumowanie</h4>"
							+ "<b>Wybór od¿ywki wêglowodanowej powinien byæ zwi¹zany z tym jaki sport uprawiasz a tak¿e z tym, czy brakuje Ci wêglowodanów w diecie. Je¿eli </b><br>"
							+ "<btrenujesz g³ównie kulturystycznie na si³owni, carbo po treningu powinno w zupe³noœci wystarczy.</b><br>"
							+ "<b>Jeœli wêglowodany wykorzystujesz g³ównie w ci¹gu dnia, powinieneœ wybraæ z³o¿one Ÿród³a, nie powoduj¹ce skoków cukru we krwi.</b><br>",
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
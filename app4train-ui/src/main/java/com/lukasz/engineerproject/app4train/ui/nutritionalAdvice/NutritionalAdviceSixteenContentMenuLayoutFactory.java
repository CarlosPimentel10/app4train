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
public class NutritionalAdviceSixteenContentMenuLayoutFactory {

	private class NutritionalAdviceSixteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceSixteen;
		private Label topicOfOfNutritionalAdviceSixteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceSixteenContentMenuLayout init() {

			topicOfOfNutritionalAdviceSixteen = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_SIXTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceSixteen = new Label("<h4><br>Woda z cytryn¹</h4>"
							+ "<b>Woda z cytryn¹ wspomaga odchudzanie, trawienie oraz poprawia pracê uk³adu pokarmowego. Jedn¹ z jej zalet jest to, ¿e pobudza w¹trobê do </b><br>"
							+ "<b>tworzenia ¿ó³ci, jak równie¿ pomaga w usuwaniu toksyn z organizmu. Osoby z wra¿liwym ¿o³¹dkiem mog¹ podra¿niaæ b³onê œluzow¹, skutkowaæ </b><br>"
							+ "<b>bêdzie bólem i problemami gastrycznymi. Woda z cytryn¹ dostarcza te¿ witaminê C, a wiêc poprawia odpornoœæ oraz pomaga w walce z infekcjami.</b><br>"
							+ "<b>Stosowanie: Szklankê wody z cytryn¹ najlepiej wypiæ pó³ godziny przed œniadaniem. Napój powinien byæ przygotowany rano, tak </b><br>"
							+ "<b>by sok nie straci³ wartoœci od¿ywczych.</b>" + "<h4>Woda z miodem</h4>"
							+ "<b>Miód to zdrowy i ceniony produkt ¿ywnoœciowy. Zapobiega wielu chorobom. Miód po³¹czony z wod¹ mo¿e mieæ bardzo korzystny wp³yw na </b><br>"
							+ "<b>nasze zdrowie. Bardzo wa¿na jest regularnoœæ i picie napoju na pusty ¿o³¹dek. Jego zaletami s¹ np. wspomaganie odchudzania, kontrolowanie  </b><br>"
							+ "<b>nag³ych napadów g³odu i wspomaga pracê jelit, ³agodzenie zapalenia stawów, wzmacnianie odpornoœæ organizmu. Szklanka wody z miodem </b><br>"
							+ "<b>doda nam energii i witalnoœci.</b><br>"
							+ "<b>Stosowanie:  Zaleca siê wypicie na czczo 2 ³y¿ki miodu rozpuszczonego w szklance wody.</b>"
							+ "<h4>Siemiê lniane</h4>"
							+ "<b>Siemiê lniane ma bardzo istotne kwasy Omega 3. Wp³ywa na pracê mózgu, koncentracjê oraz spowolnienie wch³aniania cukru. Wspiera te¿ </b><br>"
							+ "<b>dzia³anie uk³adu pokarmowego oraz oczyszcza organizm z toksyn. Jest idealne dla osób, które maj¹ wra¿liwy uk³ad pokarmowy. </b><br>"
							+ "<b>Stosowanie: Dwie ³y¿ki ziaren musimy gotowaæ w 1,5 szklance wody, oko³o 15-20 minut. Sporz¹dzony wywar wypijamy codziennie na czczo. </b>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceSixteen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceSixteen
							.setStyleName("throughtExplanationOfNutritionalAdviceSixteen");
					throughtExplanationOfNutritionalAdviceSixteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceSixteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceSixteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceSixteenContentMenuLayout().init();
	}
}
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
					throughtExplanationOfNutritionalAdviceSixteen = new Label("<h4><br>Woda z cytryn�</h4>"
							+ "<b>Woda z cytryn� wspomaga odchudzanie, trawienie oraz poprawia prac� uk�adu pokarmowego. Jedn� z jej zalet jest to, �e pobudza w�trob� do </b><br>"
							+ "<b>tworzenia ��ci, jak r�wnie� pomaga w usuwaniu toksyn z organizmu. Osoby z wra�liwym �o��dkiem mog� podra�nia� b�on� �luzow�, skutkowa� </b><br>"
							+ "<b>b�dzie b�lem i problemami gastrycznymi. Woda z cytryn� dostarcza te� witamin� C, a wi�c poprawia odporno�� oraz pomaga w walce z infekcjami.</b><br>"
							+ "<b>Stosowanie: Szklank� wody z cytryn� najlepiej wypi� p� godziny przed �niadaniem. Nap�j powinien by� przygotowany rano, tak </b><br>"
							+ "<b>by sok nie straci� warto�ci od�ywczych.</b>" + "<h4>Woda z miodem</h4>"
							+ "<b>Mi�d to zdrowy i ceniony produkt �ywno�ciowy. Zapobiega wielu chorobom. Mi�d po��czony z wod� mo�e mie� bardzo korzystny wp�yw na </b><br>"
							+ "<b>nasze zdrowie. Bardzo wa�na jest regularno�� i picie napoju na pusty �o��dek. Jego zaletami s� np. wspomaganie odchudzania, kontrolowanie  </b><br>"
							+ "<b>nag�ych napad�w g�odu i wspomaga prac� jelit, �agodzenie zapalenia staw�w, wzmacnianie odporno�� organizmu. Szklanka wody z miodem </b><br>"
							+ "<b>doda nam energii i witalno�ci.</b><br>"
							+ "<b>Stosowanie:  Zaleca si� wypicie na czczo 2 �y�ki miodu rozpuszczonego w szklance wody.</b>"
							+ "<h4>Siemi� lniane</h4>"
							+ "<b>Siemi� lniane ma bardzo istotne kwasy Omega 3. Wp�ywa na prac� m�zgu, koncentracj� oraz spowolnienie wch�aniania cukru. Wspiera te� </b><br>"
							+ "<b>dzia�anie uk�adu pokarmowego oraz oczyszcza organizm z toksyn. Jest idealne dla os�b, kt�re maj� wra�liwy uk�ad pokarmowy. </b><br>"
							+ "<b>Stosowanie: Dwie �y�ki ziaren musimy gotowa� w 1,5 szklance wody, oko�o 15-20 minut. Sporz�dzony wywar wypijamy codziennie na czczo. </b>",
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
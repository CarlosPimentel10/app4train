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
public class NutritionalAdviceFifteenContentMenuLayoutFactory {

	private class NutritionalAdviceFifteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceFifteen;
		private Button buttonForWindow;

		public NutritionalAdviceFifteenContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceFifteen = new Label(NutritionalAdvicesTitles.TOPIC_FIFTEEN.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceFifteen);
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
					throughtExplanationOfNutritionalAdviceFifteen = new Label(
							"<h4><br>Ile musimy wypija� ka�dego dnia?</h4>"
									+ "<b>Naukowcy m�wi�, by wypija� oko�o litr p�ynu na ka�de spo�yte 1000 kalorii. Organizm powinno si� nawadnia� ca�y dzie�, a szczeg�lnie</b><br>"
									+ "<b>w okresie oko�otreningowym. Zaleca si� wypicie 400-600 mililitr�w p�ynu oko�o 2 godziny przed wykonaniem treningu. Pozwoli nam to </b><br>"
									+ "<b>nawodni� organizm oraz dajemy mu czas na wydalenie zb�dnych p�yn�w. Tak wi�c pijemy przed �wiczeniami, podczas �wicze� oraz po �wiczeniach.</b>"

									+ "<h4>Kiedy woda a kiedy napoje sportowe?</h4>"
									+ "<b>Przed �wiczeniami najlepszym wyborem b�dzie woda zawieraj�ca produkty �ywno�ciowe lub nap�j sportowy zapewniaj�cy nawodnienie oraz  </b><br>"
									+ "<b>dawk� w�glowodan�w niezb�dnych podczas �wicze�. Czysta woda w odpowiedni spos�b zast�pi utracone p�yny w trakcie treningu umiarkowanego, </b><br>"
									+ "<b>kt�ry trwa kr�cej ni� godzin�. Napoje sportowe nie dadz� tutaj zbyt wielu korzy�ci. �wiczenia wymagaj�ce, trwaj�ce d�u�ej ni� godzin�, takie </b><br>"
									+ "<b>jak mecz tenisowy, kolarstwo lub trening si�owy, wymagaj� odpowiedniego nawodnienia. Naukowcy odkryli, i� picie napoj�w sportowych podczas tego </b><br>"
									+ "<b>typy aktywno�ci b�dzie korzystniejsze, dlatego warto wybra� nap�j izotoniczny, kt�ry ma 8 g cukru/100 ml.</b>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceFifteen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceFifteen
							.setStyleName("throughtExplanationOfNutritionalAdviceFifteen");
					throughtExplanationOfNutritionalAdviceFifteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceFifteen);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceFifteenContentMenuLayout().init();
	}
}
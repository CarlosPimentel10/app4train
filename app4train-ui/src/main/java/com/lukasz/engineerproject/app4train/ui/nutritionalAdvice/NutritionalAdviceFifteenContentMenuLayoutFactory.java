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
							"<h4><br>Ile musimy wypijaæ ka¿dego dnia?</h4>"
									+ "<b>Naukowcy mówi¹, by wypijaæ oko³o litr p³ynu na ka¿de spo¿yte 1000 kalorii. Organizm powinno siê nawadniaæ ca³y dzieñ, a szczególnie</b><br>"
									+ "<b>w okresie oko³otreningowym. Zaleca siê wypicie 400-600 mililitrów p³ynu oko³o 2 godziny przed wykonaniem treningu. Pozwoli nam to </b><br>"
									+ "<b>nawodniæ organizm oraz dajemy mu czas na wydalenie zbêdnych p³ynów. Tak wiêc pijemy przed æwiczeniami, podczas æwiczeñ oraz po æwiczeniach.</b>"

									+ "<h4>Kiedy woda a kiedy napoje sportowe?</h4>"
									+ "<b>Przed æwiczeniami najlepszym wyborem bêdzie woda zawieraj¹ca produkty ¿ywnoœciowe lub napój sportowy zapewniaj¹cy nawodnienie oraz  </b><br>"
									+ "<b>dawkê wêglowodanów niezbêdnych podczas æwiczeñ. Czysta woda w odpowiedni sposób zast¹pi utracone p³yny w trakcie treningu umiarkowanego, </b><br>"
									+ "<b>który trwa krócej ni¿ godzinê. Napoje sportowe nie dadz¹ tutaj zbyt wielu korzyœci. Æwiczenia wymagaj¹ce, trwaj¹ce d³u¿ej ni¿ godzinê, takie </b><br>"
									+ "<b>jak mecz tenisowy, kolarstwo lub trening si³owy, wymagaj¹ odpowiedniego nawodnienia. Naukowcy odkryli, i¿ picie napojów sportowych podczas tego </b><br>"
									+ "<b>typy aktywnoœci bêdzie korzystniejsze, dlatego warto wybraæ napój izotoniczny, który ma 8 g cukru/100 ml.</b>",
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
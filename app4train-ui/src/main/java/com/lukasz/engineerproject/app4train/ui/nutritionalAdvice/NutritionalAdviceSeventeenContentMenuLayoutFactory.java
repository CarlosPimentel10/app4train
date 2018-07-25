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
public class NutritionalAdviceSeventeenContentMenuLayoutFactory {

	private class NutritionalAdviceSeventeenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceSeventeen;
		private Label topicOfOfNutritionalAdviceSeventeen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceSeventeenContentMenuLayout init() {

			topicOfOfNutritionalAdviceSeventeen = new Label(
					UtilsForNutritionalAdvicesTitles.TOPIC_SEVENTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceSeventeen = new Label(
							"<b><br><br>�	Silnie uzale�nia, poniewa� oddzia�uje na te same obszary w m�zgu jak narkotyki. Odstawienie go powoduje niepok�j, depresj�, k�opoty z koncentracj�. </b><br>"
									+ "<b>�	Zaburzenia uk�adu pokarmowego, poniewa� cukier niszczy jelita Od jelit wszystko si� zaczyna, w zwi�zku z tym ka�de zachwianie flory </b><br>"
									+ "<b>bakteryjnej stanowi ryzyko wyst�pienia nowych schorze� obejmuj�ce inne cz�ci cia�a.</b><br>"
									+ "<b>�	Os�abienie odporno�ci, poniewa� jak wskazuj� badania, spo�ycie cukru os�abia uk�ad odporno�ciowy. Du�e spo�ycie cukru wp�ywa na </b><br>"
									+ "<b>to, �e jeste�my te� bardziej podatni na choroby oraz infekcje.</b><br>"
									+ "<b>�	Zwi�ksza ryzyko wyst�pienia chor�b nowotworowych piersi, w�troby, przewodu pokarmowego, p�uc i innych. </b><br>"
									+ "<b>�	Zaburza gospodark� hormonaln�, poniewa� posi�ek bogaty w cukry proste skutkuje gwa�townym wzrostem glukozy we krwi. </b><br>"
									+ "<b>Konsekwencj� tego jest insulinooporno��, cukrzyca lub zesp� policystycznych jajnik�w.</b><br>"
									+ "<b>�	Powoduje wiele r�nych chor�b i dolegliwo�ci jak choroby serca i kr��enia, astma, mia�d�yca, oty�o��, pr�chnica, padaczka, �ylaki,  </b><br>"
									+ "<b>stwardnienie rozsiane i wiele innych. Cukier to zagro�eniem dla ka�dej cz�ci naszego organizmu, niszczy go i doprowadza do wyniszczenia. </b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceSeventeen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceSeventeen
							.setStyleName("throughtExplanationOfNutritionalAdviceSeventeen");
					throughtExplanationOfNutritionalAdviceSeventeen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceSeventeen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceSeventeen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceSeventeenContentMenuLayout().init();
	}
}
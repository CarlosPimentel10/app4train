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
public class NutritionalAdviceThirteenContentMenuLayoutFactory {

	private class NutritionalAdviceThirteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceThirteen;
		private Button buttonForWindow;

		public NutritionalAdviceThirteenContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceThirteen = new Label(NutritionalAdvicesTitles.TOPIC_THIRTEEN.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceThirteen);
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
					throughtExplanationOfNutritionalAdviceThirteen = new Label(
							"<b><br><br>Opr�cz walor�w smakowych, posiadaj� one bardzo du�� warto�� od�ywcz�, r�norodne witaminy i minera�y.  S� uzupe�nieniem naszej</b><br>"
									+ "<b>diety a w dodatku to jedno z najlepszych i najta�szych �r�de� bia�ka. Wiele jest spekulacji, czy cz�ste jedzenie jaj szkodzi czy te� nie. Oczywi�cie </b><br>"
									+ "<b>wiadomo, �e opieraj�c diet� na kilku produktach dorobimy si� niedobor�w jednych sk�adnik�w na rzecz drugich. Specjali�ci twierdz�, i� chc�c utrzyma� </b><br>"
									+ "<b>zbilansowan� diet� powinno zjada� si� nawet do trzech ca�ych jaj dziennie. Trzeba zaznaczy�, �e nie znaleziono nigdy powi�zania mi�dzy spo�ywaniem </b><br>"
									+ "<b>jaj a chorob� wie�cow�. Cholesterol uzyskujemy nie tylko z po�ywienia, ale tak�e nasz organizm sam potrafi wytworzy� znaczne </b><br>"
									+ "<b>jego ilo�ci w w�trobie. W momencie gdy dostarczamy go wi�cej z po�ywienia, wtedy w�troba zaczyna wytwarza� go nieco mniej. Skutkiem tego jest </b><br>"
									+ "<b>to, �e stan cholesterolu nie ulega zbyt drastycznym zmianom. Trzeba wiedzie�, �e tzw. \"z�y cholesterol\" (LDL) wp�ywa na produkcj� z�og�w,</b><br>"
									+ "<b>kt�re mog� zatka� t�tnice, jednocze�nie zwi�kszaj�c tym ryzyko chor�b serca. Jest jeszcze \"dobry cholesterol \" (HDL), kt�ry oczyszcza </b><br>"
									+ "<b>naczynia krwiono�ne przenosz�c cholesterol LDL z powrotem do w�troby, celem jego rozk�adu. Jajka posiadaj� du�e ilo�ci cholesterolu HDL, </b><br>"
									+ "<b>zatem spo�ywanie ich to dla nas sama korzy��.</b><br>",
							ContentMode.HTML);

					throughtExplanationOfNutritionalAdviceThirteen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceThirteen
							.setStyleName("throughtExplanationOfNutritionalAdviceThirteen");
					throughtExplanationOfNutritionalAdviceThirteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceThirteen);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceThirteenContentMenuLayout().init();
	}
}
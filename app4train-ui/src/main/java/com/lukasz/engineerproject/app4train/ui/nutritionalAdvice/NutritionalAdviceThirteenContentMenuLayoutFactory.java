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
							"<b><br><br>Oprócz walorów smakowych, posiadaj¹ one bardzo du¿¹ wartoœæ od¿ywcz¹, ró¿norodne witaminy i minera³y.  S¹ uzupe³nieniem naszej</b><br>"
									+ "<b>diety a w dodatku to jedno z najlepszych i najtañszych Ÿróde³ bia³ka. Wiele jest spekulacji, czy czêste jedzenie jaj szkodzi czy te¿ nie. Oczywiœcie </b><br>"
									+ "<b>wiadomo, ¿e opieraj¹c dietê na kilku produktach dorobimy siê niedoborów jednych sk³adników na rzecz drugich. Specjaliœci twierdz¹, i¿ chc¹c utrzymaæ </b><br>"
									+ "<b>zbilansowan¹ dietê powinno zjadaæ siê nawet do trzech ca³ych jaj dziennie. Trzeba zaznaczyæ, ¿e nie znaleziono nigdy powi¹zania miêdzy spo¿ywaniem </b><br>"
									+ "<b>jaj a chorob¹ wieñcow¹. Cholesterol uzyskujemy nie tylko z po¿ywienia, ale tak¿e nasz organizm sam potrafi wytworzyæ znaczne </b><br>"
									+ "<b>jego iloœci w w¹trobie. W momencie gdy dostarczamy go wiêcej z po¿ywienia, wtedy w¹troba zaczyna wytwarzaæ go nieco mniej. Skutkiem tego jest </b><br>"
									+ "<b>to, ¿e stan cholesterolu nie ulega zbyt drastycznym zmianom. Trzeba wiedzieæ, ¿e tzw. \"z³y cholesterol\" (LDL) wp³ywa na produkcjê z³ogów,</b><br>"
									+ "<b>które mog¹ zatkaæ têtnice, jednoczeœnie zwiêkszaj¹c tym ryzyko chorób serca. Jest jeszcze \"dobry cholesterol \" (HDL), który oczyszcza </b><br>"
									+ "<b>naczynia krwionoœne przenosz¹c cholesterol LDL z powrotem do w¹troby, celem jego rozk³adu. Jajka posiadaj¹ du¿e iloœci cholesterolu HDL, </b><br>"
									+ "<b>zatem spo¿ywanie ich to dla nas sama korzyœæ.</b><br>",
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
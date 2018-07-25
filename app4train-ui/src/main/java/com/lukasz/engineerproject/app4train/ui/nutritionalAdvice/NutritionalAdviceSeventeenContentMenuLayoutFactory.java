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
							"<b><br><br>•	Silnie uzale¿nia, poniewa¿ oddzia³uje na te same obszary w mózgu jak narkotyki. Odstawienie go powoduje niepokój, depresjê, k³opoty z koncentracj¹. </b><br>"
									+ "<b>•	Zaburzenia uk³adu pokarmowego, poniewa¿ cukier niszczy jelita Od jelit wszystko siê zaczyna, w zwi¹zku z tym ka¿de zachwianie flory </b><br>"
									+ "<b>bakteryjnej stanowi ryzyko wyst¹pienia nowych schorzeñ obejmuj¹ce inne czêœci cia³a.</b><br>"
									+ "<b>•	Os³abienie odpornoœci, poniewa¿ jak wskazuj¹ badania, spo¿ycie cukru os³abia uk³ad odpornoœciowy. Du¿e spo¿ycie cukru wp³ywa na </b><br>"
									+ "<b>to, ¿e jesteœmy te¿ bardziej podatni na choroby oraz infekcje.</b><br>"
									+ "<b>•	Zwiêksza ryzyko wyst¹pienia chorób nowotworowych piersi, w¹troby, przewodu pokarmowego, p³uc i innych. </b><br>"
									+ "<b>•	Zaburza gospodarkê hormonaln¹, poniewa¿ posi³ek bogaty w cukry proste skutkuje gwa³townym wzrostem glukozy we krwi. </b><br>"
									+ "<b>Konsekwencj¹ tego jest insulinoopornoœæ, cukrzyca lub zespó³ policystycznych jajników.</b><br>"
									+ "<b>•	Powoduje wiele ró¿nych chorób i dolegliwoœci jak choroby serca i kr¹¿enia, astma, mia¿d¿yca, oty³oœæ, próchnica, padaczka, ¿ylaki,  </b><br>"
									+ "<b>stwardnienie rozsiane i wiele innych. Cukier to zagro¿eniem dla ka¿dej czêœci naszego organizmu, niszczy go i doprowadza do wyniszczenia. </b><br>",
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
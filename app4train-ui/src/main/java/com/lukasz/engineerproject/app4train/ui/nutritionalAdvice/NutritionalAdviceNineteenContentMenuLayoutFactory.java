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
public class NutritionalAdviceNineteenContentMenuLayoutFactory {

	private class NutritionalAdviceNineteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceNineteen;
		private Button buttonForWindow;

		public NutritionalAdviceNineteenContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceNineteen = new Label(NutritionalAdvicesTitles.TOPIC_NINETEEN.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceNineteen);
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
					throughtExplanationOfNutritionalAdviceNineteen = new Label(
							"<h4><br>Zrezygnuj z przetworzonych produktów!</h4>"
									+ "<b>Sól posiada ró¿ne w³aœciwoœci. Najbardziej niezdrow¹ jest sól rafinowana. Wystêpuje ona w wielu przetworzonych produktach, jak: sosy, przyprawy,</b><br>"
									+ "<b>czy zupy. Spo¿ycie takiej soli nale¿y niezw³ocznie ograniczyæ do minimum, a najlepiej przestaæ z niej w ogóle korzystaæ. To od nas zale¿y, jaki mamy </b><br>"
									+ "<b>stan zdrowia. 90% nowotworów jest wynika z nieodpowiedniego trybu ¿ycia i niezdrowej diety. Negatywnym skutkiem rafinowanej soli jest nadciœnienie</b><br>"
									+ "<b>têtnicze, udaru mózgu zaburzenia rytmu serca, oty³oœæ. </b>"
									+ "<h4>Czy sól jest niezbêdna do ¿ycia?</h4>"
									+ "<b>Prawda jest taka, ¿e sól jest nam bardzo potrzebna. Naturalna, nieprzetworzona sól odpowiada za regulacjê iloœæ wody wewn¹trzkomórkowej oraz  </b><br>"
									+ "<b>zewn¹trzkomórkowej. Jej nadmiar, jak i niedobór mo¿e prowadziæ do obrzêku mózgu oraz zaburzeñ oddychania.</b>"
									+ "<h4>Jaka sól jest najzdrowsza?</h4>"
									+ "<b>Jedn¹ z  nich jest nierafinowana sól morska ,która powstaje przez odparowanie wody morskiej. Ma nisk¹ zawartoœæ sodu, posiada te¿ magnez, lit i cynk.</b><br>"
									+ "<b>Sól himalajska  uwa¿ana jest za najczystsz¹ sól. Wydobywa siê j¹ rêcznie. Posiada magnez, siarczany i ¿elazo. Pomaga przy schorzeniach stawów, ciœnienia,</b><br>"
									+ "<b>a nawet spowalnia procesy starzenia. Nasze polskie, naturalne bogactwo to nieprzetworzona i bogata w wiele minera³ów kamienna sól k³odawska. </b><br>"
									+ "<b>Biopierwiastki soli k³odawskiej s¹ ³atwo przyswajalne. Oprócz sodu zawiera ¿elazo, wapñ, cynk i potas.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceNineteen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceNineteen
							.setStyleName("throughtExplanationOfNutritionalAdviceNineteen");
					throughtExplanationOfNutritionalAdviceNineteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceNineteen);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceNineteenContentMenuLayout().init();
	}
}
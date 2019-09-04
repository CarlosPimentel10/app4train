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
							"<h4><br>Zrezygnuj z przetworzonych produkt�w!</h4>"
									+ "<b>S�l posiada r�ne w�a�ciwo�ci. Najbardziej niezdrow� jest s�l rafinowana. Wyst�puje ona w wielu przetworzonych produktach, jak: sosy, przyprawy,</b><br>"
									+ "<b>czy zupy. Spo�ycie takiej soli nale�y niezw�ocznie ograniczy� do minimum, a najlepiej przesta� z niej w og�le korzysta�. To od nas zale�y, jaki mamy </b><br>"
									+ "<b>stan zdrowia. 90% nowotwor�w jest wynika z nieodpowiedniego trybu �ycia i niezdrowej diety. Negatywnym skutkiem rafinowanej soli jest nadci�nienie</b><br>"
									+ "<b>t�tnicze, udaru m�zgu zaburzenia rytmu serca, oty�o��. </b>"
									+ "<h4>Czy s�l jest niezb�dna do �ycia?</h4>"
									+ "<b>Prawda jest taka, �e s�l jest nam bardzo potrzebna. Naturalna, nieprzetworzona s�l odpowiada za regulacj� ilo�� wody wewn�trzkom�rkowej oraz  </b><br>"
									+ "<b>zewn�trzkom�rkowej. Jej nadmiar, jak i niedob�r mo�e prowadzi� do obrz�ku m�zgu oraz zaburze� oddychania.</b>"
									+ "<h4>Jaka s�l jest najzdrowsza?</h4>"
									+ "<b>Jedn� z  nich jest nierafinowana s�l morska ,kt�ra powstaje przez odparowanie wody morskiej. Ma nisk� zawarto�� sodu, posiada te� magnez, lit i cynk.</b><br>"
									+ "<b>S�l himalajska  uwa�ana jest za najczystsz� s�l. Wydobywa si� j� r�cznie. Posiada magnez, siarczany i �elazo. Pomaga przy schorzeniach staw�w, ci�nienia,</b><br>"
									+ "<b>a nawet spowalnia procesy starzenia. Nasze polskie, naturalne bogactwo to nieprzetworzona i bogata w wiele minera��w kamienna s�l k�odawska. </b><br>"
									+ "<b>Biopierwiastki soli k�odawskiej s� �atwo przyswajalne. Opr�cz sodu zawiera �elazo, wap�, cynk i potas.</b><br>",
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
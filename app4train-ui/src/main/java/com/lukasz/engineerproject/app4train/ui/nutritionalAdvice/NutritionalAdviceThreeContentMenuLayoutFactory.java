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
public class NutritionalAdviceThreeContentMenuLayoutFactory {

	private class NutritionalAdviceThreeContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceThree;
		private Button buttonForWindow;

		public NutritionalAdviceThreeContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceThree = new Label(NutritionalAdvicesTitles.TOPIC_THREE.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceThree);
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
					throughtExplanationOfNutritionalAdviceThree = new Label(
							"<b><br><br>Nie jest to wyb�r najbardziej optymalny. Lepsze rezultaty osi�gniemy jedz�c od czterech, do nawet sze�ciu razy dziennie.</b><br>"
									+ "<b>Do zalet spo�ywania 5, 6 a nawet i 7 posi�k�w dziennie wymieni� mo�na zapanowanie nad g�odem i opanowanie ch�ci na podjadanie.</b><br>"
									+ "<b>Jedz�c mniej, a cz�ciej mo�na jednocze�nie przyspieszy� metabolizm. Czasami jednak mo�e by� tak, �e posi�ki s� za ma�e. </b><br>"
									+ "<b>Skutkiem tego jest brak satysfakcji oraz ochota do podjadania. Wysoka cz�stotliwo�� posi�k�w oczywi�cie ma swoje zalety, ale tak�e </b><br>"
									+ "<b>pewne wady. Nie powinno si� traktowa� jej, jako uniwersalnego zalecenia dla ka�dego, kto chce od�ywia� si� zdrowo lub redukowa� tkank� </b><br>"
									+ "<b>t�uszczow�. Jaka jest wi�c ilo�� posi�k�w jest optymalna? Jest to kwestia indywidualna i nale�y o tym pami�ta�. Podstawow� </b><br>"
									+ "<b>kwesti� jest ilo�� kalorii dostarczonych wraz z diet� w trakcie dnia. Kwesti� drugorz�dn� jest roz�o�enie spo�ywanych kalorii </b><br>"
									+ "<b>na posi�ki w trakcie dnia. Je�li decydujemy si� spo�ywa� 3 g��wne posi�ki dziennie musimy zapewni� w nich odpowiedni� ilo�ci </b><br>"
									+ "<b>kalorii, bia�ka, w�glowodan�w, t�uszcz�w, a tak�e witamin i mikroelement�w. Przyk�ad�w roz�o�enia kalorii na trzy posi�ki jest kilka.  </b><br>"
									+ "<b>Ja przedstawiam przyk�ad, gdy trenujemy w godzinach popo�udniowych. �niadanie obejmuje 20-25% dziennej poda�y kalorii. Na �niadanie </b><br>"
									+ "<b>�niadanie obejmuje 20-25% dziennej poda�y kalorii. Na �niadanie sprawdz� si� np. jajecznica, jajka sadzone, gotowane, omlety i wszelkiego rodzaju sa�atki.</b><br>"
									+ "<b>Obiad to w tym wypadku spo�ywany przed treningiem zawiera 20-25% dziennej poda�y kalorii. Zbyt obfity posi�ek przed </b><br>"
									+ "<b>treningiem nie jest najlepszym rozwi�zaniem, poniewa� nadmiernie obci��amy wtedy uk�adu pokarmowego. Mo�na skorzysta� z drobiu, chudej </b><br>"
									+ "<b>wo�owiny, ryb. Zjedzmy je z batatami, ry�em lub kasz� b�d�ce sk�adnikami z�o�onych w�glowodan�w o do�� niskim indeksie glikemicznym.</b><br>"
									+ "<b>Po treningu dostarczamy oko�o 30-40 gram�w bia�ka co wp�ynie na syntez� bia�ek mi�niowych.</b><br>"
									+ "<b>Kolacja stanowi� b�dzie najwi�kszy posi�ek zawieraj�cy 50-60% dziennego zapotrzebowania na energi�.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceThree
							.setStyleName("throughtExplanationOfNutritionalAdviceThree");
					throughtExplanationOfNutritionalAdviceThree.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfNutritionalAdviceThree.setSizeUndefined();
					window.setContent(throughtExplanationOfNutritionalAdviceThree);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceThreeContentMenuLayout().init();
	}
}
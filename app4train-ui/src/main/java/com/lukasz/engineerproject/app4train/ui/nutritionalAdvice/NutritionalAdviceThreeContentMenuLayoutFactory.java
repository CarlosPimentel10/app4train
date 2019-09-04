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
							"<b><br><br>Nie jest to wybór najbardziej optymalny. Lepsze rezultaty osi¹gniemy jedz¹c od czterech, do nawet szeœciu razy dziennie.</b><br>"
									+ "<b>Do zalet spo¿ywania 5, 6 a nawet i 7 posi³ków dziennie wymieniæ mo¿na zapanowanie nad g³odem i opanowanie chêci na podjadanie.</b><br>"
									+ "<b>Jedz¹c mniej, a czêœciej mo¿na jednoczeœnie przyspieszyæ metabolizm. Czasami jednak mo¿e byæ tak, ¿e posi³ki s¹ za ma³e. </b><br>"
									+ "<b>Skutkiem tego jest brak satysfakcji oraz ochota do podjadania. Wysoka czêstotliwoœæ posi³ków oczywiœcie ma swoje zalety, ale tak¿e </b><br>"
									+ "<b>pewne wady. Nie powinno siê traktowaæ jej, jako uniwersalnego zalecenia dla ka¿dego, kto chce od¿ywiaæ siê zdrowo lub redukowaæ tkankê </b><br>"
									+ "<b>t³uszczow¹. Jaka jest wiêc iloœæ posi³ków jest optymalna? Jest to kwestia indywidualna i nale¿y o tym pamiêtaæ. Podstawow¹ </b><br>"
									+ "<b>kwesti¹ jest iloœæ kalorii dostarczonych wraz z diet¹ w trakcie dnia. Kwesti¹ drugorzêdn¹ jest roz³o¿enie spo¿ywanych kalorii </b><br>"
									+ "<b>na posi³ki w trakcie dnia. Jeœli decydujemy siê spo¿ywaæ 3 g³ówne posi³ki dziennie musimy zapewniæ w nich odpowiedni¹ iloœci </b><br>"
									+ "<b>kalorii, bia³ka, wêglowodanów, t³uszczów, a tak¿e witamin i mikroelementów. Przyk³adów roz³o¿enia kalorii na trzy posi³ki jest kilka.  </b><br>"
									+ "<b>Ja przedstawiam przyk³ad, gdy trenujemy w godzinach popo³udniowych. Œniadanie obejmuje 20-25% dziennej poda¿y kalorii. Na œniadanie </b><br>"
									+ "<b>Œniadanie obejmuje 20-25% dziennej poda¿y kalorii. Na œniadanie sprawdz¹ siê np. jajecznica, jajka sadzone, gotowane, omlety i wszelkiego rodzaju sa³atki.</b><br>"
									+ "<b>Obiad to w tym wypadku spo¿ywany przed treningiem zawiera 20-25% dziennej poda¿y kalorii. Zbyt obfity posi³ek przed </b><br>"
									+ "<b>treningiem nie jest najlepszym rozwi¹zaniem, poniewa¿ nadmiernie obci¹¿amy wtedy uk³adu pokarmowego. Mo¿na skorzystaæ z drobiu, chudej </b><br>"
									+ "<b>wo³owiny, ryb. Zjedzmy je z batatami, ry¿em lub kasz¹ bêd¹ce sk³adnikami z³o¿onych wêglowodanów o doœæ niskim indeksie glikemicznym.</b><br>"
									+ "<b>Po treningu dostarczamy oko³o 30-40 gramów bia³ka co wp³ynie na syntezê bia³ek miêœniowych.</b><br>"
									+ "<b>Kolacja stanowiæ bêdzie najwiêkszy posi³ek zawieraj¹cy 50-60% dziennego zapotrzebowania na energiê.</b><br>",
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
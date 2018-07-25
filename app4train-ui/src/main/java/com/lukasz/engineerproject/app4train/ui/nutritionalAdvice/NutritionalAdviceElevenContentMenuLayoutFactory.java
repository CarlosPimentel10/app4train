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
public class NutritionalAdviceElevenContentMenuLayoutFactory {

	private class NutritionalAdviceElevenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceEleven;
		private Label topicOfOfNutritionalAdviceEleven;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceElevenContentMenuLayout init() {

			topicOfOfNutritionalAdviceEleven = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_ELEVEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceEleven = new Label(
							"<b><br><br>Olej kokosowy w ostatnich czasach to jeden z najbardziej porz�dnych olej�w w�r�d aktywnych os�b.</b>"
									+ "<h4>Czym jest olej kokosowy?</h4>"
									+ "<b>Olej kokosowy to olej ro�linny, kt�ry otrzymujemy z t�oczenia oraz rozgrzania mi��szu kokosa. Kupi� mo�emy dwie jego odmiany:</b><br>"
									+ "<b>�	olej kokosowy nierafinowany, posiadaj�cy bardzo przyjemny, kokosowy zapach i smak. Nie zmienia jednak smaku potraw.</b><br>"
									+ "<b>Mo�na go wykorzystywa� do sma�enia.</b><br>"
									+ "<b>Oba te oleje mog� by� poddawane do�� wysokim temperaturom. </b>"
									+ "<h4>Olej kokosowy winny hipercholesterolemii?</h4>"
									+ "<b>Jaki� czas temu m�wiono, �e olej kokosowy, podnosi poziom �z�ego� cholesterolu, czyli frakcji LDL. Badania przeprowadzone w Instytucie </b><br>"
									+ "<b>Fizjologii i Biofizyki KPC Medical College and Hospital, zaprzecza tej tezie. Olej kokosowy obni�a poziom cholesterolu frakcji LDL, jak r�wnie� obni�a </b><br>"
									+ "<b>znacz�co poziom tr�jgliceryd�w. Co wi�cej, naukowcy ci stwierdzili, i� dzia�a on przeciwzakrzepowo i przeciwmia�d�ycowo, co w zupe�no�ci burzy </b><br>"
									+ "<b>teorie, wymy�lon� przez marketingowc�w. </b>" + "<h4>Podsumowanie</h4>"
									+ "<b>Nie powinni�my si� obawia� oleju kokosowego. Wprowadzenie go do swojej diety przyniesie korzy�� dla twojego zdrowia. Oczywi�cie nie </b><br>"
									+ "<b>powinien w diecie stanowi� tylko jedynego �r�d�a t�uszczu. Podstawow� kwesti� zdrowego od�ywiania jest urozmaicenie. Tylko wtedy na pewno</b><br>"
									+ "<b>b�dziemy mieli �adnych niedobor�w.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceEleven
							.setStyleName("throughtExplanationOfNutritionalAdviceEleven");
					throughtExplanationOfNutritionalAdviceEleven.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfNutritionalAdviceEleven.setSizeUndefined();
					window.setContent(throughtExplanationOfNutritionalAdviceEleven);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceEleven);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceElevenContentMenuLayout().init();
	}
}
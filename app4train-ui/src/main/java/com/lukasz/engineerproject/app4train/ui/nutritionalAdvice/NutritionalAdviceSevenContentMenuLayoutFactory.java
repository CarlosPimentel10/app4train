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
public class NutritionalAdviceSevenContentMenuLayoutFactory {

	private class NutritionalAdviceSevenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceSeven;
		private Button buttonForWindow;

		public NutritionalAdviceSevenContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceSeven = new Label(NutritionalAdvicesTitles.TOPIC_SEVEN.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceSeven);
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
					throughtExplanationOfNutritionalAdviceSeven = new Label("<br><h4>Jaja</h4>"
							+ "<b>To idealny produkt, kt�ry mo�emy wykorzysta� na �niadanie. Zwykle ka�dy z nas lubi jajecznic�, omlety czy te� jaja na bekonie.</b><br>"
							+ "<b>Jaja zawieraj� du�y dodatek kaloryczny dla naszej diety. Sk�adaj� si� z  kwas�w omega-3, pe�nowarto�ciowego bia�ka, kt�re maj� profil </b><br>"
							+ "<b>aminokwas�w o idealnej konfiguracji, bior�c pod uwag� nasz� muskulatur�. Posiadaj� r�wnie� cholesterol, kt�ry jest konieczny do </b><br>"
							+ "<b>syntezy testosteronu. </b>" + "<h4>Jogurt grecki i jagody</h4>"
							+ "<b>Osoby nie lubi�ce jaj, stosuj� na �niadanie nabia�, kt�ry r�wnie� b�dzie dobrym sposobem na dostarczenie t�uszczy w porannym posi�ku. Produkty </b><br>"
							+ "<b>typu jogurt grecki, posiadaj� t�uszcze nasycone, kt�re �atwo wykorzystywane s� przez nas na potrzeby energetyczne. Dostarczana z </b><br>"
							+ "<b>nich energia jest bardzo szybko metabolizowana przez nasz organizm. Ponadto dzi�ki niemu d�ugo b�dziemy chodzili nasyceni. Jagody s� </b><br>"
							+ "<b>doskona�ym dodatkiem do jogurtu, daj�c �wie�y smak, ale i stanowi� doskona�e �r�d�o antyoksydant�w.</b>"
							+ "<h4>Od�ywka bia�kowa</h4>"
							+ "<b>Stanowi alternatyw� dla os�b, kt�re z rana nie maj� apetytu. Wykorzystuj�c dobrej jako�ci szejk bia�kowy, pozwoli nam do�adowa� </b><br>"
							+ "<b>swoje mi�nie aminokwasami z samego rana. Pomimo, �e nie b�dzie to posi�ek bardzo syty, b�dzie stanowi� dobr� opcj�, na pocz�tek dnia.</b>"
							+ "<h4>Pe�noziarniste tosty z mas�em orzechowym</h4>"
							+ "<b>To dobra opcja dla tych, kt�rzy lubi� w�glowodany w pierwszym posi�ku dnia. Mas�o orzechowe powinno wywodzi� si� z migda��w lub nerkowc�w. </b><br>"
							+ "<b>Lepiej unika� mas�a z orzech�w arachidowych, poniewa� ich pochodzenie nie jest do ko�ca pewne. Posi�ek ten nie zawiera du�ej ilo�ci bia�ka, jednak </b><br>"
							+ "<b>potrafi dostarczy� spory zastrzyk energii, kt�ry ograniczy g��d na d�ugi czas. </b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceSeven.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceSeven
							.setStyleName("throughtExplanationOfNutritionalAdviceSeven");
					throughtExplanationOfNutritionalAdviceSeven.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceSeven);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceSevenContentMenuLayout().init();
	}
}
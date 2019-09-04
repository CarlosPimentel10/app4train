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
							+ "<b>To idealny produkt, który mo¿emy wykorzystaæ na œniadanie. Zwykle ka¿dy z nas lubi jajecznicê, omlety czy te¿ jaja na bekonie.</b><br>"
							+ "<b>Jaja zawieraj¹ du¿y dodatek kaloryczny dla naszej diety. Sk³adaj¹ siê z  kwasów omega-3, pe³nowartoœciowego bia³ka, które maj¹ profil </b><br>"
							+ "<b>aminokwasów o idealnej konfiguracji, bior¹c pod uwagê nasz¹ muskulaturê. Posiadaj¹ równie¿ cholesterol, który jest konieczny do </b><br>"
							+ "<b>syntezy testosteronu. </b>" + "<h4>Jogurt grecki i jagody</h4>"
							+ "<b>Osoby nie lubi¹ce jaj, stosuj¹ na œniadanie nabia³, który równie¿ bêdzie dobrym sposobem na dostarczenie t³uszczy w porannym posi³ku. Produkty </b><br>"
							+ "<b>typu jogurt grecki, posiadaj¹ t³uszcze nasycone, które ³atwo wykorzystywane s¹ przez nas na potrzeby energetyczne. Dostarczana z </b><br>"
							+ "<b>nich energia jest bardzo szybko metabolizowana przez nasz organizm. Ponadto dziêki niemu d³ugo bêdziemy chodzili nasyceni. Jagody s¹ </b><br>"
							+ "<b>doskona³ym dodatkiem do jogurtu, daj¹c œwie¿y smak, ale i stanowi¹ doskona³e Ÿród³o antyoksydantów.</b>"
							+ "<h4>Od¿ywka bia³kowa</h4>"
							+ "<b>Stanowi alternatywê dla osób, które z rana nie maj¹ apetytu. Wykorzystuj¹c dobrej jakoœci szejk bia³kowy, pozwoli nam do³adowaæ </b><br>"
							+ "<b>swoje miêœnie aminokwasami z samego rana. Pomimo, ¿e nie bêdzie to posi³ek bardzo syty, bêdzie stanowiæ dobr¹ opcjê, na pocz¹tek dnia.</b>"
							+ "<h4>Pe³noziarniste tosty z mas³em orzechowym</h4>"
							+ "<b>To dobra opcja dla tych, którzy lubi¹ wêglowodany w pierwszym posi³ku dnia. Mas³o orzechowe powinno wywodziæ siê z migda³ów lub nerkowców. </b><br>"
							+ "<b>Lepiej unikaæ mas³a z orzechów arachidowych, poniewa¿ ich pochodzenie nie jest do koñca pewne. Posi³ek ten nie zawiera du¿ej iloœci bia³ka, jednak </b><br>"
							+ "<b>potrafi dostarczyæ spory zastrzyk energii, który ograniczy g³ód na d³ugi czas. </b><br>",
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
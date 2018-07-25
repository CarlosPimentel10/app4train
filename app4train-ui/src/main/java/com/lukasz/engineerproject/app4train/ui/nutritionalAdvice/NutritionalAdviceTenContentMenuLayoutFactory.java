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
public class NutritionalAdviceTenContentMenuLayoutFactory {

	private class NutritionalAdviceTenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceTen;
		private Label topicOfOfNutritionalAdviceTen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public NutritionalAdviceTenContentMenuLayout init() {

			topicOfOfNutritionalAdviceTen = new Label(UtilsForNutritionalAdvicesTitles.TOPIC_TEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceTen = new Label("<br><h4>Woda to ¿ycie</h4>"
							+ "<b>Woda jest substancj¹, utrzymuj¹c¹ ciê przy ¿yciu. Trzeba zdaæ sobie sprawê z tego, ¿e Cia³o cz³owieka sk³ada z ok. 70% z wody. Procentowa </b><br>"
							+ "<b>wartoœæ wody w bezt³uszczowej masie cia³a, je¿eli chodzi u osobê doros³¹ jest na sta³ym poziomie i wynosi 75%. W tkankach mo¿e byæ równa </b><br>"
							+ "<b>wartoœæ wody np. w miêœniach jest 74-80% wody, w p³ucach oko³o 80%, w w¹trobie oko³o 68%, a koœciach oko³o 25%. Ró¿nice w zawartoœci wody </b><br>"
							+ "<b>w ludzkim organizmie wynikaj¹ z wieku, p³ci, a tak¿e z budowy cia³a. Woda pe³ni wa¿ne funkcje w naszym organizmie, a z racji tego tracimy jej </b><br>"
							+ "<b>znaczne iloœci wraz z potem, moczem, oraz podczas oddychania, musimy j¹ na bie¿¹co uzupe³niaæ. Cz³owiek mo¿e przetrwaæ nawet 3 tygodnie bez </b><br>"
							+ "<b>pokarmu, bez wody jedynie 3 dni.</b>"
							+ "<h4>Woda jest niezbêdna w procesie trawienia</h4>"
							+ "<b>Formowanie kêsów, prze³ykanie, a tak¿e dalszy ich transport w przewodzie pokarmowym wymaga odpowiedniej zawartoœci wody w œlinie </b><br>"
							+ "<b>oraz soku ¿o³¹dkowym, jelitowym czy te¿ ¿ó³ci. Brak wody powoduje zaburzenie tych procesów.</b>"
							+ "<h4>Woda poprawia samopoczucie i wydolnoœæ organizmu</h4>"
							+ "<b>Odwodnienie organizmu wp³ywa na sprawnoœæ umys³ow¹. Wi¹¿e siê z nastêpuj¹cymi objawami np. zmêczenie, pogorszenie pamiêci, </b><br>"
							+ "<b>rozkojarzenie, pogorszenie nastroju. Nie powinno nas to dziwiæ dlatego, ¿e Nasz mózg sk³ada siê z 80% wody.</b>"
							+ "<h4>Woda oczyszcza</h4>"
							+ "<b>Wraz z wydalan¹ przez nerki wod¹ z organizmu usuwane s¹ substancje przemiany materii. Odpowiednie nawodnienie organizmu </b><br>"
							+ "<b>pozwala na sprawne usuwanie toksyn z organizmu.</b>"
							+ "<h4>Woda pomaga utrzymaæ prawid³ow¹ masê cia³a</h4>"
							+ "<b>W przeciwieñstwie do soków oraz s³odkich napojów, woda nie posiada kalorii. W dodatku woda wype³nia ¿o³¹dek, co powoduje, ¿e jesteœmy bardziej syci. </b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceTen.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceTen.setStyleName("throughtExplanationOfNutritionalAdviceTen");
					throughtExplanationOfNutritionalAdviceTen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceTen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceTen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceTenContentMenuLayout().init();
	}
}
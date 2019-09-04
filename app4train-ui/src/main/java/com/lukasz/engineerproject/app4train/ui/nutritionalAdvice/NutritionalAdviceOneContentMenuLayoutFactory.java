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
public class NutritionalAdviceOneContentMenuLayoutFactory {

	private class NutritionalAdviceOneContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceOne;
		private Button buttonForWindow;

		public NutritionalAdviceOneContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceOne = new Label(NutritionalAdvicesTitles.TOPIC_ONE.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceOne);
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
					throughtExplanationOfNutritionalAdviceOne = new Label(
							"<b><br><br>Obecnie tematem przewodnim jest ser, z którym zwi¹zanych jest ostatnio wiele debat. Boimy siê zarówno wêglowodanów,</b><br>"
									+ "<b>jak i t³uszczy, ale przecie¿ wszystkie makrosk³adniki (bia³ko, t³uszcze, wêglowodany) s¹ dla nas niezbêdne. Zwykle jest tak,  </b><br>"
									+ "<b>¿e t³uszcz wystêpuje w œladowych iloœciach w naszej diecie z obawy przed przytyciem. Wp³ywa to na pogorszenie naszych parametrów zdrowotnych.</b><br>"
									+ "<b>Czy rezygnacja z t³uszczy jest konieczna?. Trzeba zdaæ sobie sprawê z tego, ¿e nasza dieta w ci¹gu dnia sk³adaæ siê powinna z wêglowodanów</b><br>"
									+ "<b>o niskim indeksie glikemicznym (ok. 50-60% dziennego zapotrzebowania na kalorie), bia³ka (20-30 %) i niewielkich iloœci t³uszczy </b><br>"
									+ "<b>(10-15%). Takie proporcje zapewni¹ nam osi¹gniêcie wymarzonej sylwetki. </b><br>"
									+ "<b>Podsumowuj¹c: naukowcy w ostatnich latach coraz czêœciej dostarczaj¹ nam wiele dowodów œwiadcz¹cych o tym, i¿ pe³not³uste jedzenie, a w </b><br>"
									+ "<b>szczególnoœci produkty nabia³owe s¹ nies³usznie demonizowane g³ównie przez lekarzy, a tak¿e dietetyków. T³uszcz od zawsze kojarzony by³  </b><br>"
									+ "<b>przez nas z tyciem. Mo¿na to zaobserwowaæ wœród producentów, którzy zaczêli produkowaæ produkty tzw. „light”, „zero”, „bez t³uszczu” czy „bez cukru”. </b><br>"
									+ "<b> Trzeba mieæ œwiadomoœæ tego w sk³adzie tych produktów mamy wiele zbêdnych dodatków, sztucznych barwników, aromatów oraz substancji </b><br>"
									+ "<b>s³odz¹cych. Nie ma tutaj ¿adnego powi¹zania z naturalnym produktem. Tyczy siê to równie¿ zdrowia. W zwi¹zku z tym pe³not³uste produkty </b><br>"
									+ "<b>spo¿ywcze mog¹ tak naprawdê okazaæ siê zdecydowanie bardziej wartoœciowym sk³adnikiem naszej diety ni¿ ich „odt³uszczone” odpowiedniki.</b><br>"
									+ "<b>Obecnoœæ pe³not³ustych serów, jak równie¿ innych mlecznych produktów spo¿ywczych jest wskazana w naszej codziennej diecie, zachowuj¹c </b><br>"
									+ "<b>przy tym odpowiednie iloœci.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceOne.setStyleName("throughtExplanationOfNutritionalAdviceOne");
					throughtExplanationOfNutritionalAdviceOne.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceOne.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceOne);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceOneContentMenuLayout().init();
	}
}
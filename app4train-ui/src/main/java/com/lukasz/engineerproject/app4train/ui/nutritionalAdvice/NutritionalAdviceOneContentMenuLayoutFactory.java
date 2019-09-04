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
							"<b><br><br>Obecnie tematem przewodnim jest ser, z kt�rym zwi�zanych jest ostatnio wiele debat. Boimy si� zar�wno w�glowodan�w,</b><br>"
									+ "<b>jak i t�uszczy, ale przecie� wszystkie makrosk�adniki (bia�ko, t�uszcze, w�glowodany) s� dla nas niezb�dne. Zwykle jest tak,  </b><br>"
									+ "<b>�e t�uszcz wyst�puje w �ladowych ilo�ciach w naszej diecie z obawy przed przytyciem. Wp�ywa to na pogorszenie naszych parametr�w zdrowotnych.</b><br>"
									+ "<b>Czy rezygnacja z t�uszczy jest konieczna?. Trzeba zda� sobie spraw� z tego, �e nasza dieta w ci�gu dnia sk�ada� si� powinna z w�glowodan�w</b><br>"
									+ "<b>o niskim indeksie glikemicznym (ok. 50-60% dziennego zapotrzebowania na kalorie), bia�ka (20-30 %) i niewielkich ilo�ci t�uszczy </b><br>"
									+ "<b>(10-15%). Takie proporcje zapewni� nam osi�gni�cie wymarzonej sylwetki. </b><br>"
									+ "<b>Podsumowuj�c: naukowcy w ostatnich latach coraz cz�ciej dostarczaj� nam wiele dowod�w �wiadcz�cych o tym, i� pe�not�uste jedzenie, a w </b><br>"
									+ "<b>szczeg�lno�ci produkty nabia�owe s� nies�usznie demonizowane g��wnie przez lekarzy, a tak�e dietetyk�w. T�uszcz od zawsze kojarzony by�  </b><br>"
									+ "<b>przez nas z tyciem. Mo�na to zaobserwowa� w�r�d producent�w, kt�rzy zacz�li produkowa� produkty tzw. �light�, �zero�, �bez t�uszczu� czy �bez cukru�. </b><br>"
									+ "<b> Trzeba mie� �wiadomo�� tego w sk�adzie tych produkt�w mamy wiele zb�dnych dodatk�w, sztucznych barwnik�w, aromat�w oraz substancji </b><br>"
									+ "<b>s�odz�cych. Nie ma tutaj �adnego powi�zania z naturalnym produktem. Tyczy si� to r�wnie� zdrowia. W zwi�zku z tym pe�not�uste produkty </b><br>"
									+ "<b>spo�ywcze mog� tak naprawd� okaza� si� zdecydowanie bardziej warto�ciowym sk�adnikiem naszej diety ni� ich �odt�uszczone� odpowiedniki.</b><br>"
									+ "<b>Obecno�� pe�not�ustych ser�w, jak r�wnie� innych mlecznych produkt�w spo�ywczych jest wskazana w naszej codziennej diecie, zachowuj�c </b><br>"
									+ "<b>przy tym odpowiednie ilo�ci.</b><br>",
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
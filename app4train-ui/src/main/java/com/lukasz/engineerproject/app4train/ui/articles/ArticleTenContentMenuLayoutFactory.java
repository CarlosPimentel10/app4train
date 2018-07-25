package com.lukasz.engineerproject.app4train.ui.articles;

import com.lukasz.engineerproject.app4train.utils.UtilsForArticlesTitles;
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
public class ArticleTenContentMenuLayoutFactory {

	private class ArticleTenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleTen;
		private Label topicOfOfArticleTen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleTenContentMenuLayout init() {

			topicOfOfArticleTen = new Label(UtilsForArticlesTitles.TOPIC_TEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleTen = new Label(
							"<b><br><br>�	W godzinach wieczornych poziom kortyzolu zmniejsza si� zwykle aby�my mogli w nocy odpocz�� i zregenerowa� si�. W momencie gdy dobowy cykl</b><br>"
									+ "<b>wydzielania kortyzolu jest zaburzony, to wtedy jego poziom utrzymuje si� na wysokim poziomie w godzinach wieczornych, a my odczuwamy problem z za�ni�ciem. </b><br>"
									+ "<b>Je�eli wieczorem pomimo zm�czenia nie mo�esz zasn��, prawdopodobnie tw�j kortyzol jest zbyt wysoki</b><br>"
									+ "<b>�	Kortyzol swoj� najwy�sz� warto�� osi�ga w chwili wybudzenia ze snu. Dzi�ki niemu mamy rano energi�, aby normalnie funkcjonowa�. Gdy jednak dobowy rytmu </b><br>"
									+ "<b>wydzielania kortyzolu jest zaburzony cz�sto dzieje si� tak, �e rano jego poziom jest za niski, a skutkiem tego jest problem, �eby si� wybudzi�. </b><br>"
									+ "<b>�	Wysoki poziom kortyzolu wp�ywa na odk�adanie si� tkanki t�uszczowej w rejonie pasa. Dzieje si� tak r�wnie� pomimo tego, gdy od�ywiamy si� zdrowo </b><br>"
									+ "<b>i jeste�my aktywni fizycznie.</b><br>"
									+ "<b>�	Wysoki poziom kortyzolu skutkuje, os�abieniem uk�adu odporno�ciowego, co skutkuje tym, �e jeste�my bardziej zagro�eni na dzia�anie wirus�w i bakterii.</b><br>"
									+ "<b>�	Wysoki poziom kortyzolu stanowi ryzyko podwy�szonego poziomu glukozy we krwi, a jednocze�nie samym zwi�ksza ryzyko rozwoju cukrzycy.</b><br>"
									+ "<b>�	Wysoki poziom kortyzolu wp�ywa na wzrost st�enia prolaktyny, kt�ry powoduje nadwra�liwo�� na b�l. W tym okresie nawet najmniejszy b�l g�owy mo�e </b><br>"
									+ "<b>by� mocno odczuwalny. </b><br>"
									+ "<b>Podsumowuj�c: kortyzol jest hormonem, kt�ry mo�e by� zar�wno naszym sprzymierze�cem, jak i wrogiem. Powszechnie panuje opinia, </b><br>"
									+ "<b>i� kortyzol jest z�y i powinno si� go bezwzgl�dnie obni�a�. Nie jest to jednak prawd�. Kortyzol jest nam niezb�dny do funkcjonowania. Naszym  </b><br>"
									+ "<b>wrogiem s� natomiast zaburzenia wydzielania kortyzolu. Wi�c obni�anie jego poziomu ma sens tylko i wy��cznie w okre�lonych sytuacjach.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleTen.setSizeUndefined();
					throughtExplanationOfArticleTen.setStyleName("throughtExplanationOfArticleTen");
					throughtExplanationOfArticleTen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleTen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleTen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleTenContentMenuLayout().init();
	}
}

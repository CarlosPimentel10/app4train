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
							"<b><br><br>•	W godzinach wieczornych poziom kortyzolu zmniejsza siê zwykle abyœmy mogli w nocy odpocz¹æ i zregenerowaæ siê. W momencie gdy dobowy cykl</b><br>"
									+ "<b>wydzielania kortyzolu jest zaburzony, to wtedy jego poziom utrzymuje siê na wysokim poziomie w godzinach wieczornych, a my odczuwamy problem z zaœniêciem. </b><br>"
									+ "<b>Je¿eli wieczorem pomimo zmêczenia nie mo¿esz zasn¹æ, prawdopodobnie twój kortyzol jest zbyt wysoki</b><br>"
									+ "<b>•	Kortyzol swoj¹ najwy¿sz¹ wartoœæ osi¹ga w chwili wybudzenia ze snu. Dziêki niemu mamy rano energiê, aby normalnie funkcjonowaæ. Gdy jednak dobowy rytmu </b><br>"
									+ "<b>wydzielania kortyzolu jest zaburzony czêsto dzieje siê tak, ¿e rano jego poziom jest za niski, a skutkiem tego jest problem, ¿eby siê wybudziæ. </b><br>"
									+ "<b>•	Wysoki poziom kortyzolu wp³ywa na odk³adanie siê tkanki t³uszczowej w rejonie pasa. Dzieje siê tak równie¿ pomimo tego, gdy od¿ywiamy siê zdrowo </b><br>"
									+ "<b>i jesteœmy aktywni fizycznie.</b><br>"
									+ "<b>•	Wysoki poziom kortyzolu skutkuje, os³abieniem uk³adu odpornoœciowego, co skutkuje tym, ¿e jesteœmy bardziej zagro¿eni na dzia³anie wirusów i bakterii.</b><br>"
									+ "<b>•	Wysoki poziom kortyzolu stanowi ryzyko podwy¿szonego poziomu glukozy we krwi, a jednoczeœnie samym zwiêksza ryzyko rozwoju cukrzycy.</b><br>"
									+ "<b>•	Wysoki poziom kortyzolu wp³ywa na wzrost stê¿enia prolaktyny, który powoduje nadwra¿liwoœæ na ból. W tym okresie nawet najmniejszy ból g³owy mo¿e </b><br>"
									+ "<b>byæ mocno odczuwalny. </b><br>"
									+ "<b>Podsumowuj¹c: kortyzol jest hormonem, który mo¿e byæ zarówno naszym sprzymierzeñcem, jak i wrogiem. Powszechnie panuje opinia, </b><br>"
									+ "<b>i¿ kortyzol jest z³y i powinno siê go bezwzglêdnie obni¿aæ. Nie jest to jednak prawd¹. Kortyzol jest nam niezbêdny do funkcjonowania. Naszym  </b><br>"
									+ "<b>wrogiem s¹ natomiast zaburzenia wydzielania kortyzolu. Wiêc obni¿anie jego poziomu ma sens tylko i wy³¹cznie w okreœlonych sytuacjach.</b><br>",
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

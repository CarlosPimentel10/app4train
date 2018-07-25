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
public class ArticleOneContentMenuLayoutFactory {

	private class ArticleOneContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleOne;
		private Label topicOfOfArticleOne;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleOneContentMenuLayout init() {

			topicOfOfArticleOne = new Label(UtilsForArticlesTitles.TOPIC_ONE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleOne = new Label(
							"<b><br><br>Kwestia czêstotliwoœci trenowania w ci¹gu tygodnia powinna byæ odpowiednio rozumiana.  Zwróæ uwagê, ¿e piêæ treningów w</b><br>"
									+ "<b>tygodniu niekoniecznie musi byæ lepsze ni¿ cztery, czy trzy jednostki treningowe. Musimy zdawaæ sobie sprawê z tego, ¿e, </b><br>"
									+ "<b>wiêcej jednostek treningowych w tygodniu nie zawsze dawaæ bêdzie lepsze efekty. Iloœæ treningów w ci¹gu tygodnia powinna byæ uzale¿niona od sta¿u </b><br>"
									+ "<b>treningowego oraz preferencji.</b>" + "<h4>Sta¿ treningowy</h4>"
									+ "<b>Im d³u¿ej posiadamy sta¿ treningowy, tym wiêcej wysi³ku musimy w³o¿yæ w osi¹gniêcie zamierzonych rezultatów. Twoja objêtoœæ treningowa lub intensywnoœæ</b><br>"
									+ "<b> powinna nieustannie wzrastaæ. Mocno upraszczaj¹c, osoby pocz¹tkuj¹ce powinny trenowaæ 3 razy w tygodniu. Z ka¿dym treningiem bêd¹ osi¹ga³y </b><br>"
									+ "<b>coraz to lepsze efekty. Jest to normalny objaw w przypadku osób, które rozpoczynaj¹ dopiero swoje treningi. W przypadku osób bardziej zaawansowanych,</b><br>"
									+ "<b> trzeba mieæ na uwadze, ¿e mog¹ potrzebowaæ 4, 5 a nawet 6 sesji treningowych tygodniowo chc¹c pobudziæ w odpowiedni sposób swoje miêœnie.</b>"
									+ "<h4>Preferencje</h4>"
									+ "<b>Jeœli nie lubisz chodziæ na si³owniê zbyt czêsto, to w takim przypadku nie ma sensu zmuszaæ siê do 5 lub 6 jednostek treningowych w tygodniu. </b><br>"
									+ "<b>Lepiej trenowaæ od 3 do 4 dni w tygodniu i cieszyæ siê efektami bêd¹c na si³owni rzadziej. Jeœli jednak lubisz trenowaæ, i jest to Twoja</b><br>"
									+ "<b>odskocznia od rzeczywiœci, nie jesteœ zmuszony ograniczaæ siê do 3 treningów w tygodniu. Jeœli odpowiednio zaplanujesz objêtoœæ treningow¹,</b><br>"
									+ "<b>nawet w takim przypadku nie przetrenujesz siê. Wymaga to roz³o¿enia w takim przypadku planu treningowego na szeœæ krótszych i l¿ejszych sesji.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleOne.setStyleName("throughtExplanationOfArticleOne");
					throughtExplanationOfArticleOne.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfArticleOne.setSizeUndefined();
					window.setContent(throughtExplanationOfArticleOne);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleOne);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleOneContentMenuLayout().init();
	}
}

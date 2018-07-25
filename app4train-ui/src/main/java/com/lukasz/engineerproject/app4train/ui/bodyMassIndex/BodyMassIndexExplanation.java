package com.lukasz.engineerproject.app4train.ui.bodyMassIndex;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = BodyMassIndexExplanation.NAME, ui = App4TrainMainUI.class)
public class BodyMassIndexExplanation extends VerticalLayout implements View {

	public static final String NAME = "cotojestbmi?";
	private Label labelForExplanation;
	private Panel panel;

	private void addLayout() {

		setMargin(true);
		panel = new Panel("Co to jest BMI?");
		panel.setWidth("100%");
		labelForExplanation = new Label(
				"<b>WskaŸnik masy cia³a (BMI) (ang. Body Mass Index)</b> –  to wspó³czynnik uzyskany przez podzielenie masy cia³a podanej w (kg) przez kwadrat wysokoœci podanej w (m). Zakres wartoœci wskaŸnika BMI stosowany jest tylko w stosunku do osób doros³ych. \r\n"
						+ "WskaŸnik ten ma znaczenie w ocenie zagro¿enia chorobami wynikaj¹ce z nadwagi i oty³oœci, np. cukrzyc¹, mia¿d¿yc¹. Podwy¿szona wartoœæ tego wskaŸnika zwiêksza ryzyko wyst¹pienia takich chorób.\r\n"
						+ "BMI jest bardzo prosty w u¿yciu, jednak nie uwzglêdnia on indywidualnej budowy cia³a. Jest on dosyæ niedok³adnym wskaŸnikiem zarówno niedowagi jak i nadwagi, które mog¹ stanowiæ zagro¿enie dla zdrowia. Kulturysta mo¿e mieæ BMI wskazuj¹ce na skrajn¹ oty³oœæ, posiadaj¹c jednoczeœnie niewielk¹  tkankê t³uszczow¹. Z drugiej strony, wskaŸnik zupe³nie zdrowych, szczup³ych oraz wysokich lekkoatletów mo¿e wykazywaæ skrajn¹ niedowagê. To potwierdza jego faktyczn¹ niedok³adnoœæ.\r\n",
				ContentMode.HTML);

		panel.setContent(labelForExplanation);
		labelForExplanation.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		addComponent(panel);

	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();

	}

}

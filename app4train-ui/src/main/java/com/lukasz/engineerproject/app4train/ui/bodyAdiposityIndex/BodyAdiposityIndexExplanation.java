package com.lukasz.engineerproject.app4train.ui.bodyAdiposityIndex;

import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = BodyAdiposityIndexExplanation.NAME, ui = App4TrainMainUI.class)
public class BodyAdiposityIndexExplanation extends VerticalLayout implements View {

	public static final String NAME = "cotojestbai?";
	private Label labelForExplanation;
	private Panel panel;

	private void addLayout() {

		setMargin(true);
		panel = new Panel("Co to jest BAI?");
		panel.setWidth("100%");
		labelForExplanation = new Label(
				"<b>WskaŸnik Ot³uszczenia Cia³a (BAI) (ang. Body Adiposity Index)</b> - wykorzystywany jest przy ocenie prawid³owej masy cia³a. WskaŸnik ten dostarcza dok³adniejszy obraz stanu naszego cia³a w porównaniu z popularnym BMI, który nie przedstawia realnego udzia³u tkanki t³uszczowej w organizmie. Wzór pozwalaj¹cy obliczyæ wskaŸnik BAI powsta³ w oparciu o rzeczywiste pomiary ludzi uzyskane w Stanach Zjednoczonych i w Meksyku. Bierze pod uwagê stosunek obwodu bioder do masy cia³a, w podziale na trzy grupy wiekowe i na p³eæ. Przeznaczony jest dla osób powy¿ej 20 roku ¿ycia. Do prawid³owego pomiaru obwodu bioder nale¿y stan¹æ w lekkim rozkroku (na szerokoœæ bioder). Dodatkowo nale¿y roz³o¿yæ równomiernie ciê¿ar cia³a i rozluŸniæ miêœnie poœladków. Obwód powinien byæ mierzony przez œrodek poœladków, a nastêpnie miarkê prowadzimy równolegle do pod³o¿a.",
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

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
				"<b>Wska�nik Ot�uszczenia Cia�a (BAI) (ang. Body Adiposity Index)</b> - wykorzystywany jest przy ocenie prawid�owej masy cia�a. Wska�nik ten dostarcza dok�adniejszy obraz stanu naszego cia�a w por�wnaniu z popularnym BMI, kt�ry nie przedstawia realnego udzia�u tkanki t�uszczowej w organizmie. Wz�r pozwalaj�cy obliczy� wska�nik BAI powsta� w oparciu o rzeczywiste pomiary ludzi uzyskane w Stanach Zjednoczonych i w Meksyku. Bierze pod uwag� stosunek obwodu bioder do masy cia�a, w podziale na trzy grupy wiekowe i na p�e�. Przeznaczony jest dla os�b powy�ej 20 roku �ycia. Do prawid�owego pomiaru obwodu bioder nale�y stan�� w lekkim rozkroku (na szeroko�� bioder). Dodatkowo nale�y roz�o�y� r�wnomiernie ci�ar cia�a i rozlu�ni� mi�nie po�ladk�w. Obw�d powinien by� mierzony przez �rodek po�ladk�w, a nast�pnie miark� prowadzimy r�wnolegle do pod�o�a.",
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

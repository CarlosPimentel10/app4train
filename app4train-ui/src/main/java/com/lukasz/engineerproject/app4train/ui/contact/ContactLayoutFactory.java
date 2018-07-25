package com.lukasz.engineerproject.app4train.ui.contact;

import org.springframework.beans.factory.annotation.Autowired;
import com.lukasz.engineerproject.app4train.ui.commons.App4TrainMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringView(name = ContactLayoutFactory.NAME, ui = App4TrainMainUI.class)
public class ContactLayoutFactory extends VerticalLayout implements View {

	public static final String NAME = "wyœwietlkontakt";
	private Label labelForApp4TrainData;

	@Autowired
	FormMessageForMailLayoutFactory formMessageForMailLayoutFactory;

	private void addLayout() {

		setMargin(false);

		labelForApp4TrainData = new Label(
				"<b>app4train Consulting £ukasz Ptaszek </b><br>" + "<b>Telefon kontaktowy</b></b>:  <br>"
						+ "<b>Adres e-mail</b>: app4train@gmail.com <br><br>"
						+ "<b>Chcesz siê dowiedzieæ wiêcej? Wyœlij do nas wiadomoœæ, aby uzyskaæ informacje.<b><br>",
				ContentMode.HTML);
		labelForApp4TrainData.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);

		com.vaadin.ui.Component createComponent = formMessageForMailLayoutFactory.createComponent();

		addComponents(labelForApp4TrainData, createComponent);

	}

	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addLayout();
	}
}

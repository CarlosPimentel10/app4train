package com.lukasz.engineerproject.app4train.ui.bodyTypesExplanation;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@org.springframework.stereotype.Component
public class BodyTypeExplanationForEndomorphicMenuLayoutFactory {

	private class BodyTypeExplanationForEndomorphicMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label shortExplanationOfEndomorphicType;
		private Label throughtExplanationOfEndomorphicType;
		private Label explanationOfEndomorphicType;
		private FormLayout layoutForMenuComponents;
		private HorizontalLayout layoutForButtonAndPopup;
		private Button buttonForPopup;
		private Panel panel;
		private Embedded picture;

		public BodyTypeExplanationForEndomorphicMenuLayout init() {

			layoutForMenuComponents = new FormLayout();

			shortExplanationOfEndomorphicType = new Label(
					"<p><p><ul><li>zwolniony metabolizm</li><li>znacznie wi�ksza si�a wyj�ciowa od ektomorfika</li><li>t�uszcz gromadzi si� na wszystkich partiach cia�a</li><li>znacznie trudniej spali� t�uszcz ni� ektomorfikowi</li><li>wysoki poziom tkanki t�uszczowej</li></ul></p></p>",
					ContentMode.HTML);

			picture = new Embedded();
			picture.setSource(new ThemeResource("../../images/endomorfik.png"));
			picture.setSizeUndefined();

			explanationOfEndomorphicType = new Label("Szczeg�owy opis endomorfika");

			buttonForPopup = new Button();
			buttonForPopup.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfEndomorphicType = new Label(
							"<b><br>Typowy endomorfik to osoba mocno ot�uszczona. Spowodowane jest to zwolnionym metabolizmem, </b><br>"
									+ "<b>przez co spalanie tkanki t�uszczowej stanowi du�y problem. Chc�c utrzyma� cia�o w formie, endomorfik musi by� pod sta�� kontrol� </b><br>"
									+ "<b>kaloryczn�. Nawet kilkutygodniowe zaniedbania, mog� skutkowa� mocnymi przyrostami tkanki t�uszczowej. Budowanie masy nie jest dla </b><br>"
									+ "<b>endomorfika problemem. Jednak bez odpowiednich proporcji makrosk�adnik�w (bia�ka, w�glowodany, tluszcze), obok masy mi�niowej  </b><br>"
									+ "<b>przybywa spora ilo�� masy t�uszczowej. Zaleca si� stosowanie bia�ka jako uzupe�nienie diety. Endomorfik, w przeciwie�stwie do </b><br>"
									+ "<b>ektomorfika, potrzebuje minimalnie wi�kszej puli kalorycznej ni� wymagana, aby zbudowa� mas� mi�niow�. Spalanie tkanki </b><br>"
									+ "<b>t�uszczowej wymaga jednak znacznie mniejszej poda�y kalorycznej oraz wykonywania cardio (bieganie, rower). </b><br>",
							ContentMode.HTML);
					throughtExplanationOfEndomorphicType.setStyleName("throughtExplanationOfEndomorphicType");
					throughtExplanationOfEndomorphicType.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfEndomorphicType.setSizeUndefined();
					window.setContent(throughtExplanationOfEndomorphicType);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForPopup.setIcon(FontAwesome.SEARCH);
			buttonForPopup.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndPopup = new HorizontalLayout(buttonForPopup, explanationOfEndomorphicType);
			layoutForButtonAndPopup.setSpacing(true);

			layoutForMenuComponents.addComponents(shortExplanationOfEndomorphicType, picture, layoutForButtonAndPopup);
			addComponent(layoutForMenuComponents);

			return this;
		}

		public Component layout() {

			setMargin(true);
			panel = new Panel("Typ budowy cia�a - ENDOMORFIK");
			panel.setWidth("100%");
			panel.setContent(layoutForMenuComponents);

			addComponent(panel);
			setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
			return panel;
		}

	}

	public Component createComponent(BodyTypeExplanationMenuLayoutFactory bodyTypeExplanationMenuLayoutFactory) {
		return new BodyTypeExplanationForEndomorphicMenuLayout().init().layout();
	}
}

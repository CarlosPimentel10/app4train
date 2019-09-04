
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
public class BodyTypeExplanationForMesomorphicMenuLayoutFactory {

	private class BodyTypeExplanationForMesomorphicMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label shortExplanationOfMesomorphicType;
		private Label throughtExplanationOfMesomorphicType;
		private Label explanationOfMesomorphicType;
		private FormLayout layoutForMenuComponents;
		private Button buttonForPopup;
		private Embedded picture;

		public BodyTypeExplanationForMesomorphicMenuLayout init() {

			layoutForMenuComponents = new FormLayout();

			prepareDescription();

			preparePicture();

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndPopup = new HorizontalLayout(buttonForPopup, explanationOfMesomorphicType);
			layoutForButtonAndPopup.setSpacing(true);

			layoutForMenuComponents.addComponents(shortExplanationOfMesomorphicType, picture, layoutForButtonAndPopup);
			addComponent(layoutForMenuComponents);

			return this;
		}

		private void prepareButton() {
			buttonForPopup = new Button();
			buttonForPopup.setIcon(FontAwesome.SEARCH);
			buttonForPopup.setStyleName(ValoTheme.BUTTON_SMALL);
		}

		private void buttonAction() {
			buttonForPopup.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfMesomorphicType = new Label(
							"<b><br>Typowy mezomorfik trzymaj�c odpowiedni� diet�, bez wi�kszych stara� wygl�da dobrze. </b><br>"
									+ "<b>Cz�sto bywa tak, nie�wicz�cy mezomorfik wygl�da o wiele lepiej ni� ektomorfik trenuj�cy kilka miesi�cy. Spowodowane jest to bardzo</b><br>"
									+ "<b>dobr� genetycznie budow� cia�a. Bior�c pod uwag� wszystkie typy budowy cia�a, w�a�nie mezomorfik ma najlepsze predyspozycje do zostania </b><br>"
									+ "<b>profesjonalnym kulturyst�. Przy odpowiedniej poda�y kalorycznej do organizmu, budowanie masy mi�niowej zar�wno jak i spalanie tkanki </b><br>"
									+ "<b>t�uszczowej nie stwarza mu problem�w. Dla tego typu budowy cia�a, po��czenie trening�w si�owych z treningami cardio (bieganie, rower),</b><br>"
									+ "<b> stanowi najlepsze rozwi�zanie.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfMesomorphicType.setStyleName("throughtExplanationOfMesomorphicType");
					throughtExplanationOfMesomorphicType.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfMesomorphicType.setSizeUndefined();
					window.setContent(throughtExplanationOfMesomorphicType);
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void preparePicture() {
			picture = new Embedded();
			picture.setSource(new ThemeResource("../../images/mezomorfik.png"));
			picture.setSizeUndefined();
		}

		private void prepareDescription() {
			shortExplanationOfMesomorphicType = new Label(
					"<p><ul><li>niski poziom tkanki t�uszczowej</li><li>nabieranie masy mi�niowej przychodzi dosy� �atwo</li><li>du�a si�a</li><li>spalanie tkanki t�uszczowej nie jest wi�kszym problemem</li><li>szerokie barki, w�ska talia, wyra�nie widoczne mi�nie</li></ul></p>",
					ContentMode.HTML);

			explanationOfMesomorphicType = new Label("Szczeg�owy opis mezomorfika");
		}

		public Component layout() {

			setMargin(true);
			Panel panel = new Panel("Typ budowy cia�a - MEZOMORFIK");
			panel.setWidth("100%");
			panel.setContent(layoutForMenuComponents);

			addComponent(panel);
			setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
			return panel;
		}

	}

	public Component createComponent(BodyTypeExplanationMenuLayoutFactory bodyTypeExplanationMenuLayoutFactory) {
		return new BodyTypeExplanationForMesomorphicMenuLayout().init().layout();
	}
}

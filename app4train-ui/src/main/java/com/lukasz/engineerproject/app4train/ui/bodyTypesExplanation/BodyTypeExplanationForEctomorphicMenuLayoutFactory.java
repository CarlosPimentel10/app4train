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
public class BodyTypeExplanationForEctomorphicMenuLayoutFactory {

	private class BodyTypeExplanationForEctomorphicMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label shortExplanationOfEctomorphicType;
		private Label throughtExplanationOfEctomorphicType;
		private Label explanationOfEctomorphicType;
		private FormLayout layoutForMenuComponents;
		private Button buttonForPopup;
		private Embedded picture;

		public BodyTypeExplanationForEctomorphicMenuLayout init() {

			layoutForMenuComponents = new FormLayout();

			prepareDescription();

			preparePicture();

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndPopup = new HorizontalLayout(buttonForPopup, explanationOfEctomorphicType);
			layoutForButtonAndPopup.setSpacing(true);

			layoutForMenuComponents.addComponents(shortExplanationOfEctomorphicType, picture, layoutForButtonAndPopup);

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
					throughtExplanationOfEctomorphicType = new Label(
							"<b><br>Typowy ektomorfik jest bardzo szczup�a osoba. Cech� charakterystyczn� ektomorfika jest przyspieszony</b><br>"
									+ "<b>metabolizm co bardzo cz�sto przeszkadza podczas budowania masy. W przypadku tego typu budowy cia�a, brak odpowiedniej wiedzy </b><br>"
									+ "<b>dotycz�cej odpowiedniego od�ywiania stanowi powa�nym problemem. Budowanie masy mi�niowej mo�na osi�gn�� przez spo�ycie znacznie </b><br>"
									+ "<b>wi�kszej puli kalorycznej ni� jest wymagana do utrzymania wagi. Trzeba pami�ta� te� o tym, �e w okresie budowania masy mi�niowej </b><br>"
									+ "<b>ektomorfik powinien do minimum ograniczy� cardio (bieganie, rower). W przypadku ektomorfika, dodatkowa suplementacja jak od�ywki </b><br>"
									+ "<b>w�glowodanowe, jak r�wnie� bia�kowe s� jak najbardziej wskazane. Nie ka�dy ektomorfik jest szczup�y, pomimo �e regu�a m�wi inaczej.</b><br>"
									+ "<b>Jednak d�ugotrwa�e pomijanie odpowiedniego od�ywiania mo�e skutkowa� gromadzeniem si� tkanki t�uszczowej, szczeg�lnie w okolicach brzucha.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfEctomorphicType.setStyleName("throughtExplanationOfEctomorphicType");
					throughtExplanationOfEctomorphicType.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfEctomorphicType.setSizeUndefined();
					window.setContent(throughtExplanationOfEctomorphicType);
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareDescription() {
			shortExplanationOfEctomorphicType = new Label(
					"<p><ul><li>niski poziom tkanki t�uszczowej</li><li>szczup�e ramiona</li><li>bardzo szybki metabolizm</li><li>osoba, kt�rej bardzo trudno nabra� masy mi�niowej</li><li>p�aska klatka piersiowa</li></ul></p>",
					ContentMode.HTML);

			explanationOfEctomorphicType = new Label("Szczeg�owy opis ektomorfika");
		}

		private void preparePicture() {
			picture = new Embedded();
			picture.setSource(new ThemeResource("../../images/ektomorfik.png"));
			picture.setSizeUndefined();
		}

		public Component layout() {

			setMargin(true);
			Panel panel = new Panel("Typ budowy cia�a - EKTOMORFIK");
			panel.setWidth("100%");
			panel.setContent(layoutForMenuComponents);

			addComponent(panel);

			setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
			return panel;
		}

	}

	public Component createComponent(BodyTypeExplanationMenuLayoutFactory bodyTypeExplanationMenuLayoutFactory) {
		return new BodyTypeExplanationForEctomorphicMenuLayout().init().layout();
	}
}

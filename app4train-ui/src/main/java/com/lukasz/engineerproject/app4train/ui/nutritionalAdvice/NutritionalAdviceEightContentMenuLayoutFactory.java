package com.lukasz.engineerproject.app4train.ui.nutritionalAdvice;

import com.lukasz.engineerproject.app4train.utils.NutritionalAdvicesTitles;
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
public class NutritionalAdviceEightContentMenuLayoutFactory {

	private class NutritionalAdviceEightContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfNutritionalAdviceEight;
		private Button buttonForWindow;

		public NutritionalAdviceEightContentMenuLayout init() {

			Label topicOfOfNutritionalAdviceEight = new Label(NutritionalAdvicesTitles.TOPIC_EIGHT.getString());

			prepareButton();

			buttonAction();

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfNutritionalAdviceEight);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareButton() {
			buttonForWindow = new Button();
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);
		}

		private void buttonAction() {
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfNutritionalAdviceEight = new Label(
							"<b>Lorem Ipsum jest tekstem stosowanym jako przyk�adowy wype�niacz w przemy�le poligraficznym. Zosta� po raz aaaaaa</b><br>\""
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niejaaaaaaaaaaaaaaaaaaaaaaa </b><br>\""
									+ "<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latachaaaaaaaaaaaaaaaaaaaa</b><br>\""
									+ "<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\""
									+ "<b>r�ne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druk�w na komputerach osobistych, jak Aldus</b><br>\""
									+ "<b>"
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niej </b><br>\""
									+ "<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latach</b><br>\""
									+ "<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\""
									+ "<b>r�ne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druk�w na komputerach osobistych, jak Aldus</b><br>\""
									+ "<b>"
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niej </b><br>\\\"\"\r\n"
									+ "					<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latach</b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\\\"\"\r\n"
									+ "					<b>r�ne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druk�w na komputerach osobistych, jak Aldus</b><br>\\\"\"\r\n"
									+ "					<b>"
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niej </b><br>\""
									+ "<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latach</b><br>\""
									+ "<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\""
									+ "<b>r�ne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druk�w na komputerach osobistych, jak Aldus</b><br>\""
									+ "<b>"
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niej </b><br>\\\"\"\r\n"
									+ "					<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latach</b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\\\"\"\r\n"
									+ "					<b>r�ne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druk�w na komputerach osobistych, jak Aldus</b><br>\\\"\"\r\n"
									+ "					<b>"
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niej </b><br>\\\"\"\r\n"
									+ "					<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latach</b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br><br>"
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niej </b><br>\\\"\"\r\n"
									+ "					<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latach</b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br><br>"
									+ "<b>pierwszy u�yty w XV w. przez nieznanego drukarza do wype�nienia tekstem pr�bnej ksi��ki. Pi�� wiek�w p�niej </b><br>\\\"\"\r\n"
									+ "					<b>zacz�� by� u�ywany przemy�le elektronicznym, pozostaj�c praktycznie niezmienionym. Spopularyzowa� si� w latach</b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br>\\\"\"\r\n"
									+ "					<b>60. XX w. wraz z publikacj� arkuszy Letrasetu, zawieraj�cych fragmenty Lorem Ipsum, a ostatnio z zawieraj�cym </b><br><br>",
							ContentMode.HTML);
					throughtExplanationOfNutritionalAdviceEight
							.setStyleName("throughtExplanationOfNutritionalAdviceEight");
					throughtExplanationOfNutritionalAdviceEight.setSizeUndefined();
					throughtExplanationOfNutritionalAdviceEight.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfNutritionalAdviceEight);
					UI.getCurrent().addWindow(window);
				}
			});
		}

	}

	public Component createComponent() {
		return new NutritionalAdviceEightContentMenuLayout().init();
	}
}
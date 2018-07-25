package com.lukasz.engineerproject.app4train.ui.exampleExcercises;

import java.io.File;
import com.lukasz.engineerproject.app4train.utils.UtilsForExcercisesTitles;
import com.vaadin.server.FileResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Video;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@org.springframework.stereotype.Component
public class ExcerciseSeventeenFactory {

	private class ExcerciseSeventeenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseSeventeenPart1;
		private Label throughtExplanationOfExcerciseSeventeenPart2;
		private Label topicOfOfExcerciseSeventeen;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseSeventeenLayout init() {

			topicOfOfExcerciseSeventeen = new Label(UtilsForExcercisesTitles.TOPIC_SEVENTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/17.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseSeventeenPart1 = new Label(
							"<b>W pozycji stoj�cej, linka trzymana obur�cz nachwytem. Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet, z lekkim<br></b>"
									+ "<b>wypi�ciem klatki piersiowej podczas wykonywania tego �wiczenia, jak r�wnie� na to aby w fazie ko�cowej ( zgi�cia przedramion)</b><br>"
									+ "<b>przedramion), maksymalny k�t pomi�dzy przedramieniem a ramieniem nie przekracza� 90 stopni:</b>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseSeventeenPart2 = new Label(
							"<b><ul><li>wzi�� wdech i wyporstowa� przedramiona, trzymaj�c �okcie w jednej pozycji wzd�uz tu�owia (ruch w tej fazie powinien by� szybki)</li><li>wykona� wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseSeventeenPart1,
							throughtExplanationOfExcerciseSeventeenPart2, video);

					throughtExplanationOfExcerciseSeventeenPart1.setStyleName("throughtExplanationOfExcerciseSeventeenPart1");
					throughtExplanationOfExcerciseSeventeenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseSeventeenPart2.setStyleName("throughtExplanationOfExcerciseSeventeenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseSeventeen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseSeventeenLayout().init();
	}
}
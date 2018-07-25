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
public class ExcerciseFiveFactory {

	private class ExcerciseFiveLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseFivePart1;
		private Label throughtExplanationOfExcerciseFivePart2;
		private Label topicOfOfExcerciseFive;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseFiveLayout init() {

			topicOfOfExcerciseFive = new Label(UtilsForExcercisesTitles.TOPIC_FIVE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/5.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseFivePart1 = new Label(
							"<b>W pozycji siedz�cej na �awce, sztanga trzymana\r\n"
									+ "nachwytem, szeroko�� rozstawu r�k powinien by� \r\n" + "wi�kszy ni� rozstaw<br>"
									+ " bark�w. K�t ustawienia �awki w ramach tego �wiczenia powinien wynosi� od 20 do 40 stopni:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseFivePart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie opu�ci� sztang� w okolice dolnych partii mi�ni piersiowych (ruch w tej fazie powinien by� <br>"
									+ "wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li><li>wycisn�� sztang� wykonuj�� w ko�cowej fazie \r\n"
									+ "ruchu wydech (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseFivePart1,
							throughtExplanationOfExcerciseFivePart2, video);

					throughtExplanationOfExcerciseFivePart1.setStyleName("throughtExplanationOfExcerciseFivePart1");
					throughtExplanationOfExcerciseFivePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseFivePart2.setStyleName("throughtExplanationOfExcerciseFivePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseFive);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseFiveLayout().init();
	}
}
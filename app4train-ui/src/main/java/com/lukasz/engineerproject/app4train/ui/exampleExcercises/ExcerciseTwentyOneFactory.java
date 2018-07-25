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
public class ExcerciseTwentyOneFactory {

	private class ExcerciseTwentyOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwentyOnePart1;
		private Label throughtExplanationOfExcerciseTwentyOnePart2;
		private Label topicOfOfExcerciseTwentyOne;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwentyOneLayout init() {

			topicOfOfExcerciseTwentyOne = new Label(UtilsForExcercisesTitles.TOPIC_TWENTYONE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/21.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwentyOnePart1 = new Label(
							"<b>W pozycji siedz�cej na �awce, sztanga trzymana na wysoko�ci g�rnej cz�ci klatki piersiowej nachwytem.<br>"
									+ " K�t ustawienia �awki w ramach tego �wiczenia powinien wynosi� od 20 do 40 stopni:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwentyOnePart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie opu�ci� sztang� w \r\n"
									+ "okolice dolnych partii mi�ni piersiowych (ruch w tej fazie powinien by� wolniejszy w celu <br>"
									+ "odpowiedniego rozci�gniecia mi�ni)</li><li>wycisn�� sztang� wykonuj�� w ko�cowej fazie \r\n"
									+ "ruchu wydech (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwentyOnePart1,
							throughtExplanationOfExcerciseTwentyOnePart2, video);

					throughtExplanationOfExcerciseTwentyOnePart1.setStyleName("throughtExplanationOfExcerciseTwentyOnePart1");
					throughtExplanationOfExcerciseTwentyOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwentyOnePart2.setStyleName("throughtExplanationOfExcerciseTwentyOnePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwentyOne);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwentyOneLayout().init();
	}
}
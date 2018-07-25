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
public class ExcerciseFourFactory {

	private class ExcerciseFourLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseFourPart1;
		private Label throughtExplanationOfExcerciseFourPart2;
		private Label topicOfOfExcerciseFour;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseFourLayout init() {

			topicOfOfExcerciseFour = new Label(UtilsForExcercisesTitles.TOPIC_FOUR.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/4.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setSizeUndefined();
					video.setCaption("Film instruktarzowy");

					throughtExplanationOfExcerciseFourPart1 = new Label(
							"<b>W pozycji siedz�cej na �awce, sztanga trzymana nachwytem, szeroko�� rozstawu r�k powinien by� wi�kszy ni� rozstaw bark�w. K�t ustawienia<br>"
									+ " �awki w ramach tego �wiczenia powinien wynosi� od 40 do 60 stopni:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseFourPart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie opu�ci� sztang� w \r\n"
									+ "okolice wci�cia szyjnego mostka (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gni�cia mi�ni)</li><li>wycisn�� sztang� wykonuj�� w ko�cowej fazie ruchu wydech (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseFourPart1,
							throughtExplanationOfExcerciseFourPart2, video);

					throughtExplanationOfExcerciseFourPart1.setStyleName("throughtExplanationOfExcerciseFourPart1");
					throughtExplanationOfExcerciseFourPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseFourPart2.setStyleName("throughtExplanationOfExcerciseFourPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseFour);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseFourLayout().init();
	}
}
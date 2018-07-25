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
public class ExcerciseTwentyFiveFactory {

	private class ExcerciseTwentyFiveLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwentyFivePart1;
		private Label throughtExplanationOfExcerciseTwentyFivePart2;
		private Label topicOfOfExcerciseTwentyFive;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwentyFiveLayout init() {

			topicOfOfExcerciseTwentyFive = new Label(UtilsForExcercisesTitles.TOPIC_TWENTYFIVE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/25.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwentyFivePart1 = new Label(
							"<b>W pozycji stoj�cej, grzbiet wyprostowany, \r\n"
									+ " ko�czyny dolne w lekkim rozkroku na szeroko�� bark�w, stopy nieco wysuni�te <br>"
									+ "ku przodowi ustawione r�wnolegle, ramiona zgi�te na wysoko�ci klatki piersowej, trzymaj� kettlebell:"
									,
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwentyFivePart2 = new Label(
							"<b><ul><li>wzi�� wdech jednosze�nie opuszczaj�c si� do poziomu gdy nogi zgi�te b�d� pod k�tem 90 stopni lub nieco mniejszym tak aby ca�y czas czu� napi�cie <br>"
									+ "mi�ni czworog�owych (ruch w tej fazie powinien by� wolniejszy \r\n"
									+ "w celu odpowiedniego rozci�gni�cia mi�ni)</li><li>powr�ci� do pozycji startowej wykonuj�c wydech w \r\n"
									+ "ko�cowej fazie ruchu (ruch w tej fazie powinien by� szybki).</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwentyFivePart1,
							throughtExplanationOfExcerciseTwentyFivePart2, video);

					throughtExplanationOfExcerciseTwentyFivePart1.setStyleName("throughtExplanationOfExcerciseTwentyFivePart1");
					throughtExplanationOfExcerciseTwentyFivePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwentyFivePart2.setStyleName("throughtExplanationOfExcerciseTwentyFivePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwentyFive);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwentyFiveLayout().init();
	}
}
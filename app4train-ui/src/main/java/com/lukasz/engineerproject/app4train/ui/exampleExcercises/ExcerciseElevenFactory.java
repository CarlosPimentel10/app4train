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
public class ExcerciseElevenFactory {

	private class ExcerciseElevenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseElevenPart1;
		private Label throughtExplanationOfExcerciseElevenPart2;
		private Label topicOfOfExcerciseEleven;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseElevenLayout init() {

			topicOfOfExcerciseEleven = new Label(UtilsForExcercisesTitles.TOPIC_ELEVEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/11.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseElevenPart1 = new Label(
							"<b>W pozycji siedz�cej twarz� do przyrz�du, dr��ek trzymany\r\n"
									+ "podchwytem, rozstaw ramion taki jak rozstaw bark�w, stopy umieszczona na pod�o�u <br>"
									+ "w celu zachowania stabilnej pozycji:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseElevenPart2 = new Label(
							"<b><ul><li>wzi�� wdech i przyci�gn�� dr��ek do g�rnych partii\r\n"
									+ "klatki piersiowej, jednocze�nie wypinaj�c klatke piersiow� oraz odwodz�c �okcie do ty�u (ruch w tej fazie <br>"
									+ "powinien by� szybki)</li><li>powr�t do pozycji startowej wykonujac wydech (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseElevenPart1,
							throughtExplanationOfExcerciseElevenPart2, video);

					throughtExplanationOfExcerciseElevenPart1.setStyleName("throughtExplanationOfExcerciseElevenPart1");
					throughtExplanationOfExcerciseElevenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseElevenPart2.setStyleName("throughtExplanationOfExcerciseElevenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseEleven);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseElevenLayout().init();
	}
}
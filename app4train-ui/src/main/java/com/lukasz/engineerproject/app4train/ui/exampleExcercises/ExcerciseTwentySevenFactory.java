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
public class ExcerciseTwentySevenFactory {

	private class ExcerciseTwentySevenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwentySevenPart1;
		private Label throughtExplanationOfExcerciseTwentySevenPart2;
		private Label topicOfOfExcerciseTwentySeven;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwentySevenLayout init() {

			topicOfOfExcerciseTwentySeven = new Label(UtilsForExcercisesTitles.TOPIC_TWENTYSEVEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/27.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwentySevenPart1 = new Label(
							"<b>W pozycji siedz¹cej na ³awce przyrz¹du, grzbiet oparty na oparciu, uchwyty przyrz¹du trzymane d³oñmi<br>"
									+ " nachwytem,  nogi zgiête w kolanach, zaparte o dr¹¿ek przyrz¹du stopami na wysokoœci kostek:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwentySevenPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech a nastêpnie wyprostowaæ nogi do pe³nego wyprostu w stawach kolanowych przytrzymuj¹c na ok. 1<br>"
									+ "sekundê celem lepszego napiêcia miêœni (ruch w tej fazie powinien byæ szybki)</li><li>powrót do pozycji wyjœciowej wykonuj¹c wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwentySevenPart1,
							throughtExplanationOfExcerciseTwentySevenPart2, video);

					throughtExplanationOfExcerciseTwentySevenPart1.setStyleName("throughtExplanationOfExcerciseTwentySevenPart1");
					throughtExplanationOfExcerciseTwentySevenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwentySevenPart2.setStyleName("throughtExplanationOfExcerciseTwentySevenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwentySeven);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwentySevenLayout().init();
	}
}
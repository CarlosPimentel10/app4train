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
							"<b>W pozycji siedz�cej na �awce przyrz�du, grzbiet oparty na oparciu, uchwyty przyrz�du trzymane d�o�mi<br>"
									+ " nachwytem,  nogi zgi�te w kolanach, zaparte o dr��ek przyrz�du stopami na wysoko�ci kostek:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwentySevenPart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie wyprostowa� nogi do pe�nego wyprostu w stawach kolanowych przytrzymuj�c na ok. 1<br>"
									+ "sekund� celem lepszego napi�cia mi�ni (ruch w tej fazie powinien by� szybki)</li><li>powr�t do pozycji wyj�ciowej wykonuj�c wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
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
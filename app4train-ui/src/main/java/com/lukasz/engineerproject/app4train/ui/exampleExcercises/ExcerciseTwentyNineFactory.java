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
public class ExcerciseTwentyNineFactory {

	private class ExcerciseTwentyNineLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwentyNinePart1;
		private Label throughtExplanationOfExcerciseTwentyNinePart2;
		private Label topicOfOfExcerciseTwentyNine;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwentyNineLayout init() {

			topicOfOfExcerciseTwentyNine = new Label(UtilsForExcercisesTitles.TOPIC_TWENTYNINE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/29.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwentyNinePart1 = new Label(
							"<b>W pozycji le��cej na brzuchu na przyrz�dzie tak, aby poza �awk� wystawa�y wy��cznie kolana, nogi wyprostowane w kolanach,<br>"
									+ "zaparte o dr��ek przyrz�du na wysoko�ci �ci�gien Achillesa, nachwytem trzymane uchwyty przyrzadu, biodra oraz tu��w<br>"
									+ "przylegaj� do powie�chni przyrz�du przez ca�y czas trwania �wiczenia:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwentyNinePart2 = new Label(
							"<b><ul><li>wzi�� wdech i maksymalnie zgi�� nogi w kolanach przytrzymuj�c ok 1 sekundy celem lepszego napi�cia mi�ni (ruch w tej fazie powinien by� szybki)</li><li>powr�ci� do pozycji wyj�ciowej wykonuj�c wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gni�cia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwentyNinePart1,
							throughtExplanationOfExcerciseTwentyNinePart2, video);

					throughtExplanationOfExcerciseTwentyNinePart1.setStyleName("throughtExplanationOfExcerciseTwentyNinePart1");
					throughtExplanationOfExcerciseTwentyNinePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwentyNinePart2.setStyleName("throughtExplanationOfExcerciseTwentyNinePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwentyNine);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwentyNineLayout().init();
	}
}
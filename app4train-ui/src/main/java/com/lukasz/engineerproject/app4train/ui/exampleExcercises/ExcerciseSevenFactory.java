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
public class ExcerciseSevenFactory {

	private class ExcerciseSevenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseSevenPart1;
		private Label throughtExplanationOfExcerciseSevenPart2;
		private Label topicOfOfExcerciseSeven;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseSevenLayout init() {

			topicOfOfExcerciseSeven = new Label(UtilsForExcercisesTitles.TOPIC_SEVEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/7.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseSevenPart1 = new Label(
							"<b>W pozycji siedz¹cej na ³awce skoœnej, hantle trzymane nachwytem, ³okcie ugiête. Zwróciæ uwagê na to aby k¹t ustawienia ³awki<br>"
									+ "w ramach tego æwiczenia powinien byæ wiêkszy ni¿ 60 stopni oraz o zachowanie stabilnej pozycji:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseSevenPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech a nastêpnie opuœciæ hantle, zwracajac uwagê na to aby ³okcie prowadzone by³y w trakcie ca³ego ruchu na boki tak aby nie „ucieka³y” do œrodka<br>"
									+ " (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniêcia miêœni)</li><li>wycisn¹æ hantle wykonuj¹æ w koñcowej fazie ruchu wydech (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseSevenPart1,
							throughtExplanationOfExcerciseSevenPart2, video);

					throughtExplanationOfExcerciseSevenPart1.setStyleName("throughtExplanationOfExcerciseSevenPart1");
					throughtExplanationOfExcerciseSevenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseSevenPart2.setStyleName("throughtExplanationOfExcerciseSevenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseSeven);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseSevenLayout().init();
	}
}
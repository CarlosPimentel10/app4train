package com.lukasz.engineerproject.app4train.ui.exampleExercises;

import java.io.File;

import com.lukasz.engineerproject.app4train.utils.ExercisesTitles;
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
class ExerciseSevenFactory {

	private class ExerciseSevenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseSevenPart1;
		private Label throughtExplanationOfExerciseSevenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseSevenLayout init() {

			Label topicOfExerciseSeven = new Label(ExercisesTitles.TOPIC_SEVEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseSeven);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private Button prepareButton() {
			Button buttonForWindow = new Button();
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);
			return buttonForWindow;
		}

		private void buttonAction(Button buttonForWindow) {
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/7.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseSevenPart1,
							throughtExplanationOfExerciseSevenPart2,
							video);


					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseSevenPart1 = new Label(
					"<b>W pozycji siedz¹cej na ³awce skoœnej, hantle trzymane nachwytem, ³okcie ugiête. Zwróciæ uwagê na to aby k¹t ustawienia ³awki<br>"
							+ "w ramach tego æwiczenia powinien byæ wiêkszy ni¿ 60 stopni oraz o zachowanie stabilnej pozycji:",
					ContentMode.HTML);

			throughtExplanationOfExerciseSevenPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie opuœciæ hantle, zwracajac uwagê na to aby ³okcie prowadzone by³y w trakcie ca³ego ruchu na boki tak aby nie „ucieka³y” do œrodka<br>"
							+ " (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniêcia miêœni)</li><li>wycisn¹æ hantle wykonuj¹æ w koñcowej fazie ruchu wydech (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseSevenPart1.setStyleName("throughtExplanationOfExerciseSevenPart1");
			throughtExplanationOfExerciseSevenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseSevenPart2.setStyleName("throughtExplanationOfExerciseSevenPart2");
		}

	}

	public Component createComponent() {
		return new ExerciseSevenLayout().init();
	}
}
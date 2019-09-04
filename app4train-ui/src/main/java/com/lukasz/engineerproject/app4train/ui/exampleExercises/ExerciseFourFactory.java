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
public class ExerciseFourFactory {

	private class ExerciseFourLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseFourPart1;
		private Label throughtExplanationOfExerciseFourPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFourLayout init() {

			Label topicOfExerciseFour = new Label(ExercisesTitles.TOPIC_FOUR.getString());

			Button buttonForWindow = new Button();
			buttonAction(buttonForWindow);

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseFour);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void buttonAction(Button buttonForWindow) {
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/4.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseFourPart1,
							throughtExplanationOfExerciseFourPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseFourPart1 = new Label(
					"<b>W pozycji siedz¹cej na ³awce, sztanga trzymana nachwytem, szerokoœæ rozstawu r¹k powinien byæ wiêkszy ni¿ rozstaw barków. K¹t ustawienia<br>"
							+ " ³awki w ramach tego æwiczenia powinien wynosiæ od 40 do 60 stopni:",
					ContentMode.HTML);

			throughtExplanationOfExerciseFourPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie opuœciæ sztangê w \r\n"
							+ "okolice wciêcia szyjnego mostka (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniêcia miêœni)</li><li>wycisn¹æ sztangê wykonuj¹æ w koñcowej fazie ruchu wydech (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseFourPart1.setStyleName("throughtExplanationOfExerciseFourPart1");
			throughtExplanationOfExerciseFourPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseFourPart2.setStyleName("throughtExplanationOfExerciseFourPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setSizeUndefined();
			video.setCaption("Film instruktarzowy");
		}

	}

	public Component createComponent() {
		return new ExerciseFourLayout().init();
	}
}
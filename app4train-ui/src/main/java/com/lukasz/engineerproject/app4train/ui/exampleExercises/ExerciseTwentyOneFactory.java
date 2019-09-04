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
class ExerciseTwentyOneFactory {

	private class ExerciseTwentyOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTwentyOnePart1;
		private Label throughtExplanationOfExerciseTwentyOnePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTwentyOneLayout init() {

			Label topicOfExerciseTwentyOne = new Label(ExercisesTitles.TOPIC_TWENTY_ONE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTwentyOne);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/21.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTwentyOnePart1,
							throughtExplanationOfExerciseTwentyOnePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTwentyOnePart1 = new Label(
					"<b>W pozycji siedz¹cej na ³awce, sztanga trzymana na wysokoœci górnej czêœci klatki piersiowej nachwytem.<br>"
							+ " K¹t ustawienia ³awki w ramach tego æwiczenia powinien wynosiæ od 20 do 40 stopni:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseTwentyOnePart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie opuœciæ sztangê w \r\n"
							+ "okolice dolnych partii miêœni piersiowych (ruch w tej fazie powinien byæ wolniejszy w celu <br>"
							+ "odpowiedniego rozci¹gniecia miêœni)</li><li>wycisn¹æ sztangê wykonuj¹æ w koñcowej fazie \r\n"
							+ "ruchu wydech (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentyOnePart1.setStyleName("throughtExplanationOfExerciseTwentyOnePart1");
			throughtExplanationOfExerciseTwentyOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTwentyOnePart2.setStyleName("throughtExplanationOfExerciseTwentyOnePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTwentyOneLayout().init();
	}
}
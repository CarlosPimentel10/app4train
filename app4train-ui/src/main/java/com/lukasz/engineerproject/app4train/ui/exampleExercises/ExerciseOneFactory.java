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
class ExerciseOneFactory {

	private class ExerciseOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseOnePart1;
		private Label throughtExplanationOfExerciseOnePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseOneLayout init() {

			Label topicOfExerciseOne = new Label(ExercisesTitles.TOPIC_ONE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseOne);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/1.mp4"));
					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseOnePart1,
							throughtExplanationOfExerciseOnePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseOnePart1 = new Label(
					"<b>W pozycji le¿¹cej na plecach na w¹skiej ³awce, hantelki trzymane podchwytem, ramiona lekko zgiête w ³okciach wyci¹gniête w górê:</b><br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseOnePart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie roz³o¿yæ ramiona do poziomu ruchem w pe³ni okr¹g³ym (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li><li>powrót do pozycji startowej wykonuj¹c wydech (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseOnePart1.setStyleName("throughtExplanationOfExerciseOnePart1");
			throughtExplanationOfExerciseOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseOnePart2.setStyleName("throughtExplanationOfExerciseOnePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setSizeUndefined();
			video.setCaption("Film instruktarzowy");
		}

	}

	public Component createComponent() {
		return new ExerciseOneLayout().init();
	}
}
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
class ExerciseFortyOneFactory {

	private class ExerciseFortyOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseFortyOnePart1;
		private Label throughtExplanationOfExerciseFortyOnePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFortyOneLayout init() {

			Label topicOfExerciseFortyOne = new Label(ExercisesTitles.TOPIC_FORTY_ONE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseFortyOne);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/41.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseFortyOnePart1,
							throughtExplanationOfExerciseFortyOnePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseFortyOnePart1 = new Label(
					"<b>W pozycji le¿¹cej na plecach na macie, kettlebell powinien byæ trzymany nachwytem, stopy ustawione na pod³o¿u w celu zachowania stabilnej pozycji: <br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseFortyOnePart2 = new Label(
					"<b><ul><li>wzi¹æ wdech i zgi¹æ przedramiona, na wysokoœæ czo³a, staraj¹c siê nie odwodziæ w bok ³okci w trakcie opuszczania sztangi <br>"
							+ "(ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li><li>powróciæ do pozycji wyjœciowej wykonuj¹c wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseFortyOnePart1.setStyleName("throughtExplanationOfExerciseFortyOnePart1");
			throughtExplanationOfExerciseFortyOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseFortyOnePart2.setStyleName("throughtExplanationOfExerciseFortyOnePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseFortyOneLayout().init();
	}
}
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
class ExerciseTwentyFourFactory {

	private class ExerciseTwentyFourLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTwentyFourPart1;
		private Label throughtExplanationOfExerciseTwentyFourPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTwentyFourLayout init() {

			Label topicOfExerciseTwentyFour = new Label(ExercisesTitles.TOPIC_TWENTY_FOUR.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTwentyFour);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/24.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTwentyFourPart1,
							throughtExplanationOfExerciseTwentyFourPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTwentyFourPart1 = new Label(
					"<b>W pozycji stoj¹cej, stanga trzymana podchwytem (rozstaw r¹k nieco wiêksz¹ ni¿ rozstaw barków). Zwracaæ szczególn¹ uwagê<br>"
							+ " na to aby mieæ wyprostowany grzbiet oraz aby przy zgiêciu przedramion nie poruszaæ klatk¹ piersiow¹ (stabilna pozycja):",
					ContentMode.HTML);

			throughtExplanationOfExerciseTwentyFourPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech i zgi¹æ przedramiona (ruch w tej fazie powinien byæ szybki)</li><li>wykonaæ wydech w koñcowej fazie ruchu</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentyFourPart1.setStyleName("throughtExplanationOfExerciseTwentyFourPart1");
			throughtExplanationOfExerciseTwentyFourPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTwentyFourPart2.setStyleName("throughtExplanationOfExerciseTwentyFourPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTwentyFourLayout().init();
	}
}
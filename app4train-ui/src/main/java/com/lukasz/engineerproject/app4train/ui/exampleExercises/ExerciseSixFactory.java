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
public class ExerciseSixFactory {

	private class ExerciseSixLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseSixPart1;
		private Label throughtExplanationOfExerciseSixPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseSixLayout init() {

			Label topicOfExerciseSix = new Label(ExercisesTitles.TOPIC_SIX.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseSix);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/6.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseSixPart1,
							throughtExplanationOfExerciseSixPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseSixPart1 = new Label(
					"<b>W pozycji siedz¹cej na ³awce, sztanga trzymana nachwytem, szerokoœæ rozstawu r¹k powinnien byæ wiêkszy \r\n"
							+ "ni¿ rozstaw barków:",
					ContentMode.HTML);

			throughtExplanationOfExerciseSixPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie opuœciæ sztangê w \r\n"
							+ "okolice piersi (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li><li>wycisn¹æ sztangê wykonuj¹æ w koñcowej fazie \r\n"
							+ "ruchu wydech (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseSixPart1.setStyleName("throughtExplanationOfExerciseSixPart1");
			throughtExplanationOfExerciseSixPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseSixPart2.setStyleName("throughtExplanationOfExerciseSixPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseSixLayout().init();
	}
}
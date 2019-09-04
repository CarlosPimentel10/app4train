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
class ExerciseFourteenFactory {

	private class ExerciseFourteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseFourteenPart1;
		private Label throughtExplanationOfExerciseFourteenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFourteenLayout init() {

			Label topicOfExerciseFourteen = new Label(ExercisesTitles.TOPIC_FOURTEEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseFourteen);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/14.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseFourteenPart1,
							throughtExplanationOfExerciseFourteenPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseFourteenPart1 = new Label(
					"<b>W pozycji stoj¹cej, koñczyny dolne ustawione w lekkim rozkroku, ramiê ustawione wzd³u¿ tu³owia z r¹czk¹ wyci¹gu dolnego trzyman¹ nachwytem, lekko zgiêty ³okieæ.<br>"
							+ "Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:",
					ContentMode.HTML);

			throughtExplanationOfExerciseFourteenPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie unieœæ ramiê do poziomu (ruch w tej fazie powinien byæ szybki)</li><li>wracamy do pozycji wyjœciowej wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseFourteenPart1.setStyleName("throughtExplanationOfExerciseFourteenPart1");
			throughtExplanationOfExerciseFourteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseFourteenPart2.setStyleName("throughtExplanationOfExerciseFourteenPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseFourteenLayout().init();
	}
}
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
class ExerciseThirtyNineFactory {

	private class ExerciseThirtyNineLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseThirtyNinePart1;
		private Label throughtExplanationOfExerciseThirtyNinePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseThirtyNineLayout init() {

			Label topicOfExerciseThirtyNine = new Label(ExercisesTitles.TOPIC_THIRTY_NINE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseThirtyNine);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/39.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseThirtyNinePart1,
							throughtExplanationOfExerciseThirtyNinePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseThirtyNinePart1 = new Label(
					"<b>W pozycji stoj¹cej, koñczyny dolne ustawione w lekkim rozkroku, r¹czka kettlebell trzymana nachwytem przy udach.<br>"
							+ "Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseThirtyNinePart2 = new Label(
					"<b><ul><li> wzi¹æ wdech a nastêpnie podci¹gnaæ wzd³u¿ tu³owia kettlebell pod brodê, unosz¹c ³okcie jak najwy¿ej jest to mo¿liwe (ruch w tej fazie powinien byæ szybki)</li><li>opuszczaj¹c kettlebell, wracamy do pozycji wyjœciowej  wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseThirtyNinePart1.setStyleName("throughtExplanationOfExerciseThirtyNinePart1");
			throughtExplanationOfExerciseThirtyNinePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseThirtyNinePart2.setStyleName("throughtExplanationOfExerciseThirtyNinePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseThirtyNineLayout().init();
	}
}
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
class ExerciseThirtySixFactory {

	private class ExerciseThirtySixLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseThirtySixPart1;
		private Label throughtExplanationOfExerciseThirtySixPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseThirtySixLayout init() {

			Label topicOfExerciseThirtySix = new Label(ExercisesTitles.TOPIC_THIRTY_SIX.getString());

			Button buttonForWindow = getButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseThirtySix);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private Button getButton() {
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/36.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseThirtySixPart1,
							throughtExplanationOfExerciseThirtySixPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseThirtySixPart1 = new Label(
					"<b>W pozycji le¿¹cej na ³awce skoœnej, hantle trzymane na wysokoœci klatki piersiowej, tak aby kciuk by³ skierowany w kierunku naszego cia³a.<br>"
							+ " Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia oraz na stabiln¹ pozycjê:",
					ContentMode.HTML);


			throughtExplanationOfExerciseThirtySixPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie wycisn¹æ hantle do wyprostu ³okci, nie wykonujemy ¿adnej rotacji nadgarstkami (ruch w tej fazie powinien byæ szybki)</li><li>wracamy do pozycji wyjœciowej wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseThirtySixPart1.setStyleName("throughtExplanationOfExerciseThirtySixPart1");
			throughtExplanationOfExerciseThirtySixPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseThirtySixPart2.setStyleName("throughtExplanationOfExerciseThirtySixPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseThirtySixLayout().init();
	}
}
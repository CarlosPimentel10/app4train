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
class ExerciseTwentyFiveFactory {

	private class ExerciseTwentyFiveLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTwentyFivePart1;
		private Label throughtExplanationOfExerciseTwentyFivePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTwentyFiveLayout init() {

			Label topicOfExerciseTwentyFive = new Label(ExercisesTitles.TOPIC_TWENTY_FIVE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTwentyFive);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/25.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTwentyFivePart1,
							throughtExplanationOfExerciseTwentyFivePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTwentyFivePart1 = new Label(
					"<b>W pozycji stoj¹cej, grzbiet wyprostowany, \r\n"
							+ " koñczyny dolne w lekkim rozkroku na szerokoœæ barków, stopy nieco wysuniête <br>"
							+ "ku przodowi ustawione równolegle, ramiona zgiête na wysokoœci klatki piersowej, trzymaj¹ kettlebell:"
					,
					ContentMode.HTML);

			throughtExplanationOfExerciseTwentyFivePart2 = new Label(
					"<b><ul><li>wzi¹æ wdech jednoszeœnie opuszczaj¹c siê do poziomu gdy nogi zgiête bêd¹ pod k¹tem 90 stopni lub nieco mniejszym tak aby ca³y czas czuæ napiêcie <br>"
							+ "miêœni czworog³owych (ruch w tej fazie powinien byæ wolniejszy \r\n"
							+ "w celu odpowiedniego rozci¹gniêcia miêœni)</li><li>powróciæ do pozycji startowej wykonuj¹c wydech w \r\n"
							+ "koñcowej fazie ruchu (ruch w tej fazie powinien byæ szybki).</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentyFivePart1.setStyleName("throughtExplanationOfExerciseTwentyFivePart1");
			throughtExplanationOfExerciseTwentyFivePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTwentyFivePart2.setStyleName("throughtExplanationOfExerciseTwentyFivePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTwentyFiveLayout().init();
	}
}
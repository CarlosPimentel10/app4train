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
class ExerciseThirtyFiveFactory {

	private class ExerciseThirtyFiveLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseThirtyFivePart1;
		private Label throughtExplanationOfExerciseThirtyFivePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseThirtyFiveLayout init() {

			Label topicOfExerciseThirtyFive = new Label(ExercisesTitles.TOPIC_THIRTY_FIVE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseThirtyFive);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/35.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseThirtyFivePart1,
							throughtExplanationOfExerciseThirtyFivePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseThirtyFivePart1 = new Label(
					"<b>W pozycji stoj¹cej, grzbiet wyprostowany, \r\n"
							+ " koñczyny dolne w lekkim rozkroku na szerokoœæ barków, ramiona zgiêtê, trzymaj¹ kettlebell <br>"
							+ "na wysokoœci klatki piersiowej Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie<br>"
							+ "wykonywania tego æwiczenia, jak równie¿ na to, by ciê¿ar by³ wypychany z piêt a nie z palców stóp:",
					ContentMode.HTML);

			throughtExplanationOfExerciseThirtyFivePart2 = new Label(
					"<b><ul><li> wzi¹æ wdech i wspi¹æ siê na palce powoduj¹c napiêcie ³ydek, przytrzymaæ przez krótki okres ok. 1-2 sek. (ruch w tej fazie powinien byæ szybszy)</li>"
							+ "<li>powróciæ do pozycji wyjœciowej wykonuj¹c wydech, piêta ponownie znajduje siê poni¿ej poziomu palców (ruch w tej fazie powinien byæ wolniejszy <br>"
							+ "w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseThirtyFivePart1.setStyleName("throughtExplanationOfExerciseThirtyFivePart1");
			throughtExplanationOfExerciseThirtyFivePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseThirtyFivePart2.setStyleName("throughtExplanationOfExerciseThirtyFivePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseThirtyFiveLayout().init();
	}
}
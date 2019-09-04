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
class ExerciseEighteenFactory {

	private class ExerciseEighteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseEighteenPart1;
		private Label throughtExplanationOfExerciseEighteenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseEighteenLayout init() {

			Label topicOfExerciseEighteen = new Label(ExercisesTitles.TOPIC_EIGHTEEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseEighteen);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/18.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseEighteenPart1,
							throughtExplanationOfExerciseEighteenPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseEighteenPart1 = new Label(
					"<b>W pozycji stoj¹cej dr¹¿ek wyci¹gu górnego trzymany podchwytem, ustawienie twarz¹ do przyrz¹du. Zwróciæ szczególn¹ uwagê<br>"
							+ "na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:",
					ContentMode.HTML);

			throughtExplanationOfExerciseEighteenPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech i wyprostowaæ przedramiona (ruch w tej fazie powinien byæ szybki)</li><li>powróciæ do pozycji wyjœciowej wykonuj¹æ wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseEighteenPart1.setStyleName("throughtExplanationOfExerciseEighteenPart1");
			throughtExplanationOfExerciseEighteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseEighteenPart2.setStyleName("throughtExplanationOfExerciseEighteenPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseEighteenLayout().init();
	}
}
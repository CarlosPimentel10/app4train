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
class ExerciseTwentyTwoFactory {

	private class ExerciseTwentyTwoLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTwentyTwoPart1;
		private Label throughtExplanationOfExerciseTwentyTwoPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTwentyTwoLayout init() {

			Label topicOfExerciseTwentyTwo = new Label(ExercisesTitles.TOPIC_TWENTY_TWO.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTwentyTwo);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/22.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTwentyTwoPart1,
							throughtExplanationOfExerciseTwentyTwoPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTwentyTwoPart1 = new Label(
					"<b>W pozycji siedz¹cej na przyrz¹dzie, ramiona maj¹ byæ wyci¹gniête, ³okcie oparte na ³awce, natomiast sztanga trzymana podchwytem:<br>"
							+ "Jest to æwiczenie, które stopniowo zwiêksza obci¹¿enie miêœnia dokonuj¹c wyprostu ramion. Zwróciæ szczególn¹  <br>"
							+ "uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentyTwoPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie zgi¹æ ramiona (ruch w tej fazie powinien byæ szybki)</li><li>wykonaæ wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentyTwoPart1.setStyleName("throughtExplanationOfExerciseTwentyTwoPart1");
			throughtExplanationOfExerciseTwentyTwoPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTwentyTwoPart2.setStyleName("throughtExplanationOfExerciseTwentyTwoPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTwentyTwoLayout().init();
	}
}
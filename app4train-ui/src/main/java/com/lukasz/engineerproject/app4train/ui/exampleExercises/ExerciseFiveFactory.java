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
class ExerciseFiveFactory {

	private class ExerciseFiveLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseFivePart1;
		private Label throughtExplanationOfExerciseFivePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFiveLayout init() {

			Label topicOfExerciseFive = new Label(ExercisesTitles.TOPIC_FIVE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseFive);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/5.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseFivePart1,
							throughtExplanationOfExerciseFivePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseFivePart1 = new Label(
					"<b>W pozycji siedz�cej na �awce, sztanga trzymana\r\n"
							+ "nachwytem, szeroko�� rozstawu r�k powinien by� \r\n" + "wi�kszy ni� rozstaw<br>"
							+ " bark�w. K�t ustawienia �awki w ramach tego �wiczenia powinien wynosi� od 20 do 40 stopni:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseFivePart2 = new Label(
					"<b><ul><li>wzi�� wdech a nast�pnie opu�ci� sztang� w okolice dolnych partii mi�ni piersiowych (ruch w tej fazie powinien by� <br>"
							+ "wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li><li>wycisn�� sztang� wykonuj�� w ko�cowej fazie \r\n"
							+ "ruchu wydech (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseFivePart1.setStyleName("throughtExplanationOfExerciseFivePart1");
			throughtExplanationOfExerciseFivePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseFivePart2.setStyleName("throughtExplanationOfExerciseFivePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseFiveLayout().init();
	}
}
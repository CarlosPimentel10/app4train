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
public class ExerciseSixteenFactory {

	private class ExerciseSixteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseSixteenPart1;
		private Label throughtExplanationOfExerciseSixteenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseSixteenLayout init() {

			Label topicOfExerciseSixteen = new Label(ExercisesTitles.TOPIC_SIXTEEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseSixteen);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/16.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseSixteenPart1,
							throughtExplanationOfExerciseSixteenPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseSixteenPart1 = new Label(
					"<b>W pozycji le��cej na plecach na �awce, sztanga powinna by� trzymana nachwytem, ramiona ustawione pionowo w stosunku<br>"
							+ " do �awki, stopy ustawione na pod�o�u w celu zachowania stabilnej pozycji:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseSixteenPart2 = new Label(
					"<b><ul><li>wzi�� wdech i zgi�� przedramiona, na wysoko�� czo�a, staraj�c si� nie odwodzi� w bok �okci w trakcie opuszczania sztangi <br>"
							+ "(ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li><li>powr�ci� do pozycji wyj�ciowej wykonuj�c wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseSixteenPart1.setStyleName("throughtExplanationOfExerciseSixteenPart1");
			throughtExplanationOfExerciseSixteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseSixteenPart2.setStyleName("throughtExplanationOfExerciseSixteenPart2");
		}

	}

	public Component createComponent() {
		return new ExerciseSixteenLayout().init();
	}
}
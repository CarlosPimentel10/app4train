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
class ExerciseTwentyEightFactory {

	private class ExerciseTwentyEightLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTwentyEightPart1;
		private Label throughtExplanationOfExerciseTwentyEightPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTwentyEightLayout init() {

			Label topicOfExerciseTwentyEight = new Label(ExercisesTitles.TOPIC_TWENTY_EIGHT.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTwentyEight);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/28.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTwentyEightPart1,
							throughtExplanationOfExerciseTwentyEightPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTwentyEightPart1 = new Label(
					"<b>W pozycji stoj�cej na platformie suwnicy, grzbiet wyprostowany, \r\n"
							+ " ko�czyny dolne w lekkim rozkroku na szeroko�� bark�w, stopy nieco wysuni�te <br>"
							+ "ku przodowi ustawione r�wnolegle, biodra przylegaj� do powierzchni oparcia, ramiona zgi�te, uchwyty<br>"
							+ " suwnicy trzymane nachwytem. Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia<br>"
							+ "jak r�wnie� na to, by ci�ar by� wypychany z pi�t a nie z palc�w st�p:",
					ContentMode.HTML);

			throughtExplanationOfExerciseTwentyEightPart2 = new Label(
					"<b><ul><li>wzi�� wdech jednosze�nie opuszczaj�c si� do poziomu gdy nogi zgi�te b�d� pod k�tem 90 stopni lub nieco mniejszym tak aby ca�y czas czu� napi�cie <br>"
							+ "mi�ni czworog�owych (ruch w tej fazie powinien by� wolniejszy \r\n"
							+ "w celu odpowiedniego rozci�gni�cia mi�ni)</li><li>powr�ci� do pozycji startowej wykonuj�c wydech w \r\n"
							+ "ko�cowej fazie ruchu (ruch w tej fazie powinien by� szybki).</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentyEightPart1.setStyleName("throughtExplanationOfExerciseTwentyEightPart1");
			throughtExplanationOfExerciseTwentyEightPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTwentyEightPart2.setStyleName("throughtExplanationOfExerciseTwentyEightPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTwentyEightLayout().init();
	}
}
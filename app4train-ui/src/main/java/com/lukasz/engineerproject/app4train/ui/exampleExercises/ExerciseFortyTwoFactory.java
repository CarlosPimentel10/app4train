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
class ExerciseFortyTwoFactory {

	private class ExerciseFortyTwoLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseFortyTwoPart1;
		private Label throughtExplanationOfExerciseFortyTwoPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFortyTwoLayout init() {

			Label topicOfExerciseFortyTwo = new Label(ExercisesTitles.TOPIC_FORTY_TWO.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseFortyTwo);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/42.mp4"));
					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseFortyTwoPart1,
							throughtExplanationOfExerciseFortyTwoPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseFortyTwoPart1 = new Label(
					"<b>W pozycji stoj�cej, ko�czyny dolne ustawione w lekkim rozkroku, r�czka kettlebell trzymana obydwiema r�koma na wysoko�ci pasa,<br>"
							+ " lekko zgi�te �okcie. Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia:",
					ContentMode.HTML);

			throughtExplanationOfExerciseFortyTwoPart2 = new Label(
					"<b><ul><li>wzi�� wdech i unie�� ramiona z kettlebell, na wysoko�� czo�a, staraj�c si� utrzymywa� stabiln� pozycj�<br>"
							+ "(ruch w tej fazie powinien by� szybki)</li><li>powr�ci� do pozycji wyj�ciowej wykonuj�c wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni )</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseFortyTwoPart1.setStyleName("throughtExplanationOfExerciseFortyTwoPart1");
			throughtExplanationOfExerciseFortyTwoPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseFortyTwoPart2.setStyleName("throughtExplanationOfExerciseFortyTwoPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseFortyTwoLayout().init();
	}
}
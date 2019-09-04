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
class ExerciseNineFactory {

	private class ExerciseNineLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseNinePart1;
		private Label throughtExplanationOfExerciseNinePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseNineLayout init() {

			Label topicOfExerciseNine = new Label(ExercisesTitles.TOPIC_NINE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseNine);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/9.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseNinePart1,
							throughtExplanationOfExerciseNinePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseNinePart1 = new Label(
					"<b>W pozycji stoj�cej, ko�czyny dolne ustawione w lekkim rozkroku, ramiona ustawione wzd�u� tu�owia z hantlami trzymanymi nachwytem, lekko zgi�te �okcie. <br>"
							+ "Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia:",
					ContentMode.HTML);

			throughtExplanationOfExerciseNinePart2 = new Label(
					"<b><ul><li>wzi�� wdech a nast�pnie unie�� ramiona do poziomu (ruch w tej fazie powinien by� szybki)</li><li>wracamy do pozycji wyj�ciowej wykonuj�c wydech (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseNinePart1.setStyleName("throughtExplanationOfExerciseNinePart1");
			throughtExplanationOfExerciseNinePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseNinePart2.setStyleName("throughtExplanationOfExerciseNinePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseNineLayout().init();
	}
}
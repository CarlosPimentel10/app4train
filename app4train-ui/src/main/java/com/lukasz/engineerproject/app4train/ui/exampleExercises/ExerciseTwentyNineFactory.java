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
class ExerciseTwentyNineFactory {

	private class ExerciseTwentyNineLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTwentyNinePart1;
		private Label throughtExplanationOfExerciseTwentyNinePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTwentyNineLayout init() {

			Label topicOfExerciseTwentyNine = new Label(ExercisesTitles.TOPIC_TWENTY_NINE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTwentyNine);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/29.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTwentyNinePart1,
							throughtExplanationOfExerciseTwentyNinePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTwentyNinePart1 = new Label(
					"<b>W pozycji le¿¹cej na brzuchu na przyrz¹dzie tak, aby poza ³awkê wystawa³y wy³¹cznie kolana, nogi wyprostowane w kolanach,<br>"
							+ "zaparte o dr¹¿ek przyrz¹du na wysokoœci œciêgien Achillesa, nachwytem trzymane uchwyty przyrzadu, biodra oraz tu³ów<br>"
							+ "przylegaj¹ do powie¿chni przyrz¹du przez ca³y czas trwania æwiczenia:",
					ContentMode.HTML);

			throughtExplanationOfExerciseTwentyNinePart2 = new Label(
					"<b><ul><li>wzi¹æ wdech i maksymalnie zgi¹æ nogi w kolanach przytrzymuj¹c ok 1 sekundy celem lepszego napiêcia miêœni (ruch w tej fazie powinien byæ szybki)</li><li>powróciæ do pozycji wyjœciowej wykonuj¹c wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniêcia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentyNinePart1.setStyleName("throughtExplanationOfExerciseTwentyNinePart1");
			throughtExplanationOfExerciseTwentyNinePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTwentyNinePart2.setStyleName("throughtExplanationOfExerciseTwentyNinePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTwentyNineLayout().init();
	}
}
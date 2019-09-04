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
class ExerciseThreeFactory {

	private class ExerciseThreeLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseThreePart1;
		private Label throughtExplanationOfExerciseThreePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseThreeLayout init() {

			Label topicOfExerciseThree = new Label(ExercisesTitles.TOPIC_THREE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseThree);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/3.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseThreePart1,
							throughtExplanationOfExerciseThreePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseThreePart1 = new Label(
					"<b>W pozycji stoj¹cej, rozstaw nóg w lekkim rozkroku, tu³ów lekko pochylony do przodu, r¹czki wyci¹gu górnego trzymane nachwytem<br>"
							+ "  lekko zgiête ramiona w ³okciach, ramiona roz³orzone. Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia<br>"
							+ " w niewielkiej odleg³oœci od ud, kieruj¹c j¹ w okolice brzucha, jak równie¿ na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseThreePart2 = new Label(
					"<b><ul><li>wzi¹æ wdech i dokonaæ przyci¹gniêcia do siebie ramion tak, aby r¹czki wyci¹gu górnego by³y w niewielkiej odleg³oœci od<br>"
							+ "siebie wykonuj¹c wydech w koñcowej fazie œci¹gniêcia (ruch w tej fazie powinien byæ szybki)</li><li>powrót do pozycji startowej w celu powtórzenia æwiczenia  (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseThreePart1.setStyleName("throughtExplanationOfExerciseThreePart1");
			throughtExplanationOfExerciseThreePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseThreePart2.setStyleName("throughtExplanationOfExerciseThreePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseThreeLayout().init();
	}
}
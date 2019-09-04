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
class ExerciseThirtyOneFactory {

	private class ExerciseThirtyOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseThirtyOnePart1;
		private Label throughtExplanationOfExerciseThirtyOnePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseThirtyOneLayout init() {

			Label topicOfExerciseThirtyOne = new Label(ExercisesTitles.TOPIC_THIRTY_ONE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseThirtyOne);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/31.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseThirtyOnePart1,
							throughtExplanationOfExerciseThirtyOnePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseThirtyOnePart1 = new Label(
					"<b>W pozycji stoj¹cej grzbiet wyprostowany, barki przylegaj¹ do oparæ przyrz¹du,  rozstaw koñczyn dolnych wyprostowanych w kolanach taki jak rozstaw barków<br>"
							+ "stopa ustawiona tak aby tylko œródstopie by³o ustawione na przyrz¹dzie, stopy zadarte do góry w wyniku czego obni¿one s¹ pozycje piêt, ramiona zgiête <br>"
							+ " w ³okciach, r¹czki przysz¹du trzymane nachwytem:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseThirtyOnePart2 = new Label(
					"<b><ul><li> wzi¹æ wdech i wspi¹æ siê na palce powoduj¹c napiêcie ³ydek, przytrzymaæ przez krótki okres ok. 1-2 sek. (ruch w tej fazie powinien byæ szybszy)</li>"
							+ "<li>powróciæ do pozycji wyjœciowej wykonuj¹c wydech, piêta ponownie znajduje siê poni¿ej poziomu palców (ruch w tej fazie powinien byæ wolniejszy <br>"
							+ "w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseThirtyOnePart1.setStyleName("throughtExplanationOfExerciseThirtyOnePart1");
			throughtExplanationOfExerciseThirtyOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseThirtyOnePart2.setStyleName("throughtExplanationOfExerciseThirtyOnePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseThirtyOneLayout().init();
	}
}
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
class ExerciseFifteenFactory {

	private class ExerciseFifteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseFifteenPart1;
		private Label throughtExplanationOfExcerciseFifteenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFifteenLayout init() {

			Label topicOfExerciseFifteen = new Label(ExercisesTitles.TOPIC_FIFTEEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseFifteen);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/15.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExcerciseFifteenPart1,
							throughtExplanationOfExcerciseFifteenPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExcerciseFifteenPart1 = new Label(
					"<b>W pozycji stoj�cej, r�czka wyci�gu g�rnego trzymana nachwytem. Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet<br>"
							+ " w trakcie wykonywania tego �wiczenia, z lekkim wypi�ciem klatki piersiowej podczas wykonywania tego �wiczenia<br>"
							+ " jak r�wnie� na to aby w fazie ko�cowej (zgi�cia przedramion), maksymalne zgi�cie przedramion <br>"
							+ "  tworzy�o pomi�dzy przedramieniem a ramieniem k�t 90 stopni:<br>",
					ContentMode.HTML);

			throughtExplanationOfExcerciseFifteenPart2 = new Label(
					"<b><ul><li>wzi�� wdech i wyprostowa� przedramiona, nie odrywaj�c �okci od tu�owia (ruch w tej fazie powinien by� szybki)</li><li>wykona� wydech w ko�cowej fazie ruchu  (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExcerciseFifteenPart1.setStyleName("throughtExplanationOfExcerciseFifteenPart1");
			throughtExplanationOfExcerciseFifteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExcerciseFifteenPart2.setStyleName("throughtExplanationOfExcerciseFifteenPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseFifteenLayout().init();
	}
}
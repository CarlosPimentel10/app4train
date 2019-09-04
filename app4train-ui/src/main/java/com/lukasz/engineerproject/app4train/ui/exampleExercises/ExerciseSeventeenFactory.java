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
class ExerciseSeventeenFactory {

	private class ExerciseSeventeenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseSeventeenPart1;
		private Label throughtExplanationOfExcerciseSeventeenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseSeventeenLayout init() {

			Label topicOfExerciseSeventeen = new Label(ExercisesTitles.TOPIC_SEVENTEEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseSeventeen);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/17.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExcerciseSeventeenPart1,
							throughtExplanationOfExcerciseSeventeenPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExcerciseSeventeenPart1 = new Label(
					"<b>W pozycji stoj¹cej, linka trzymana obur¹cz nachwytem. Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet, z lekkim<br></b>"
							+ "<b>wypiêciem klatki piersiowej podczas wykonywania tego æwiczenia, jak równie¿ na to aby w fazie koñcowej ( zgiêcia przedramion)</b><br>"
							+ "<b>przedramion), maksymalny k¹t pomiêdzy przedramieniem a ramieniem nie przekracza³ 90 stopni:</b>",
					ContentMode.HTML);

			throughtExplanationOfExcerciseSeventeenPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech i wyporstowaæ przedramiona, trzymaj¹c ³okcie w jednej pozycji wzd³uz tu³owia (ruch w tej fazie powinien byæ szybki)</li><li>wykonaæ wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExcerciseSeventeenPart1.setStyleName("throughtExplanationOfExcerciseSeventeenPart1");
			throughtExplanationOfExcerciseSeventeenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExcerciseSeventeenPart2.setStyleName("throughtExplanationOfExcerciseSeventeenPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}
	}

	public Component createComponent() {
		return new ExerciseSeventeenLayout().init();
	}
}
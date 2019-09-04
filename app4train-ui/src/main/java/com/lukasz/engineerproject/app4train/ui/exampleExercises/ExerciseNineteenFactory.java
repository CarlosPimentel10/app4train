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
class ExerciseNineteenFactory {

	private class ExerciseNineteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseNineteenPart1;
		private Label throughtExplanationOfExerciseNineteenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseNineteenLayout init() {

			Label topicOfExerciseNineteen = new Label(ExercisesTitles.TOPIC_NINETEEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseNineteen);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/19.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseNineteenPart1,
							throughtExplanationOfExerciseNineteenPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseNineteenPart1 = new Label(
					"<b>Hantla trzymana w jednej r�ce nachwytem, druga r�ka jak r�wnie� zgi�ta w kolanie ko�czyna dolna oparte s� na �awce<br>"
							+ "Zwr�ci� uwag� na utrzymanie zablokowanego grzbietu aby nie dosz�o do nadmiernej krzywizny kr�gos�upa: <br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseNineteenPart2 = new Label(
					"<b><ul><li>wzi�� wdech i podci�gn�� w okolice biodra odwodz�c �okie� do ty�u, utrzymuj�c rami� przy tu�owiu (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li><li>opu�ci� hantle do pozycji poczatkowej wykonujac wydech (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseNineteenPart1.setStyleName("throughtExplanationOfExerciseNineteenPart1");
			throughtExplanationOfExerciseNineteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseNineteenPart2.setStyleName("throughtExplanationOfExerciseNineteenPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseNineteenLayout().init();
	}
}
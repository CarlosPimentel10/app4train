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
class ExerciseThirtyFiveFactory {

	private class ExerciseThirtyFiveLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseThirtyFivePart1;
		private Label throughtExplanationOfExerciseThirtyFivePart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseThirtyFiveLayout init() {

			Label topicOfExerciseThirtyFive = new Label(ExercisesTitles.TOPIC_THIRTY_FIVE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseThirtyFive);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/35.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseThirtyFivePart1,
							throughtExplanationOfExerciseThirtyFivePart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseThirtyFivePart1 = new Label(
					"<b>W pozycji stoj�cej, grzbiet wyprostowany, \r\n"
							+ " ko�czyny dolne w lekkim rozkroku na szeroko�� bark�w, ramiona zgi�t�, trzymaj� kettlebell <br>"
							+ "na wysoko�ci klatki piersiowej Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie<br>"
							+ "wykonywania tego �wiczenia, jak r�wnie� na to, by ci�ar by� wypychany z pi�t a nie z palc�w st�p:",
					ContentMode.HTML);

			throughtExplanationOfExerciseThirtyFivePart2 = new Label(
					"<b><ul><li> wzi�� wdech i wspi�� si� na palce powoduj�c napi�cie �ydek, przytrzyma� przez kr�tki okres ok. 1-2 sek. (ruch w tej fazie powinien by� szybszy)</li>"
							+ "<li>powr�ci� do pozycji wyj�ciowej wykonuj�c wydech, pi�ta ponownie znajduje si� poni�ej poziomu palc�w (ruch w tej fazie powinien by� wolniejszy <br>"
							+ "w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseThirtyFivePart1.setStyleName("throughtExplanationOfExerciseThirtyFivePart1");
			throughtExplanationOfExerciseThirtyFivePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseThirtyFivePart2.setStyleName("throughtExplanationOfExerciseThirtyFivePart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseThirtyFiveLayout().init();
	}
}
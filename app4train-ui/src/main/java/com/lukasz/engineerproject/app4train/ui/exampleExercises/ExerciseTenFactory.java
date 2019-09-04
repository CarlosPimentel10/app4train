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
class ExerciseTenFactory {

	private class ExerciseTenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTenPart1;
		private Label throughtExplanationOfExerciseTenPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTenLayout init() {

			Label topicOfExerciseTen = new Label(ExercisesTitles.TOPIC_TEN.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTen);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/10.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTenPart1,
							throughtExplanationOfExerciseTenPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTenPart1 = new Label(
					"<b>W pozycji stoj¹cej, koñczyny dolne ustawione w lekkim rozkroku, sztanga trzymana nachwytem przy udach, rozstaw r¹k<br>"
							+ " trzymaj¹cych sztangê powinien byæ nieco szerszy ni¿ rozstaw barków. Zwróciæ szczególn¹ uwagê na wyprostowany <br>"
							+ " grzbiet w trakcie wykonywania tego æwiczenia:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseTenPart2 = new Label(
					"<b><ul><li> wzi¹æ wdech a nastêpnie podci¹gnaæ wzd³u¿ tu³owia sztangê pod brodê, unosz¹c ³okcie jak najwy¿ej jest to mo¿liwe (ruch w tej fazie powinien byæ szybki)</li><li>opuszczaj¹c sztangê, wracamy do pozycji wyjœciowej  wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseTenPart1.setStyleName("throughtExplanationOfExerciseTenPart1");
			throughtExplanationOfExerciseTenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTenPart2.setStyleName("throughtExplanationOfExerciseTenPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTenLayout().init();
	}
}
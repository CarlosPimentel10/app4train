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
class ExerciseThirtyTwoFactory {

	private class ExerciseThirtyTwoLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseThirtyTwoPart1;
		private Label throughtExplanationOfExerciseThirtyTwoPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseThirtyTwoLayout init() {

			Label topicOfExerciseThirtyTwo = new Label(ExercisesTitles.TOPIC_THIRTY_TWO.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseThirtyTwo);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/32.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseThirtyTwoPart1,
							throughtExplanationOfExerciseThirtyTwoPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseThirtyTwoPart1 = new Label(
					"<b>W pozycji stoj¹cej, sztanga trzymana podchwytem, \r\n"
							+ "szerokoœæ rozstawu r¹k powinna byæ wiêksza ni¿ rozstaw<br>"
							+ " barków, tu³ów pochylony pod k¹tem 45 stopni do przodu. Zwróciæ szczególna uwagê na to aby sztanga przyci¹gana by³a<br>"
							+ " w niewielkiej odleg³oœci od ud, kieruj¹c j¹ w okolice brzucha, jak równie¿ na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseThirtyTwoPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech i przyci¹gn¹æ sztangê w okolice brzucha \r\n"
							+ "(ruch w tej fazie powinien byæ szybki)</li><li>powrót do pozycji startowej wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseThirtyTwoPart1.setStyleName("throughtExplanationOfExerciseThirtyTwoPart1");
			throughtExplanationOfExerciseThirtyTwoPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseThirtyTwoPart2.setStyleName("throughtExplanationOfExerciseThirtyTwoPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseThirtyTwoLayout().init();
	}
}
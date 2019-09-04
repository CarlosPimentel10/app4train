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
public class ExerciseFortyFactory {

	private class ExerciseFortyLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseFortyPart1;
		private Label throughtExplanationOfExerciseFortyPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFortyLayout init() {

			Label topicOfExerciseForty = new Label(ExercisesTitles.TOPIC_FORTY.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseForty);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/40.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseFortyPart1,
							throughtExplanationOfExerciseFortyPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseFortyPart1 = new Label(
					"<b>Zwr�� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseFortyPart2 = new Label(
					"<b><ul><li>Po�� si� p�asko na brzuchu</li>"
							+ "<li>u�� d�onie na ziemi, po obu stronach tu�owia. Powinny by� rozstawione nieco szerzej <br>"
							+ "ni� rozstaw bark�w, na wysoko�ci ramion</li>"
							+ "<li>nogi ugi�te w kolanach, stopy skrzy�owany i uniesione do g�ry </li>"
							+ "<li>wyprostuj r�ce w �okciach, jednocze�nie unosz�c tu��w do g�ry</li>"
							+ "<li>ugnij r�ce a nast�pnie op�� tu��w najni�ej jak potrafisz ale nie do samej ziemi</li>"
							+ "<li>ponownie wyprostuj r�ce a nast�pnie unie� si� do g�ry</li><br></ul><br></b>",
					ContentMode.HTML);

			throughtExplanationOfExerciseFortyPart1.setStyleName("throughtExplanationOfExerciseFortyPart1");
			throughtExplanationOfExerciseFortyPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseFortyPart2.setStyleName("throughtExplanationOfExerciseFortyPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseFortyLayout().init();
	}
}
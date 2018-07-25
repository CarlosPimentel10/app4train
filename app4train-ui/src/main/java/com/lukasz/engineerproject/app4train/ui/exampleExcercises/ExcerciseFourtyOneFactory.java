package com.lukasz.engineerproject.app4train.ui.exampleExcercises;

import java.io.File;
import com.lukasz.engineerproject.app4train.utils.UtilsForExcercisesTitles;
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
public class ExcerciseFourtyOneFactory {

	private class ExcerciseFourtyOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseFourtyOnePart1;
		private Label throughtExplanationOfExcerciseFourtyOnePart2;
		private Label topicOfOfExcerciseFourtyOne;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseFourtyOneLayout init() {

			topicOfOfExcerciseFourtyOne = new Label(UtilsForExcercisesTitles.TOPIC_FOURTYONE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/41.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseFourtyOnePart1 = new Label(
							"<b>W pozycji le¿¹cej na plecach na macie, kettlebell powinien byæ trzymany nachwytem, stopy ustawione na pod³o¿u w celu zachowania stabilnej pozycji: <br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseFourtyOnePart2 = new Label(
							"<b><ul><li>wzi¹æ wdech i zgi¹æ przedramiona, na wysokoœæ czo³a, staraj¹c siê nie odwodziæ w bok ³okci w trakcie opuszczania sztangi <br>"
									+ "(ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li><li>powróciæ do pozycji wyjœciowej wykonuj¹c wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseFourtyOnePart1,
							throughtExplanationOfExcerciseFourtyOnePart2, video);

					throughtExplanationOfExcerciseFourtyOnePart1.setStyleName("throughtExplanationOfExcerciseFourtyOnePart1");
					throughtExplanationOfExcerciseFourtyOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseFourtyOnePart2.setStyleName("throughtExplanationOfExcerciseFourtyOnePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseFourtyOne);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseFourtyOneLayout().init();
	}
}
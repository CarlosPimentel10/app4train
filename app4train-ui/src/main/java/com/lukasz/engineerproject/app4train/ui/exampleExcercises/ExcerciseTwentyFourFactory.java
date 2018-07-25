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
public class ExcerciseTwentyFourFactory {

	private class ExcerciseTwentyFourLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwentyFourPart1;
		private Label throughtExplanationOfExcerciseTwentyFourPart2;
		private Label topicOfOfExcerciseTwentyFour;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwentyFourLayout init() {

			topicOfOfExcerciseTwentyFour = new Label(UtilsForExcercisesTitles.TOPIC_TWENTYFOUR.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/24.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwentyFourPart1 = new Label(
							"<b>W pozycji stoj¹cej, stanga trzymana podchwytem (rozstaw r¹k nieco wiêksz¹ ni¿ rozstaw barków). Zwracaæ szczególn¹ uwagê<br>"
									+ " na to aby mieæ wyprostowany grzbiet oraz aby przy zgiêciu przedramion nie poruszaæ klatk¹ piersiow¹ (stabilna pozycja):",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwentyFourPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech i zgi¹æ przedramiona (ruch w tej fazie powinien byæ szybki)</li><li>wykonaæ wydech w koñcowej fazie ruchu</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwentyFourPart1,
							throughtExplanationOfExcerciseTwentyFourPart2, video);

					throughtExplanationOfExcerciseTwentyFourPart1.setStyleName("throughtExplanationOfExcerciseTwentyFourPart1");
					throughtExplanationOfExcerciseTwentyFourPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwentyFourPart2.setStyleName("throughtExplanationOfExcerciseTwentyFourPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwentyFour);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwentyFourLayout().init();
	}
}
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
public class ExcerciseSixteenFactory {

	private class ExcerciseSixteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseSixteenPart1;
		private Label throughtExplanationOfExcerciseSixteenPart2;
		private Label topicOfOfExcerciseSixteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseSixteenLayout init() {

			topicOfOfExcerciseSixteen = new Label(UtilsForExcercisesTitles.TOPIC_SIXTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/16.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseSixteenPart1 = new Label(
							"<b>W pozycji le¿¹cej na plecach na ³awce, sztanga powinna byæ trzymana nachwytem, ramiona ustawione pionowo w stosunku<br>"
									+ " do ³awki, stopy ustawione na pod³o¿u w celu zachowania stabilnej pozycji:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseSixteenPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech i zgi¹æ przedramiona, na wysokoœæ czo³a, staraj¹c siê nie odwodziæ w bok ³okci w trakcie opuszczania sztangi <br>"
									+ "(ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li><li>powróciæ do pozycji wyjœciowej wykonuj¹c wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseSixteenPart1,
							throughtExplanationOfExcerciseSixteenPart2, video);

					throughtExplanationOfExcerciseSixteenPart1.setStyleName("throughtExplanationOfExcerciseSixteenPart1");
					throughtExplanationOfExcerciseSixteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseSixteenPart2.setStyleName("throughtExplanationOfExcerciseSixteenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseSixteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseSixteenLayout().init();
	}
}
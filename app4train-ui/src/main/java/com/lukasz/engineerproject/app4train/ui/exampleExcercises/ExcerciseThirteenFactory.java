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
public class ExcerciseThirteenFactory {

	private class ExcerciseThirteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseThirteenPart1;
		private Label throughtExplanationOfExcerciseThirteenPart2;
		private Label topicOfOfExcerciseThirteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseThirteenLayout init() {

			topicOfOfExcerciseThirteen = new Label(UtilsForExcercisesTitles.TOPIC_THIRTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/13.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseThirteenPart1 = new Label(
							"<b>W pozycji siedz¹cej, twarz¹ do maszyny, klatka wsparta na operciu, r¹czki przyrz¹du trzymane <br>"
									+ "nachwytem, ramiona wyci¹gniête w przód:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseThirteenPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech a nastêpnie odwieœæ do ty³u ramiona dokonuj¹c œci¹gniêcia ³opatek w koñcowej fazie ruchu (ruch w tej fazie powinien byæ szybki)</li><li> powróciæ to pozycji wyjœciowej wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseThirteenPart1,
							throughtExplanationOfExcerciseThirteenPart2, video);

					throughtExplanationOfExcerciseThirteenPart1.setStyleName("throughtExplanationOfExcerciseThirteenPart1");
					throughtExplanationOfExcerciseThirteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseThirteenPart2.setStyleName("throughtExplanationOfExcerciseThirteenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseThirteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseThirteenLayout().init();
	}
}
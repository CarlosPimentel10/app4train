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
public class ExcerciseTwentyTwoFactory {

	private class ExcerciseTwentyTwoLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwentyTwoPart1;
		private Label throughtExplanationOfExcerciseTwentyTwoPart2;
		private Label topicOfOfExcerciseTwentyTwo;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwentyTwoLayout init() {

			topicOfOfExcerciseTwentyTwo = new Label(UtilsForExcercisesTitles.TOPIC_TWENTYTWO.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/22.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwentyTwoPart1 = new Label(
							"<b>W pozycji siedz¹cej na przyrz¹dzie, ramiona maj¹ byæ wyci¹gniête, ³okcie oparte na ³awce, natomiast sztanga trzymana podchwytem:<br>"
									+ "Jest to æwiczenie, które stopniowo zwiêksza obci¹¿enie miêœnia dokonuj¹c wyprostu ramion. Zwróciæ szczególn¹  <br>"
									+ "uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
							ContentMode.HTML);
					throughtExplanationOfExcerciseTwentyTwoPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech a nastêpnie zgi¹æ ramiona (ruch w tej fazie powinien byæ szybki)</li><li>wykonaæ wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwentyTwoPart1,
							throughtExplanationOfExcerciseTwentyTwoPart2, video);

					throughtExplanationOfExcerciseTwentyTwoPart1.setStyleName("throughtExplanationOfExcerciseTwentyTwoPart1");
					throughtExplanationOfExcerciseTwentyTwoPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwentyTwoPart2.setStyleName("throughtExplanationOfExcerciseTwentyTwoPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwentyTwo);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwentyTwoLayout().init();
	}
}
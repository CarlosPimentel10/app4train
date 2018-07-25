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
public class ExcerciseEighteenFactory {

	private class ExcerciseEighteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseEighteenPart1;
		private Label throughtExplanationOfExcerciseEighteenPart2;
		private Label topicOfOfExcerciseEighteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseEighteenLayout init() {

			topicOfOfExcerciseEighteen = new Label(UtilsForExcercisesTitles.TOPIC_EIGHTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/18.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseEighteenPart1 = new Label(
							"<b>W pozycji stoj¹cej dr¹¿ek wyci¹gu górnego trzymany podchwytem, ustawienie twarz¹ do przyrz¹du. Zwróciæ szczególn¹ uwagê<br>"
									+ "na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseEighteenPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech i wyprostowaæ przedramiona (ruch w tej fazie powinien byæ szybki)</li><li>powróciæ do pozycji wyjœciowej wykonuj¹æ wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseEighteenPart1,
							throughtExplanationOfExcerciseEighteenPart2, video);
					throughtExplanationOfExcerciseEighteenPart1.setStyleName("throughtExplanationOfExcerciseEighteenPart1");
					throughtExplanationOfExcerciseEighteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseEighteenPart2.setStyleName("throughtExplanationOfExcerciseEighteenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseEighteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseEighteenLayout().init();
	}
}
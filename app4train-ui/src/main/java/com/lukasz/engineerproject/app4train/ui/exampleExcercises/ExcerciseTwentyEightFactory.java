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
public class ExcerciseTwentyEightFactory {

	private class ExcerciseTwentyEightLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwentyEightPart1;
		private Label throughtExplanationOfExcerciseTwentyEightPart2;
		private Label topicOfOfExcerciseTwentyEight;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwentyEightLayout init() {

			topicOfOfExcerciseTwentyEight = new Label(UtilsForExcercisesTitles.TOPIC_TWENTYEIGHT.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/28.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwentyEightPart1 = new Label(
							"<b>W pozycji stoj¹cej na platformie suwnicy, grzbiet wyprostowany, \r\n"
									+ " koñczyny dolne w lekkim rozkroku na szerokoœæ barków, stopy nieco wysuniête <br>"
									+ "ku przodowi ustawione równolegle, biodra przylegaj¹ do powierzchni oparcia, ramiona zgiête, uchwyty<br>"
									+ " suwnicy trzymane nachwytem. Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia<br>"
									+ "jak równie¿ na to, by ciê¿ar by³ wypychany z piêt a nie z palców stóp:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwentyEightPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech jednoszeœnie opuszczaj¹c siê do poziomu gdy nogi zgiête bêd¹ pod k¹tem 90 stopni lub nieco mniejszym tak aby ca³y czas czuæ napiêcie <br>"
									+ "miêœni czworog³owych (ruch w tej fazie powinien byæ wolniejszy \r\n"
									+ "w celu odpowiedniego rozci¹gniêcia miêœni)</li><li>powróciæ do pozycji startowej wykonuj¹c wydech w \r\n"
									+ "koñcowej fazie ruchu (ruch w tej fazie powinien byæ szybki).</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwentyEightPart1,
							throughtExplanationOfExcerciseTwentyEightPart2, video);

					throughtExplanationOfExcerciseTwentyEightPart1.setStyleName("throughtExplanationOfExcerciseTwentyEightPart1");
					throughtExplanationOfExcerciseTwentyEightPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwentyEightPart2.setStyleName("throughtExplanationOfExcerciseTwentyEightPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwentyEight);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwentyEightLayout().init();
	}
}
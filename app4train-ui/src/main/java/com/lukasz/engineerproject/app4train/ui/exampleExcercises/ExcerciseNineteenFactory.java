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
public class ExcerciseNineteenFactory {

	private class ExcerciseNineteenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseNineteenPart1;
		private Label throughtExplanationOfExcerciseNineteenPart2;
		private Label topicOfOfExcerciseNineteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseNineteenLayout init() {

			topicOfOfExcerciseNineteen = new Label(UtilsForExcercisesTitles.TOPIC_NINETEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/19.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseNineteenPart1 = new Label(
							"<b>Hantla trzymana w jednej rêce nachwytem, druga rêka jak równie¿ zgiêta w kolanie koñczyna dolna oparte s¹ na ³awce<br>"
									+ "Zwróciæ uwagê na utrzymanie zablokowanego grzbietu aby nie dosz³o do nadmiernej krzywizny krêgos³upa: <br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseNineteenPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech i podci¹gn¹æ w okolice biodra odwodz¹c ³okieæ do ty³u, utrzymuj¹c ramiê przy tu³owiu (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li><li>opuœciæ hantle do pozycji poczatkowej wykonujac wydech (ruch w tej fazie powinien byæ szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseNineteenPart1,
							throughtExplanationOfExcerciseNineteenPart2, video);

					throughtExplanationOfExcerciseNineteenPart1.setStyleName("throughtExplanationOfExcerciseNineteenPart1");
					throughtExplanationOfExcerciseNineteenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseNineteenPart2.setStyleName("throughtExplanationOfExcerciseNineteenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseNineteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseNineteenLayout().init();
	}
}
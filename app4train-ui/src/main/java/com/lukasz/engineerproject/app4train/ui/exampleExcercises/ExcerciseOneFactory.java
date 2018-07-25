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
public class ExcerciseOneFactory {

	private class ExcerciseOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseOnePart1;
		private Label throughtExplanationOfExcerciseOnePart2;
		private Label topicOfOfExcerciseOne;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseOneLayout init() {

			topicOfOfExcerciseOne = new Label(UtilsForExcercisesTitles.TOPIC_ONE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/1.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setSizeUndefined();
					video.setCaption("Film instruktarzowy");

					throughtExplanationOfExcerciseOnePart1 = new Label(
							"<b>W pozycji le��cej na plecach na w�skiej �awce, hantelki trzymane podchwytem, ramiona lekko zgi�te w �okciach wyci�gni�te w g�r�:</b><br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseOnePart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie roz�o�y� ramiona do poziomu ruchem w pe�ni okr�g�ym (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li><li>powr�t do pozycji startowej wykonuj�c wydech (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseOnePart1,
							throughtExplanationOfExcerciseOnePart2, video);

					throughtExplanationOfExcerciseOnePart1.setStyleName("throughtExplanationOfExcerciseOnePart1");
					throughtExplanationOfExcerciseOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseOnePart2.setStyleName("throughtExplanationOfExcerciseOnePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseOne);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseOneLayout().init();
	}
}
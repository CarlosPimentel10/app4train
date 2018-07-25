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
public class ExcerciseTwelveFactory {

	private class ExcerciseTwelveLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwelvePart1;
		private Label throughtExplanationOfExcerciseTwelvePart2;
		private Label topicOfOfExcerciseTwelve;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwelveLayout init() {

			topicOfOfExcerciseTwelve = new Label(UtilsForExcercisesTitles.TOPIC_TWELVE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/12.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwelvePart1 = new Label(
							"<b>W pozycji stoj�cej na platformie suwnicy, grzbiet wyprostowany, \r\n"
									+ " ko�czyny dolne w lekkim rozkroku na szeroko�� bark�w, stopy\r\n"
									+ " nieco wysuni�te <br>" + "ku przodowi ustawione r�wnolegle, biodra\r\n"
									+ " przylegaj� do powierzchni oparcia, ramiona zgi�te, uchwyty\r\n"
									+ " suwnicy trzymane nachwytem. Zwr�ci� szczeg�ln� <br>"
									+ "uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia jak r�wnie� na to, by ci�ar by� wypychany z pi�t a nie z palc�w st�p:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwelvePart2 = new Label(
							"<b><ul><li>wzi�� wdech jednosze�nie opuszczaj�c si� do poziomu gdy nogi \r\n"
									+ "zgi�te b�d� pod k�tem 90 stopni lub nieco mniejszym tak \r\n"
									+ "aby ca�y czas czu� napi�cie<br>"
									+ "mi�ni czworog�owych (ruch w tej fazie powinien by� wolniejszy \r\n"
									+ "w celu odpowiedniego rozci�gni�cia mi�ni)</li><li>powr�ci� do pozycji startowej wykonuj�c wydech w \r\n"
									+ "ko�cowej fazie ruchu (ruch w tej fazie powinien by� szybki)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwelvePart1,
							throughtExplanationOfExcerciseTwelvePart2, video);

					throughtExplanationOfExcerciseTwelvePart1.setStyleName("throughtExplanationOfExcerciseTwelvePart1");
					throughtExplanationOfExcerciseTwelvePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwelvePart2.setStyleName("throughtExplanationOfExcerciseTwelvePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwelve);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwelveLayout().init();
	}
}
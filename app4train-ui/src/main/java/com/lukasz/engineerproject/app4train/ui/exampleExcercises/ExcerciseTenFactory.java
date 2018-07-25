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
public class ExcerciseTenFactory {

	private class ExcerciseTenLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTenPart1;
		private Label throughtExplanationOfExcerciseTenPart2;
		private Label topicOfOfExcerciseTen;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTenLayout init() {

			topicOfOfExcerciseTen = new Label(UtilsForExcercisesTitles.TOPIC_TEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/10.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTenPart1 = new Label(
							"<b>W pozycji stoj�cej, ko�czyny dolne ustawione w lekkim rozkroku, sztanga trzymana nachwytem przy udach, rozstaw r�k<br>"
									+ " trzymaj�cych sztang� powinien by� nieco szerszy ni� rozstaw bark�w. Zwr�ci� szczeg�ln� uwag� na wyprostowany <br>"
									+ " grzbiet w trakcie wykonywania tego �wiczenia:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTenPart2 = new Label(
							"<b><ul><li> wzi�� wdech a nast�pnie podci�gna� wzd�u� tu�owia sztang� pod brod�, unosz�c �okcie jak najwy�ej jest to mo�liwe (ruch w tej fazie powinien by� szybki)</li><li>opuszczaj�c sztang�, wracamy do pozycji wyj�ciowej  wykonuj�c wydech (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTenPart1,
							throughtExplanationOfExcerciseTenPart2, video);

					throughtExplanationOfExcerciseTenPart1.setStyleName("throughtExplanationOfExcerciseTenPart1");
					throughtExplanationOfExcerciseTenPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTenPart2.setStyleName("throughtExplanationOfExcerciseTenPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTenLayout().init();
	}
}
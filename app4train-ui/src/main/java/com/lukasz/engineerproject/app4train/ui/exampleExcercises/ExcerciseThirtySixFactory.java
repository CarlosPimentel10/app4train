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
public class ExcerciseThirtySixFactory {

	private class ExcerciseThirtySixLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseThirtySixPart1;
		private Label throughtExplanationOfExcerciseThirtySixPart2;
		private Label topicOfOfExcerciseThirtySix;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseThirtySixLayout init() {

			topicOfOfExcerciseThirtySix = new Label(UtilsForExcercisesTitles.TOPIC_THIRTYSIX.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/36.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseThirtySixPart1 = new Label(
							"<b>W pozycji le��cej na �awce sko�nej, hantle trzymane na wysoko�ci klatki piersiowej, tak aby kciuk by� skierowany w kierunku naszego cia�a.<br>"
									+ " Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia oraz na stabiln� pozycj�:",
							ContentMode.HTML);


					throughtExplanationOfExcerciseThirtySixPart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie wycisn�� hantle do wyprostu �okci, nie wykonujemy �adnej rotacji nadgarstkami (ruch w tej fazie powinien by� szybki)</li><li>wracamy do pozycji wyj�ciowej wykonuj�c wydech (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseThirtySixPart1,
							throughtExplanationOfExcerciseThirtySixPart2, video);

					throughtExplanationOfExcerciseThirtySixPart1.setStyleName("throughtExplanationOfExcerciseThirtySixPart1");
					throughtExplanationOfExcerciseThirtySixPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseThirtySixPart2.setStyleName("throughtExplanationOfExcerciseThirtySixPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseThirtySix);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseThirtySixLayout().init();
	}
}
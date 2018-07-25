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
public class ExcerciseThirtyFactory {

	private class ExcerciseThirtyLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseThirtyPart1;
		private Label throughtExplanationOfExcerciseThirtyPart2;
		private Label topicOfOfExcerciseSixteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseThirtyLayout init() {

			topicOfOfExcerciseSixteen = new Label(UtilsForExcercisesTitles.TOPIC_THIRTY.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/30.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseThirtyPart1 = new Label(
							"<b>W pozycji stoj�cej, ko�czyny dolne ustawione w lekkim rozkroku, jedna z nich przytrzymuje gum� oporow� nachwytem, ramiona ustawione wzd�u� tu�owia,<br>"
									+ " lekko zgi�te �okcie. Po wynonaniu �wiczenia jedn� r�k� wykonujemy identyczny ruch przy wykorzystaniu drugiej r�ki, przytrzymuj�c"
									+ " gum� oporow� drug� nog�.<br>"
									+ " Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia:",
									ContentMode.HTML);

					throughtExplanationOfExcerciseThirtyPart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie unie�� rami� do poziomu (ruch w tej fazie powinien by� szybki)</li><li>wracamy do pozycji wyj�ciowej wykonuj�c wydech (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseThirtyPart1,
							throughtExplanationOfExcerciseThirtyPart2, video);

					throughtExplanationOfExcerciseThirtyPart1.setStyleName("throughtExplanationOfExcerciseThirtyPart1");
					throughtExplanationOfExcerciseThirtyPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseThirtyPart2.setStyleName("throughtExplanationOfExcerciseThirtyPart2");
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
		return new ExcerciseThirtyLayout().init();
	}
}
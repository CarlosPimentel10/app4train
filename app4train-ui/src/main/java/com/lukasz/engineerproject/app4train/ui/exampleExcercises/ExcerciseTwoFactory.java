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
public class ExcerciseTwoFactory {

	private class ExcerciseTwoLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseTwoPart1;
		private Label throughtExplanationOfExcerciseTwoPart2;
		private Label topicOfOfExcerciseTwo;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseTwoLayout init() {

			topicOfOfExcerciseTwo = new Label(UtilsForExcercisesTitles.TOPIC_TWO.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/2.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseTwoPart1 = new Label(
							"<b>W pozycji siedz�cej na przyrz�dzie, �okcie zgi�te, ramiona ustawione poziomo, r�czki przyrz�du trzymane nachwytem, przedramiona oparte o podp�rki przyrz�du:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTwoPart2 = new Label(
							"<b><ul><li>wzi�� wdech a nast�pnie przyci�gn�� do siebie ramiona (ruch w tej fazie powinien by� szybki)</li><li>powr�t do pozycji startowej wykonuj�c wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseTwoPart1,
							throughtExplanationOfExcerciseTwoPart2, video);

					throughtExplanationOfExcerciseTwoPart1.setStyleName("throughtExplanationOfExcerciseTwoPart1");
					throughtExplanationOfExcerciseTwoPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseTwoPart2.setStyleName("throughtExplanationOfExcerciseTwoPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseTwo);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseTwoLayout().init();
	}
}
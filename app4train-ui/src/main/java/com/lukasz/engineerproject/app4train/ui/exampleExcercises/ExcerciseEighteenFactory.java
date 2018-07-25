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
							"<b>W pozycji stoj�cej dr��ek wyci�gu g�rnego trzymany podchwytem, ustawienie twarz� do przyrz�du. Zwr�ci� szczeg�ln� uwag�<br>"
									+ "na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia:",
							ContentMode.HTML);

					throughtExplanationOfExcerciseEighteenPart2 = new Label(
							"<b><ul><li>wzi�� wdech i wyprostowa� przedramiona (ruch w tej fazie powinien by� szybki)</li><li>powr�ci� do pozycji wyj�ciowej wykonuj�� wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
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
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
							"<b>W pozycji stoj¹cej, koñczyny dolne ustawione w lekkim rozkroku, sztanga trzymana nachwytem przy udach, rozstaw r¹k<br>"
									+ " trzymaj¹cych sztangê powinien byæ nieco szerszy ni¿ rozstaw barków. Zwróciæ szczególn¹ uwagê na wyprostowany <br>"
									+ " grzbiet w trakcie wykonywania tego æwiczenia:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseTenPart2 = new Label(
							"<b><ul><li> wzi¹æ wdech a nastêpnie podci¹gnaæ wzd³u¿ tu³owia sztangê pod brodê, unosz¹c ³okcie jak najwy¿ej jest to mo¿liwe (ruch w tej fazie powinien byæ szybki)</li><li>opuszczaj¹c sztangê, wracamy do pozycji wyjœciowej  wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
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
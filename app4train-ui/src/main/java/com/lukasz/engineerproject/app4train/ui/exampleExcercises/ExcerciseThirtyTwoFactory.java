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
public class ExcerciseThirtyTwoFactory {

	private class ExcerciseThirtyTwoLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseThirtyTwoPart1;
		private Label throughtExplanationOfExcerciseThirtyTwoPart2;
		private Label topicOfOfExcerciseThirtyTwo;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseThirtyTwoLayout init() {

			topicOfOfExcerciseThirtyTwo = new Label(UtilsForExcercisesTitles.TOPIC_THIRTYTWO.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/32.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseThirtyTwoPart1 = new Label(
							"<b>W pozycji stoj¹cej, sztanga trzymana podchwytem, \r\n"
									+ "szerokoœæ rozstawu r¹k powinna byæ wiêksza ni¿ rozstaw<br>"
									+ " barków, tu³ów pochylony pod k¹tem 45 stopni do przodu. Zwróciæ szczególna uwagê na to aby sztanga przyci¹gana by³a<br>"
									+ " w niewielkiej odleg³oœci od ud, kieruj¹c j¹ w okolice brzucha, jak równie¿ na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseThirtyTwoPart2 = new Label(
							"<b><ul><li>wzi¹æ wdech i przyci¹gn¹æ sztangê w okolice brzucha \r\n"
									+ "(ruch w tej fazie powinien byæ szybki)</li><li>powrót do pozycji startowej wykonuj¹c wydech (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseThirtyTwoPart1,
							throughtExplanationOfExcerciseThirtyTwoPart2, video);

					throughtExplanationOfExcerciseThirtyTwoPart1.setStyleName("throughtExplanationOfExcerciseThirtyTwoPart1");
					throughtExplanationOfExcerciseThirtyTwoPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseThirtyTwoPart2.setStyleName("throughtExplanationOfExcerciseThirtyTwoPart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseThirtyTwo);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseThirtyTwoLayout().init();
	}
}
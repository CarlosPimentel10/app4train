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
public class ExcerciseThreeFactory {

	private class ExcerciseThreeLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseThreePart1;
		private Label throughtExplanationOfExcerciseThreePart2;
		private Label topicOfOfExcerciseThree;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseThreeLayout init() {

			topicOfOfExcerciseThree = new Label(UtilsForExcercisesTitles.TOPIC_THREE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/3.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseThreePart1 = new Label(
							"<b>W pozycji stoj�cej, rozstaw n�g w lekkim rozkroku, tu��w lekko pochylony do przodu, r�czki wyci�gu g�rnego trzymane nachwytem<br>"
									+ "  lekko zgi�te ramiona w �okciach, ramiona roz�orzone. Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia<br>"
									+ " w niewielkiej odleg�o�ci od ud, kieruj�c j� w okolice brzucha, jak r�wnie� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseThreePart2 = new Label(
							"<b><ul><li>wzi�� wdech i dokona� przyci�gni�cia do siebie ramion tak, aby r�czki wyci�gu g�rnego by�y w niewielkiej odleg�o�ci od<br>"
									+ "siebie wykonuj�c wydech w ko�cowej fazie �ci�gni�cia (ruch w tej fazie powinien by� szybki)</li><li>powr�t do pozycji startowej w celu powt�rzenia �wiczenia  (ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gniecia mi�ni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseThreePart1,
							throughtExplanationOfExcerciseThreePart2, video);

					throughtExplanationOfExcerciseThreePart1.setStyleName("throughtExplanationOfExcerciseThreePart1");
					throughtExplanationOfExcerciseThreePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseThreePart2.setStyleName("throughtExplanationOfExcerciseThreePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseThree);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseThreeLayout().init();
	}
}
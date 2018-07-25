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
							"<b>W pozycji stoj¹cej, rozstaw nóg w lekkim rozkroku, tu³ów lekko pochylony do przodu, r¹czki wyci¹gu górnego trzymane nachwytem<br>"
									+ "  lekko zgiête ramiona w ³okciach, ramiona roz³orzone. Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia<br>"
									+ " w niewielkiej odleg³oœci od ud, kieruj¹c j¹ w okolice brzucha, jak równie¿ na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseThreePart2 = new Label(
							"<b><ul><li>wzi¹æ wdech i dokonaæ przyci¹gniêcia do siebie ramion tak, aby r¹czki wyci¹gu górnego by³y w niewielkiej odleg³oœci od<br>"
									+ "siebie wykonuj¹c wydech w koñcowej fazie œci¹gniêcia (ruch w tej fazie powinien byæ szybki)</li><li>powrót do pozycji startowej w celu powtórzenia æwiczenia  (ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
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
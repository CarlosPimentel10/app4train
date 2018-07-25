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
public class ExcerciseThirtyOneFactory {

	private class ExcerciseThirtyOneLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseThirtyOnePart1;
		private Label throughtExplanationOfExcerciseThirtyOnePart2;
		private Label topicOfOfExcerciseThirtyOne;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseThirtyOneLayout init() {

			topicOfOfExcerciseThirtyOne = new Label(UtilsForExcercisesTitles.TOPIC_THIRTYONE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/31.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseThirtyOnePart1 = new Label(
							"<b>W pozycji stoj¹cej grzbiet wyprostowany, barki przylegaj¹ do oparæ przyrz¹du,  rozstaw koñczyn dolnych wyprostowanych w kolanach taki jak rozstaw barków<br>"
									+ "stopa ustawiona tak aby tylko œródstopie by³o ustawione na przyrz¹dzie, stopy zadarte do góry w wyniku czego obni¿one s¹ pozycje piêt, ramiona zgiête <br>"
									+ " w ³okciach, r¹czki przysz¹du trzymane nachwytem:<br>",
							ContentMode.HTML);

					throughtExplanationOfExcerciseThirtyOnePart2 = new Label(
							"<b><ul><li> wzi¹æ wdech i wspi¹æ siê na palce powoduj¹c napiêcie ³ydek, przytrzymaæ przez krótki okres ok. 1-2 sek. (ruch w tej fazie powinien byæ szybszy)</li>"
									+ "<li>powróciæ do pozycji wyjœciowej wykonuj¹c wydech, piêta ponownie znajduje siê poni¿ej poziomu palców (ruch w tej fazie powinien byæ wolniejszy <br>"
									+ "w celu odpowiedniego rozci¹gniecia miêœni)</li></ul><br></b>",
							ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseThirtyOnePart1,
							throughtExplanationOfExcerciseThirtyOnePart2, video);

					throughtExplanationOfExcerciseThirtyOnePart1.setStyleName("throughtExplanationOfExcerciseThirtyOnePart1");
					throughtExplanationOfExcerciseThirtyOnePart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					throughtExplanationOfExcerciseThirtyOnePart2.setStyleName("throughtExplanationOfExcerciseThirtyOnePart2");
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseThirtyOne);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseThirtyOneLayout().init();
	}
}
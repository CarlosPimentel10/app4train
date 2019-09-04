package com.lukasz.engineerproject.app4train.ui.exampleExercises;

import java.io.File;

import com.lukasz.engineerproject.app4train.utils.ExercisesTitles;
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
class ExerciseTwentySixFactory {

	private class ExerciseTwentySixLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseTwentySixPart1;
		private Label throughtExplanationOfExerciseTwentySixPart2;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseTwentySixLayout init() {

			Label topicOfExerciseTwentySix = new Label(ExercisesTitles.TOPIC_TWENTY_SIX.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseTwentySix);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private Button prepareButton() {
			Button buttonForWindow = new Button();
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);
			return buttonForWindow;
		}

		private void buttonAction(Button buttonForWindow) {
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/cos26.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();

					layoutForLabelAndVideo.addComponents(
							throughtExplanationOfExerciseTwentySixPart1,
							throughtExplanationOfExerciseTwentySixPart2,
							video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseTwentySixPart1 = new Label(
					"<b>W pozycji stoj¹cej, hantle trzymane nachwytem wzd³u¿ tu³owia, ramiona wyprostowane, rozstaw koñczyn dolnych na szerokoœæ rozstawu braków, grzbiet wyprostowany <br>"
							+ "Zwróciæ szczególn¹ uwagê na wyprostowany grzbiet w trakcie wykonywania tego æwiczenia:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseTwentySixPart2 = new Label(
					"<b><ul><li>wzi¹æ wdech a nastêpnie jedn¹ nog¹ wykonujemy wykrok w przód  na tyle du¿y, aby kolano nogi wykrocznej nie<br>"
							+ "przekracza³o linii palców tej nogi, natomiast druga noga (nie æwiczona) w momencie wykroku jest lekko zgiêta w kolanie<br>"
							+ "(ruch w tej fazie powinien byæ wolniejszy w celu odpowiedniego rozci¹gniêcia miêœni)</li>"
							+ "<li>powrót do pozycji wyjœciowej wykonuj¹c wydech wydech w koñcowej fazie ruchu (ruch w tej fazie powinien byæ szybki).<br>"
							+ "Po wykonaniu wykroku jedna nog¹ w identyczny sposób nale¿y wykonaæ wykrok drug¹ nog¹.</li></ul><br></b>",
					ContentMode.HTML);
			throughtExplanationOfExerciseTwentySixPart1.setStyleName("throughtExplanationOfExerciseTwentySixPart1");
			throughtExplanationOfExerciseTwentySixPart1.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
			throughtExplanationOfExerciseTwentySixPart2.setStyleName("throughtExplanationOfExerciseTwentySixPart2");
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseTwentySixLayout().init();
	}
}
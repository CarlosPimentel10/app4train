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
					"<b>W pozycji stoj�cej, hantle trzymane nachwytem wzd�u� tu�owia, ramiona wyprostowane, rozstaw ko�czyn dolnych na szeroko�� rozstawu brak�w, grzbiet wyprostowany <br>"
							+ "Zwr�ci� szczeg�ln� uwag� na wyprostowany grzbiet w trakcie wykonywania tego �wiczenia:<br>",
					ContentMode.HTML);

			throughtExplanationOfExerciseTwentySixPart2 = new Label(
					"<b><ul><li>wzi�� wdech a nast�pnie jedn� nog� wykonujemy wykrok w prz�d  na tyle du�y, aby kolano nogi wykrocznej nie<br>"
							+ "przekracza�o linii palc�w tej nogi, natomiast druga noga (nie �wiczona) w momencie wykroku jest lekko zgi�ta w kolanie<br>"
							+ "(ruch w tej fazie powinien by� wolniejszy w celu odpowiedniego rozci�gni�cia mi�ni)</li>"
							+ "<li>powr�t do pozycji wyj�ciowej wykonuj�c wydech wydech w ko�cowej fazie ruchu (ruch w tej fazie powinien by� szybki).<br>"
							+ "Po wykonaniu wykroku jedna nog� w identyczny spos�b nale�y wykona� wykrok drug� nog�.</li></ul><br></b>",
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
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
class ExerciseFortyThreeFactory {

	private class ExerciseFortyThreeLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExerciseFortyThree;
		private VerticalLayout layoutForLabelAndVideo;
		private Video video;

		public ExerciseFortyThreeLayout init() {

			Label topicOfExerciseFortyThree = new Label(ExercisesTitles.TOPIC_FORTY_THREE.getString());

			Button buttonForWindow = prepareButton();

			buttonAction(buttonForWindow);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfExerciseFortyThree);
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
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/43.mp4"));

					prepareVideo(fileResource);

					prepareLabelsForExplanation();

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExerciseFortyThree, video);

					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});
		}

		private void prepareLabelsForExplanation() {
			throughtExplanationOfExerciseFortyThree = new Label(
					"<b> �wiczenie to mo�ne by� wykonywane do karku i do brody. Wersja do karku jest jednak mniej naturalna dla staw�w. Dr��ek chwytany jest nachwytem <br>"
							+ "na szeroko�� umo�liwiaj�c� po podci�gni�ciu utworzenie przez ramiona z przedramionami k�ta prostego (w przybli�eniu). Nogi <br>"
							+ "trzymamy zgi�te w kolanach (chc�c uzyska� lepsz� stabilno�� mo�na je sple��). Wdech powietrza nabieramy przed rozpocz�ciem <br>"
							+ "ruchu podci�gania. Wydech natomiast ma miejsce dopiero, gdy jeste�my ju� u g�ry. Podci�ganie ko�czymy, gdy nasza broda (lub kark) <br>"
							+ "osi�gn�a wysoko�� dr��ka lub nieco ponad nim. Opuszczanie ma by� prowadzone wolno, pod pe�n� kontrol�. Zwr�� uwag� aby nie buja� <br>"
							+ "tu�owiem w trakcie �wiczenia. Koncentrujmy si� na pracy mi�ni grzbietu, przez ca�y czas trwania �wiczenia. Staraj si� mi�nie <br>"
							+ "ramion, w miar� mo�liwo�ci wy��czy� z pracy. <br>",
					ContentMode.HTML);
			throughtExplanationOfExerciseFortyThree.setStyleName("throughtExplanationOfExcerciseFourtyTwoPart1");
			throughtExplanationOfExerciseFortyThree.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}

		private void prepareVideo(FileResource fileResource) {
			video = new Video("video");
			video.setSource(fileResource);
			video.setCaption("Film instruktarzowy");
			video.setSizeUndefined();
		}

	}

	public Component createComponent() {
		return new ExerciseFortyThreeLayout().init();
	}
}
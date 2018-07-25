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
public class ExcerciseFourtyThreeFactory {

	private class ExcerciseFourtyThreeLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfExcerciseFourtyThree;
		private Label topicOfOfExcerciseFourtyThree;
		private HorizontalLayout layoutForButtonAndWindow;
		private VerticalLayout layoutForLabelAndVideo;
		private Button buttonForWindow;
		private Video video;

		public ExcerciseFourtyThreeLayout init() {

			topicOfOfExcerciseFourtyThree = new Label(UtilsForExcercisesTitles.TOPIC_FOURTYTHREE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);

					FileResource fileResource = new FileResource(new File(
							"E:/wersja z 18,04,2018/app4train/app4train-web/src/main/webapp/VAADIN/videos/43.mp4"));
					video = new Video("video");
					video.setSource(fileResource);
					video.setCaption("Film instruktarzowy");
					video.setSizeUndefined();

					throughtExplanationOfExcerciseFourtyThree = new Label(
							"<b> Æwiczenie to mo¿ne byæ wykonywane do karku i do brody. Wersja do karku jest jednak mniej naturalna dla stawów. Dr¹¿ek chwytany jest nachwytem <br>"
									+ "na szerokoœæ umo¿liwiaj¹c¹ po podci¹gniêciu utworzenie przez ramiona z przedramionami k¹ta prostego (w przybli¿eniu). Nogi <br>"
									+ "trzymamy zgiête w kolanach (chc¹c uzyskaæ lepsz¹ stabilnoœæ mo¿na je spleœæ). Wdech powietrza nabieramy przed rozpoczêciem <br>"
									+ "ruchu podci¹gania. Wydech natomiast ma miejsce dopiero, gdy jesteœmy ju¿ u góry. Podci¹ganie koñczymy, gdy nasza broda (lub kark) <br>"
									+ "osi¹gnê³a wysokoœæ dr¹¿ka lub nieco ponad nim. Opuszczanie ma byæ prowadzone wolno, pod pe³n¹ kontrol¹. Zwróæ uwagê aby nie bujaæ <br>"
									+ "tu³owiem w trakcie æwiczenia. Koncentrujmy siê na pracy miêœni grzbietu, przez ca³y czas trwania æwiczenia. Staraj siê miêœnie <br>"
									+ "ramion, w miarê mo¿liwoœci wy³¹czyæ z pracy. <br>",
									ContentMode.HTML);

					layoutForLabelAndVideo = new VerticalLayout();
					layoutForLabelAndVideo.addComponents(throughtExplanationOfExcerciseFourtyThree, video);

					throughtExplanationOfExcerciseFourtyThree.setStyleName("throughtExplanationOfExcerciseFourtyTwoPart1");
					throughtExplanationOfExcerciseFourtyThree.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					layoutForLabelAndVideo.setSizeUndefined();
					window.setContent(layoutForLabelAndVideo);
					window.setSizeFull();
					UI.getCurrent().addWindow(window);
				}
			});

			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfExcerciseFourtyThree);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ExcerciseFourtyThreeLayout().init();
	}
}
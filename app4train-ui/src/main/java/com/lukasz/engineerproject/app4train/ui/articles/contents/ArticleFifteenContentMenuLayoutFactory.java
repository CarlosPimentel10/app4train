package com.lukasz.engineerproject.app4train.ui.articles.contents;

import com.lukasz.engineerproject.app4train.utils.ArticlesTitles;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@org.springframework.stereotype.Component
public class ArticleFifteenContentMenuLayoutFactory {

	private class ArticleFifteenContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleFifteen;
		private Label topicOfOfArticleFifteen;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleFifteenContentMenuLayout init() {

			topicOfOfArticleFifteen = new Label(ArticlesTitles.TOPIC_FIFTEEN.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleFifteen);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleFifteen);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleFifteen = new Label(
					"<b><br><br>Najczêtsz¹ mantr¹ jak¹ mo¿na us³yszeæ, g³ównie wœród kobiet jest „jedz mniej, æwicz wiêcej”. Takie podejœcie nie jest jednak odpowiednie, poniewa¿ </b><br>"
							+ "<b>dieta jest albo na 100%, albo wcale. Tak samo jest z treningiem. W d³u¿szej perspektywie czasu niskokaloryczne diety oraz intensywne treningi si³owe </b><br>"
							+ "<b>skutkowaæ mog¹ do powa¿nymi zaburzeniami hormonalnych czy metabolicznymi. Jednym s³owem ucierpi na tym ca³y nasz organizm. Takie podejœcie najczêœciej </b><br>"
							+ "<b>obieraj¹ osoby, które natychmiast chc¹ zrzuciæ swoj¹ wagê, nie zwracaj¹c uwagê na konsekwencje swoich decyzji.Chc¹c schudn¹æ zdrowo i efektywnie</b><br>"
							+ "<b>nale¿y sporz¹dziæ dietê opieraj¹ca siê o odpowiednie makrosk³adniki, takie aby móc od¿ywiæ organizm i mieæ energiê do treningu. W przypadku nadwy¿ki</b><br>"
							+ "<b>kalorycznej, trening pozwoli nam budowaæ masê miêœniow¹, jednak w przypadku deficytu kalorycznego bêdziemy efektywnie spalaæ tkankê t³uszczow¹. </b><br>"
							+ "<b>Warto wspomnieæ, i¿ cardio (bieganie czy rower), nie da nam takiego efektu, jaki daje ciê¿ki trening wykorzystuj¹c æwiczenia wielostawowe, anga¿uj¹ce  </b><br>"
							+ "<b>du¿e partie miêœniowe </b>" + "<h4>Sk³adniki diety</h4>" + "<h5>Bia³ko</h5>"
							+ "<b>Jak wiadomo jest najbardziej syc¹ce, ze wszystkich makrosk³adników. 1 g bia³ka zawiera 4 kcal. Znajdziemy je w jajkach, miêsach rybach,</b><br>"
							+ "<b> nabiale, od¿ywkach bia³kowych.</b>" + "<h5>Wêglowodany</h5>"
							+ "<b>Równie¿ mocno syc¹ce, zawieraj¹ sporo cennego b³onnika, 1 g wêglowodanów to 4 kcal. Znajdziemy je w kaszach, ry¿ach, owocach, ziemniakach, batatach.</b>"
							+ "<h5>T³uszcze</h5>"
							+ "<b>To najbardziej wydajne paliwo, 1 g t³uszczu zawiera 9 kcal. Znajdziemy je w miêsach, rybach, nasionach chia, orzechach, oleju kokosowym a tak¿e awokado.</b><br>",
					ContentMode.HTML);
			throughtExplanationOfArticleFifteen.setSizeUndefined();
			throughtExplanationOfArticleFifteen.setStyleName("throughtExplanationOfArticleFifteen");
			throughtExplanationOfArticleFifteen.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}

	}

	public Component createComponent() {
		return new ArticleFifteenContentMenuLayout().init();
	}
}

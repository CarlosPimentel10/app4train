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
					"<b><br><br>Najcz�tsz� mantr� jak� mo�na us�ysze�, g��wnie w�r�d kobiet jest �jedz mniej, �wicz wi�cej�. Takie podej�cie nie jest jednak odpowiednie, poniewa� </b><br>"
							+ "<b>dieta jest albo na 100%, albo wcale. Tak samo jest z treningiem. W d�u�szej perspektywie czasu niskokaloryczne diety oraz intensywne treningi si�owe </b><br>"
							+ "<b>skutkowa� mog� do powa�nymi zaburzeniami hormonalnych czy metabolicznymi. Jednym s�owem ucierpi na tym ca�y nasz organizm. Takie podej�cie najcz�ciej </b><br>"
							+ "<b>obieraj� osoby, kt�re natychmiast chc� zrzuci� swoj� wag�, nie zwracaj�c uwag� na konsekwencje swoich decyzji.Chc�c schudn�� zdrowo i efektywnie</b><br>"
							+ "<b>nale�y sporz�dzi� diet� opieraj�ca si� o odpowiednie makrosk�adniki, takie aby m�c od�ywi� organizm i mie� energi� do treningu. W przypadku nadwy�ki</b><br>"
							+ "<b>kalorycznej, trening pozwoli nam budowa� mas� mi�niow�, jednak w przypadku deficytu kalorycznego b�dziemy efektywnie spala� tkank� t�uszczow�. </b><br>"
							+ "<b>Warto wspomnie�, i� cardio (bieganie czy rower), nie da nam takiego efektu, jaki daje ci�ki trening wykorzystuj�c �wiczenia wielostawowe, anga�uj�ce  </b><br>"
							+ "<b>du�e partie mi�niowe </b>" + "<h4>Sk�adniki diety</h4>" + "<h5>Bia�ko</h5>"
							+ "<b>Jak wiadomo jest najbardziej syc�ce, ze wszystkich makrosk�adnik�w. 1 g bia�ka zawiera 4 kcal. Znajdziemy je w jajkach, mi�sach rybach,</b><br>"
							+ "<b> nabiale, od�ywkach bia�kowych.</b>" + "<h5>W�glowodany</h5>"
							+ "<b>R�wnie� mocno syc�ce, zawieraj� sporo cennego b�onnika, 1 g w�glowodan�w to 4 kcal. Znajdziemy je w kaszach, ry�ach, owocach, ziemniakach, batatach.</b>"
							+ "<h5>T�uszcze</h5>"
							+ "<b>To najbardziej wydajne paliwo, 1 g t�uszczu zawiera 9 kcal. Znajdziemy je w mi�sach, rybach, nasionach chia, orzechach, oleju kokosowym a tak�e awokado.</b><br>",
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

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
public class ArticleSixContentMenuLayoutFactory {

	private class ArticleSixContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleSix;

		public ArticleSixContentMenuLayout init() {

			Label topicOfOfArticleSix = new Label(ArticlesTitles.TOPIC_SIX.getString());

			Button buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					prepareLabelForArticle();
					window.setContent(throughtExplanationOfArticleSix);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			HorizontalLayout layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleSix);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

		private void prepareLabelForArticle() {
			throughtExplanationOfArticleSix = new Label(
					"<b><br><br>Nadmiar t³uszczu na brzuchu i wokó³ talii jest to podstawowy powód wielu osób do tego ¿eby zacz¹æ trenowaæ oraz zdrowo siê od¿ywiaæ.</b><br>"
							+ "<b>Pomimo starañ, mo¿e nam siê nie udawaæ osi¹gn¹æ zamierzony cel. Ciê¿ka praca nad sob¹ nie daje nam odpowiedniej satysfakcji. Czasem </b><br>"
							+ "<b>powinniœmy zwróciæ uwagê na kilka przyczyn, które uniemo¿liwiaj¹ nam osi¹gn¹æ wymarzon¹ sylwetkê.</b>"
							+ "<h4>Deficyt snu</h4>"
							+ "<b>W przypadku gdy pracujesz wiele godzin bez odpoczynku, a tak¿e siedzisz za biurkiem do póŸnych godzin nocnych, zamiast iœæ spaæ o rozs¹dnej </b><br>"
							+ "<b>porze, mo¿esz mieæ problemy ze swoimi obwodami. Czêste niedosypianie sprawia, ¿e masz ochotê na niezdrowe i s³abe jakoœciowo jedzenie. Osoby, </b><br>"
							+ "<b>które œpi¹ œrednio 4-5 godzin na dobê zjadaj¹ ok. ponad 600 dodatkowych kalorii ni¿ osoby, które œpi¹ 7-8 godzin dziennie.</b>"
							+ "<h4>Zbyt wysoki poziom stresu</h4>"
							+ "<b>W nerwach zwykle siêgamy po przek¹ski, które s¹ niekoniecznie dietetyczne. Zwiêkszona zostaje wtedy poda¿ kalorii, mamy wolniejsze spalanie</b><br>"
							+ "<b>a to przek³ada siê na dodatkowe centymetry.</b>"
							+ "<h4>Nieodpowiednie podejœcie do odchudzania</h4>"
							+ "<b>Odchudzanie to nie tylko spadek iloœci spo¿ywanych kalorii poparta wiêksz¹ aktywnoœci¹ ruchowa. Wiadomo, s¹ to niezbêdne elementy chc¹c  </b><br>"
							+ "<b>kszta³towaæ nasz¹ sylwetkê, ale trzeba do tego odpowiednio podejœæ. Najlepiej zmiany wprowadziæ na sta³e, a nie tylko na kilka tygodni przed  </b><br>"
							+ "<b>wakacjami. Spo¿ywanie zdrowej, wartoœciowej oraz najmniej przetworzonej ¿ywnoœci powinno staæ siê naszym sta³ym nawykiem. Takie  </b><br>"
							+ "<b>podejœcie pozwoli nam zachowaæ d³ugo zmiany, jakie uzyskamy w sylwetce. </b>"
							+ "<h4>Dieta CUD</h4>"
							+ "<b>Wiadomo, ¿e efekt jest mo¿liwy do osi¹gniêcia, jednak jeœli utrata wagi by³a szybka, a my szybko wrócimy do swoich poprzednich nawyków to i </b><br>"
							+ "<b>waga wzroœnie. Zbyt rygorystyczna oraz uboga w wartoœci od¿ywcze dieta, negatywnie wp³ywa na nasze narz¹dy wewnêtrzne, co mo¿e mieæ wp³yw na nasze zdrowie.</b><br>",
					ContentMode.HTML);
			throughtExplanationOfArticleSix.setSizeUndefined();
			throughtExplanationOfArticleSix.setStyleName("throughtExplanationOfArticleSix");
			throughtExplanationOfArticleSix.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
		}

	}

	public Component createComponent() {
		return new ArticleSixContentMenuLayout().init();
	}
}

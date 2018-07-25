package com.lukasz.engineerproject.app4train.ui.articles;

import com.lukasz.engineerproject.app4train.utils.UtilsForArticlesTitles;
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
public class ArticleNineContentMenuLayoutFactory {

	private class ArticleNineContentMenuLayout extends VerticalLayout {

		private static final long serialVersionUID = 1L;
		private Label throughtExplanationOfArticleNine;
		private Label topicOfOfArticleNine;
		private HorizontalLayout layoutForButtonAndWindow;
		private Button buttonForWindow;

		public ArticleNineContentMenuLayout init() {

			topicOfOfArticleNine = new Label(UtilsForArticlesTitles.TOPIC_NINE.getString());

			buttonForWindow = new Button();
			buttonForWindow.addClickListener(new ClickListener() {

				public void buttonClick(ClickEvent event) {
					Window window = new Window();
					window.setModal(true);
					throughtExplanationOfArticleNine = new Label("<br><h4>Równomierne obci¹¿anie miêœni</h4><br>"
							+ "<b>Zwykle czêsto osoby trenuj¹ce skupiaj¹ siê na ulubionej partii cia³a. Mo¿e to powodowaæ dysproporcjê sylwetki, ale tak¿e ograniczenia zwi¹zane z </b><br>"
							+ "<b>progresj¹. Æwicz¹c ca³e cia³o równomiernie je wzmacniamy oraz rozwijamy, zak³adaj¹c, ¿e trening poparty jest odpowiednio zbilansowan¹ diet¹.</b>"
							+ "<h4>Mniejsza objêtoœæ</h4>"
							+ "<b>Wykonuj¹c po jednym æwiczeniu na dan¹ grupê miêœni, mamy mniejsze ryzyko przetrenowania. Pomimo tego, ¿e w treningu ca³ego cia³a, ka¿da partia anga¿owana </b><br>"
							+ "<b>nawet dwa, czy trzy razy w tygodniu to i tak objêtoœæ treningowa bêdzie wci¹¿ mniejsza. Dziêki temu miêsieñ bêdzie mia³ wiêksz¹ szansê na regeneracjê.</b>"
							+ "<h4>Æwiczenia wielostawowe</h4>"
							+ "<b>Podstawow¹ ró¿nic¹ miêdzy treningiem ca³ego cia³a, a treningiem dzielonym jest dobór æwiczeñ. Pierwszy trening charakteryzuje siê zwykle </b><br>"
							+ "<b>æwiczeniami wielostawowymi, anga¿uj¹ce jednoczeœnie wiele grup miêœniowych. W treningu dzielonym czêsto pojawiaj¹ siê æwiczenia </b><br>"
							+ "<b>izolowane. Zalet¹ treningu ca³ego cia³a jest to, ¿e wykonuj¹c niewiele æwiczeñ wielostawowych, mamy pewnoœæ, ¿e nie pominiemy ¿adnej istotnej partii.</b>"
							+ "<h4>Szybsza utrata tkanki t³uszczowej</h4>"
							+ "<b>Trening ca³ego cia³a anga¿uje wiêcej grup miêœniowych w ramach jednej jednostki treningowej. W zwi¹zku z tym zu¿ywamy wiêcej energii. Taki typ</b><br>"
							+ "<b>treningu jest bardziej intensywny dla naszego organizmu. </b>"
							+ "<h4>Szybsze wzmocnienie cia³a</h4>"
							+ "<b>Niezwykle wa¿ne dla osób pocz¹tkuj¹cych, poniewa¿ æwicz¹c ca³e cia³o kilka razy w tygodniu trenujemy dan¹ partiê kilkukrotnie, daj¹c miêœniom </b><br>"
							+ "<b>wiêcej bodŸców do rozwoju, przy czym stale uczymy siê techniki wykonywana wielu æwiczeñ. W konsekwencji szybciej siê rozwijamy, </b><br>"
							+ "<b>wzmacniamy i mo¿emy dokonywaæ zmian w naszych planach treningowych.</b><br>",
							ContentMode.HTML);
					throughtExplanationOfArticleNine.setSizeUndefined();
					throughtExplanationOfArticleNine.setStyleName("throughtExplanationOfArticleNine");
					throughtExplanationOfArticleNine.addStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
					window.setContent(throughtExplanationOfArticleNine);
					UI.getCurrent().addWindow(window);
				}
			});
			buttonForWindow.setIcon(FontAwesome.SEARCH);
			buttonForWindow.setStyleName(ValoTheme.BUTTON_SMALL);

			layoutForButtonAndWindow = new HorizontalLayout(buttonForWindow, topicOfOfArticleNine);
			layoutForButtonAndWindow.setSpacing(true);

			addComponent(layoutForButtonAndWindow);

			return this;
		}

	}

	public Component createComponent() {
		return new ArticleNineContentMenuLayout().init();
	}
}

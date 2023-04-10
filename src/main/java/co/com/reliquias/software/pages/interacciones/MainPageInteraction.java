package co.com.reliquias.software.pages.interacciones;

import co.com.reliquias.software.pages.mapeos.MainPage;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class MainPageInteraction extends GeneralInteraction {

    @Page
    private MainPage mainPage;

    public String getTitleMainPage() {
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();
    }

}

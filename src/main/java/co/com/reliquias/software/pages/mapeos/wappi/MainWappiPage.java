package co.com.reliquias.software.pages.mapeos.wappi;

import co.com.reliquias.software.pages.mapeos.GeneralPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;

@At("https://automation-wappi.vercel.app/home")
public class MainWappiPage extends GeneralPage {

    @FindBy(xpath = "//h1")
    public WebElementFacade txtTitleMainPage;

    @FindBy(xpath = "//a[contains(text(), 'Información personal')]")
    public WebElementFacade menuOptionUpdateProfile;

}

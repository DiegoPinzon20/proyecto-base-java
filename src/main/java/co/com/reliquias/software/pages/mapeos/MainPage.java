package co.com.reliquias.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;

@At("https://demo.serenity.is/")
public class MainPage extends GeneralPage {

    @FindBy(xpath = "//main//h1")
    public WebElementFacade txtTitleMainPage;

}

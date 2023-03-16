package co.com.reliquias.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demo.serenity.is/Account/Login")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name='Username']")
    public WebElementFacade inputUsername; //WebElement

    @FindBy(id = "LoginPanel0_Password")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//button[contains(text(), 'Sign In')]")
    public WebElementFacade btnLogin;

}

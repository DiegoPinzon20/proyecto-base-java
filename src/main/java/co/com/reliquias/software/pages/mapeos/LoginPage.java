package co.com.reliquias.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DefaultUrl("https://demo.serenity.is/Account/Login")
public class LoginPage extends GeneralPage {

//    @FindBy(xpath = "//input[@name='Username']")
    @FindBy(how = How.NAME, using = "Username")
    public WebElementFacade inputUsername; //WebElement

//    @FindBy(id = "LoginPanel0_Password")
    @FindBy(how = How.ID, using = "LoginPanel0_Password")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//button[contains(text(), 'Sign In')]")
    public WebElementFacade btnLogin;

}

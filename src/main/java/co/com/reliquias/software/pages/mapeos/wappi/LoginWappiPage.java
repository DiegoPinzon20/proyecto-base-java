package co.com.reliquias.software.pages.mapeos.wappi;

import co.com.reliquias.software.pages.mapeos.GeneralPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginWappiPage extends GeneralPage {

    @FindBy(how = How.ID, using = "username")
    public WebElementFacade inputUsername;

    @FindBy(how = How.ID, using = "password")
    public WebElementFacade inputPassword;

    @FindBy(id = "button-login")
    public WebElementFacade btnLogin;

}

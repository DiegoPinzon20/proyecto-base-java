package co.com.reliquias.software.steps;

import co.com.reliquias.software.pages.interacciones.MainPageInteraction;
import co.com.reliquias.software.pages.mapeos.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);

    @Page
    private LoginPage loginPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    @Step("user open login page")
    public void openLoginPage() {
        loginPage.open();
        LOGGER.info("user open login page");
    }

    @Step("clear user and password fields")//clear Fields Login
    public void clearFieldsLogin() {
        loginPage.inputUsername.type(""); //sendKeys
//        loginPage.inputUsername.sendKeys("");
        loginPage.inputPassword.type("");
    }

    @Step("enter credentials")
    public void enterCredentials(String username, String password) {
        loginPage.inputUsername.type(username);
        loginPage.inputPassword.type(password);
        LOGGER.atInfo().setMessage("enter credentials with username:{} and password:{}.").addArgument(username).addArgument(password).log();
    }

    @Step("access the system")
    public void accessSystem(){
        loginPage.btnLogin.waitUntilClickable().click();
    }

    @Step("validate successful login")
    public void validateSuccessfulLogin() {
        final String mensajeError = "Login was unsuccessful.";
        assertThat(mensajeError, mainPageInteraction.getTitleMainPage(), is(equalTo("Dashboard")));
    }

}












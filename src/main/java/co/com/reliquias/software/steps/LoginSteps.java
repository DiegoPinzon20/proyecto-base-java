package co.com.reliquias.software.steps;

import co.com.reliquias.software.pages.interacciones.MainPageInteraction;
import co.com.reliquias.software.pages.mapeos.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    @Page
    private LoginPage loginPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    @Step("user open login page")
    public void openLoginPage() {
        loginPage.open();
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

package co.com.reliquias.software.pages.mapeos.wappi;

import co.com.reliquias.software.pages.mapeos.GeneralPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@At("https://automation-wappi.vercel.app/profile")
public class ProfileInformationWappiPage extends GeneralPage {

    @FindBy(id = "image")
    public WebElementFacade inputImage;

    @FindBy(id = "name")
    public WebElementFacade txtName;

    @FindBy(id = "lastName")
    public WebElementFacade txtLastName;

    @FindBy(id = "bornDate")
    public WebElementFacade txtBornDate;

    @FindBy(id = "country")
    public WebElementFacade countryDropdown;

    @FindBy(id = "save-profile")
    public WebElementFacade btnSaveInformationProfile;

    @FindBy(xpath = "//div[@id='confirmation-modal']//p")
    public WebElementFacade txtUpdateResult;

    public WebElement getElementGenre(String genre) {
        return getDriver().findElement(By.id(genre));
    }

}

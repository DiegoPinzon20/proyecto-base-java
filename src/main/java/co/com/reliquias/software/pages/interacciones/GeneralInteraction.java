package co.com.reliquias.software.pages.interacciones;

import co.com.reliquias.software.utilities.RobotUtility;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class GeneralInteraction extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralInteraction.class);

    public void scrollToElement(WebElementFacade webElementFacade) {
//        Actions actions = new Actions(getDriver());
//        actions.scrollToElement(webElementFacade).perform();
        evaluateJavascript("arguments[0].scrollIntoView(true);", webElementFacade);
        LOGGER.info("Se realiza desplazamiento hacia el elemento web");
    }

    public void openPage(String url) {
        LOGGER.info("Se abre al URL:'{}'", url);
        getDriver().get(url);
    }

    public void uploadFile(WebElementFacade webElementFacade, String absolutePathFile) {
        StringSelection stringSelection = new StringSelection(absolutePathFile);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        webElementFacade.waitUntilClickable().click();
        RobotUtility.wait(1500);
        RobotUtility.pressManyKeys(KeyEvent.VK_CONTROL, KeyEvent.VK_V);
        RobotUtility.releaseManyKeys(KeyEvent.VK_CONTROL, KeyEvent.VK_V);
        RobotUtility.pressAndRelease(KeyEvent.VK_ENTER);
    }

}

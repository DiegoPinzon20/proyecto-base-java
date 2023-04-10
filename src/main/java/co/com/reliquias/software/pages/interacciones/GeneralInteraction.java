package co.com.reliquias.software.pages.interacciones;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralInteraction extends PageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralInteraction.class);

    public void scrollToElement(WebElementFacade webElementFacade) {
//        Actions actions = new Actions(getDriver());
//        actions.scrollToElement(webElementFacade).perform();
        evaluateJavascript("arguments[0].scrollIntoView(true);", webElementFacade);
        LOGGER.info("Se realiza desplazamiento hacia el elemento web");
    }

}

package co.com.reliquias.software.steps;

import co.com.reliquias.software.models.ProfileModel;
import co.com.reliquias.software.pages.interacciones.GeneralInteraction;
import co.com.reliquias.software.pages.mapeos.wappi.MainWappiPage;
import co.com.reliquias.software.pages.mapeos.wappi.ProfileInformationWappiPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class UpdateProfileWappiSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateProfileWappiSteps.class);
    private static final String RUTA_BASE_IMAGEN = "src/test/resources/images/";

    @Page
    private ProfileInformationWappiPage profileInformationWappiPage;

    @Page
    private MainWappiPage mainWappiPage;

    @Page
    private GeneralInteraction generalInteraction;

    @Step("se carga la información actualizada del perfil")
    public void updateInformation(ProfileModel profileModel) {
        final Path rutaImagen = Paths.get(RUTA_BASE_IMAGEN.concat("arnold_profile.jpg")).toAbsolutePath();
        LOGGER.info("Se registra la información del usuario");
        LOGGER.info("Ruta del archivo:{}", rutaImagen);
//      profileInformationWappiPage.upload(rutaImagen.toString()).to(profileInformationWappiPage.inputImage);//Forma en que lo hace Serenity BDD(es lo ideal), utilizarla si funciona para tu pagina de prueba.
        generalInteraction.uploadFile(profileInformationWappiPage.inputImage, rutaImagen.toString());
        profileInformationWappiPage.txtName.type(profileModel.getNombre());
        profileInformationWappiPage.txtLastName.type(profileModel.getApellido());
        profileInformationWappiPage.txtBornDate.type(profileModel.getFechaNacimiento());
        profileInformationWappiPage.getElementGender(profileModel.getGenero()).click();
        profileInformationWappiPage.countryDropdown.selectByVisibleText(profileModel.getPais());
        profileInformationWappiPage.btnSaveInformationProfile.click();

    }

    @Step("Ir al formulario de actualización de perfil")
    public void goToUpdateProfileForm() {
        mainWappiPage.menuOptionUpdateProfile.waitUntilClickable().click();
        profileInformationWappiPage.txtName.waitUntilVisible();
    }

    @Step("La actualización se realizó correctamente")
    public void validarActualizacion(List<String> expectedMessages) {
        assertThat("La actualización ha fallado", profileInformationWappiPage.txtUpdateResult.waitUntilVisible().getText(),
                is(equalTo(expectedMessages.get(0))));
    }

}

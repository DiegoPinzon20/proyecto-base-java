package co.com.reliquias.software.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(CucumberWithSerenity.class) //-> Para trabajar con Cucumber y Serenity
//@RunWith(SerenityRunner.class)
//@RunWith(JUnit4.class)
@CucumberOptions(
        features = "src/test/resources/features/login/inicio_sesion.feature",
//        glue = "co.com.reliquias.software.definitions", //POM
        glue = "co.com.reliquias.software.stepdefinitions", //Screenplay
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
        plugin = "pretty",
        tags = "@InicioSesionExitoso"
)
public class LoginRunner {
}

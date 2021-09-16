package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import task.Login;

import java.net.MalformedURLException;


import static util.Enums.EnumVariablesSesion.DRIVER_EN_EJECUCION;
import static util.WebDriverFactory.getAppiumDriver;
import static util.WebDriverFactory.kobitton;

public class GeneralesStepDefinitions {

    private WebDriver driver;

    @Before
    public void prepararEscenario() throws MalformedURLException {
        if(System.getenv().get("Denv").equals("kobitton")){
            driver = kobitton();
        }else{
            driver = getAppiumDriver();
        }
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) esta logueado en la app$")
    public void queElUsuarioEstaLogueadoEnLaApp(String actor) {
        OnStage.theActorCalled(actor).can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().attemptsTo(Login.exitoso());
        OnStage.theActorInTheSpotlight().remember(DRIVER_EN_EJECUCION.getValue(),driver);
    }
}

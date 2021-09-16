package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterface.LoginUI.*;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USUARIO,isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue("standard_user").into(INPUT_USUARIO),
                Enter.theValue("secret_sauce").into(INPUT_CLAVE),
                Click.on(BTN_LOGIN));
    }

    public static Login exitoso(){
        return Tasks.instrumented(Login.class);
    }
}

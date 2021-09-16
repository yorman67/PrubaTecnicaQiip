package task;

import Interaction.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.CompletarCompraUI.BTN_FINALIZAR;

public class FinalizarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.hacia(BTN_FINALIZAR),
                Click.on(BTN_FINALIZAR)
        );
    }

    public static FinalizarCompra exitosa (){
        return Tasks.instrumented(FinalizarCompra.class);
    }
}

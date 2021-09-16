package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.ProductosUI.BTN_CARRITO;

public class ObservarArticulos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CARRITO)
        );
    }

    public static Performable delCarrito(){
        return Tasks.instrumented(ObservarArticulos.class);
    }
}

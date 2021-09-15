package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AgregarProductos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static AgregarProductos alCarrito() {
       return Tasks.instrumented(AgregarProductos.class);
    }
}

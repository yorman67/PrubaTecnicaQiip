package task;

import Interaction.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;


import java.util.List;

import static userinterface.ProductosUI.*;

public class AgregarProductos implements Task {

    private List<String> listaProductos;


    public AgregarProductos(List<String> producto) {
        this.listaProductos = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver a = actor.recall("driver");
        for (String producto: listaProductos) {
            actor.attemptsTo(
                    Scroll.hacia(LBL_NOMBRE_PRODUCTO.of(producto)),
                    Click.on(LBL_NOMBRE_PRODUCTO.of(producto)),
                    Click.on(BTN_AGREGAR_ARTICULO),
                    Click.on(BTN_REGRESAR_A_PRODUCTOS)
            );
        }
    }

    public static AgregarProductos alCarrito(List<String> productos) {
       return Tasks.instrumented(AgregarProductos.class,productos);
    }
}

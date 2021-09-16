package task;

import Interaction.Presionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static userinterface.FormularioCompradorUI.BTN_CONTINUAR;

public class RealizarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DiligenciarInformacion.delComprador(),
                Presionar.elElemento(BTN_CONTINUAR),
                FinalizarCompra.exitosa()
        );
    }

    public static RealizarCompra exitosa(){
        return  Tasks.instrumented(RealizarCompra.class);
    }
}

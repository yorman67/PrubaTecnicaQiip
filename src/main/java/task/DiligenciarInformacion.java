package task;

import Interaction.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import util.GenerarData;

import static userinterface.FormularioCompradorUI.*;

public class DiligenciarInformacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        GenerarData data = new GenerarData();

        actor.attemptsTo(
                Scroll.hacia(BTN_VERIFICAR),
                Click.on(BTN_VERIFICAR),
                Enter.theValue(data.generarNombre()).into(INPUT_NOMBRE),
                Enter.theValue(data.generarApellido()).into(INPUT_APELLIDO),
                SendKeys.of(data.generarCodigoPostal()).into(INPUT_CODIGO_POSTAL),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static DiligenciarInformacion delComprador(){
        return Tasks.instrumented(DiligenciarInformacion.class);
    }
}

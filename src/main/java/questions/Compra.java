package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.CompletarCompraUI.LBL_COMPRA_EXITOSA;

public class Compra implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_COMPRA_EXITOSA.resolveFor(actor).isVisible();
    }

    public static Compra terminadaExitosamente(){
        return new Compra();
    }
}

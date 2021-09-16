package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import task.AgregarProductos;
import task.DiligenciarInformacion;
import task.ObservarArticulos;

import java.util.List;

public class RealizarCompraStepDefinition {

    @Dado("que el usuario los productos")
    public void queElUsuarioLosProductos(List<String> productos) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito(productos));
        OnStage.theActorInTheSpotlight().attemptsTo(ObservarArticulos.delCarrito());
    }

    @Cuando("el usuario completa la compra")
    public void elUsuarioCompletaLaCompra() {
       OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarInformacion.delComprador());
    }

    @Entonces("se observa una pantalla agradeciendo por la orden")
    public void seObservaUnaPantallaAgradeciendoPorLaOrden() {

    }


}

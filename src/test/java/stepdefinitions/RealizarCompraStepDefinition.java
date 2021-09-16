package stepdefinitions;

import Interaction.Presionar;
import exceptions.CompraConErroresException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.Compra;
import task.AgregarProductos;
import task.RealizarCompra;

import java.util.List;

import static exceptions.CompraConErroresException.COMPRA_FALLIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static userinterface.CompletarCompraUI.LBL_COMPRA_EXITOSA;
import static userinterface.ProductosUI.BTN_CARRITO;

public class RealizarCompraStepDefinition {

    @Dado("que el usuario los productos")
    public void queElUsuarioLosProductos(List<String> productos) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarrito(productos), Presionar.elElemento(BTN_CARRITO));
    }

    @Cuando("el usuario completa la compra")
    public void elUsuarioCompletaLaCompra() {
       OnStage.theActorInTheSpotlight().attemptsTo(RealizarCompra.exitosa());
    }

    @Entonces("se observa una pantalla con el mensaje {string}")
    public void seObservaUnaPantallaConElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Compra.terminadaExitosamente()).orComplainWith(CompraConErroresException.class, COMPRA_FALLIDA));
        OnStage.withCurrentActor(Ensure.that(LBL_COMPRA_EXITOSA).text().contains(mensaje));
    }
}

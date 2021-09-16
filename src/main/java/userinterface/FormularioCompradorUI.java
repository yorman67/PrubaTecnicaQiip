package userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioCompradorUI {

    public static final Target BTN_VERIFICAR = Target.the("Boton para verificar articulos").located(MobileBy.AccessibilityId("test-CHECKOUT"));
    public static final Target INPUT_NOMBRE = Target.the("Input nombre").located(MobileBy.AccessibilityId("test-First Name"));
    public static final Target INPUT_APELLIDO = Target.the("Input apellido").located(MobileBy.AccessibilityId("test-Last Name"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Input codigo postal").located(MobileBy.AccessibilityId("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUAR = Target.the("Boton continuar").located(MobileBy.AccessibilityId("test-CONTINUE"));

    public FormularioCompradorUI() {
        throw new IllegalStateException("clase no instanciable");
    }
}

package userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {
    public static final Target LBL_NOMBRE_PRODUCTO = Target.the("Titulo del producto").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target BTN_AGREGAR_ARTICULO = Target.the("Boton para agregar un articulo").located(MobileBy.AccessibilityId("test-ADD TO CART"));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(MobileBy.AccessibilityId("test-BACK TO PRODUCTS"));
    public static final Target BTN_CARRITO= Target.the("Boton para ir al carrito").located(MobileBy.AccessibilityId("test-Cart"));
}

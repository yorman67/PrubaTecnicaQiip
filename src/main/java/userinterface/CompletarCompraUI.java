package userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CompletarCompraUI {
    public static final Target BTN_FINALIZAR= Target.the("Button to Finish").located(MobileBy.AccessibilityId("test-FINISH"));
    public static final Target LBL_COMPRA_EXITOSA = Target.the("Title Checkout Complete").located(MobileBy.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETE!']"));
}

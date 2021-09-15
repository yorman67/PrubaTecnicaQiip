package userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target INPUT_USUARIO = Target.the("Input usuario").located(MobileBy.AccessibilityId("test-Username"));
    public static final Target INPUT_CLAVE = Target.the("Input clave").located(MobileBy.AccessibilityId("test-Password"));
    public static final Target BTN_LOGIN = Target.the("Boton login").located(MobileBy.AccessibilityId("test-LOGIN"));
}

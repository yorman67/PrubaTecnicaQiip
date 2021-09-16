package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static util.Enums.EnumCapabilitiesKobitton.*;
import static util.Enums.EnumCapabilitiesLocal.*;

public class WebDriverFactory {

    public static WebDriver getAppiumDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, VERSION.getValue());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, NOMBRE_DISPOSITIVO.getValue());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME.getValue());
        capabilities.setCapability(APP_PACKAGE.getValue(), VALOR_APP_PACKAGE.getValue());
        capabilities.setCapability(APP_ACTIVITY.getValue(), VALOR_APP_ACTIVITY.getValue());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME.getValue());
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        return new AppiumDriver<MobileElement>(new URL(URL_LOCAL.getValue()), capabilities);
    }

    public static WebDriver kobitton() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(SESION_NAME.getValue(), VALOR_SESION_NAME.getValue());
        capabilities.setCapability(SESION_DESCRIPTION.getValue(), "");
        capabilities.setCapability(DEVICE_ORIENTATION.getValue(), VALOR_DEVICE_ORIENTATION.getValue());
        capabilities.setCapability(CAPTURE_SCREENSHOTS.getValue(), true);
        capabilities.setCapability(APP.getValue(), VALOR_APP.getValue());
        capabilities.setCapability(DEVICE_GROUP.getValue(), VALOR_DEVICE_GROUP.getValue());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, NOMBRE_DISPOSITIVO_KOBITTON.getValue());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, VERSION_KOBITTON.getValue());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME_KOBITTON.getValue());
        return new AppiumDriver<MobileElement>(new URL(URL_KOBITTON.getValue()), capabilities);
    }
}

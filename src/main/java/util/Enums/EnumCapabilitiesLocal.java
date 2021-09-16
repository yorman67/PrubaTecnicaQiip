package util.Enums;

public enum EnumCapabilitiesLocal {

    VERSION("11"),
    NOMBRE_DISPOSITIVO("ZY32BS3K8W"),
    AUTOMATION_NAME("UiAutomator2"),
    APP_PACKAGE("appPackage"),
    VALOR_APP_PACKAGE("com.swaglabsmobileapp"),
    APP_ACTIVITY("appActivity"),
    VALOR_APP_ACTIVITY("com.swaglabsmobileapp.MainActivity"),
    PLATFORM_NAME("Android"),
    URL_LOCAL("http://127.0.0.1:4723/wd/hub");

    private String texto;

    EnumCapabilitiesLocal(String texto) {
        this.texto = texto;
    }

    public String getValue() {
        return this.texto;
    }
}

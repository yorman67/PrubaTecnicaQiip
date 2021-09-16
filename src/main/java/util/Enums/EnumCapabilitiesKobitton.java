package util.Enums;

public enum EnumCapabilitiesKobitton {

    SESION_NAME("sessionName"),
    VALOR_SESION_NAME("Automation test session"),
    SESION_DESCRIPTION("sessionDescription"),
    DEVICE_ORIENTATION("deviceOrientation"),
    VALOR_DEVICE_ORIENTATION("portrait"),
    CAPTURE_SCREENSHOTS("captureScreenshots"),
    APP("app"),
    VALOR_APP("kobiton-store:253553"),
    DEVICE_GROUP("deviceGroup"),
    VALOR_DEVICE_GROUP("KOBITON"),
    VERSION_KOBITTON("10"),
    PLATFORM_NAME_KOBITTON("Android"),
    NOMBRE_DISPOSITIVO_KOBITTON("Galaxy A10"),
    URL_KOBITTON("https://yorman67:0c35c89e-e44e-4d75-93c3-575fd550245d@api.kobiton.com/wd/hub");

    private String texto;

    EnumCapabilitiesKobitton(String texto) {
        this.texto = texto;
    }

    public String getValue() {
        return this.texto;
    }
}

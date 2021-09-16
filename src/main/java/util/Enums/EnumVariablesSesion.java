package util.Enums;

public enum EnumVariablesSesion {

    DRIVER_EN_EJECUCION ("driver");

    private String texto;

    EnumVariablesSesion(String texto) {
        this.texto = texto;
    }

    public String getValue() {
        return this.texto;
    }

}

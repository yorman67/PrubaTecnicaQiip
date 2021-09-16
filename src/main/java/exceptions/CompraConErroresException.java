package exceptions;

public class CompraConErroresException extends AssertionError {

    public static final String COMPRA_FALLIDA = "Hubo un error buscando verificando la compra";

    public CompraConErroresException(String message, Throwable cause){
        super(message, cause);
    }
}

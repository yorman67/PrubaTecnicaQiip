package exceptions;

public class CompraConErroresException extends AssertionError {

    public static final String COMPRA_FALLIDA = "Hubo un error en el proceso de compra";

    public CompraConErroresException(String message, Throwable cause){
        super(message, cause);
    }
}

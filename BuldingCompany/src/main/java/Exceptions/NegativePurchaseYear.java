package Exceptions;

public class NegativePurchaseYear extends Exception{
    public NegativePurchaseYear(){
    }

    public NegativePurchaseYear(String message) {
        super(message);
    }

    public NegativePurchaseYear(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativePurchaseYear(Throwable cause) {
        super(cause);
    }

    public NegativePurchaseYear(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

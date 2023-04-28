package Exceptions;

public class IncorectLevelBuilding extends Exception{
    public IncorectLevelBuilding() {
    }

    public IncorectLevelBuilding(String message) {
        super(message);
    }

    public IncorectLevelBuilding(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorectLevelBuilding(Throwable cause) {
        super(cause);
    }

    public IncorectLevelBuilding(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

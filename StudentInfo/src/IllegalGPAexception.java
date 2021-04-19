public class IllegalGPAexception extends Exception {
    public IllegalGPAexception() {
    }

    public IllegalGPAexception(String message) {
        super(message);
    }

    public IllegalGPAexception(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalGPAexception(Throwable cause) {
        super(cause);
    }

    public IllegalGPAexception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

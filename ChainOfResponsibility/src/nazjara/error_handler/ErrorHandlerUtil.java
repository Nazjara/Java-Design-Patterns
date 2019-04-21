package nazjara.error_handler;

public class ErrorHandlerUtil {

    private static FaxErrorHandler faxErrorHandler;

    static {
        faxErrorHandler = new FaxErrorHandler();
        EmailErrorHandler emailErrorHandler = new EmailErrorHandler();
        NetworkErrorHandler networkErrorHandler = new NetworkErrorHandler();

        faxErrorHandler.setNextErrorHandler(emailErrorHandler);
        emailErrorHandler.setNextErrorHandler(networkErrorHandler);
    }

    public static ErrorHandler getErrorHandlerChain() {
        return faxErrorHandler;
    }
}

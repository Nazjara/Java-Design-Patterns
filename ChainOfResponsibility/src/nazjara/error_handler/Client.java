package nazjara.error_handler;

public class Client {

    public static void main(String[] args) {
        ErrorHandler errorHandler = ErrorHandlerUtil.getErrorHandlerChain();

        errorHandler.handleError(new Exception("Fax error"));
        errorHandler.handleError(new Exception("Email error"));
        errorHandler.handleError(new Exception("Network error"));
    }
}

package nazjara.error_handler;

public class EmailErrorHandler implements ErrorHandler {

    private ErrorHandler nextErrorHandler;

    public void setNextErrorHandler(ErrorHandler nextErrorHandler) {
        this.nextErrorHandler = nextErrorHandler;
    }

    @Override
    public void handleError(Exception exception) {
        if (exception.getMessage().contains("Email")) {
            System.out.println("Handling email error");
        } else {
            nextErrorHandler.handleError(exception);
        }
    }
}

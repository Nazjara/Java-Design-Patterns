package nazjara.error_handler;

public class FaxErrorHandler implements ErrorHandler {

    private ErrorHandler nextErrorHandler;

    public void setNextErrorHandler(ErrorHandler nextErrorHandler) {
        this.nextErrorHandler = nextErrorHandler;
    }

    @Override
    public void handleError(Exception exception) {
        if (exception.getMessage().contains("Fax")) {
            System.out.println("Handling fax error");
        } else {
            nextErrorHandler.handleError(exception);
        }
    }
}

package nazjara.error_handler;

public class NetworkErrorHandler implements ErrorHandler {

    @Override
    public void handleError(Exception exception) {
        if (exception.getMessage().contains("Network")) {
            System.out.println("Handling network error");
        }
    }
}

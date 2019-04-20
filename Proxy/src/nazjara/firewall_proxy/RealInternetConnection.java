package nazjara.firewall_proxy;

public class RealInternetConnection implements InternetConnection {

    @Override
    public void connect(String hostname) {
        System.out.println("Establishing internet connection...");
        System.out.println("Connection established. Accessing " + hostname);
    }
}

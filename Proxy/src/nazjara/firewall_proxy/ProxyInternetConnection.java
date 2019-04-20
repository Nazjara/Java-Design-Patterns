package nazjara.firewall_proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternetConnection implements InternetConnection {
    private InternetConnection internetConnection;
    private static Set<String> allowedDomainNames = new HashSet<>();

    static {
        allowedDomainNames.add("my-library.com");
        allowedDomainNames.add("google.com");
        allowedDomainNames.add("udemy.com");
    }

    public ProxyInternetConnection() {
        this.internetConnection = new RealInternetConnection();
    }

    // firewall proxy protects target from illegal access
    @Override
    public void connect(String hostname) {
        if(allowedDomainNames.contains(hostname.toLowerCase())) {
            internetConnection.connect(hostname);
        } else {
            System.out.println("Access denied to " + hostname);
        }
    }
}

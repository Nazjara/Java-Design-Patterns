package nazjara.firewall_proxy;

public class Client {

    public static void main(String[] args) {
        InternetConnection connection = new ProxyInternetConnection();

        connection.connect("hack-someone.com");
        System.out.println("----------------------------");
        connection.connect("udemy.com");
    }
}

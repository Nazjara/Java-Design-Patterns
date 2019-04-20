package nazjara.virtual_proxy;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("file.jpg");

        image.display();
        System.out.println("--------------------");
        image.display();
    }
}

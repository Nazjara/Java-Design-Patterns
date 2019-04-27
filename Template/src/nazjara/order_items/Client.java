package nazjara.order_items;

public class Client {

    public static void main(String[] args) {
        OrderProcessTemplate template = new NetOrder();
        template.processOrder(true);

        System.out.println("------------------------");

        template = new StoreOrder();
        template.processOrder(false);
    }
}

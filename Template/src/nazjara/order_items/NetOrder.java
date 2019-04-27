package nazjara.order_items;

public class NetOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("Selecting item in online store");
    }

    @Override
    void doPayment() {
        System.out.println("Paying for item using paypal");
    }

    @Override
    void doDelivery() {
        System.out.println("Delivering using air post");
    }
}

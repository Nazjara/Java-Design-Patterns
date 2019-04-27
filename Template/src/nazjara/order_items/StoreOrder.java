package nazjara.order_items;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("Selecting item in real store");
    }

    @Override
    void doPayment() {
        System.out.println("Paying for item using cash");
    }

    @Override
    void doDelivery() {
        System.out.println("Delivering using courier on the car");
    }
}

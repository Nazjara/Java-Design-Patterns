package nazjara.order_items;

public abstract class OrderProcessTemplate {

    protected final void processOrder(boolean isGift) {
        doSelect();
        doPayment();

        if(isGift) {
            giftWrapping();
        }

        doDelivery();
    }

    protected void giftWrapping() {
        System.out.println("Wrap into nice box");
    }

    abstract void doSelect();
    abstract void doPayment();

    abstract void doDelivery();
}

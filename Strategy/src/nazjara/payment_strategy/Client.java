package nazjara.payment_strategy;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 20);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("qwerty@gmail.com", "password"));
        cart.pay(new CreditCardStrategy("Name", "12345678", "111", "01.01.1970"));
    }
}

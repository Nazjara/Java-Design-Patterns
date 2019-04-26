package nazjara.payment_strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dataOfExpire;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dataOfExpire) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dataOfExpire = dataOfExpire;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}

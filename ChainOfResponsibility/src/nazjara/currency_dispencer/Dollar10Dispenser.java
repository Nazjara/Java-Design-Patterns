package nazjara.currency_dispencer;

public class Dollar10Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();

        if (amount >= 10) {
            int num = amount / 10;
            int remainder = amount % 10;
            System.out.println("Dispensing " + num + " 10$ note(s)");

            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}

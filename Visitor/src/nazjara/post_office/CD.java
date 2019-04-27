package nazjara.post_office;

public class CD implements Element {
    private double price;
    private int weight;

    public CD(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}

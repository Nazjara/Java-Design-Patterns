package nazjara.post_office;

public class USPostageVisitor implements Visitor {

    private double totalCost = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice() < 20) {
            totalCost += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() < 20) {
            totalCost += cd.getWeight() * 2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() < 20) {
            totalCost += dvd.getWeight() * 3;
        }
    }

    @Override
    public double getTotalCost() {
        return totalCost;
    }
}

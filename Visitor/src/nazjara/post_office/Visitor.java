package nazjara.post_office;

public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dcd);

    double getTotalCost();
}

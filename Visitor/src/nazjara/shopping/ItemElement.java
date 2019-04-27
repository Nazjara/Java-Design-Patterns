package nazjara.shopping;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}

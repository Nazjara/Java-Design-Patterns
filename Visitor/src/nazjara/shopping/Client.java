package nazjara.shopping;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<ItemElement> items = new ArrayList<>();
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        items.add(new Book(20, "1234"));
        items.add(new Book(60, "5678"));
        items.add(new Fruit(10, 2, "Banana"));
        items.add(new Fruit(20, 2, "Orange"));

        int totalCost = items.stream().mapToInt(i -> i.accept(visitor)).sum();

        System.out.println("Total cost - " + totalCost);
    }
}

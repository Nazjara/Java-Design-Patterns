package nazjara.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showCost() {
        System.out.println("Total cost: " + items.stream().mapToDouble(Item::getPrice).sum());
    }

    public void showItems() {
        System.out.println("Order contains such items:");
        items.forEach(item -> System.out.println(item.getName() + " - " + item.getPrice() + " - " + item.getPacking().pack()));
    }
}

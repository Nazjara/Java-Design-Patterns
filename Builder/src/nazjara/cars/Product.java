package nazjara.cars;

import java.util.LinkedList;
import java.util.List;

public class Product {
    private List<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Product contains such parts:");
        parts.forEach(System.out::println);
    }
}

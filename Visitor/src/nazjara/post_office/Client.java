package nazjara.post_office;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Visitor visitor1 = new USPostageVisitor();
        Visitor visitor2 = new SouthAmericaPostageVisitor();

        List<Element> items = new ArrayList<>();
        items.add(new CD(10.0, 1));
        items.add(new CD(20.0, 2));
        items.add(new CD(30.0, 3));
        items.add(new DVD(15.0, 1));
        items.add(new DVD(25.0, 2));
        items.add(new DVD(35.0, 3));
        items.add(new Book(17.0, 5));
        items.add(new Book(17.0, 7));
        items.add(new Book(37.0, 10));

        items.forEach(item -> item.accept(visitor1));
        items.forEach(item -> item.accept(visitor2));

        System.out.println("Total shipping cost for US Postage - " + visitor1.getTotalCost());
        System.out.println("Total shipping cost for South America Postage - " + visitor2.getTotalCost());
    }
}

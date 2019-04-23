package nazjara.arts_and_science;

public class Client {

    public static void main(String[] args) {
        Iterator scienceIterator = new ScienceAggregator().createIterator();
        Iterator artsIterator = new ArtsAggregator().createIterator();

        System.out.println("Science objects:");
        while (scienceIterator.hasNext()) {
            System.out.println(scienceIterator.next());
        }

        System.out.println("--------------------------");

        System.out.println("Arts objects:");
        while (artsIterator.hasNext()) {
            System.out.println(artsIterator.next());
        }

    }
}

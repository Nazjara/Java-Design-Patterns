package nazjara.arts_and_science;

public class ArtsAggregator implements Aggregator {

    private String[] arts;

    {
        arts = new String[3];
        arts[0] = "Arts1";
        arts[1] = "Arts2";
        arts[2] = "Arts3";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(arts);
    }
}

package nazjara.arts_and_science;

import java.util.LinkedList;
import java.util.List;

public class ScienceAggregator implements Aggregator {

    private List<String> science;

    {
        science = new LinkedList<>();
        science.add("Science1");
        science.add("Science2");
        science.add("Science3");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(science);
    }
}

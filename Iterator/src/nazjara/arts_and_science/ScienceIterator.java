package nazjara.arts_and_science;

import java.util.List;

public class ScienceIterator implements Iterator {
    private List<String> science;
    private int index = 0;

    public ScienceIterator(List<String> science) {
        this.science = science;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public String next() {
        return science.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < science.size();
    }
}

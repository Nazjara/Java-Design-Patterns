package nazjara.arts_and_science;

public class ArtsIterator implements Iterator {
    private String[] arts;
    private int index = 0;

    public ArtsIterator(String[] arts) {
        this.arts = arts;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public String next() {
        return arts[index++];
    }

    @Override
    public boolean hasNext() {
        return index < arts.length;
    }
}

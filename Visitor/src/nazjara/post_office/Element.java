package nazjara.post_office;

public interface Element {
    void accept(Visitor visitor);
}

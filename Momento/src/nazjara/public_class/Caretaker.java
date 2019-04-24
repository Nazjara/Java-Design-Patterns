package nazjara.public_class;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Momento> momentos;

    public Caretaker() {
        this.momentos = new ArrayList<>();
    }

    public void save(Momento momento) {
        momentos.add(momento);
    }

    public Momento restore(int stateCounter) {
        return momentos.get(stateCounter);
    }
}

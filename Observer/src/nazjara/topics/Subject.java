package nazjara.topics;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

    // not required, but added so observers can ask for update by themselves
    Object getUpdate(Observer observer);
}

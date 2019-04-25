package nazjara.topics;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}

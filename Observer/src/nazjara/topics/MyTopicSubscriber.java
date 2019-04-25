package nazjara.topics;

public class MyTopicSubscriber implements Observer {
    private String name;
    private Subject subject;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) subject.getUpdate(this);

        if (message == null) {
            System.out.println(name + ": no new message");
        } else {
            System.out.println(name + ": consuming message - " + message);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

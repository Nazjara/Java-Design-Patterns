package nazjara.notifications;

public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notifications;

    public NotificationCollection() {
        notifications = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String s) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Full");
        } else {
            notifications[numberOfItems] = new Notification(s);
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}

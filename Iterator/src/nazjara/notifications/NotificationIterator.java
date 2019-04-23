package nazjara.notifications;

public class NotificationIterator implements Iterator {
    Notification[] notifications;
    int position = 0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return position < notifications.length && notifications[position] != null;
    }

    @Override
    public Object next() {
        Notification notification = notifications[position];
        position += 1;
        return notification;
    }
}

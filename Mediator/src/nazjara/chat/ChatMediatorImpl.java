package nazjara.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        // message should not be received by user sending it
        users.stream().filter(u -> u != user).forEach(u -> u.receive( message));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

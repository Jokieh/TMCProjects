import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageArrayList = new ArrayList<>();

    public MessagingService() {
        this.messageArrayList = messageArrayList;
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) messageArrayList.add(message);
    }

    public ArrayList<Message> getMessages() {
        return messageArrayList;
    }
}

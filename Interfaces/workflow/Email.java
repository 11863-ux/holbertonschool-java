package workflow;

public class Email implements NotificationChannel {
    @Override
    public void notify(Message message) {
        System.out.printf("[Email] {%s} - %s\n", message.messageType,message.text);
    }
}

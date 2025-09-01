package workflow;

public class Slack implements NotificationChannel {
    @Override
    public void notify(Message message) {
        System.out.printf("[SLACK] {%s} - %s\n", message.messageType,message.text);
    }
}

package workflow;

public class Slack implements NotificationChannel {
    @Override
    public void notify(Message message) {
        System.out.printf("[Slack] {%s} - %s\n", message.messageType,message.text);
    }
}

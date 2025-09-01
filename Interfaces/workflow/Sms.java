package workflow;

public class Sms implements NotificationChannel {
    @Override
    public void notify(Message message) {
        System.out.printf("[SMS] {%s} - %s\n", message.messageType,message.text);
    }
}

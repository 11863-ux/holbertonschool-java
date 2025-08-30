public class Sms implements NotificationChannel {
    @Override
    public void notify(Message message) {
        System.out.printf("[Sms] {%s} - %s\n", message.messageType,message.text);
    }
}

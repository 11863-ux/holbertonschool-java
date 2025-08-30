public class Teams implements NotificationChannel {
    @Override
    public void notify(Message message) {
        System.out.printf("[Teams] {%s} - %s\n", message.messageType,message.text);
    }
}

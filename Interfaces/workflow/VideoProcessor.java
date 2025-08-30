package workflow;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VideoProcessor {
    List<NotificationChannel> channels= new ArrayList<>();

    void registerChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    void process(Video video) {
        for (NotificationChannel channel : channels) {
            Message msg = new Message();
            msg.messageType=MessageType.LOG;
            msg.text=String.format("[%s] - %s",video.file,video.format);
            channel.notify(msg);
        }
    }
}

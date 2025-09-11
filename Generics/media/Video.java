package media;

public class Video extends Media{
    int duration;

    Video(String name, int duration) {
        super.name = name;
        this.duration = duration;
    }
}

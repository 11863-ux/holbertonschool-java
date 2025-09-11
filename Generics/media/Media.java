package media;

public class Media {
    String name;

    @Override
    public String toString() {
        return String.format("Type: %s - Name: %s", this.getClass().getSimpleName(), getName());
    }

    public String getName() {
        return name;
    }
}

public class Electronic extends Item {
    String description;
    double value;

    Electronic(String description, double value) {
        this.description = description;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("[%s] $ %f",description,value).replace(".",",");
    }
}

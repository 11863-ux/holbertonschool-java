package warehouse;

public class Food extends Item {
    String name;
    double calories;
    double price;

    Food(String name, double calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("[%s] %f $ %f",name,calories,price).replace(".",",");
    }
}

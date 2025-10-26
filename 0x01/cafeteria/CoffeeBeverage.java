import java.util.List;

public class CoffeeBeverage extends Beverage {
    @Override
    public List<String> getIngredients() {
        return List.of("coffee");
    }

    @Override
    public double getPrice() {
        return 5.35;
    }
}

import java.util.List;

public class CoffeeBeverage extends Beverage {
    @Override
    List<String> getIngredients() {
        return List.of("coffee");
    }

    @Override
    double getPrice() {
        return 5.35;
    }
}

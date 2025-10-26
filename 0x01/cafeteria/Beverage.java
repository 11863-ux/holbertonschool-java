import java.util.List;

public abstract class Beverage {
    abstract List<String> getIngredients();
    abstract double getPrice();

    @Override
    public String toString() {
        return String.format("Price: %.2f - Ingredients: %s", getPrice(), getIngredients());
    }
}

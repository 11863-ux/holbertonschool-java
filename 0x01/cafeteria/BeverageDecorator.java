import java.util.List;

public class BeverageDecorator extends Beverage {

    public Beverage decoratedBeverage;

    public BeverageDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }
    @Override
    public List<String> getIngredients() {
        return decoratedBeverage.getIngredients();
    }

    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice();
    }
}

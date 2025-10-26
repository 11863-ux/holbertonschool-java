import java.util.List;

public class BeverageDecorator extends Beverage {

    Beverage decoratedBeverage;

    public BeverageDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }
    @Override
    List<String> getIngredients() {
        return decoratedBeverage.getIngredients();
    }

    @Override
    double getPrice() {
        return decoratedBeverage.getPrice();
    }
}

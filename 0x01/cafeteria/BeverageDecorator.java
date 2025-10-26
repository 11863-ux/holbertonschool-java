import java.util.ArrayList;
import java.util.List;

public class BeverageDecorator extends Beverage {

    private Beverage decoratedBeverage;

    public BeverageDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }
    @Override
    public ArrayList<String> getIngredients() {
        return decoratedBeverage.getIngredients();
    }

    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice();
    }
}

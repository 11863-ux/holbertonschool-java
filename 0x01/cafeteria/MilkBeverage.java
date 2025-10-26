import java.util.ArrayList;
import java.util.List;

public class MilkBeverage extends BeverageDecorator{
    public MilkBeverage(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public ArrayList<String> getIngredients() {
        super.getIngredients().add("milk");
        return super.getIngredients();
    }


    @Override
    public double getPrice() {
        return super.getPrice() + 3.2;
    }
}

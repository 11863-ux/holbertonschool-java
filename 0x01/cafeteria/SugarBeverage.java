import java.util.ArrayList;
import java.util.List;

public class SugarBeverage extends BeverageDecorator{
    public SugarBeverage(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public ArrayList<String> getIngredients() {
        super.getIngredients().add("sugar");
        return super.getIngredients();
    }


    @Override
    public double getPrice() {
        return super.getPrice()+1.9;
    }
}

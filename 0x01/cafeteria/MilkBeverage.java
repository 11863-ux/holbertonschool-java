import java.util.ArrayList;
import java.util.List;

public class MilkBeverage extends BeverageDecorator{
    public MilkBeverage(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>(super.getIngredients());
        ingredients.add("milk");
        return ingredients;
    }


    @Override
    public double getPrice() {
        return super.getPrice() + 3.2;
    }
}

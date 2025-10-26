import java.util.List;

public class MilkBeverage extends BeverageDecorator{
    public MilkBeverage(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    List<String> getIngredients() {
        super.getIngredients().add("milk");
        return super.getIngredients();
    }


    @Override
    double getPrice() {
        return super.getPrice() + 3.2;
    }
}

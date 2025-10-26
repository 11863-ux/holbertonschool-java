import java.util.List;

public class SugarBeverage extends BeverageDecorator{
    public SugarBeverage(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    List<String> getIngredients() {
        super.getIngredients().add("sugar");
        return decoratedBeverage.getIngredients();
    }


    @Override
    double getPrice() {
        return super.getPrice()+1.9;
    }
}

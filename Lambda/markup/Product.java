import java.util.function.Consumer;
import java.util.function.Supplier;

public class Product {
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getMarkupPercentage() {
        return markupPercentage;
    }

    String name;
    double price;
    double markupPercentage=10;

    Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    Supplier<Double> priceWithMarkup= ()-> price+price*markupPercentage/100;
    Consumer<Double> updateMarkup=(Double value) -> markupPercentage=value;

}

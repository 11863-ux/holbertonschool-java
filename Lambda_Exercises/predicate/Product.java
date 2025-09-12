package predicate;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Product {

    String name;
    double price;

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductTypes getType() {
        return type;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    double weight;
    ProductTypes type;
    int stockQuantity;


    Product(String name, double price, double weight, int stockQuantity, ProductTypes type) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.stockQuantity = stockQuantity;
    }

    private static final DecimalFormatSymbols symbols = new DecimalFormatSymbols();
    private static final DecimalFormat df;

    static {
        symbols.setDecimalSeparator(',');
        df = new DecimalFormat("0.000000", symbols);
    }

    // constructor və getter-lər...

    @Override
    public String toString() {
        return name + " "
                + df.format(price) + " "
                + df.format(weight) + " "
                + stockQuantity + " "
                + type;
    }
}

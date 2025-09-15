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


    Product(String name, double price,double weight, int stockQuantity,ProductTypes type) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return String.format("%s %f %f %d %s",name,price,weight,stockQuantity,type);
    }
}

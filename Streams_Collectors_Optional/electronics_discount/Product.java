public class Product {

    int code;
    String name;
    ProductCategory category;
    public double price;

    public Product(int code, String name, ProductCategory category, double price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s $ %.2f", code, name, category, price).replace(".", ",");
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

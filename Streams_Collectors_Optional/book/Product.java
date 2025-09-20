public class Product {

    int code;
    String name;
    ProductCategory category;
    double price;

    public Product(int code, String name, ProductCategory category, double price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s $ %.2f]", code, name, category, price).replace(".", ",");
    }
}

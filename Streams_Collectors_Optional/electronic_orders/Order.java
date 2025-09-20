import java.util.List;

public class Order {

    public Order(int code, List<Product> products, Client client) {
        this.code = code;
        this.products = products;
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    int code;
    List<Product> products;
    Client client;

    @Override
    public String toString() {
        return String.format("[%s] %s", code, client.name);
    }
}

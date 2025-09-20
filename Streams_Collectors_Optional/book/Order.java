import java.util.List;

public class Order {

    public Order(int code, List<Product> products, Client client) {
        this.code = code;
        this.products = products;
        this.client = client;
    }

    int code;
    List<Product> products;
    Client client;
}

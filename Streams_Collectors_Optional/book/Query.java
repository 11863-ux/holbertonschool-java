import java.util.List;

public class Query {

    public static List<Product> getBooksFromOrder(Order order){

        return order.products.stream().filter(product->product.category==ProductCategory.BOOK).toList();
    }
}

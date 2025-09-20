import java.util.Comparator;
import java.util.List;

public class Query {

    public static List<Product> getBooksFromOrder(Order order){

        return order.products.stream().filter(product->product.category== ProductCategory.BOOK).toList();
    }

    public static Product getProductWithHighestPrice(List<Product> products){
        return products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).toList().get(0);
    }
}

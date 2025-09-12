import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductSearch {
    static List<Product> filter(List<Product> products, Predicate<Product> predicate) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (predicate.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}

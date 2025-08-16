package bookstore_order;

import bookstore_order.products.Product;

public class ItemOrder {
    Product product;
    int quantity;
    ItemOrder(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

}

package snackshop;

public class OrderItem {
    OrderItemType type;
    String name;

    public OrderItem(OrderItemType type, String name) {
        this.type = type;
        this.name = name;
    }
}

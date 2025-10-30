package snackshop;

public class OrderItem {
    private OrderItemType type;
    private String name;

    public OrderItem(OrderItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public OrderItemType getType() {
        return type;
    }
}

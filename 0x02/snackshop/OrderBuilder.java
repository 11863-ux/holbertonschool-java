public class OrderBuilder extends OrderAbstractBuilder{

    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    @Override
    void setSnack(SnackType type) {
        order.addItemInBox(new OrderItem(OrderItemType.SNACK, type.toString()));
    }

    @Override
    void setFries(FriesSize size) {
        order.addItemInBox(new OrderItem(OrderItemType.FRIES, size.toString()));
    }

    @Override
    void setToy(ToyType type) {
        order.addItemInBox(new OrderItem(OrderItemType.TOY, type.toString()));
    }

    @Override
    void setDrink(DrinkType type) {
        order.addItemInBox(new OrderItem(OrderItemType.DRINK, type.toString()));
    }

    public Order build(){
        return order;
    }
}

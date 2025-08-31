package providers.shipping;

public class OrderProcessor {
    ShippingProvider shippingProvider;
    OrderProcessor(ShippingProvider shippingProvider) {
        this.shippingProvider = shippingProvider;
    }

    public void process(Order order){
        Shipping shipping=shippingProvider.calculateShipping(order.weight,order.total);
        order.setShipping(shipping);
    }
}

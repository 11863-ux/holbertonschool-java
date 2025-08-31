package providers;

public class Shipping {
    double value;
    ShippingProviderType  shippingProviderType;

    Shipping(double value,ShippingProviderType shippingProviderType) {
        this.value = value;
        this.shippingProviderType = shippingProviderType;
    }

    public ShippingProviderType getShippingProviderType() {
        return shippingProviderType;
    }

    public double getValue() {
        return value;
    }
}

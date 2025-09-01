package shipping.providers;

public class Fedex implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        double costValue=weight>1000?value*10/100:value*5/100;
        return new Shipping(costValue,getShippingProviderType());

    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}

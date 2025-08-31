package providers;

public class DalseyHillblomLynn implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        double costValue=weight>5000?value*12/100:value*4/100;
        return new Shipping(costValue,getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.DHL;
    }
}

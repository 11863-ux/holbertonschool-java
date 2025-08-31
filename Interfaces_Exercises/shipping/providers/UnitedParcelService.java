package providers;

public class UnitedParcelService implements ShippingProvider{
    @Override
    public Shipping calculateShipping(double weight, double value) {
        double costValue=weight>2000?value*7/100:value*45/1000;
        return new Shipping(costValue,getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}

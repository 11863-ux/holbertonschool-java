public class Order {
    double discountPercentage;
    ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items){
        this.discountPercentage = discountPercentage;
        this.items = items;
    }


    public double  calculateTotal(){
        double total = 0d;
        for (ItemOrder item : items){
            total += item.quantity*item.product.getNetPrice();
        }
        return Math.floor((total-total*discountPercentage/100d)*100)/100.0;
    }
}

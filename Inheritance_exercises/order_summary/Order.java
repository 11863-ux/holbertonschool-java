package order_summary;


import java.util.Arrays;

public class Order {
    double discountPercentage;
    ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }


    public double calculateTotal() {
        double total = 0;
        for (ItemOrder item : items) {
            total += item.quantity * item.product.getNetPrice();
        }
        return total - total * discountPercentage / 100;
    }

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");
        Arrays.stream(items).forEach(item -> {
            ItemOrder listItem=items[items.length-1];
            System.out.printf("Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f", item.product.getClass().getSimpleName(), item.product.title, item.product.getNetPrice(), item.quantity, item.product.getNetPrice()*item.quantity);
            if(item!=listItem){
                System.out.println();
            }
        });
        System.out.println();
        System.out.println("----------------------------");
        System.out.printf("DISCOUNT: %.2f", calculateTotal()*discountPercentage/100);
        System.out.println();
        System.out.printf("TOTAL PRODUCTS: %.2f", calculateTotal());
        System.out.println();
        System.out.println("----------------------------");
        System.out.printf("TOTAL ORDER: %.2f", calculateTotal()-calculateTotal()*discountPercentage/100);
        System.out.println();
        System.out.println("----------------------------");
    }
}

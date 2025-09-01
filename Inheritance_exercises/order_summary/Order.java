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
        return total;
    }

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");
        Arrays.stream(items).forEach(item -> {
            ItemOrder listItem=items[items.length-1];
            System.out.print(String.format("Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f", item.product.getClass().getSimpleName(), item.product.title, item.product.getNetPrice(), item.quantity, item.product.getNetPrice()*item.quantity).replace(".",","));
            if(item!=listItem){
                System.out.println();
            }
        });
        System.out.println();
        System.out.println("----------------------------");
        System.out.print(String.format("DISCOUNT: %.2f\n", calculateTotal()*discountPercentage/100d).replace(".",","));
        System.out.print(String.format("TOTAL PRODUCTS: %.2f\n", calculateTotal()).replace(".",","));
        System.out.println("----------------------------");
        System.out.print(String.format("TOTAL ORDER: %.2f\n", calculateTotal()-calculateTotal()*discountPercentage/100).replace(".",","));
        System.out.println("----------------------------");
    }
}

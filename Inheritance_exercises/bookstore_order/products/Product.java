package bookstore_order.products;

public abstract class Product {
    String title;
    int year;
    String country;
    double grossPrice;
    Product(String title, int year, String country, double grossPrice){
        this.title = title;
        this.year = year;
        this.country = country;
        this.grossPrice=grossPrice;
    }

    public abstract double getNetPrice();
}

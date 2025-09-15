package products;

public abstract class Products {
    public String title;
    public int year;
    public String country;
    public double grossPrice;
    public Products(String title, int year, String country, double grossPrice){
        this.title = title;
        this.year = year;
        this.country = country;
        this.grossPrice=grossPrice;
    }

    public abstract double getNetPrice();
}

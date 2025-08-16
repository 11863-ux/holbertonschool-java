public abstract class Products {
    String title;
    int year;
    String country;
    double grossPrice;
    public Products(String title, int year, String country, double grossPrice){
        this.title = title;
        this.year = year;
        this.country = country;
        this.grossPrice=grossPrice;
    }

    public abstract double getNetPrice();
}

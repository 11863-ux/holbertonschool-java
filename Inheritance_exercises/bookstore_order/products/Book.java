package bookstore_order.products;

public class Book extends Product{
    public Book(String title, int year, String country, double grossPrice, int pages, String author, int edition){
        super(title, year, country, grossPrice);
    }
    @Override
    public double getNetPrice() {
        return grossPrice+grossPrice*15/100;
    }
}

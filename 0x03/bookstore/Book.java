import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() throws InvalidBookException {
        if(title.length()<3){
            throw new InvalidBookException("Invalid book title");
        }
        return title;
    }

    public String getAuthor() throws InvalidAuthorException {
        String[] words = author.split(" ");
        if(words.length <=1) {
            throw new InvalidAuthorException("Invalid author name");
        }
        return author;
    }

    public double getPrice() throws InvalidBookException {
        if(price <= 0){
            throw new InvalidBookException("Invalid book price");
        }
        return price;
    }
}

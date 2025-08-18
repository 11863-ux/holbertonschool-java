public class GoldEditionBook extends Book{
    GoldEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double getPrice() throws InvalidBookException {
        return super.getPrice()+super.getPrice()*30/100;
    }
}

import java.util.ArrayList;

public class Order {
    List<CookieOrder> cookies;

    Order() {
        this.cookies = new ArrayList<>();
    }


    public void addCookieOrder(CookieOrder order) {
        cookies.add(order);
    }

    public int getTotalBoxes(){
        AtomicInteger totalBoxes= new AtomicInteger();
        cookies.forEach(cookie -> {
            totalBoxes.addAndGet(cookie.getBoxQuantity());
        });
        return totalBoxes.get();
    }

    public int removeFlavor(String flavor){

        List<CookieOrder> filteredList=cookies.stream().filter(cookie-> !cookie.getFlavor().equals(flavor)).toList();
        int size=getTotalBoxes();
        cookies= new ArrayList<>(filteredList);

        return size-getTotalBoxes();

    }
}

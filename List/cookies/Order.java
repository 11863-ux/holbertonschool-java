package cookies;

import java.util.ArrayList;
import java.util.List;

public class Order {
    ArrayList<CookieOrder> cookies;

    Order() {
        this.cookies = new ArrayList<>();
    }


    public void addCookieOrder(CookieOrder order) {
        cookies.add(order);
    }

    public int getTotalBoxes(){
        int count=0;
        for (CookieOrder order : cookies) {
            count += order.getBoxQuantity();
        }
        return count;
    }

    public int removeFlavor(String flavor){

        List<CookieOrder> filteredList=cookies.stream().filter(cookie-> !cookie.getFlavor().equals(flavor)).toList();
        int size=getTotalBoxes();
        cookies= new ArrayList<>(filteredList);

        return size-getTotalBoxes();

    }
}

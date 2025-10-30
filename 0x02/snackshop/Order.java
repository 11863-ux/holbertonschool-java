import java.util.HashSet;

public class Order {
    private HashSet<OrderItem> itemsInBox=new HashSet<>();
    private HashSet<OrderItem> itemsOutOfBox=new HashSet<>();

    public void addItemInBox(OrderItem item){
        itemsInBox.add(item);
    }

    public void addItemOutOfBox(OrderItem item){
        itemsOutOfBox.add(item);
    }

    @Override
    public String toString() {
        StringBuilder s= new StringBuilder("Out of the box:\n");
        for(OrderItem item:itemsInBox){
            s.append(String.format("        -%s ",item.getType().name())).append(item.getName()).append("\n");
        }

        s.append("In the box:\n");

        for(OrderItem item:itemsOutOfBox){
            s.append(String.format("        -%s ",item.getType().name())).append(item.getName()).append("\n");
        }

        return s.toString();

    }
}

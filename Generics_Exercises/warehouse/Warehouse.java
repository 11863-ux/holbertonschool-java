import java.util.HashMap;
import java.util.Map;

public class Warehouse<T extends Item> implements Storable<T> {

    Map<String, Item> map = new HashMap<>();

    @Override
    public void addToInventory(String name, T obj) {
        map.put(name,obj);
    }

    @Override
    public T getFromInventory(String name) {
        return (T) map.get(name);
    }
}

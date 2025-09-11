package warehouse;

public interface Storable<T> {


    void addToInventory(String name,T obj);

    T getFromInventory(String name);
}

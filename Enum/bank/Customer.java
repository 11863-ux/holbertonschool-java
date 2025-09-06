import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    ArrayList<Double> transactions;

    Customer(String name, double transaction){
        this.name = name;
        this.transactions = new ArrayList<>(List.of(transaction));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}

public class Client {

    int code;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return premium;
    }

    String name;
    boolean premium;

    public Client(int code, String name, boolean premium) {
        this.code = code;
        this.name = name;
        this.premium = premium;
    }

}

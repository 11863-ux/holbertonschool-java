package aggregation;

public class Employee {
    private String name;
    private int code;
    private Address address;

    public Employee(String name, int code, Address address) {
        this.name = name;
        this.code = code;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public Address getAddress() {
        return address;
    }

    public void introduce() {
        System.out.printf("Code: %d\n" +
                "Name: %s\n" +
                "District: %s\n" +
                "City: %s\n" +
                "Country: %s",getCode(),getName(),getAddress().getCity(),getAddress().getCountry());
    }
}

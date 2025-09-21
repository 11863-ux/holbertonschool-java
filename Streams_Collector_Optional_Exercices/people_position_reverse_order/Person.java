public class Person {
    int code;
    String name;
    String position;
    int age;
    double salary;

    public Person(int code, String name, String position, int age, double salary) {
        this.code = code;
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public int getCode() {
        return code;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s %d $ %f",code,name,position,age,salary);
    }

}

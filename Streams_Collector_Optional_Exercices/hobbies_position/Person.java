import java.util.List;

public class Person implements Comparable<Person> {
    int code;
    String name;
    String position;
    int age;
    double salary;
    List<String> hobbies;

    public Person(int code, String name, String position, int age, double salary, List<String> hobbies) {
        this.code = code;
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.hobbies = hobbies;
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s %d $ %f",code,name,position,age,salary);
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}

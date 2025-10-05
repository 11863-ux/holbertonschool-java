import java.util.Date;

public class Person {

    String name;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String surname;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer, float salary) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
        this.salary = salary;
    }

    Date birthDate;
    boolean anotherCompanyOwner;
    boolean pensioner;
    boolean publicServer;
    float salary;

    public String fullName(){
        return name+" "+surname;
    }

    public float calculateYearlySalary(){
        return salary*12;
    }


    public boolean isMEI(){
        return calculateYearlySalary() < 130000 && 2025-birthDate.getYear() > 18 && !anotherCompanyOwner && !pensioner && !publicServer;
    }

    Person(float salary){
        setSalary(salary);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

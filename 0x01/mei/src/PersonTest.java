import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class PersonTest {

    String name;
    String surname;
    Date birthDate;
    boolean anotherCompanyOwner;
    boolean pensioner;
    boolean publicServer;
    float salary;
    Person person;

    @BeforeEach
    public void setUp(){
        this.name = "Paul";
        this.surname = "McCartney";
        this.salary=1200;
        this.birthDate = new Date(2005, Calendar.APRIL,16);
    }

    @Test
    public void show_full_name(){
        Person person=new Person(name,surname);
        Assertions.assertEquals(name+" "+surname,person.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        Person person=new Person(salary);
        Assertions.assertEquals(14400,person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI(){
        Person person=new Person(name,surname,birthDate,false,false,false,1200);
        Assertions.assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        Person person=new Person(name,surname,birthDate,true,false,false,1200);
        Assertions.assertFalse(person.isMEI());
    }
}

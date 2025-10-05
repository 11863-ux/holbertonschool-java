import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {

    Person person;
    @BeforeEach
    public void setUp() {
        person=new Person();

    }


    @Test
    public void test_email_with_at_symbol(){
        Assertions.assertTrue(person.isEmailValid("email_test@domain.com"));
    }

    @Test
    public void testar_email_sem_arroba(){
        Assertions.assertFalse(person.isEmailValid("email_testdomain.com"));
    }

    @Test
    public void test_email_over_50_characters(){
        Assertions.assertEquals(false,person.isEmailValid("email_test_very_long_should_not_be_valid@domain.com"));
    }


}

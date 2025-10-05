public class Person {

    public boolean isEmailValid(String email) {
        return email.contains("@") && email.length()<=50;
    }
}

public class Person {

    public static boolean emailValid(String email){
        return email.length() <=50 && email.contains("@");
    }
}

public class Phone {
    String areaCode;
    String number;

    public Phone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
    }

    public String toString(){
        return String.format("(%s) %s", areaCode, number);
    }

}

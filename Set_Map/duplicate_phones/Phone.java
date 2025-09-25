import java.util.Objects;

public class Phone {
    String areaCode;
    String number;

    public Phone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("(%s) %s", areaCode, number);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        if(this == obj) return true;
        return Objects.equals(this.areaCode, ((Phone) obj).areaCode) && Objects.equals(this.number, ((Phone) obj).number);
    }
}

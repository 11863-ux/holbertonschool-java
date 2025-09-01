public class PositiveInteger {
    int value;

    PositiveInteger(int value) {
        this.value = value;

    }

    PositiveInteger(String value) {
        if(Integer.parseInt(value)<0){
            throw new IllegalArgumentException("Value is not a positive integer");
        }
        this.value = Integer.parseInt(value);
    }

    public int getValue() {
       return value;
    }

    public void setValue(int value) {
        if(value < 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
        this.value = value;

    }

    public boolean isPrime(){
        if(value <=1){
            return false;
        }
        for (int i = 2; i < value; i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

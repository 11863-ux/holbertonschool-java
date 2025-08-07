public class EvenNumbers {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i<=98 && i%2==0){
                System.out.print(i+", ");
            }else if (i>98) System.out.println(i);;
        }
    }
}

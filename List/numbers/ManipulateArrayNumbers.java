package numbers;

import java.util.List;

public class ManipulateArrayNumbers {

    public static int findNumberPosition(List<Integer> numbers,int number){
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i).equals(number)){
                return i;
            }
        }
        return -1;
    }

    public static void addNumber(List<Integer> numbers,int number){
        if(findNumberPosition(numbers,number)!=-1){
            throw new IllegalArgumentException("Number already in the list");
        }else numbers.add(number);
    }

    public static void removeNumber(List<Integer> numbers,int number ){
        int index=findNumberPosition(numbers,number);
        if(index!=-1){
            numbers.remove(index);
        }else throw new IllegalArgumentException("Number not found in the list");

    }

    public static void replaceNumber(List<Integer> numbers,int numberToReplace,int replacementNumber){
        if(findNumberPosition(numbers,numberToReplace)!=-1){

            for(int i=0;i<numbers.size();i++){
                if(numbers.get(i).equals(numberToReplace)){
                    numbers.set(i,replacementNumber);
                }
            }
        } else numbers.add(replacementNumber);

    }
}

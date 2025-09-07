import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneList {

    HashMap<String,ArrayList<Phone>> peoplePhones;

    public PhoneList() {
        peoplePhones = new HashMap<>();
    }


    public void addPhone(String name,Phone phone){
        if(peoplePhones.containsKey(name)){
            peoplePhones.get(name).add(phone);
        }else peoplePhones.put(name,new ArrayList<>(List.of(phone)));


    }

    public ArrayList<Phone> isFind(String name){
        if(peoplePhones.containsKey(name)){
            return peoplePhones.get(name);
        }return null;
    }
}

import java.util.HashMap;
import java.util.TreeSet;
import java.util.List;

public class PhoneList {

    HashMap<String, TreeSet<Phone>> peoplePhones;

    public PhoneList() {
        peoplePhones = new HashMap<>();
    }


    public TreeSet<Phone> addPhone(String name, Phone phone){
        if(peoplePhones.containsKey(name)){
            TreeSet<Phone> phones = peoplePhones.get(name);
            if(phones.contains(phone)){
                throw  new RuntimeException("Phone already exists for this person");
            } else if (checkHasAnyUserHaveThisPhone(phone)) {
                throw new RuntimeException("Phone already belongs to another person");

            } else {
                peoplePhones.get(name).add(phone);
                return phones;
            }
        }
        else {
            peoplePhones.put(name,new TreeSet<>(List.of(phone)));
            return peoplePhones.get(name);
        }


    }

    public boolean checkHasAnyUserHaveThisPhone(Phone phone) {
        for (TreeSet<Phone> phones: peoplePhones.values()) {
            if (phones.contains(phone)) {
                return true;
            }
        }
        return false;
    }

    public TreeSet<Phone> isFind(String name){
        if(peoplePhones.containsKey(name)){
            return peoplePhones.get(name);
        }return null;
    }
}

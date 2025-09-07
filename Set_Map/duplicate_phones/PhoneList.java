package duplicate_phones;

import phones.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PhoneList {

    HashMap<String, HashSet<Phone>> peoplePhones;

    public PhoneList() {
        peoplePhones = new HashMap<>();
    }


    public HashSet<Phone> addPhone(String name, Phone phone){
        if(peoplePhones.containsKey(name)){
            HashSet<Phone> phones = peoplePhones.get(name);
            if(phones.contains(phone)){
                throw  new RuntimeException("Phone already exists for this person");
            }else peoplePhones.get(name).add(phone);
        }else peoplePhones.put(name,new HashSet<>(List.of(phone)));


    }

    public HashSet<Phone> isFind(String name){
        if(peoplePhones.containsKey(name)){
            return peoplePhones.get(name);
        }return null;
    }
}

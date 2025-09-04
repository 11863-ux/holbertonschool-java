package mobile;

import java.util.ArrayList;

public class Mobile {

    ArrayList<Contact> contacts= new ArrayList<>();

    public int getContactPosition(String name){
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).name.equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void addContact(Contact contact){
        int contactReturn=getContactPosition(contact.name);
        if(contactReturn==-1){
            contacts.add(contact);
        } else{
            throw new IllegalArgumentException("Could not add contact. Contact with this name already exists");
        }
    }

    public void updateContact(Contact oldContact, Contact newContact){
        int contactReturnForOldContact=getContactPosition(oldContact.name);
        int contactReturnForNewContact=getContactPosition(newContact.name);

        if(contactReturnForOldContact==-1){
            throw new IllegalArgumentException("Could not modify contact. Contact does not exist");
        }
        if(contactReturnForNewContact!=-1 && contactReturnForOldContact!=contactReturnForNewContact){
            throw new IllegalArgumentException("Could not modify contact. Contact with this name already exists");
        }

        contacts.set(contactReturnForOldContact,newContact);
    }

    public void removeContact(Contact contact){
        int contactReturn=getContactPosition(contact.name);
        if(contactReturn!=-1){
            contacts.remove(contactReturn);
        } else{
            throw new IllegalArgumentException("Could not remove contact. Contact does not exist");
        }
    }

    public void listContacts(){
        contacts.forEach(contact-> System.out.printf("%s -> %s (%s)\n",contact.name,contact.phone,contact.type));
    }
}

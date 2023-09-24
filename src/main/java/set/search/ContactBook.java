package main.java.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {

    private Set<Contact> contactSet;

    public ContactBook() {
        this.contactSet = new HashSet<>();
    }


    public void addContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName (String name) {
        Set<Contact> contactsPerName = new HashSet<>();
        for (Contact c : contactSet) {
            if(c.getName().startsWith(name)) {
                contactsPerName.add(c);
            }
        }
        return contactsPerName;
    }

    public Contact updateContactNumber(String name, int newNumber) {
        Contact updatedContact = null;
        for(Contact c : contactSet) {
            if(c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }
}

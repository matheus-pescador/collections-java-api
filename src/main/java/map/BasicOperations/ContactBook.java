package main.java.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    private Map<String, Integer> contactBookMap;

    public ContactBook() {
        this.contactBookMap = new HashMap<>();
    }

    public void addContact(String name, Integer phone) {
        contactBookMap.put(name, phone);
    }

    public void removeContact(String name) {
        if (!contactBookMap.isEmpty()) {
            contactBookMap.remove(name);
        }
    }

    public void showContacts() {
        System.out.println(contactBookMap);
    }

    public Integer searchByName(String name) {
        Integer phoneByName = null;
        if (!contactBookMap.isEmpty()) {
            phoneByName = contactBookMap.get(name);

        }
        return phoneByName;
    }
}

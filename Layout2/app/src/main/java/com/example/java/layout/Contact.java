package com.example.java.layout;

import java.util.ArrayList;

/**
 * Created by Java on 6/11/2016.
 */
public class Contact {
    private String image;
    private String location;
    private String name;
    public Contact(String name, String location , String image) {
        this.name = name;
        this.location = location;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    public String getImage(){
        return image;
    }
    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Angkor","Siem rab",""));
        }

        return contacts;
    }
}

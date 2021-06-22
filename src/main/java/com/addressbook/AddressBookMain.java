package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    /**
     * Added welcome message
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");
    }
    /**
     * added this method to check the test case.
     * @param contactList
     * @return boolean
     */
    public boolean AddContact(Addressbook contactList){
        List<Addressbook> contacts=new ArrayList<>();
        if (contacts.add(contactList)){
            return true;
        }
        return false;

    }
}

package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    /**
     * Added welcome message
     * Taking console input.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:\n");
        String firstname=scan.next();
        System.out.println("Enter your last name:\n");
        String lastname=scan.next();
        System.out.println("Enter your Address:\n");
        String address=scan.next();
        System.out.println("Enter your City:\n");
        String city=scan.next();
        System.out.println("Enter your State:\n");
        String state=scan.next();
        System.out.println("Enter your Zip:\n");
        String zip=scan.next();
        System.out.println("Enter your Phone Number:\n");
        String phoneNumber=scan.next();
        System.out.println("Enter your Email:\n");
        String email=scan.next();
        Addressbook contactList=new Addressbook(firstname,lastname,address,city,state,zip,phoneNumber,email);
    }
    /**
     * this method will return the given input as a string.
     * @return next input.
     */
    public String getInput() {
        Scanner scan=new Scanner(System.in);
        return scan.next();
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

package com.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class AddressBookTest {
    /**
     * this will check the contact is added or not.
     */
    @Test
    public void Given_variablesAre_present_should_return_true(){
        AddressBookMain contact=new AddressBookMain();
        Addressbook addressbook=new Addressbook("Amitranjan", "Pradhan", "Narsinghpur", "Cuttack", "Odisha", "754032", "6371912511", "amitranjanpradhan456@gmail.com");
        Boolean result=contact.AddContact(addressbook);
        Assertions.assertTrue(result);
    }
    /**
     * this method will check the user inputs.
     */
    @Test
    public void Given_ConsoleInput_Is_Added_Should_return_value(){
        AddressBookMain contact=new AddressBookMain();
        String firstname = "Amitranjan";
        InputStream in = new ByteArrayInputStream(firstname.getBytes());
        System.setIn(in);
        Assertions.assertEquals("Amitranjan",contact.getInput());
        String lastname = "Pradhan";
        InputStream lastName = new ByteArrayInputStream(lastname.getBytes());
        System.setIn(lastName);
        Assertions.assertEquals("Pradhan",contact.getInput());
        String address = "Narsinghpur";
        InputStream aDdress = new ByteArrayInputStream(address.getBytes());
        System.setIn(aDdress);
        Assertions.assertEquals("Narsinghpur",contact.getInput());
        String city = "Cuttack";
        InputStream cIty = new ByteArrayInputStream(city.getBytes());
        System.setIn(cIty);
        Assertions.assertEquals("Cuttack",contact.getInput());
        String state = "odisha";
        InputStream sTate = new ByteArrayInputStream(state.getBytes());
        System.setIn(sTate);
        Assertions.assertEquals("odisha",contact.getInput());
        String zip = "754032";
        InputStream zIp = new ByteArrayInputStream(zip.getBytes());
        System.setIn(zIp);
        Assertions.assertEquals("754032",contact.getInput());
        String phoneNumber = "6371912511";
        InputStream pHoneNumber = new ByteArrayInputStream(zip.getBytes());
        System.setIn(pHoneNumber);
        Assertions.assertEquals("6371912511",contact.getInput());
        String email = "amitranjanpradhan456@gmail.com";
        InputStream eMail = new ByteArrayInputStream(zip.getBytes());
        System.setIn(eMail);
        Assertions.assertEquals("amitranjanpradhan456@gmail.com",contact.getInput());
    }
}

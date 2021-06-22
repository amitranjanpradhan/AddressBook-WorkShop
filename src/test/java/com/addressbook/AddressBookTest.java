package com.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {
    /**
     * this will check the contact is added or not.
     */
    @Test
    public void Given_variablesAre_present_should_return_true(){
        AddressBookMain contact=new AddressBookMain();
        Addressbook addressbook=new Addressbook("AmitRanjan", "Pradhan", "Narsinghpur", "Cuttack", "Odisha", "754032", "6371912511", "amitranjanpradhan456@gmail.com");
        Boolean result=contact.AddContact(addressbook);
        Assertions.assertTrue(result);
    }
}

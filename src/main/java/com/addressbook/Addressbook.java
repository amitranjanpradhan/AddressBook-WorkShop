package com.addressbook;

public class Addressbook {
    /**
     * added variables through which we can store values.
     */
    public String firstname,lastname,address,city,state,zip,phoneNumber,email;

    /**
     * this constructor will initialise the values according to the object creation.
     * @param firstname
     * @param lastname
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phoneNumber
     * @param email
     */
    public Addressbook (String firstname,String lastname,String address,String city,String state,String zip,String phoneNumber,String email){
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
}

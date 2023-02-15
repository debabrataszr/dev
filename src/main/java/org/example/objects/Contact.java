package org.example.objects;

public class Contact {
    String name;
    String lastname;
    String number;
    String address;
    public void printMyData() {
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(number);
        System.out.println(address);
    }
    public Contact() {
    }

    public Contact(String name,String lastname,String number,String address) {
        this.name=name;
        this.lastname = lastname;
        this.number=number;
        this.address=address;
    }
}

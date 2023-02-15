package org.example.objects;


import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);



    Contact[] c1Arr= new Contact[2];
    Contact c1=new Contact();




    public static void main(String[] args) {

        System.out.println("Enter the number of contacts to be stored:");
         int n=sc.nextInt();
         sc.nextLine();

        AddressBook addressBook = new AddressBook();

        addressBook.showDetails();

        addressBook.printDetails();
    }

    private void showDetails() {
            for(int i=0;i<c1Arr.length;i++){
           Contact c1=new Contact();
        System.out.println("Enter name:");
        c1.name=sc.nextLine();
        System.out.println("Enter lastname:");
        c1.lastname=sc.nextLine();
        System.out.println("Enter number:");
        c1.number=sc.nextLine();
        System.out.println("Enter address:");
        c1.address=sc.nextLine();
        c1Arr[i]=c1;
        }

    }

    private void printDetails() {
        for(int i=0;i<c1Arr.length;i++){

            System.out.println(c1Arr[i].name);

            System.out.println(c1Arr[i].lastname);

            System.out.println(c1Arr[i].number);

            System.out.println(c1Arr[i].address);
        }
    }
}
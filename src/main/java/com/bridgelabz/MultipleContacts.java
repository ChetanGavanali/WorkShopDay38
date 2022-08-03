package com.bridgelabz;


import java.util.ArrayList;
import java.util.Scanner;

public class MultipleContacts {

    private ArrayList<Contacts> record;


        public MultipleContacts() {
            record = new ArrayList<Contacts>();
        }

        public void display() {
            for (Contacts obj:record) {
                obj.display();
            }
        }

        public void addToRecord(Contacts obj) {

            record.add(new Contacts(obj.firstName, obj.lastName, obj.address, obj.city, obj.state, obj.zipCode, obj.phoneNumber, obj.email));


        }

        public static Contacts add() {

            Scanner sc = new Scanner(System.in);
            String firstName;
            String lastName;
            String address;
            String city;
            String state;
            String zipCode;
            String phoneNumber;
            String email;

            System.out.println("Enter Details");
            System.out.print("FirstName: ");
            firstName= sc.next();
            System.out.print("LastName: ");
            lastName= sc.next();
            System.out.print("Address: ");
            address= sc.next();
            System.out.print("City: ");
            city= sc.next();
            System.out.print("State: ");
            state = sc.next();
            System.out.print("ZipCode: ");
            zipCode = sc.next();
            System.out.print("PhoneNumber: ");
            phoneNumber = sc.next();
            System.out.println("Email: ");
            email = sc.next();

            Contacts entry = new Contacts(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
            return entry;
        }

        public void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            MultipleContacts buildobj = new MultipleContacts();
            Contacts entry1= new Contacts("Chetan", "Gavanali", "Mutaga", "Belgaum","Karnataka", "591124","9449441490","chetangavanali@gmail.com");
            buildobj.addToRecord(entry1);
            System.out.println(entry1);

            Contacts entry2= new Contacts("abcd","efgh","ijkl","mnop","qrst", "123456", "1234567890","abcd@gmail.com");
            buildobj.addToRecord(entry2);
            System.out.println(entry2);

            String user_input="1";
            while(user_input.equals("1")) {

                Contacts entry=buildobj.add();
                buildobj.addToRecord(entry);
                System.out.println(entry);

                System.out.println();
                System.out.println("press 1 to add new entry");
                System.out.println("press any key to exit");
                user_input=sc.next();
            }
             buildobj.display();

        }
}

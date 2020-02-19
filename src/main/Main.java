package main;

import definition.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person prsn = new Person();

        System.out.println("Welcome to Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contact");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit a program");

        int inpMenu = sc.nextInt();

        if (inpMenu == 1) {
            System.out.println("You have chosen to add a new contact:");
            System.out.println("Please enter the name of the Person");
            System.out.print("First Name:");
            String fname = sc.next();
            System.out.print("Last Name:");
            String lname = sc.next();
            prsn.add(fname, lname);

        }


    }
}

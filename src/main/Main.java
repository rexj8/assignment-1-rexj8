package main;

import definition.LinkedList;
import definition.Name;
import definition.PhoneNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Name nm = new Name();
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedListName = new LinkedList<String>();
        LinkedList<String> linkedListNumber = new LinkedList<String>();

//
        System.out.println("                        Welcome Sir!");

        while (true) {

            System.out.println("1. SHOW Contacts list");
            System.out.println("2. ADD Contacts");
            System.out.println("3. REMOVE Contacts");
            System.out.println("4. Search Contacts");
            System.out.println("5. EXIT");

            int inpMENU = sc.nextInt();

            if (inpMENU == 1) {
                linkedListName = nm.getFromDB();
                linkedListNumber = phoneNumber.getFromDB();

                int i = 0;
                while (i < linkedListName.size) {
                    System.out.println(linkedListName.get(i) + "   " + linkedListNumber.get(i));
                    i++;
                }
                System.out.println("\nTotal Contacts :- " + linkedListName.size);
            } else if (inpMENU == 2) {
                System.out.println("Enter a NAME :-");
                String name = sc.next();
                nm.addIntoDB(name);

                System.out.println("Enter Number :-");
                String number = sc.next();
                phoneNumber.addIntoDB(number, name);
            } else if (inpMENU == 3) {
                System.out.println("Enter contact name which you have to REMOVE :-");
                String removeName = sc.next();
                nm.delFromDB(removeName);
            } else if (inpMENU == 4) {

                System.out.println("Search Text :-");
                String text = sc.next();
                System.out.println();

                linkedListName = nm.getFromDB();
                linkedListNumber = phoneNumber.getFromDB();

                int i = 0;
                int count = 0;
                String strtemp;
                while (i < linkedListName.size) {
                    strtemp = linkedListName.get(i) + "   " + linkedListNumber.get(i);

                    if (strtemp.indexOf(text) != -1) {
                        count += 1;
                        System.out.println(strtemp);
                    }
                    i++;
                }
                System.out.println("\n" + count + " results Found");

            } else if (inpMENU == 5) {
                System.exit(0);
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

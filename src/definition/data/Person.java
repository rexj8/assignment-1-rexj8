package definition.data;

import adt.PersonADT;
import definition.LinkedList;

public class Person implements PersonADT {
    public static LinkedList<String> ls = new LinkedList<>();
    public static LinkedList<String> linkedListFName = new LinkedList<>();
    public static LinkedList<String> linkedListLName = new LinkedList<>();
    public static LinkedList<String> linkedListEMail = new LinkedList<>();
    public static LinkedList<String> linkedListCTNo = new LinkedList<>();
    public static LinkedList<Integer> linkedListCount = new LinkedList<>();
    String fname;
    String lname;
    String email;
    int count;

    @Override
    public void addName(String fname, String lname) {

        this.fname = fname;
        this.lname = lname;

        linkedListFName.add(fname);
        linkedListLName.add(lname);
    }

    public void addEMail(String email) {
        this.email = email;

        linkedListEMail.add(email);
    }

    public void addCTNo(String number) {
        linkedListCTNo.add(number);
    }

    public static int count(int count) {
        linkedListCount.add(count);
        return count;
    }

    @Override
    public String viewAll() {
        return null;
    }

    @Override
    public String search(String text) {
        return null;
    }

    @Override
    public void remove(int index) {

    }


}

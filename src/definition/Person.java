package definition;

import adt.PersonADT;

public class Person implements PersonADT {
    LinkedList<String> ls = new LinkedList<>();
    LinkedList<String> linkedListFName = new LinkedList<>();
    LinkedList<String> linkedListLName = new LinkedList<>();
    String fname;
    String lname;
    String email;

    @Override
    public void addName(String fname, String lname) {

        this.fname = fname;
        this.lname = lname;

//        linkedListFName.add(fname);
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

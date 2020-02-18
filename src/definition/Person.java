package definition;

import adt.PersonADT;

public class Person implements PersonADT {
    LinkedList<String> ls = new LinkedList<>();
    String fname;
    String lname;
    String email;

    @Override
    public void add(String text) {

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

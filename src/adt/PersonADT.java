package adt;

public interface PersonADT {

    void add(String fname, String lname);

    String viewAll();

    String search(String text);

    void remove(int index);


}

package ch.bb.mycodecampapp;

// This class represents a single person entry
public class Person {
    public final Integer id;
    public final String lastname;
    public final String firstname;

    private Person(Integer _id, String _firstname, String _lastname) {
        this.id = _id;
        this.firstname = _firstname;
        this.lastname = _lastname;
    }
}
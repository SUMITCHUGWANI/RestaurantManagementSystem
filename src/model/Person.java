package model;

public abstract class Person {
    public final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

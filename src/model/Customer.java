package model;

public class Customer extends Person{
    public Customer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}

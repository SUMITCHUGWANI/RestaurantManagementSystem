package model;

public class Reservation {

    private static int id;

    private Customer customer;

    private Table table;

    public Reservation(Customer customer, Table table) {
        id += 1;
        this.customer = customer;
        this.table = table;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Reservation.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", table=" + table +
                '}';
    }
}

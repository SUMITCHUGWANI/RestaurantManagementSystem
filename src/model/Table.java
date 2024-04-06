package model;

public class Table {
    private static int id = 0;

    private TableStatus status;

    private Customer customer;

    public Table() {
        id += 1;
        this.status = TableStatus.UNOCCUPIED;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


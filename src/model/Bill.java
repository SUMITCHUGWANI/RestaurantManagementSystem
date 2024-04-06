package model;

public class Bill {

    private  static int id = 0;

    private PayMode paymode;

    private Double totalAmount;

    private Customer customer;

    private Order order;



    public Bill(PayMode paymode, Double totalAmount, Customer customer, Order order) {
        id += 1;
        this.paymode = paymode;
        this.totalAmount = totalAmount;
        this.customer = customer;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "paymode=" + paymode +
                ", totalAmount=" + totalAmount +
                ", customer=" + customer +
                ", order=" + order +
                '}';
    }
}

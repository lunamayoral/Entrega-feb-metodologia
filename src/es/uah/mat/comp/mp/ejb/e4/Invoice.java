package es.uah.mat.comp.mp.ejb.e4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount; // %

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }


    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        amount = this.amount - getCustomerDiscount() * this.amount /100;
        return amount;
    }
    @Override
    public String toString() {
        StringBuilder customerDetails = new StringBuilder();
        customerDetails.append(" Customer[name= ").append(customer.getName())
                .append(" discount(%)= ").append(customer.getDiscount())
                .append("]");

        return "Book[ id = " + id + "name= " +  customerDetails +
                " amount= " + this.amount +  "]";

    }
}

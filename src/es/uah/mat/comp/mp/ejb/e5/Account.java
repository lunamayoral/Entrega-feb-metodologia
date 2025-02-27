package es.uah.mat.comp.mp.ejb.e5;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double balance;
    public Account(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
        balance=0.0;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        DecimalFormat BalanceForm=new DecimalFormat("00");
        String balance =BalanceForm.format(this.balance);
        return customer.toString()+"balance=$" + balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }
    public Account withdraw(double amount){
        if(balance>=amount){
            this.balance-=amount;
        }else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}

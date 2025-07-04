package model;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, Double balance){
        this.name = name;
        this.balance = balance;
    }
    public String getName(){
        return this.name;
    }
    public Double getBalance(){
        return this.balance;
    }
    public int decreaseBalance(Double amount){
       if(amount > balance){
        return -1;
       }
       this.balance -= amount;
       return 1;
    }
    public void increaseBalance(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

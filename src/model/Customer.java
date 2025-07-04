public class Customer {
    private String name;
    Private Double balance;

    Customer(String name, Double balance){
        this.name = name;
        this.balance = balance;
    }
    public void getName(){
        return this.name;
    }
    public void getBalance(){
        return this.balance
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

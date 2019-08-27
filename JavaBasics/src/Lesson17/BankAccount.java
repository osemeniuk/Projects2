package Lesson17;

public class BankAccount {

    private int id;
    private String name;
    private double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {

        try {
            balance -= amount;
        } catch (NotEnoughFundsException ex) {
            System.out.println("not enough funds");
        }
    }

    public void topUp(double amount){
        balance += amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
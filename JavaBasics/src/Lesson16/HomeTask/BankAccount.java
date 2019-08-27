package Lesson16.HomeTask;

public class BankAccount {
    private int id;
    private String name;
    private double balance;

    BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
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

    public void withdraw(double amount) {
        try {
            balance -= amount;
        } catch (IllegalArgumentException ex) {
            System.out.println("not enough funds");
        }

    }

    public void topUp(double amount) {
        balance += amount;

    }

    @Override
    public String toString() {
        return "id=" + getId() + " name=" + getName() + " balance=" + getBalance() + " ";
    }
}

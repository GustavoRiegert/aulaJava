package entities;

public class Account {

    private final int accountNumber;
    private String name;
    private double value;

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Account(int accountNumber, String name, double inicialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(inicialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void deposit(double value){
        this.value += value;
    }

    public void withdraw(double value){
        this.value -= value + 5;
    }

    public String toString(){
        return "Account " + accountNumber + ", Holder: " + name + ", Balance: $"
                + value;
    }
}


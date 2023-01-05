package entities;

//public final class SavingsAccount extends Account{
    //não deixa criar um metodo que extend esse

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

//    @Override
//    public final void withdraw(double amount){
//        balance -= amount;
//    }
    //não deixa criar um método que irá sobrepor esse
}

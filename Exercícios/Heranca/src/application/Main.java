package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING (Subclasse para superClasse)

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);

        //DOWNCASTING (Super para Sub)

        BusinessAccount acc4 = (BusinessAccount) acc2; //para acessar o loan com o acc2
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; //Ela foi instanciada como savings logo n pode ser Business
        if(acc3 instanceof BusinessAccount){ //força conversão de saving para business
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        acc.withdraw(200.0); //pega a função da classe super
        System.out.println(acc.getBalance());

        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance()); //pega da classe savingsAccounts

        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
    }
}
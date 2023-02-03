package application;

import models.entities.Account;
import models.exceptions.BusinessException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        try {
            createAccount(accounts);
            withdrawProcess(accounts);
        } catch (BusinessException e){
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error!");
        } finally {
            sc.close();
        }
    }

    private static void createAccount(List<Account> accounts) {

        System.out.println("Enter account data");

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        sc.nextLine();

        System.out.print("Initial balance: ");
        double inicialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        accounts.add(new Account(number, holder, inicialBalance, withdrawLimit));
    }

    private static void withdrawProcess(List<Account> accounts) {

        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double amount =  sc.nextDouble();

        accounts.get(0).withdraw(amount);
        System.out.println("New balance: " + accounts.get(0).getBalance());

    }
}
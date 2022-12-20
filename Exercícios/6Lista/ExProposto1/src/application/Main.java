package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there a inicial deposit (y/n)? ");
        String answer = sc.nextLine();

        Account account;
        if (answer.equals("y")) {
            System.out.print("Enter inicial deposit value: ");
            double value = sc.nextDouble();
            account = new Account(accountNumber, name, value);
        } else {
            account = new Account(accountNumber, name);
        }

        System.out.println("\nAccount data: " + account);
        System.out.print("\nEnter a deposit value: ");
        double temporary = sc.nextDouble();
        account.deposit(temporary);
        System.out.println("Update account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        temporary = sc.nextDouble();
        account.withdraw(temporary);
        System.out.println("Update account data:");
        System.out.println(account);

        sc.close();
    }
}

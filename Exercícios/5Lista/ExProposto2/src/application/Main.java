package application;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee empregado = new Employee();

        System.out.print("Name: ");
        empregado.name = sc.nextLine();
        System.out.print("Gross salary: ");
        empregado.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        empregado.tax = sc.nextDouble();

        System.out.println("\nEmployee: " + empregado.name + ", $" + empregado.netSalary());
        System.out.print("Which percentage to increase salary? ");
        double aumentoSalario = sc.nextDouble();

        empregado.incraseSalary(aumentoSalario);

        System.out.println("\nUpdate data: " + empregado.name + ", $" + empregado.netSalary() );

        sc.close();

    }
}

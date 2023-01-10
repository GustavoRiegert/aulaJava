package aplicattion;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of employees: ");
        int aux = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        for (int i = 1; i <= aux; i++){
            System.out.println("Employee #"  + i  + " data: " );
            list.add(createEmployee());
        }

        getEmployeesPayment(list);
    }

    private static Employee createEmployee() {

        System.out.print("Outsourced (y/n)? ");
        char outsourced = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Hours: ");
        int hours = sc.nextInt();

        System.out.print("Value per hour: ");
        double vph = sc.nextDouble();

        if ((outsourced == 'y') || (outsourced == 'Y')){

            System.out.print("Additional charge: ");
            double additionalCharge = sc.nextDouble();
            return new OutsourceEmployee(name, hours, vph, additionalCharge);
        } else {

            return new Employee(name, hours, vph);
        }
    }

    private static void getEmployeesPayment(List<Employee> list) {

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee object : list) {
            System.out.println(object.getName() + " - $ " + object.payment());
        }

    }
}
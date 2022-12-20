package application;

import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Composicao {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException{

        Locale.setDefault(Locale.US);

//        Worker worker = instanceWorker("Alex", "MID_LEVEL", 1200.00, "Design");
//        HourContract hour = instanceHourContract(sdf.parse("20/08/2018"), 50.00, 20 );
//        HourContract hour1 = instanceHourContract(sdf.parse("13/06/2018"), 30.00, 18 );
//        HourContract hour2 = instanceHourContract(sdf.parse("25/08/2018"), 80.00, 10 );
//
//        worker.addContract(hour);
//        worker.addContract(hour1);
//        worker.addContract(hour2);

        Worker worker = createWorker();
        System.out.print("How many contracts to this worker? ");
        int aux = sc.nextInt();

        for (int i = 1; i <= aux; i++){
            System.out.println("Enter contract #" + i + " data:");
            HourContract hourContract = createHourContract();
            worker.addContract(hourContract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthDate  = sc.next();
        int month = Integer.parseInt(monthDate.substring(0,2));
        int year = Integer.parseInt(monthDate.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthDate + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }

    public static Worker createWorker(){

        System.out.print("Enter departments's data: ");
        String dpt = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        Double bs = sc.nextDouble();

        return instanceWorker(name, level, bs, dpt);

    }
    public static Worker instanceWorker(String name, String level, Double bs, String dpt){
        return new Worker(name, WorkerLevel.valueOf(level), bs, dpt);
    }

    public static HourContract createHourContract() throws ParseException {
        System.out.print("Date (DD/MM/YYYY): ");
        Date contractDate = sdf.parse(sc.next());
        System.out.print("Value per hour: ");
        double hourPayment = sc.nextDouble();
        System.out.print("Duration (hours): ");
        int hours = sc.nextInt();

        return instanceHourContract(contractDate, hourPayment, hours);
    }

    public static HourContract instanceHourContract(Date date, Double valuePerHour, Integer hours){
        return new HourContract(date, valuePerHour, hours);
    }
}
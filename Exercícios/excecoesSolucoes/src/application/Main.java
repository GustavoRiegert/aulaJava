package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) {

        List<Reservation> reservations = new ArrayList<>();

        try{
            createReservation(reservations);
            changeReservation(reservations);
            sc.close();
        } catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
}

    private static void createReservation(List<Reservation> reservations) {

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            reservations.add(new Reservation(number, checkin, checkout));
            imprimeReserva(reservations);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
    }

    private static void imprimeReserva(List<Reservation> reservations) {

        System.out.println("Reservation: " + reservations.toString().replace("[", "").replace("]", ""));
    }

    private static void changeReservation(List<Reservation> reservations) {

        try {
            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            reservations.get(0).updateDates(checkin, checkout);

            imprimeReserva(reservations);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
    }
}
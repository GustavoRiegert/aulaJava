import entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int entrada =  sc.nextInt();


        for (int i=0; i < entrada; i++ ){
            System.out.println();
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(nome, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i= 0; i < vect.length; i++){
            if (vect [i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

    }
}
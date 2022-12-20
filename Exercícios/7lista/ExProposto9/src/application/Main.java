package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar: ");
        int entrada = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[entrada];
        int[] idade = new int[entrada];
        int maiorIdade = 0;
        String pessoaMaisVelha = null;

        for (int i = 0; i < nome.length; i++){

            System.out.printf("Dados da %da pessoa: ", i + 1);
            System.out.print("\nNome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
            if (idade[i] > maiorIdade){
                maiorIdade = idade[i];
                pessoaMaisVelha = nome[i];

            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);


    }
}
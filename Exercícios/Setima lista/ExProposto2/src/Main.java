import numeros.Numero;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar? ");
        int tamanho = sc.nextInt();
        Numero[] vet = new Numero[tamanho];

        for(int i = 0; i < vet.length; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            double numeroEntrada = sc.nextDouble();
            vet[i] = new Numero(numeroEntrada);
        }

        double soma = 0;

        System.out.print("VALORES: ");
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i].getNumero() + " ");
            soma = soma + vet[i].getNumero();
        }

        double media = soma / vet.length;
        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + media);


    }
}
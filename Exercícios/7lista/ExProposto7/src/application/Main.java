package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int entrada = sc.nextInt();

        double[] vetor = new double[entrada];
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / vetor.length;
        System.out.println("\nMEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }
}
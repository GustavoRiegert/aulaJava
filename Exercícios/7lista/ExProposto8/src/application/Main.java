package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int entrada = sc.nextInt();

        int[] vetor = new int[entrada];
        int soma = 0, aux = 0;
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] % 2 == 0){
                soma += vetor[i];
                aux++;
            }
        }

        if (aux != 0){
            double media = soma / aux;
            System.out.printf("MEDIA DOS PARES = %.2f", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
package application;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];
        for(int i= 0; i < tamanho; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        int pares = 0;
        for(int i= 0; i < tamanho; i++){
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " ");
                pares++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES: " + pares);

    }
}
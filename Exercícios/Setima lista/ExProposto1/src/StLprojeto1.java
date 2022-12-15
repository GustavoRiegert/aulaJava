import entities.Numeros;

import java.util.Scanner;

public class StLprojeto1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar? ");
        int tamanho = sc.nextInt();
        Numeros[] num = new Numeros[tamanho];

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            num[i] = new Numeros(numero);
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < num.length; i++){
            if(num[i].getNumero() < 0) {
                System.out.println(num[i].getNumero());
            }
        }

    }
}
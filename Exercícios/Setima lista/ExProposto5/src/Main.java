import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int entrada = sc.nextInt();

        double maiorValor = 0;
        int posicao = 0;
        double[] numeros = new double[entrada];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            if (numeros[i] > maiorValor){
                maiorValor = numeros[i];
                posicao = i;
            }
        }

        System.out.print("\nMAIOR VALOR = " + maiorValor);
        System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}
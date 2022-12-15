import java.util.Locale;
import java.util.Scanner;

public class PLprojeto5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numero1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int numero2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        System.out.println();
        double valorTotal = ((numero1 * preco1) + (numero2 * preco2));

        System.out.printf("VALOR A PAGAR: R$%.2f", valorTotal);

        sc.close();
    }
}

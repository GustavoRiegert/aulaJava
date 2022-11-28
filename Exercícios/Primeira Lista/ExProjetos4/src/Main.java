import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        double horas = sc.nextDouble();
        double ganhoHora = sc.nextDouble();

        double salario = ganhoHora*horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$%.2f\n", salario);

        sc.close();
    }
}

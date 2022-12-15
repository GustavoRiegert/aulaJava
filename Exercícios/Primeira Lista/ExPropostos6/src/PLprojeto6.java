import java.util.Locale;
import java.util.Scanner;

public class PLprojeto6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        double areaT = A * C / 2;
        double areaC = pi * Math.pow(C, 2);
        double areaTrap = (A + B) / 2 * C;
        double areaQ = Math.pow(B, 2);
        double areaR = A * B;

        System.out.printf("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n", areaT, areaC, areaTrap, areaQ, areaR);

        sc.close();
    }
}

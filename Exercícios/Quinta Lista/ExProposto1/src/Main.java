import Retangulo.Retangulo;

import java.util.Locale;
import java.util.Scanner;

import static Retangulo.Retangulo.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        ret.width = sc.nextDouble();
        ret.height = sc.nextDouble();

        System.out.println("AREA = " + ret.area());
        System.out.println("PERIMETER = " + ret.perimeter());
        System.out.println("DIAGONAL = " + ret.diagonal());

        sc.close();

    }
}

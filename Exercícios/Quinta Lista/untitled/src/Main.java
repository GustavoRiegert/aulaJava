import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dprice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dbought = sc.nextDouble();

        double finalPrice = CurrencyConverter.calcDollar(dprice, dbought);
        System.out.print("Amount to be paid in reais = $" + finalPrice);

        sc.close();
    }
}

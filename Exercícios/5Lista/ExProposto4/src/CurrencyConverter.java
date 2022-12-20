public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double calcDollar(double price, double pay){

        return price * pay * (1.0 + IOF) ;
    }
}

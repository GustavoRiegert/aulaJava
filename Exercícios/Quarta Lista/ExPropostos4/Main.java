import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entradas = sc.nextInt();

        for (int i =0; i < entradas; i++){

            int primeiro = sc.nextInt();
            int segundo = sc.nextInt();

            if (segundo == 0){
                System.out.println("Divisão impossivel");
            } else {
                double divisao = (double)primeiro / segundo;
                System.out.printf("%.1f\n", divisao);
            }

        }

        sc.close();
    }
}

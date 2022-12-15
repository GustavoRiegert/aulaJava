import java.util.Scanner;

public class QaLprojeto5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int fatorial = 1;

        for (int i=1; i <= entrada; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}

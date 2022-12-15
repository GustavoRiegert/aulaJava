import java.util.Scanner;

public class QaLprojeto7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        for(int i = 1; i <= entrada; i++){
            int quadrado = i*i;
            int cubo = i*i*i;

            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}

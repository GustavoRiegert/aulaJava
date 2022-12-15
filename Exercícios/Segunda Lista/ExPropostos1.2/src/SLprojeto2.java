import java.util.Scanner;

public class SLprojeto2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        if(entrada % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}

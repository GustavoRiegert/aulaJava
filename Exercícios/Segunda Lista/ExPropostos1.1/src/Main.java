import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        if(entrada >= 0 ){
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
        
    }
}

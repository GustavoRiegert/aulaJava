import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int[][] matriz = new int[entrada][entrada];

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int negativos = 0;

        System.out.println();
        System.out.println("Main diagonal: ");

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                }
                if (matriz[i][j] < 0){
                    negativos++;
                }
            }
        }

        System.out.println();
        System.out.println("Negative numbers = " + negativos);

    }
}

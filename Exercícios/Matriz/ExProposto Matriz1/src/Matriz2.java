import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j]= sc.nextInt();
            }
        }

        int pesquisa = sc.nextInt();
        int left, right, down, up;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (pesquisa == matriz[i][j]){
                    System.out.println("Position " + i + "," +  j + ";");
                    if (j > 0) {
                        left = matriz[i][j - 1];
                        System.out.println("Left: " + left);
                    }
                    if (j < matriz[i].length - 1){
                        right = matriz [i][j + 1];
                        System.out.println("Right: " + right);
                    }
                    if (i > 0){
                        up = matriz[i-1][j];
                        System.out.println("Up: " + up);
                    }
                    if (i < matriz.length - 1) {
                        down = matriz[i + 1][j];
                        System.out.println("Down: " + down);
                    }

                }
            }
        }
    }
}
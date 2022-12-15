import java.util.Scanner;

public class Tprojeto2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int coordenadaX = sc.nextInt();
        int coordenadaY = sc.nextInt();

        while (coordenadaY != 0 || coordenadaX != 0){

            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("Primeiro quadrante");
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("Segundo quadrante");
            } else if (coordenadaX < 0 && coordenadaY < 0 ) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
            coordenadaX = sc.nextInt();
            coordenadaY = sc.nextInt();
        }

        sc.close();
    }
}

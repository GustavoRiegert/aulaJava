import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hInicial = sc.nextInt();
        int hFinal = sc.nextInt();
        int horaTotal;

        sc.close();

        if(hInicial < hFinal){
            horaTotal = hFinal - hInicial;
        } else {
            horaTotal = 24 - hInicial + hFinal;
        }

        System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
    }
}

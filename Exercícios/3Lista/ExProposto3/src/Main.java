import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt(), gasolina = 0, alcool = 0, diesel = 0;

        while (entrada != 4){

            if(entrada == 1){
                alcool++;
            } else if (entrada == 2) {
                gasolina++;
            } else if (entrada == 3) {
                diesel++;
            }
            entrada = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}

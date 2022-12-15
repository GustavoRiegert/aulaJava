import java.util.Scanner;

public class SLprojeto5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtd = sc.nextInt();

        double preco1 = 4, preco2 = 4.5, preco3 = 5, preco4 = 2, preco5 = 1.5;
        double total = 0;

        if (codigo == 1){
            total = qtd * preco1;
        }
        else if (codigo == 2) {
            total = qtd * preco2;
        }
        else if (codigo == 3) {
            total = qtd * preco3;
        }
        else if (codigo == 4) {
            total = qtd * preco4;
        }
        else if (codigo == 5) {
            total = qtd * preco5;
        }

        System.out.printf("Total: R$ %.2f", total);
    }
}

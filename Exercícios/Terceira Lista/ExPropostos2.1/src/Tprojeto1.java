import java.util.Scanner;

public class Tprojeto1 {

    public static void main(String[] args) {

        int senha = 2002;

        Scanner sc = new Scanner(System.in);
        int tentaSenha = sc.nextInt();

        while (tentaSenha != senha){
            System.out.println("Senha invalida");
            tentaSenha = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}

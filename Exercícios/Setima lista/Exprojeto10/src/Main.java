import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int entrada = sc.nextInt();

        String[] aluno = new String[entrada];
        Double[] notaPrimeiro = new Double[entrada];
        Double[] notaSegundo = new Double[entrada];

        for (int i = 0; i < aluno.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i +1);
            sc.nextLine();
            aluno[i] = sc.nextLine();
            notaPrimeiro[i] = sc.nextDouble();
            notaSegundo[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < aluno.length; i++){
            if ((notaPrimeiro[i] + notaSegundo[i]) / 2 >= 6){
                System.out.println(aluno[i]);
            }
        }
    }
}
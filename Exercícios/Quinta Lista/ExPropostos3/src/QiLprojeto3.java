import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class QiLprojeto3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.primeiraNota = sc.nextDouble();
        aluno.segundaNota = sc.nextDouble();
        aluno.terceiraNota = sc.nextDouble();

        System.out.println("\nFINAL GRADE = " + aluno.calculaNotaFinal());
        System.out.println(aluno.situacaoFinal());

        if(aluno.calculaNotaFinal() < 60){
            System.out.println("MISSING " + aluno.pontosFaltantes() + " POINTS");
        }

        sc.close();
    }
}

package application;
import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int tamanho = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[tamanho];

        for (int i = 0; i < pessoas.length; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double media = 0;
        int menores = 0;
        for (Pessoa pessoa : pessoas) {
            double aux = pessoa.getAltura();
            media += aux;
            if (pessoa.getIdade() < 16) {
                menores++;
            }
        }

        media = media / tamanho;
        double pIdade =  menores * 100.0/ tamanho;

        System.out.println("Altura media: " + media);
        System.out.println("Pessoas com menos de 16 anos: " + pIdade + "%");

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getName());
            }
        }
    }
}
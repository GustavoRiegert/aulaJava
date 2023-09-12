package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String CAMINHO = "C:\\Users\\gustavo.riegert_evol\\IdeaProjects\\aulaJava\\Exercícios\\Arquivos" +
            "\\src\\main\\resources\\";
    private static final String ESCRITA = "out\\summary.csv";
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o nome do seu arquivo da pasta resources: ");
        String path = sc.nextLine();
        String pathAbsoluth = CAMINHO + path;
        boolean success = new File(CAMINHO + "\\out").mkdir();
        lerArquivo(pathAbsoluth);
    }

    private static void lerArquivo(String path) {
            try(BufferedReader bf = new BufferedReader(new FileReader(path))) {

                String line = bf.readLine();
                List<Produto> produtos = new ArrayList<>();
                while (line != null){
                    produtos.add(criaProduto(line));
                    line = bf.readLine();
                }
                escreverArquivo(produtos);

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    private static Produto criaProduto(String line) {
        String item[] = line.split(",");
        String nome = item[0];
        Double preco = Double.valueOf(item[1]);
        Double qnt = Double.valueOf(item[2]);
        Produto produto = new Produto(nome, preco, qnt);
        return produto;
    }

    private static void escreverArquivo(List<Produto> produto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO + ESCRITA))){
            for (Produto pr: produto) {
                bw.write(pr.toString());
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
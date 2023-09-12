package org.example;

public class Produto {
    private String nome;
    private double price;
    private double qnt;

    public Produto(String nome, double price, double qnt) {
        this.nome = nome;
        this.price = price;
        this.qnt = qnt;
    }

    public double calculaPrecoFinal(){
        return price * qnt;
    }
    @Override
    public String toString() {
        return nome + ", " + calculaPrecoFinal();
    }
}

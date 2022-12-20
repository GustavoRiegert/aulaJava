package entities;

public class Aluno {

    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public String situacaoFinal(){

        if (calculaNotaFinal() > 60)
            return "PASS";
        else
            return "FAILED";
    }

    public double calculaNotaFinal(){
        return primeiraNota + segundaNota + terceiraNota;
    }

    public double pontosFaltantes(){
        if (calculaNotaFinal() > 60){
            return 0;
        } else return 60 - calculaNotaFinal();
    }

}

package entities;

public class Employee {

    private Integer id;
    private String  nome;
    private Double salario;

    public Employee(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void aumentoSalarial(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    @Override
    public String toString() {
        return  id + ", " + nome + ", " + salario;
    }
}

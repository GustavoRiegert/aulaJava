import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos empregados serão registrados? ");
        int entrada = sc.nextInt();

        for (int i = 0; i < entrada; i++){
            System.out.println();
            System.out.println("Employee " + "#" + (i+1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)){
                System.out.print("Já existe esse id. Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            list.add(new Employee(id, nome, salario));
        }

        System.out.println();
        System.out.print("Digite o id do funcionário: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("Id inexistente!");
        } else {
            System.out.print("Digite a porcentagem do aumento do funcionário: ");
            double porcentagem = sc.nextDouble();
            emp.aumentoSalarial(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários");
        for (Employee empregados : list){
            System.out.println(empregados);
        }

        sc.close();
    }

    private static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
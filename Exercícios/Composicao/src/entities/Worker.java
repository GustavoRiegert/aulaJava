package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String nome, WorkerLevel level, Double baseSalary, String department) {
        this.name = nome;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = new Department(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getbaseSalary() {
        return baseSalary;
    }

    public void setbaseSalary(Double workerLevel) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){

        contracts.add(contract);
    }

    public void removeContracts(HourContract contract){

        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){

        Double sum = baseSalary;

        Calendar cal = Calendar.getInstance();
        for (HourContract c: contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }

        return sum;
    }
}

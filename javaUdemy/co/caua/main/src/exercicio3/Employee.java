package exercicio3;

public class Employee {
    private Integer id;
    private String name;
    private Double Salary;

    public Employee(){

    }
    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.Salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getSalary() {

        return Salary;
    }

    public void setSalary(Double salary) {
        this.Salary = salary;
    }
    public void increaseSalary(double percentage){
        Salary += Salary * percentage / 100.0;
    }

    @Override
    public String toString() {

        return id + ", " + name + ", " + String.format("%.2f",Salary);
    }
}

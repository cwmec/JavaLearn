package exercicio;

public class exercicioPooSalary {
    public String nome;
    public double salary;
    public double tax;

    public double NetSalary(){
        return salary - tax;
    }
    public void IncreaseSalary(double percentage){
        salary += salary * (percentage / 100.0);
    }
    public String toString(){
        return nome + ", $ " + String.format("%.2f", NetSalary());

    }
}

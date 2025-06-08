package entities;

public class triangle {
    //Reaproveitamento do codigo
    public double a;
    public double b;
    public double c;

    //Delegação de responsabilidade
    public double area(){
        double p = (a+b+c)/2.0;
        return Math.sqrt(p * (p-a) * (p-b) * (p- c));
    }

}

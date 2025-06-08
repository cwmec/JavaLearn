package exercicio;

public class exercicioPooNotas {
    public double nota1;
    public double nota2;
    public double nota3;

    public double resultado(){
        return (nota1 + nota2 + nota3);
    }
    public double reprovado(){
        return 60 - resultado();
    }
}

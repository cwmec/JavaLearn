package exercicio;

public class exercicioPooArea {
    public double width;
    public double heigth;

    public double area(){
        return width * heigth;
    }
    public double perimeter(){
        return 2*(width+heigth);
    }

    public double diagonal(){
        return Math.sqrt((heigth*heigth)+(width*width));
    }
}

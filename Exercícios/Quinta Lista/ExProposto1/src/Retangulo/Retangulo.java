package Retangulo;

public class Retangulo {

    public double width;
    public double height;

    public double area(){

        return width * height;
    }

    public double perimeter(){

        return (width + height)*2;
    }

    public double diagonal(){

        return Math.sqrt(width * width + height * height);
    }
}

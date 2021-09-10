package ListaV_ex01;

public class Circle extends Shape2D {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    @Override
     public double area(){
         double pi = 3.14;
         return pi*(getRadius()*getRadius());
     }
     
    @Override
     public double perimeter(){
         double pi = 3.14;
         return 2*pi*getRadius();
     }

    @Override
    public void draw() {
        System.out.println("Desenhando Circulo na posição (10,15)");
    }
}

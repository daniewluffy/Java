package ListaIV_ex05;

public class Circle extends Shape {
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
    public String toString() {
        return "***STATUS CIRCULO***" + "\n\nRaio: " + getRadius() + "\nArea: " + area() + "\nPerimetro: " + perimeter();
    }
 
     public double area(){
         double pi = 3.14;
         return pi*(getRadius()*getRadius());
     }
     
     public double perimeter(){
         double pi = 3.14;
         return 2*pi*getRadius();
     }
}

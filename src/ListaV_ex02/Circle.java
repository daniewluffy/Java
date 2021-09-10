package ListaV_ex02;

public class Circle{
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
    
     public double area(){
         double pi = 3.14;
         return pi*(getRadius()*getRadius());
     }
     
     public double perimeter(){
         double pi = 3.14;
         return 2*pi*getRadius();
     }
     public double diameter(){
         return 2*getRadius();
     }
     public void draw() {
        System.out.println("Desenhando Circulo na posição (10,15)");
     }
}

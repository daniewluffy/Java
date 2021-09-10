package ListaV_ex01;

public class Rectangle extends Shape2D{
   private double width;
   private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
   
   @Override
    public double perimeter(){
        return 2 * (getHeight() + getWidth());
    }
   
   @Override
    public double area(){
        return getHeight() * getWidth();
    }

    @Override
    public void draw() {
       System.out.println("Desenhando Retângulo na posição (10, 15)");
    }
}

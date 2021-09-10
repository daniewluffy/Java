package ListaIV_ex05;

import java.awt.Color;

public class Rectangle extends Shape{
   private double width;
   private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, Color color, boolean filled) {
        super(color, filled);
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
    public String toString() {
        return "***STATUS RETÂNGULO***" + "\n\nLargura: " + getWidth() + "\nAltura: " + getHeight() + "\nPerimetro: " + perimeter() + "\nArea: " + area();
    }
   
    public double perimeter(){
        return 2 * (getHeight() + getWidth());
    }
   
    public double area(){
        return getHeight() * getWidth();
    }
}

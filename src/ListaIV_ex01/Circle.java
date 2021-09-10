package ListaIV_ex01;
import java.awt.Color;
public class Circle {
    private double radius = 1.0; 

    private Color color = new Color(255,0,0);   

    public Circle(){       

    }  

    public Circle(double radius){ 

        this.radius = radius; 

    } 

     

    public Circle(double radius, Color color){ 

        this.color = color; 

        this.radius = radius; 

    } 

  

    public Color getColor() { 

        return color; 

    } 

  

    public void setColor(Color color) { 

        this.color = color; 

    } 

  

    public double getRadius() { 

        return radius; 

    } 

    public void setRadius(double radius) { 

        this.radius = radius; 

    } 

        public double getArea(){ 

            double pi = 3.14; 

            return pi * (radius * radius); 

        } 

    } 


package ListaV_ex01;
import java.awt.Color;
import java.awt.Point;
public abstract class Shape {
    private Color color;
    private Point location;
    
    public Shape() {
    }
    public Shape(Color color){
        this.color = color;
    }
    
    public abstract double area();
    public abstract void draw();
    
    
}

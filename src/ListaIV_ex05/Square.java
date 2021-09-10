package ListaIV_ex05;
import java.awt.Color;
public class Square extends Rectangle{
    private double side;
    
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, Color color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public void setHeight(double height) {
        super.setHeight(height); 
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width); 
    }
}

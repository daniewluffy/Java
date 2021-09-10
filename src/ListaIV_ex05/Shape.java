package ListaIV_ex05;
import java.awt.Color;
public class Shape {
   public Color color;
   public boolean filled;

    public Shape() {
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
   
   public boolean filled(){
       return filled;
   }

    @Override
    public String toString() {
        return "rodando...";
    }
   
}

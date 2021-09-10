package ListaIV_ex02;
import java.awt.Color;
public class Cylinder{
    private double height; 
    private Circle base;
    
    Circle user = new Circle();
    
   public Cylinder(){ 
        
   }    

   public Cylinder(double radius){ 
       user.setRadius(radius); 
   } 

   public Cylinder(double radius, double height){  
       user.setRadius(radius); 
       this.height = height; 

   } 

    public Cylinder(double height, double radius, Color color) {
        this.height = height;
        user.setRadius(radius);
        color = color;
    }
       
    public double getHeight() { 

      return height; 

    } 

    public void setHeight(double height) { 

        if(height < 0)throw new NumberFormatException("Valor Negativo"); 

        else{ 

            this.height = height; 

        }         

    } 

    public double volume(){ 

        return user.getArea() * getHeight(); 

    } 

    public double getArea() { 

        double pi = 3.14; 

        return 2 * user.getArea() + (2 * pi * (user.getRadius() * getHeight()));  

    } 

} 


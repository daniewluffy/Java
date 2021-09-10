package ListaV_ex01;

public class Cylinder extends Shape3D{
    private double height; 
    private double radius;
    
   public Cylinder(){ 
       
   }  

   public Cylinder(double radius, double height){     
       this.radius = radius;
       this.height = height; 

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
    public double getRadius(){
        return radius;
        }

    public void setRadius(double radius) {
        this.radius = radius;
    }
     

    @Override
    public double volume(){ 
        double pi = 3.14;
        return pi*(getRadius()*getRadius()) * getHeight(); 

    } 

    @Override 

    public double area() { 

        double pi = 3.14; 

        return 2 *  pi*(getRadius()*getRadius()) + (2 * pi * (getRadius() * getHeight()));  

    } 

    @Override
    public void draw() {
         System.out.println("Desenhando Cilindro na posição (10, 15)");
    }

} 


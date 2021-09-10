package ListaIV_ex01;

public class Cylinder extends Circle{
    private double height; 
  
    

   public Cylinder(){ 
       
   }  

   public Cylinder(double radius){ 
       super(radius); 
   } 

   public Cylinder(double radius, double height){ 
    
       super(radius); 

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

    public double getVolume(){ 

        return super.getArea() * getHeight(); 

    } 

    @Override 

    public double getArea() { 

        double pi = 3.14; 

        return 2 * super.getArea() + (2 * pi * (getRadius() * getHeight()));  

    } 

} 


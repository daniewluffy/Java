package ListaV_ex01;

public class Cuboid extends Shape3D{
   // Rectangle fc = new Rectangle();
    private double depth, height, width;
   // double[] face = {fc.perimeter()};  
   
    public Cuboid() {
    }

    public Cuboid(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
   // public double[] faces(){
    //    face[0]* 6;
    //    return face;
   // }
    
    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double area(){
        return getDepth()*getHeight()*getWidth();
    }

    @Override
    public void draw() {
       System.out.println("Desenhando um cubo na posição (10,15)");
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}

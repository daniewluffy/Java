package ListaIV_ex04;

public class Point2D{
    protected float x;
    protected float y;   
    float[] XY = {x,y};

   public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    
    public float[] getXY(){
      return XY;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float[] XY) {
        this.XY = XY;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    
    }
   



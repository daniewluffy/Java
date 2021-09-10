package ListaIV_ex03;

public class Point3D extends Point2D{
    protected float z;
    float[] XYZ = {x,y,z};
    public Point3D() {
    }
    
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;                
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return XYZ;
    }

    public void setXYZ(float[] XYZ) {
        this.XYZ = XYZ;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}

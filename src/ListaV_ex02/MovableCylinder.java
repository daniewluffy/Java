package ListaV_ex02;

public class MovableCylinder extends Cylinder implements Movable{

    public MovableCylinder() {
    }
    
    @Override
    public void moveDown(){
        int locationX = 0;
        locationX ++;
        System.out.println("Movendo para baixo");
    }
    
    @Override
    public void moveLeft(){
        int locationA = 0;
        locationA ++;
        System.out.println("Movendo para esquerda");
    }
    @Override
    public void moveRight(){
        
    }
    @Override
    public void moveUp(){
        
    }
}

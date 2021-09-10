package ListaIV_ex05;

public class Teste {
    public static void main(String[] args) {
       Rectangle obb = new Rectangle();
       
       obb.setHeight(15);
       obb.setWidth(45);
       obb.perimeter();
       obb.area();
        System.out.println(obb.toString());
        
        Circle cc = new Circle();
       
       cc.setRadius(12);
       cc.perimeter();
       cc.area();
        System.out.println("");
        System.out.println(cc.toString());
        
        Square qq = new Square();
              
    }
}

package ListaIV_ex06;

public class Cat extends Mammal{

    public Cat(String NAME) {
        super(NAME);
    }
    public String greets(){
        return "miau";        
    }

    @Override
    public String toString() {
       return NAME;
    }
    
}

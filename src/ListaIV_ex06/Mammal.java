package ListaIV_ex06;

public class Mammal extends Animal{

    public Mammal(String NAME) {
        super(NAME);
    }

    @Override
    public String toString() {
        return NAME;
    }
    
}

package ListaIV_ex06;

public class Dog extends Mammal{

    public Dog(String NAME) {
        super(NAME);
    }
    public String Greets(){
        return "Au Au";
    }
    public String greets(Dog NAME){
        return this.NAME;
    }
    
}

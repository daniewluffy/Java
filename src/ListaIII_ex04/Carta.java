package ListaIII_ex04;


public class Carta {
    private int valor;
    private String carta;

    public Carta(int valor, String carta) {
        this.valor = valor;
        this.carta = carta;
    }
    
    public String getCarta() {
        return carta;
    }

    public int getValor() {
        return valor;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return carta;
    }
}


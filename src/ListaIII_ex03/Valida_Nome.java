package ListaIII_ex03;


public class Valida_Nome {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean testaNome(){
        if(getNome() == ""){
            System.out.println("Nome Nulo");
            return false;
        }else{            
            System.out.println("Nome cadastrado com sucesso");
            return true;
            
        }
    }
}

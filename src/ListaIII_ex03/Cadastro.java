package ListaIII_ex03;

import java.util.Scanner;

public class Cadastro {

    Scanner sc = new Scanner(System.in);
    
    ValidaCPF cpf = new ValidaCPF();
    Valida_Nome testeNome = new Valida_Nome();
    
    public String nome;
    public String CPF;
    
   public boolean cadastra(){
       
       System.out.println("***Dados cadastrais***");
       System.out.println("");
       
       System.out.println("Nome: ");
       nome = sc.nextLine();
       testeNome.setNome(nome);
       
       testeNome.testaNome();       
       
                if(testeNome.getNome() != ""){
                    System.out.println("Cpf: ");
                     CPF = sc.nextLine();
       
                 cpf.setCPF(CPF);   
                    
            if(cpf.isCPF() == true){
           System.out.println("CPF cadastrado com sucesso");
                }else{
                    System.out.println("CPF inválido");
                }
            }else{
                    System.out.println("Tenha um nome válido");
                }                                        
       return true;
   }
    
    
}

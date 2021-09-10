package ListaII_ex02;

import java.util.Scanner; 

public class Porta { 

    Scanner sc = new Scanner(System.in); 

     double altura, largura, profundidade; 

     boolean estado; 

     boolean tranca; 

     int escolha; 
  

    public Porta(double altura, double largura, double profundidade){ 

    this.estado = true; 

    this.altura = altura; 

    this.largura = largura; 

    this.profundidade = profundidade; 

} 

    public void statusPorta(){ 

        System.out.println("   ***STATUS DA PORTA***"); 

        System.out.println("altura: " + this.altura); 

        System.out.println("largura: " + this.largura); 

        System.out.println("profundidade: " + this.profundidade); 

        System.out.println(" "); 

        if(this.estado == true){ 

            System.out.println("Porta aberta"); 

        }else if(this.estado == false){ 

                System.out.println("Porta fechada"); 

                System.out.println("Trancar porta: (1 - SIM) (2 - NÂO)"); 

                System.out.print("R: "); 

                escolha = sc.nextInt(); 

                    switch(escolha){ 

                        case 1: 

                            this.tranca = true; 

                            System.out.println("\n**Tranca Fechada**"); 

                            break; 

                        case 2: 

                            this.tranca = false; 

                             System.out.println("\n--Tranca aberta--"); 

                             break; 

                        default: 

                            System.out.println("digito errado, tente novamente"); 

            }                  

    } 

    } 

    public boolean getEstado(){ 

        return this.estado; 

    } 

  

    public void setEstado(boolean estado) { 

        this.estado = estado;                  

    }  
} 

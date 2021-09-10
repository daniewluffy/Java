package ListaII_ex01;

  public class Lampada { //classe lampada 

static int qtd = 0; 

boolean estado;              //atributos da classe lampada 

static int base = 0; 

     

    public Lampada(){//metodo construtor 

        this.estado = false; //lampada começa desligada 

    } 

   public boolean getEstado(){ //metodo retorna o estado atual da lampada 

       return this.estado; 

   } 

    public void setEstado(boolean estado) { //metodo modificador do estado da lampada recebe um valor booleno 

        this.estado = estado; 

         if(this.estado == true){ //condicional se a lâmpada estiver ligada 

           qtd = base + 1; 

           base++; //implementa a quantidade de vezes que a lâmpada foi ligada 

       } 

       else if(this.estado == false){//condicional se a lâmpada estiver desligada 

 

           System.out.println("Lâmpada Desligada"); 

            System.out.println("Ligações: " + qtd + "\n");//imprime a quantidade 

       } 

       if(this.estado == true && qtd <= 100){ 

           System.out.println("Lâmpada Ligada"); 

            System.out.println("Ligações: " + qtd + "\n"); 

       }else{ 

           if(qtd > 100){ // condicional que verifica se a lâmpada está queimada 

               System.out.println("\n*  Lâmpada queimada  *"); 

               System.out.println(" "); 

               this.estado = false; 

           	} 

    	       } 

               } 

          } 
  


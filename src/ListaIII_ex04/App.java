package ListaIII_ex04;

import java.util.Scanner;

public class App {
    
   	public static void main(String[] args) {

            
                	BlackJack blackjack = new BlackJack();
                
                	Scanner in = new Scanner(System.in);

                	System.out.println("\nBem vindo ao Jogo 21 (Blackjack)");
		
                	System.out.println("");
                	
                	int opcao1;
                	do {
                	     
                		 System.out.println("");
                		 System.out.println("1 - Novo jogo.");                		 
                		 System.out.println("0 - Sair");
                         opcao1 = in.nextInt();
  
                		switch (opcao1) {
						case 1:
													
							blackjack.NovoJogo();
						
							break;
						default:
							break;
						}
						
					} while (opcao1 != 0);                	                	                	                			
					               
        }
}


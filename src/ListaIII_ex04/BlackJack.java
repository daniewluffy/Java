package ListaIII_ex04;

import java.util.Scanner;

import ListaIII_ex04.Banca;
import ListaIII_ex04.Carta;
import ListaIII_ex04.Cartas;
import ListaIII_ex04.Jogador;


public class BlackJack {
	  
	   private final Cartas baralho; 
	   
	   public BlackJack(){
	       baralho = new Cartas();
	       baralho.criaBaralho();
	       baralho.imprimeBaralho();
	   }
	   
	   public void criaRodada(Jogador jogador, Banca banca){
	        
	       baralho.resetaBaralho();
	       baralho.misturaBaralho();
	       jogador.LimpaCartas();
	       banca.LimpaCartas();	       	      
	       
	       System.out.println("\nâ™¥â™¦â™£â™  -------- Rodada Iniciada !  -------- â™¥â™¦â™£â™ ");
	    
	       System.out.println("A banca estÃ¡ distribuindo as cartas...\n");
	       
	       baralho.misturaBaralho();
	       
	       jogador.adicionaCartaJogador(baralho.retiraPrimeiraCartaDoBaralho());
	       jogador.adicionaCartaJogador(baralho.retiraPrimeiraCartaDoBaralho());
	       
	       System.out.println("VocÃª somou "+ jogador.retornaValorDasCartasJogador() 
	                                        +" pontos com as seguintes cartas: ");
	       jogador.imprimeCartasJogador();
	       System.err.println("\n");
	       
	       banca.adicionaCartaBanca(baralho.retiraPrimeiraCartaDoBaralho());
	       System.out.println("A banca somou "+ banca.retornaValorDasCartasBanca()
	                                        +" pontos com a seguinte carta: ");
	       banca.imprimeCartasBanca();
	       
	                    int opcao;
	                    Scanner entrada = new Scanner(System.in);
	       
	                    do{
	                        
	                                System.out.println("\n1 - Receber outra carta.");
	                                System.out.println("0 - Finalizar rodada.");
	                                System.out.println("Digite sua opÃ§ao: ");
	                                
	                                opcao = entrada.nextInt();
	                            
	                        if(opcao == 1){
	                            System.out.println("");
	                            
	                            Carta novaCarta = baralho.retiraPrimeiraCartaDoBaralho();
	                            jogador.adicionaCartaJogador(novaCarta);
	                            System.out.println("VocÃª recebeu a carta " + novaCarta.toString());
	                            System.out.println("E somou " + jogador.retornaValorDasCartasJogador()
	                                                + " com as cartas:");
	                            jogador.imprimeCartasJogador();                           
	                        }
	                        
	                        if(jogador.retornaValorDasCartasJogador() > 21){
	                        opcao = 0;
	                        }
	                                               
	                    }while(opcao != 0);
	       
	            //finaliza e confere rodada
	           if(jogador.retornaValorDasCartasJogador() < 22){
	           
	           Carta novaCartaBanca = baralho.retiraPrimeiraCartaDoBaralho();
	           banca.adicionaCartaBanca(novaCartaBanca);
	           System.out.println("A banca recebeu a carta "+novaCartaBanca.toString()
	                              +" e somou " +banca.retornaValorDasCartasBanca()+" pontos.");  
	           System.out.print("");
	           
	           if(banca.retornaValorDasCartasBanca() > 21){	
	               System.out.println(jogador.getNome()+" vocÃª venceu esta rodada");	            
	           }else if(banca.retornaValorDasCartasBanca() >= jogador.retornaValorDasCartasJogador()){
	               
	               System.out.println("A banca ganhou com "+banca.retornaValorDasCartasBanca()+"pontos!");
	               
	           } else {
	               	          
	               System.out.println(jogador.getNome()+" vocÃª venceu esta rodada");	            
	           }
	           
	           
	           
	           }else if(jogador.retornaValorDasCartasJogador() > 21){
	           
	               System.out.println("VocÃª somou mais que 21 pontos, a Banca Ganhou!"); 	             
	           }	            	        
	   }
	   
	   public void NovoJogo(){
		   
		   Scanner in = new Scanner(System.in);
		   
		   	System.out.println("Entre com seu nome e faÃ§a sua aposta!");
			System.out.print("Digite seu nome: ");
			String nome = in.next();
			//jogador
			Jogador jogador = new Jogador(nome);
			Banca banca = new Banca();
       
       	System.out.println("\nOlÃ¡ "+jogador.getNome());
       	
           int opcao;
           do{
        	   System.out.println("");
               System.out.println("1 - Iniciar rodada.");              
               System.out.println("Digite sua opÃ§ao: ");
               opcao = in.nextInt();

               switch (opcao) {
				case 1:
					
					   System.out.println("");					                  
                       criaRodada(jogador,banca); 
					
					break;									
				default:
					break;
				}
           }while(opcao != 0); 
		   
	   }
	   
	   public void CarregaJogo(Jogador jogador){
		   
		   	Scanner in = new Scanner(System.in);
		   
		   	System.out.println("\nOlÃ¡ "+jogador.getNome());
	      	   	
			Banca banca = new Banca();
      
          int opcao;
          do{
        	  System.out.println("");
              System.out.println("1 - Iniciar rodada.");              
              System.out.println("Digite sua opÃ§ao: ");
              opcao = in.nextInt();

              switch (opcao) {
				case 1:
					
					 	System.out.println("");					 	
                      criaRodada(jogador,banca); 
					
					break;				
				default:
					break;
				}
          }while(opcao != 0); 
		   
		   
	   }
	   	  
	   }
	   
	   
	


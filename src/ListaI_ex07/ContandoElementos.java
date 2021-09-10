package ListaI_ex07;

import java.util.Random;

public class ContandoElementos { 

      public static void main(String[] args) { 

        Random gera = new Random(); 

    int total0 = 0; 

    int total1 = 0; 

    int total2 = 0; 

    int total3 = 0; 

    int total4 = 0; 

    int total5 = 0; 

  
    int vetor[] = new int[20];  

    int i; 

    for(i = 0; i<vetor.length;i++){ 

        vetor[i] = gera.nextInt(6); 

        System.out.print(vetor[i] + " ");        

    } 

     

        for(int posicao = 0;posicao <= vetor.length-1; posicao++){ 

      

        if(vetor[posicao] == 0){           

            total0 ++; 

        } 

         if(vetor[posicao] == 1){                      

             total1 ++; 

        } 

        if(vetor[posicao] == 2){         

            total2 ++; 

        } 

        if(vetor[posicao] == 3){ 

            total3 ++; 

        } 

        if(vetor[posicao] == 4){ 

            total4 ++; 

        } 

        if(vetor[posicao] == 5){ 

            total5 ++; 

        } 

}           

          System.out.println(""); 

          System.out.println("o número 0 ocorre " + total0 + "vezes"); 

          System.out.println("o número 1 ocorre " + total1 + "vezes"); 

          System.out.println("o número 2 ocorre " + total2 + "vezes"); 

          System.out.println("o número 3 ocorre " + total3 + "vezes"); 

          System.out.println("o número 4 ocorre " + total4 + "vezes"); 

          System.out.println("o número 5 ocorre " + total5 + "vezes"); 

           

} 

} 


package ListaI_ex04;

import java.util.Scanner;

public class Intercala { 

    public static void main(String[] args) { 

            Scanner sc = new Scanner(System.in); 

  final boolean TRUE = true; 

  final boolean FALSE = false; 

  int n;            /* no. de elementos na sequencia */ 

  int i;            /* contador de numeros lidos */ 

  int numero;       /* usado para ler a sequencia */ 

  int paridade;     /* indica a paridade do segmento (0 = par, 1 = impar) */ 

  int k;            /* candidado a grau da alternacia */ 

  int kaux;         /* tamanho do segmento corrente */   

  boolean k_alternante; /* indica se a sequencia e' ou nao k-alternate */ 

  

        System.out.println("Determino se uma sequencia de n (>0) inteiros e k-alternante.\n"); 

         /* leia o tamanho da sequencia */ 

        System.out.println("Entre com n: "); 

        n = sc.nextInt(); 

  /* leia o 1o. elemento e determine a sua paridade */ 

        System.out.println("\"Entre com o 1o. numero da sequencia: \""); 

        numero = sc.nextInt(); 

        paridade = numero % 2;  

        kaux = 1; /* comprimento corrente do segmento */  

  /* a sequencia e' k-alternante ate que se prove o contrario */ 

  k_alternante = TRUE; 

  k = 0; /* o valor de k ainda precisa ser determinado */ 

  for (i = 1; i <= n; i++) 

    if (i == n)  

      { 

/* 1o. segmento */  

if (k == 0) k = kaux; 

/*  nao e' o 1o. segmento */ 

else if (kaux != k)  k_alternante = FALSE; 

      } 

    else  

      { 

          System.out.println("Entre com o %do. numero da sequencia: " + i+1); 

  numero = sc.nextInt(); 

 

if (numero % 2 == paridade) kaux++; 

else 

  { 

    /* 1o. segmento */ 

    if (k == 0) k = kaux; 

    /* nao e' o 1o. segmento */ 

    else if (kaux != k) k_alternante = FALSE; 

     

    kaux = 1; 

    paridade = (paridade + 1) % 2; 

  }  

      } 

  if (k_alternante == TRUE)  

            System.out.println("A sequencia e %d-alternante\n" + k); 

  else 

            System.out.println("A sequencia nao e' k-alternante\n" + FALSE); 

}  

} 


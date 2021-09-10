package ListaII_ex04;

import java.util.Scanner;

public class Calculo { 

    Scanner sc = new Scanner(System.in); 

double PI = 3.14F; 

double altura; 

double raio; 

double areaC; 

double areaT; 

double diametro; 

double bMaior; 

double bMenor; 

double perimetroC; 

double perimetroT; 

double lado1, lado2; 

  

public void Calculo(){ 

    System.out.println("**CALCULO DO CIRCULO**"); 

    System.out.print("informe o raio do circulo: "); 

    raio = sc.nextDouble(); 

    System.out.println("\nCalculando diametro, area e circuferência..."); 

    System.out.println(" ");     

     

    areaC = PI * (raio*raio); 

    perimetroC = (2 * PI) * raio; 

    diametro = 2 * raio; 

     

    System.out.println("RESULTADO: "); 

    System.out.printf("AREA: %.2f \n" , this.areaC); 

    System.out.printf("PERIMETRO: %.2f \n" , this.perimetroC); 

    System.out.printf("DIAMETRO: %.2f \n" , this.diametro); 

    System.out.println(" "); 

    System.out.println("Fim do calculo do circulo"); 

     

    System.out.println("\n**CALCULO DO TRAPEZIO**"); 

    System.out.print("informe a base MAIOR do trapezio: "); 

    bMaior = sc.nextDouble(); 

    System.out.print("informe a base MENOR do trapezio: "); 

    bMenor = sc.nextDouble(); 

    System.out.print("informe a altura do trapezio: "); 

    altura = sc.nextDouble(); 

    System.out.print("informe o lado 1: "); 

    lado1 = sc.nextDouble(); 

    System.out.print("informe o lado 2: "); 

    lado2 = sc.nextDouble(); 

     

    System.out.println("\nCalculando area e perimetro..."); 

    System.out.println(" "); 

     

    areaT = ((bMaior + bMenor) * altura)/2; 

    perimetroT = bMaior + bMenor + lado1 + lado2;  

     

    System.out.println("RESULTADO: "); 

    System.out.printf("AREA: %.2f \n" , this.areaT); 

    System.out.printf("PERIMETRO: %.2f \n" , this.perimetroT);     

} 

} 

 

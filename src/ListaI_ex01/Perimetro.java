
package ListaI_ex01;

import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        double perimetro; 

        double area; 

        double pi = 3.14; 

         

            System.out.print("Digite o valor do diâmetro da circuferência: "); 

            double d = sc.nextDouble(); 

         

        System.out.println("Calculando valor do perimetro..."); 

        System.out.println("Calculando valor da area..."); 

        System.out.println(" "); 

             

            area = pi*(d/2); 

            perimetro = (2*pi)*(d/2); 

            System.out.println("Perimetro = " + perimetro); 

            System.out.println("Area = " + area); 

    }   

} 

 


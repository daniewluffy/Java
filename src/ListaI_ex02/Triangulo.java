package ListaI_ex02;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);         

        double a,b,c;          

        System.out.println("Valores dos Três Lados: "); 

        a = sc.nextDouble(); 

        b = sc.nextDouble(); 

        c = sc.nextDouble();         

        System.out.println("Calcululando Triângulo...");         

        if(a < b+c || b < a+c || c < a+b ){ 

            if(a == b && b == c && c == a){ 

                System.out.println("TRIANGULO EQUILATERO"); 

            }else if(a == b || b == c || c == a){ 

                System.out.println("TRIâNGULO ISOSCELES"); 

            }else if(a != b && b != c && c != a){ 

                System.out.println("TRIÂNGULO ESCALENO"); 

            } 

        } 

    } 

} 


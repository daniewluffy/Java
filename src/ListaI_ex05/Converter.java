package ListaI_ex05;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) { 

     Scanner entrada = new Scanner(System.in); 
         
        int d = entrada.nextInt(); 

        long resultado = 0l; 

        long y = 1; 

        while (d > 0) { 

            if (d % 2 == 1) { 

                resultado += (long) Math.pow(10, 0); 

                d -= 1; 

            } 

            long x = (long) Math.pow(2, y); 

            if ((d - x) % (2 * x) == 0) { 

                resultado += (long) Math.pow(10, y); 

                d -= x; 

            } else { 

                y++; 

            } 

        } 

        System.out.println(resultado); 

    } 

} 


package ListaII_ex05;

import java.util.Scanner;

public class Distancia_Pontos {
    
    Scanner sc = new Scanner(System.in);
    
    
    double[] ponto1 = new double[2];
    double[] ponto2 = new double[2];
    double[] ponto3 = new double[2];
        
    
    double dp1p2;
    double dp1p3;
    double dp2p3;
    
    
    public double calculaDistancia(){  
         System.out.println("insira o ponto1 x:");
        ponto1[0] = sc.nextDouble();
         System.out.println("insira o ponto1 y:");
        ponto1[1] = sc.nextDouble();
         System.out.println("insira o ponto2 x:");
        ponto2[0] = sc.nextDouble();
         System.out.println("insira o ponto2 y:");
        ponto2[1] = sc.nextDouble();
         System.out.println("insira o ponto3 x:");
        ponto3[0] = sc.nextDouble();
         System.out.println("insira o ponto3 y:");
        ponto3[1] = sc.nextDouble();
        
    dp1p2 = Math.sqrt(Math.pow(ponto2[0] - ponto1[0], 2) + Math.pow(ponto2[1] - ponto1[1], 2));
    dp1p3 = Math.sqrt(Math.pow(ponto3[0] - ponto1[0], 2) + Math.pow(ponto3[1] - ponto1[1], 2));
    dp2p3 = Math.sqrt(Math.pow(ponto3[0] - ponto2[0], 2) + Math.pow(ponto3[1] - ponto2[1], 2));
    
        System.out.println(dp1p2);
        System.out.println(dp1p3);
        System.out.println(dp2p3);
        
    double d = dp1p2 + dp1p3 + dp2p3;
    
    return d;
    }
    
    public boolean triangulo(){
        
        if(dp1p2 == dp1p3 && dp2p3 == dp1p2 && dp2p3 == dp1p3){
            return true;
        }else{
            return false;
        }        
    }
}

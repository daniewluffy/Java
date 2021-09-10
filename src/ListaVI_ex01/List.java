package ListaVI_ex01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class List {
    public static void main(String[] args) {
        
     Random random = new Random(); // objeto Random
     ArrayList lista = new ArrayList();// objeto Lista
     
     int i;
     for(i = 0;i <= 20;i++){
         lista.add(random.nextInt());
     }
      
        System.out.println(lista);   
         Collections.sort(lista);
         System.out.println(lista);
 }
}


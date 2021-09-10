package ListaVI_ex02;

import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class List_Color {
    public static void main(String[] args) {
        
    
    Random random = new Random();
    ArrayList<Color> color;
        color = new ArrayList<>();
    
    int i;
     for(i = 0;i <= 9;i++){
         color.add(new Color(random.nextInt()));
     }
        System.out.println("adicionando 10 elementos");
        System.out.println("");
        System.out.println("Percorrendo e imprimindo");
        System.out.println(color);
        System.out.println("");
        System.out.println("inserindo dois elementos no começo da lista");
        color.add(0, new Color(5));
        color.add(0, new Color(120));
        System.out.println(color);
        System.out.println("");
        System.out.println("imprimindo elemento na posição 5");
        System.out.println(color.get(5));
        System.out.println("");
        System.out.println("imprimindo elemento na posição 3");
        System.out.println(color.get(3));
        System.out.println("removendo elemento na posição 3");
        color.remove(3);
        System.out.println(color);
        ArrayList<Color> b;
        b = new ArrayList<>();
        System.out.println("");
        System.out.println("fazendo cópia...");
        Collections.copy(color, b);
        System.out.println("embaralhando...");
        Collections.shuffle(b);
        System.out.println("percorrendo e imprimindo");
        System.out.println(b);
}
}    

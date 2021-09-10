package ListaI_ex06;

public class String_Conta {
      
    public static void main(String[] args) {     

        String s = "aaaaaaaaaa"; 

char[] c = s.toCharArray(); 

 

int quantidade = 0; 

 

char letra = 'a'; 

 

for (char d : c) { 

 

if (d == letra) { 

 

quantidade++; 

    } 

} 

        System.out.println( "A letra " + letra + " aparece " + quantidade + " vezes"); 

} 

}    



package exercicio1arraylist;

import java.util.ArrayList;

public class Exercicio1ArrayList {

    
    public static void main(String[] args) {
         ArrayList<Integer> numeros = new ArrayList<>();

       
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

       
        System.out.println("Números armazenados no ArrayList:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

    
  

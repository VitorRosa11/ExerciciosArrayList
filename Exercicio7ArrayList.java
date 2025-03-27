
package exercicio7arraylist;

import java.util.ArrayList;

public class Exercicio7ArrayList {

    
    public static void main(String[] args) {
          ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(30);
        numeros.add(50);

       
        System.out.println("Lista original com duplicados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    numeros.remove(j);
                    j--;  
                }
            }
        }
          System.out.println("\nLista sem duplicados:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

  
        


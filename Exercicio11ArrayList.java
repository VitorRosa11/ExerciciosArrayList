
package exercicio11arraylist;

import java.util.ArrayList;

public class Exercicio11ArrayList {

   
    public static void main(String[] args) {
           ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.5);
        numeros.add(20.3);
        numeros.add(15.7);
        numeros.add(8.2);
        numeros.add(12.6);

        
        double soma = 0;

        
        for (double num : numeros) {
            soma += num;
        }

        
        System.out.println("Soma dos valores: " + soma);
    }

}

  
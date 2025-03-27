
package exercicio12arraylist;

import java.util.ArrayList;

public class Exercicio12ArrayList {

    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(25);
        numeros.add(10);
        numeros.add(45);
        numeros.add(5);
        numeros.add(30);

       
        int maior = numeros.get(0);
        int menor = numeros.get(0);

        
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}


package exercicio9arraylist;

import java.util.ArrayList;

public class Exercicio9ArrayList {

   
    public static void main(String[] args) {
          ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");

        
        ArrayList<String> copiaNomes = new ArrayList<>(nomes);

        
        System.out.println("ArrayList original:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        
        System.out.println("\nArrayList copiado:");
        for (String nome : copiaNomes) {
            System.out.println(nome);
        }
    }
}


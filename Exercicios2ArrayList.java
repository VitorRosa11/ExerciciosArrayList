
package exercicios2arraylist;

import java.util.ArrayList;

public class Exercicios2ArrayList {

    
    public static void main(String[] args) {
       
  ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");

        
        String nomeParaRemover = "Carlos";

        
        if (nomes.contains(nomeParaRemover)) {
            nomes.remove(nomeParaRemover);
            System.out.println(nomeParaRemover + " foi removido da lista.");
        } else {
            System.out.println(nomeParaRemover + " não está na lista.");
        }

       
        System.out.println("\nLista atualizada:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}


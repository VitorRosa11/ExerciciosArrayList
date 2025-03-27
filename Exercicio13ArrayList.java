
package exercicio13arraylist;

import java.util.ArrayList;

public class Exercicio13ArrayList {

   
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);

        
        ArrayList<Integer> listaMesclada = new ArrayList<>();
        listaMesclada.addAll(lista1);
        listaMesclada.addAll(lista2);

        
        System.out.println("Lista mesclada:");
        for (int num : listaMesclada) {
            System.out.println(num);
        }
    }
}



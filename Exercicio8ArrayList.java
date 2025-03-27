
package exercicio8arraylist;

import java.util.ArrayList;


public class Exercicio8ArrayList {

    
    public static void main(String[] args) {
        
    public class ArrayListExemplo {

    public static void main(String[] args) {
       
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Maçã");
        elementos.add("Banana");
        elementos.add("Laranja");
        elementos.add("Uva");
        elementos.add("Melancia");
        elementos.add("Pera");

        
        System.out.println("Ordem original:");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }

        
        System.out.println("\nOrdem inversa:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }
}



package exercicio3arraylist;
import java.util.ArrayList;

public class Exercicio3ArrayList {

   import java.util.ArrayList;
    public static void main(String[] args) {
        
      ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();

        
        for (int i = 0; i < 10; i++) {
            int numero = aleatorio.nextInt(100) + 1; 
            numeros.add(numero);
        }

        
        System.out.println("Números gerados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        Collections.sort(numeros);

       
        System.out.println("\nNúmeros em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

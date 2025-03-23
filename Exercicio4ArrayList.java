
package exercicio4arraylist;

import java.util.ArrayList;
public class Exercicio4ArrayList {

   
    public static void main(String[] args) {
        
    ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Leite");
        produtos.add("Café");

        
        String produtoPesquisado = "Leite";

        
        if (produtos.contains(produtoPesquisado)) {
            System.out.println(produtoPesquisado + " foi encontrado na lista.");
        } else {
            System.out.println(produtoPesquisado + " não foi encontrado na lista.");
        }
    }
}


       


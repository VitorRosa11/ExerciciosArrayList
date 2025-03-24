
package exercicio5arraylist;

import java.util.ArrayList;
import java.util.Collection;


public class Exercicio5ArrayList {

   
    public static void main(String[] args) {
        ArrayList <Integer> Cidades = new ArrayList<>();
        Collection<? extends Integer> PortoAlegre = Cidades;
        Cidades.addAll(PortoAlegre);
        
        
        Collection<? extends Integer> SaoPaulo = Cidades;
        Cidades.addAll(SaoPaulo);
        
        Collection<? extends Integer> Madrid = Cidades;
       Cidades.addAll(Madrid);
       
        Collection<? extends Integer> Xangai = Cidades;
        Cidades.addAll(Xangai);
        
        Collection<? extends Integer> Montevideo = Cidades;
       Cidades.addAll(Montevideo);
         
        System.out.println("Diga uma cidade:" + Cidades);
    }
    
    
}

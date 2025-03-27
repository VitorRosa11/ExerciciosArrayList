
package exercicio15arraylist;

import java.util.ArrayList;

public class Exercicio15ArrayList {

    
    public static void main(String[] args) {
          ArrayList<Aluno> alunos = new ArrayList<>();

        
        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Carlos", 7.0));
        alunos.add(new Aluno("Bruna", 9.2));
        alunos.add(new Aluno("Daniel", 6.8));
        alunos.add(new Aluno("Eduardo", 7.5));

        double somaNotas = 0;

        
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " - Nota: " + aluno.getNota());
            somaNotas += aluno.getNota();
        }

        
        double media = somaNotas / alunos.size();
        System.out.printf("\nMédia das notas: %.2f\n", media);
    }
}

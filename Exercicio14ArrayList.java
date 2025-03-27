
package exercicio14.arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio14ArrayList {

    
    public static void main(String[] args) {
         ArrayList<String> tarefas = new ArrayList<>();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU\n" +
                    "1 - Adicionar tarefa\n" +
                    "2 - Remover tarefa\n" +
                    "3 - Listar tarefas\n" +
                    "0 - Sair\n" +
                    "Escolha uma opção:"));

            switch (opcao) {
                case 1:
                    String tarefa = JOptionPane.showInputDialog("Digite a tarefa para adicionar:");
                    tarefas.add(tarefa);
                    JOptionPane.showMessageDialog(null, "Tarefa adicionada!");
                    break;

                case 2:
                    String remover = JOptionPane.showInputDialog("Digite a tarefa que deseja remover:");
                    if (tarefas.remove(remover)) {
                        JOptionPane.showMessageDialog(null, "Tarefa removida!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tarefa não encontrada!");
                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa cadastrada.");
                    } else {
                        String lista = "Lista de Tarefas:\n";
                        for (String t : tarefas) {
                            lista += "- " + t + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }
}

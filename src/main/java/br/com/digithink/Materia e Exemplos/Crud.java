package br.com.digithink;

import javax.swing.*;
import java.util.ArrayList;


public class Crud {

    void main() {
        ArrayList<String> nomes = new ArrayList<>();
        
        // Menu de opções
        while (true) {
            String menu = "Escolha uma opção:\n" +
                          "1. Adicionar nome\n" +
                          "2. Listar nomes\n" +
                          "3. Atualizar nome\n" +
                          "4. Remover nome\n" +
                          "5. Sair";
            // Exibe o menu para o usuário
            String opcao = JOptionPane.showInputDialog(null, menu);
            
            // Verifica a opção escolhida pelo usuário
            switch (opcao) {
                case "1":
                    // Adicionar nome
                    String nomeAdicionar = JOptionPane.showInputDialog("Digite o nome a ser adicionado:");
                    nomes.add(nomeAdicionar);
                    JOptionPane.showMessageDialog(null, "Nome adicionado com sucesso!");
                    break;

                case "2":
                    // Listar nomes
                    StringBuilder listaNomes = new StringBuilder("Lista de Nomes:\n");
                    for (int i = 0; i < nomes.size(); i++) {
                        listaNomes.append((i + 1) + ". " + nomes.get(i) + "\n");
                    }
                    JOptionPane.showMessageDialog(null, listaNomes.toString());
                    break;

                case "3":
                    // Atualizar nome
                    String indiceAtualizarStr = JOptionPane.showInputDialog("Digite o número do nome a ser atualizado (1 a " + nomes.size() + "):");
                    int indiceAtualizar = Integer.parseInt(indiceAtualizarStr) - 1;
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
                    nomes.set(indiceAtualizar, novoNome);
                    JOptionPane.showMessageDialog(null, "Nome atualizado com sucesso!");
                    break;

                case "4":
                    // Remover nome
                    String indiceRemoverStr = JOptionPane.showInputDialog("Digite o número do nome a ser removido (1 a " + nomes.size() + "):");
                    int indiceRemover = Integer.parseInt(indiceRemoverStr) - 1;
                    nomes.remove(indiceRemover);
                    JOptionPane.showMessageDialog(null, "Nome removido com sucesso!");
                    break;

                case "5":
                    // Sair
                    JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
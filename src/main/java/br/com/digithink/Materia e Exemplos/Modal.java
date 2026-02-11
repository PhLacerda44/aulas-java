package br.com.digithink;

import javax.swing.JOptionPane;

public class Modal {
    
    public static void main(String[] args) {
        
        // Mensagem
       // JOptionPane.showMessageDialog(null, "Hello World!");

       //Obter Dados
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        JOptionPane.showConfirmDialog(null, "O nome informado é: " + nome);




    }
} 

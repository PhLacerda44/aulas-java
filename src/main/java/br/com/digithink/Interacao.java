package br.com.digithink;

import java.util.Scanner;

public class Interacao {

    public static void main(String[] args) {
        
        //Criar um objeto da class Scanner
        Scanner obj = new Scanner(System.in);

        // Obter nome
        System.out.println("Qual é o seu nome?");
        String nome = obj.nextLine();

        //Obter idade
        System.out.println("Qual é a sua idade?");
        int idade = obj.nextInt();

        //FInalizar interação
        obj.close();

        //Concetanação
        System.out.println("Olá "+ nome + "você tem"+ idade+ "anos.");

          

    }
    
}

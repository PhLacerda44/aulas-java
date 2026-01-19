package br.com.digithink;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        //Scanner
        Scanner obj = new Scanner(System.in);

        //Vetor
        String[] nomes = new String[3];

        //Laço de repetição
        for( int indice=0; indice<3; indice++){
            System.out.println("Informe o" +(indice+1)+ "nome");
            nomes[indice] = obj.nextLine();
        }

        //Fecha o Scanner
        obj.close();

        //Laço de repetição
        for(String nome : nomes){
            System.out.println(nome);
        }
        
    }
    
}

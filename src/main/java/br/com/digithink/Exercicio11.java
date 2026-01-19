package br.com.digithink;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        //Scanner
        Scanner obj = new Scanner(System.in);

        //Matriz
        String[][] dados = new String[3][2];

        //Obter dados
        for(int indice= 0; indice<3; indice++){
            System.out.println("informe o" +(indice+1)+"Estado.");
            dados[indice][0] = obj.nextLine();
            System.out.println("informe o" +(indice+1)+"Cidade.");
            dados[indice][1] = obj.nextLine();
        }

        //Fecha o Scanner
        obj.close();

        //Listar dados
    }


    
}

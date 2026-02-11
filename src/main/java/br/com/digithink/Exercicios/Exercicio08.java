package br.com.digithink;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner obj = new Scanner(System.in);

        //Obter número
        System.out.println("Informe um número");
        int numero = obj.nextInt();

        //FechaScanner
        obj.close();

        //Tabuada
        int indice = 0;
        while (indice<11){
            System.out.println(numero + "X" + indice + "=" + (numero*indice));
            indice++;
        }
            
     }

}
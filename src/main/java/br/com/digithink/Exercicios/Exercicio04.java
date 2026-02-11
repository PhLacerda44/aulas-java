package br.com.digithink.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner (System.in);


        System.out.println("Informe a conversão");
        System.out.println("1- Dólar para real");
        System.out.println("2- Real para Dólar");
        System.out.println("3- Euro para Real");
        System.out.println("4- Real para Euro");
        
        int tipoconversao = obj.nextInt();

        //Obter valor
        System.out.println("Informe o valor");
        double valor = obj.nextDouble();

        // Fecha o scanner
        obj.close();

        //eSTRUTURA ESCOLHA
        switch (tipoconversao) {
            case 1:
                System.out.println("R$" + (valor * 5.50));
                break;
        
            case 2:
                System.out.println("US$" + (valor / 5.50));
                break;

            case 3:
                System.out.println("R$" + (valor * 6));
                break;
            
            case 4:
                 System.out.println("€" + (valor / 6));
                 break;
        }
    }
    
}

package br.com.digithink.Exercicios;

import java.util.Scanner;

public class Exercicio07 {

    void main() {
        
        // Scanner
        Scanner obj = new Scanner(System.in);

        // Variáveis
        int numero = 0;
        int soma = 0;

        // Laço de repetição
        do{
            System.out.println("Informe um número");
            numero = obj.nextInt();

            // soma = soma + numero
            soma += numero;
        }while(numero != 0);

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Exibir a soma
        System.out.println("A soma é " + soma);

    }
}    

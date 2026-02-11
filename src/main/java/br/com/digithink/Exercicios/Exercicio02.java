package br.com.digithink;

    
/*
    Peça três números inteiros, em seguida retorne o menor informado.
*/

import java.util.Scanner;

public class Exercicio02 {

    void main() {
        
        // Criar objeto do tipo Scanner
        Scanner obj = new Scanner(System.in);

        // Obter o primeiro número
        System.out.println("Informe o primeiro número");
        int numero1 = obj.nextInt();

        // Obter o segundo número
        System.out.println("Informe o segundo número");
        int numero2 = obj.nextInt();

        // Obter o terceiro número
        System.out.println("Informe o terceiro número");
        int numero3 = obj.nextInt();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Criar uma variável menor número
        int menorNumero = numero1;

        // Condicionais
        if(numero2 < menorNumero){
            menorNumero = numero2;
        }

        if(numero3 < menorNumero){
            menorNumero = numero3;
        }

        // Exibir o menor número
        System.out.println("O menor número é " + menorNumero);

    }
    
}

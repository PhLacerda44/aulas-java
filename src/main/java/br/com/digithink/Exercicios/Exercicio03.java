package br.com.digithink.Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    void main() {

        // Scanner
        Scanner obj = new Scanner(System.in);

        // Obter o primeiro número
        System.out.println("Informe o primeiro número");
        int numero1 = obj.nextInt();

        // Obter o segundo número
        System.out.println("Informe o segundo número");
        int numero2 = obj.nextInt();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Operador ternário
        int calculo = numero1 == numero2 ? numero1+numero2 : numero1*numero2;

        // Exibir o cálculo
        System.out.println(calculo);
        
    }
    
}
